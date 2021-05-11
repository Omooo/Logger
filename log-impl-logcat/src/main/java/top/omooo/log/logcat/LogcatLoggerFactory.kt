package top.omooo.log.logcat

import top.omooo.log.api.ILoggerFactory
import top.omooo.log.api.Logger
import java.util.concurrent.ConcurrentHashMap

/**
 * @author songshicong
 * @version v1.0
 * @since 2021/5/11
 */
internal object LogcatLoggerFactory : ILoggerFactory {

    private val loggers: MutableMap<String, Logger> by lazy(::ConcurrentHashMap)

    override fun getLogger(name: String): Logger = loggers.getOrPut(name) {
        LogcatLogger(name)
    }

}