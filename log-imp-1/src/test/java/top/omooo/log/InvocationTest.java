package top.omooo.log;

import org.junit.Test;

import top.omooo.log.api.Logger;
import top.omooo.log.api.LoggerFactory;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * 单元测试
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/11
 */
public class InvocationTest {

    @Test
    public void test() {

        Logger logger1 = LoggerFactory.getLogger("test");
        Logger logger2 = LoggerFactory.getLogger("test");
        assertSame(logger1, logger2);

        Logger logger3 = LoggerFactory.getLogger("test");
        Logger logger4 = LoggerFactory.getLogger("test1");
        assertNotSame(logger3, logger4);
    }

    @Test
    public void test1() {
        Logger logger = LoggerFactory.getLogger("test1");
        logger.info("test info");
        logger.debug("test debug");
        logger.error("test error");
    }

    @Test
    public void test2() {
        Logger logger = LoggerFactory.getLogger(InvocationTest.class);
        logger.info("test info");
        logger.debug("test debug");
        logger.error("test error");
    }

    @Test
    public void test3() {
        Logger logger = LoggerFactory.getLogger(KClassTest.class);
        logger.info("test info");
        logger.debug("test debug");
        logger.error("test error");
    }

}
