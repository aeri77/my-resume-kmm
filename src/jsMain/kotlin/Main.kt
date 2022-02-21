import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Header({
            style {
                width(100.percent)
                backgroundColor(Color.blueviolet)
                alignContent(AlignContent.Center)
                position(Position.Sticky)
                property("zIndex", 109)
            }
        }) {
            Span({
                style {
                    fontSize(32.px)
                    alignSelf(AlignSelf.Center)
                }
            }) {
                Div({
                    style {
                        textAlign("center")
                    }
                }) {
                    Text("Toolbar")
                }
            }
        }
        Div({
            style {
                margin(16.px)
            }
        }) {
            Button(attrs = {
                onClick { count -= 1 }
            }) {
                Text("hello")
            }

            Span({ style { padding(15.px) } }) {
                Text("$count")
            }

            Button(attrs = {
                onClick { count += 1 }
            }) {
                Text("+")
            }
        }
    }
}

