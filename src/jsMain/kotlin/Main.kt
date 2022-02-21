import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Header({
            style {
                width(100.percent)
                backgroundColor(Color.transparent)
                alignContent(AlignContent.Center)
                position(Position.Fixed)
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
        Img("https://foyr.com/learn/wp-content/uploads/2019/01/game-room-decor-ideas-1536x864.jpg") {
            style {
                width(100.percent)
                height(340.px)
                property("object-fit","cover")
            }
        }
        repeat(100){
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
}

