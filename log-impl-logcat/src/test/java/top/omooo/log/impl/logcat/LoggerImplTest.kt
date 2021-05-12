package top.omooo.log.impl.logcat

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito.*
import org.powermock.api.mockito.PowerMockito.mockStatic
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import top.omooo.log.api.Logger
import top.omooo.log.api.LoggerFactory


/**
 * simple: https://stackoverflow.com/questions/8948916/mocking-logger-and-loggerfactory-with-powermock-and-mockito
 */

@RunWith(
    PowerMockRunner::class
)
@PrepareForTest(LoggerFactory::class)
class LoggerImplTest {

    @Test
    fun `test logger impl by string tag`() {
        mockStatic(LoggerFactory::class.java)
        val logger = mock(Logger::class.java)
        `when`(LoggerFactory.getLogger(anyString())).thenReturn(logger)

        LoggerFactory.getLogger("anyString").debug("debugMsg")
        verify(logger).debug("debugMsg")
    }

    @Test
    fun `test logger impl by java class tag`() {
        mockStatic(LoggerFactory::class.java)
        val logger = mock(Logger::class.java)
        `when`(LoggerFactory.getLogger(Class::class.java)).thenReturn(logger)

        LoggerFactory.getLogger(Class::class.java).debug("debugMsg")
        verify(logger).debug("debugMsg")
    }

    @Test
    fun `test logger impl by kt class tag`() {
        mockStatic(LoggerFactory::class.java)
        val logger = mock(Logger::class.java)
        `when`(LoggerFactory.getLogger(LoggerImplTest::class)).thenReturn(logger)

        LoggerFactory.getLogger(LoggerImplTest::class).debug("debugMsg")
        verify(logger).debug("debugMsg")
    }

    @Test
    fun `test mock logger impl success`() {
        mockStatic(LoggerFactory::class.java)
        val mockLogger = MockLogger(tag = "Test")
        val logger = mock(Logger::class.java)
        `when`(LoggerFactory.getLogger(anyString())).thenReturn(logger)

        mockLogger.debug("debugMsg")
        assertEquals("Test: debugMsg", mockLogger.debug)
        mockLogger.info("infoMsg")
        assertEquals("Test: infoMsg", mockLogger.info)
        mockLogger.error("errorMsg")
        assertEquals("Test: errorMsg", mockLogger.error)
    }
}