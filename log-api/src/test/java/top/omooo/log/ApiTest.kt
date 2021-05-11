package top.omooo.log

import org.junit.Test
import top.omooo.log.api.LoggerFactory.getLogger
import kotlin.test.assertFailsWith

/**
 * Api 单元测试
 *
 * @author songshicong
 * @version version
 * @since 2021/5/10
 */
class ApiTest {

    @Test
    fun `test no impl error`() {

        assertFailsWith(
            NotImplementedError::class,
            "An operation is not implemented: Not support"
        ) {
            val logger = getLogger("test1")
            logger.debug("2333")
        }
    }
}