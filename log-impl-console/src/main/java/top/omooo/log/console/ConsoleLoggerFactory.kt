package top.omooo.log.console

import top.omooo.log.api.ILoggerFactory
import top.omooo.log.api.Logger
import java.util.concurrent.ConcurrentHashMap

/**
 * LoggerFactory 的一个实现
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
internal object ConsoleLoggerFactory : ILoggerFactory {

    private val loggers: MutableMap<String, Logger> by lazy(::ConcurrentHashMap)

    override fun getLogger(name: String): Logger = loggers.getOrPut(name) {
        ConsoleLogger(name)
    }

}