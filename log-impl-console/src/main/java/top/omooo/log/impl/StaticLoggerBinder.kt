package top.omooo.log.impl

import top.omooo.log.api.ILoggerFactory
import top.omooo.log.api.LoggerFactoryBinder
import top.omooo.log.console.ConsoleLoggerFactory

internal object StaticLoggerBinder : LoggerFactoryBinder {

    override fun getLoggerFactory(): ILoggerFactory {
        return ConsoleLoggerFactory
    }

}