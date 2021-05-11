package top.omooo.log.impl

import top.omooo.log.api.ILoggerFactory
import top.omooo.log.api.LoggerFactoryBinder

/**
 * 占位使用，具体实现是在每个实现模块里，比如: log-imp-1、log-imp-2
 */
object StaticLoggerBinder :LoggerFactoryBinder{

    override fun getLoggerFactory(): ILoggerFactory {
        TODO("Not support")
    }

}