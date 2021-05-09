package top.omooo.log.api

import top.omooo.log.imp.StaticLoggerBinder

/**
 * 向外界暴露的接口
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/6
 */
object LoggerFactory {

    fun getLogger(name: String): Logger {
        return StaticLoggerBinder.getLoggerFactory().getLogger(name)
    }

}