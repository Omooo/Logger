package top.omooo.log.imp

import top.omooo.log.api.ILoggerFactory

/**
 * 占位使用，具体实现是在每个实现模块里，比如: log-imp-1、log-imp-2
 */
class StaticLoggerBinder {
    companion object {
        fun getInstance(): StaticLoggerBinder {
            throw UnsupportedOperationException("未实现")
        }
    }

    fun getLoggerFactory(): ILoggerFactory {
        throw UnsupportedOperationException("未实现")
    }
}