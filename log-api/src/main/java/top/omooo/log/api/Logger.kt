package top.omooo.log.api

/**
 * 日志规范接口
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
interface Logger {

    fun info(msg: String)

    fun debug(msg: String)

    fun error(msg: String)

}