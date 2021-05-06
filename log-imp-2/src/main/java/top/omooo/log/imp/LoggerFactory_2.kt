package top.omooo.log.imp

import top.omooo.log.api.ILoggerFactory
import top.omooo.log.api.Logger

/**
 * LoggerFactory 的另一个实现
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
class LoggerFactory_2 : ILoggerFactory {

    override fun getLogger(): Logger {
        return LoggerImpl_2()
    }

}