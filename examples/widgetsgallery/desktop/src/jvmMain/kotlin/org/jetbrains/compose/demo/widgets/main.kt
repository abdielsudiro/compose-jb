package org.jetbrains.compose.demo.widgets

import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import org.jetbrains.compose.demo.widgets.ui.MainView
import java.awt.Dimension
import java.awt.Toolkit

fun main() {
    val size = getPreferredWindowSize(600, 800)
    singleWindowApplication (
            title = "Widgets Gallery",
            state = WindowState(size = WindowSize(size.width.dp, size.height.dp)),
        ) {
        MainView()
    }
}

private fun getPreferredWindowSize(desiredWidth: Int, desiredHeight: Int): IntSize {
    val screenSize: Dimension = Toolkit.getDefaultToolkit().screenSize
    val preferredWidth: Int = (screenSize.width * 0.8f).toInt()
    val preferredHeight: Int = (screenSize.height * 0.8f).toInt()
    val width: Int = if (desiredWidth < preferredWidth) desiredWidth else preferredWidth
    val height: Int = if (desiredHeight < preferredHeight) desiredHeight else preferredHeight
    return IntSize(width, height)
}
