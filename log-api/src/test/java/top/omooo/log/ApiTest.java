package top.omooo.log;

import org.junit.Test;

import kotlin.NotImplementedError;
import top.omooo.log.api.Logger;
import top.omooo.log.api.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Api 单元测试
 *
 * @author songshicong
 * @version version
 * @since 2021/5/10
 */
public class ApiTest {

    /**
     * 测试未依赖实现模块抛异常
     */
    @Test
    public void test1() {
        Throwable exception = assertThrows(NotImplementedError.class, () -> {
            Logger logger = LoggerFactory.getLogger("test1");
            logger.debug("2333");
        });
        assertEquals("An operation is not implemented: Not support", exception.getMessage());
    }

}
