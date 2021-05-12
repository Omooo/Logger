package top.omooo.log.impl.logcat

import top.omooo.log.api.Logger

/**
 * @author songshicong
 * @version version
 * @since 2021/5/12
 */
class MockLogger constructor(private val tag: String) : Logger {

    var info = ""
    var debug = ""
    var error = ""

    override fun info(msg: String) {
        info = "$tag: $msg"
    }

    override fun debug(msg: String) {
        debug = "$tag: $msg"
    }

    override fun error(msg: String) {
        error = "$tag: $msg"
    }
}