package Lista03

import java.util.*


fun main() {
    val delay = 1000
    val interval = 2000

    val timer = Timer()
    timer.scheduleAtFixedRate(object : TimerTask() {
        override fun run() {
            println("Olá World!")
        }
    }, delay.toLong(), interval.toLong())
}