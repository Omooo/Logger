package top.omooo.log.api

/**
 * 日志工厂类
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
interface ILoggerFactory {
    fun getLogger(name: String): Logger
}