package top.omooo.log.impl

import top.omooo.log.api.ILoggerFactory
import top.omooo.log.api.LoggerFactoryBinder
import top.omooo.log.logcat.LogcatLoggerFactory

/**
 * @author songshicong
 * @version v1.0
 * @since 2021/5/11
 */
internal object StaticLoggerBinder : LoggerFactoryBinder {

    override fun getLoggerFactory(): ILoggerFactory {
        return LogcatLoggerFactory
    }

}