package top.omooo.log.imp

import top.omooo.log.api.ILoggerFactory
import top.omooo.log.api.LoggerFactoryBinder

internal object StaticLoggerBinder : LoggerFactoryBinder {

    override fun getLoggerFactory(): ILoggerFactory {
        return LoggerFactory_1()
    }

}