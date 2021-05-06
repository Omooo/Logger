package top.omooo.log.imp

import top.omooo.log.api.ILoggerFactory
import top.omooo.log.api.LoggerFactoryBinder

class StaticLoggerBinder private constructor() : LoggerFactoryBinder {

    private val loggerFactory: LoggerFactory_1 = LoggerFactory_1()

    companion object {
        fun getInstance(): StaticLoggerBinder {
            return StaticLoggerBinder()
        }
    }

    override fun getLoggerFactory(): ILoggerFactory {
        return loggerFactory
    }

}