package top.omooo.logger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import top.omooo.log.api.Logger
import top.omooo.log.api.LoggerFactory

class MainActivity : AppCompatActivity() {

    private val logger: Logger = LoggerFactory.getLogger(MainActivity::class)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logger.debug("2333")

    }
}