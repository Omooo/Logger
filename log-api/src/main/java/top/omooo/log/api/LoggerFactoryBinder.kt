package top.omooo.log.api

/**
 * Log 日志工厂绑定类
 * 外界只需要定义一个 {StaticLoggerBinder} 的类去实现这个接口，在 classpath 下就能通过 ClassLoader 来加载
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
interface LoggerFactoryBinder {
    fun getLoggerFactory(): ILoggerFactory
}