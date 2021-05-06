package top.omooo.log.api

import top.omooo.log.imp.StaticLoggerBinder

/**
 * 向外界暴露的接口
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
object LoggerFactory {

    private val STATIC_LOGGER_BINDER_PATH = "top/omooo/log/imp/StaticLoggerBinder.class"

    fun getLogger(name: String): Logger {
        return getLoggerFactory(name).getLogger()
    }

    private fun getLoggerFactory(name: String): ILoggerFactory {
        val urlList = ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH).toList()
        val toList =
            LoggerFactory::class.java.classLoader.getResources(STATIC_LOGGER_BINDER_PATH).toList()

//        val loadClass = LoggerFactory::class.java.classLoader.loadClass(STATIC_LOGGER_BINDER_PATH)
//        if (loadClass != null) {
//            println(loadClass.simpleName)
//        }
//        if (toList.isEmpty()) {
//            throw IllegalStateException("没有实现")
//        } else if (toList.size > 2) {
//            println("多于 1 个实现")
//        }
        return StaticLoggerBinder.getInstance().getLoggerFactory()
    }

}