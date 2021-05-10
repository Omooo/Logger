package top.omooo.log.imp

import top.omooo.log.api.ILoggerFactory
import top.omooo.log.api.Logger
import java.util.concurrent.ConcurrentHashMap

/**
 * LoggerFactory 的另一个实现
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
internal object LoggerFactory_2 : ILoggerFactory {

    private val loggers: MutableMap<String, Logger> by lazy(::ConcurrentHashMap)

    override fun getLogger(name: String): Logger = loggers.getOrPut(name){
        LoggerImpl_2(name)
    }

}