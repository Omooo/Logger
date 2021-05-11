package top.omooo.log.logcat

import android.util.Log
import top.omooo.log.api.Logger

/**
 * Logcat
 *
 * @author songshicong
 * @version v1.0
 * @since 2021/5/11
 */
internal class LogcatLogger(private val tag: String) : Logger {

    override fun info(msg: String) {
        Log.i(tag, msg)
    }

    override fun debug(msg: String) {
        Log.d(tag, msg)
    }

    override fun error(msg: String) {
        Log.e(tag, msg)
    }
}