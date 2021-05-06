package top.omooo.log.imp

import top.omooo.log.api.Logger

/**
 * Logger 的一个实现
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
class LoggerImpl_1 : Logger {

    override fun info(msg: String) {
        println("LoggerImpl_1: " + msg)
    }

    override fun debug(msg: String) {
        println("LoggerImpl_1: " + msg)
    }

    override fun error(msg: String) {
        println("LoggerImpl_1: " + msg)
    }
}