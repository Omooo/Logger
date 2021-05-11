package top.omooo.log

import org.junit.Rule
import org.junit.contrib.java.lang.system.SystemOutRule
import top.omooo.log.api.LoggerFactory
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame
import kotlin.test.assertSame

/**
 * @author songshicong
 * @version v1.0
 * @since 2021/5/11
 */
class LoggerImplTest {

    @get:Rule
    val systemOutRule = SystemOutRule().enableLog()

    @Test
    fun `test simple debug log`() {
        val logger = LoggerFactory.getLogger("tag")
        logger.debug("debugMsg")
        assertEquals(systemOutRule.log, "tag: debugMsg\n")
    }

    @Test
    fun `test logger impl by string tag`() {
        val logger = LoggerFactory.getLogger("tag")
        logger.debug("debugMsg")
        logger.info("infoMsg")
        logger.error("errorMsg")
        assertEquals(
            systemOutRule.log,
            """
            tag: debugMsg
            tag: infoMsg
            tag: errorMsg
            
            """.trimIndent()
        )
    }

    @Test
    fun `test logger impl by java class tag`() {
        val logger = LoggerFactory.getLogger(Class::class.java)
        logger.debug("debugMsg")
        logger.info("infoMsg")
        logger.error("errorMsg")
        assertEquals(
            systemOutRule.log,
            """
            Class: debugMsg
            Class: infoMsg
            Class: errorMsg
            
            """.trimIndent()
        )
    }

    @Test
    fun `test logger impl by kt class tag`() {
        val logger = LoggerFactory.getLogger(KClass::class)
        logger.debug("debugMsg")
        logger.info("infoMsg")
        logger.error("errorMsg")
        assertEquals(
            systemOutRule.log,
            """
            KClass: debugMsg
            KClass: infoMsg
            KClass: errorMsg
            
            """.trimIndent()
        )
    }

    @Test
    fun `test logger instance same`() {
        val logger1 = LoggerFactory.getLogger("test")
        val logger2 = LoggerFactory.getLogger("test")
        assertSame(logger1, logger2)
    }

    @Test
    fun `test logger instance not same`() {
        val logger1 = LoggerFactory.getLogger("test")
        val logger2 = LoggerFactory.getLogger("test1")
        assertNotSame(logger1, logger2)
    }
}

class KClass