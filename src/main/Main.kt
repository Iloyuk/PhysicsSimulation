package main

import javax.swing.*
import java.awt.*
import kotlin.system.exitProcess

const val WIDTH = 1800
const val HEIGHT = 1000
var choice = 0

fun main() {

    val frame = JFrame("Physics Simulation")
    val display = Display(WIDTH, HEIGHT)
    val timer = Timer(10) {
        display.update(frame)
    }

    display.setLayout(null)
    display.add(getStopButton(timer, display))

    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.preferredSize = Dimension(WIDTH, HEIGHT)
    frame.setBounds(0, 0, WIDTH, HEIGHT)
    choice = display.showMenu()

    if (choice != 0) {
        timer.start()
        frame.contentPane = display
        frame.isVisible = true
    } else exitProcess(0)

}

private fun getStopButton(timer: Timer, display: Display): JButton {
    return JButton().apply {
        this.setFont(Font("SansSerif", Font.BOLD, 30))
        this.setText("Stop")
        this.setBorder(BorderFactory.createEtchedBorder(1, Color.GRAY, Color.GRAY))
        this.setLayout(null)
        this.setBounds(WIDTH - 120, 10, 100, 50)
        this.addActionListener {
            if (it.getSource() == this) {
                timer.stop()
                choice = display.showMenu()
                timer.start()
            }
        }
    }
}