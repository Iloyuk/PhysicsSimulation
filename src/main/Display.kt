package main

import Assets.Ball;
import javax.swing.*
import java.awt.*;
import kotlin.system.exitProcess

class Display(
    private val dispWidth: Int,
    private val dispHeight: Int,
) : JPanel() {
    private var choice = 1
    private val ballList = mutableListOf<Ball>()

    override fun getPreferredSize(): Dimension = Dimension(dispWidth, dispHeight)

    fun showMenu(): Int {
        choice = JOptionPane.showOptionDialog(this, "What would you like to simulate now?",
            "Physics Simulation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, arrayOf("Quit", "Launching Ball", "Ball Dropping"), null)
            .run {
                when (this) {
                    1 -> return 1
                    2 -> return 2
                    else -> exitProcess(0)
                }
        }

        return choice
    }

    fun update(frame: JFrame) {
        when (choice) {
            1 -> frame.setTitle("Physics Simulation: Launching Ball")
            2 -> frame.setTitle("Physics Simulation: Ball Dropping")
        }

        repaint()
    }

}