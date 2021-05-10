package top.omooo.log.api

import top.omooo.log.imp.StaticLoggerBinder
import kotlin.reflect.KClass

/**
 * 向外界暴露的接口
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
object LoggerFactory {

    @JvmStatic
    fun getLogger(clazz: KClass<*>): Logger {
        return getLogger(clazz.java)
    }

    @JvmStatic
    fun getLogger(clazz: Class<*>): Logger {
        return getLogger(clazz.simpleName)
    }

    @JvmStatic
    fun getLogger(name: String): Logger {
        return StaticLoggerBinder.getLoggerFactory().getLogger(name)
    }

}