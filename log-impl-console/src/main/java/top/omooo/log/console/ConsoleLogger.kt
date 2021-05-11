package top.omooo.log.console

import top.omooo.log.api.Logger

/**
 * Logger 的一个实现
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
internal class ConsoleLogger(private val tag: String) : Logger {

    override fun info(msg: String) {
        println("$tag: $msg")
    }

    override fun debug(msg: String) {
        println("$tag: $msg")
    }

    override fun error(msg: String) {
        println("$tag: $msg")
    }
}