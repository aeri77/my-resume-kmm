import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun scratch() {
    var count: Int by mutableStateOf(0)
    renderComposable(rootElementId = "root") {
        Header({
            style {
                width(100.percent)
                alignContent(AlignContent.Center)
                position(Position.Fixed)
                fontWeight("bold")
                color(Color.white)
                property("z-index", 109)
            }
        }) {
            Div({
                style {
                    position(Position.Relative)
                }
            }) {
                Span({
                    style {
                        position(Position.Absolute)
                        width(100.percent)
                        height(100.percent)
                        backgroundColor(rgb(0, 0, 0))
                        backgroundColor(rgba(0, 0, 0, 0.4))
                        property("filter", "blur(2px)")
                    }
                })
                Span({
                    style {
                        position(Position.Relative)
                        fontSize(32.px)
                        alignSelf(AlignSelf.Center)
                    }
                }) {
                    Div(
                        attrs = {
                            style {
                                backgroundColor(Color.transparent)
                                textAlign("center")
                                fontFamily("Roboto", "sans-serif")
                                fontWeight(200)
                            }
                            onMouseEnter { event ->
                                println("button FocusIn at $event")
                            }
                            onClick { event ->
                                // event is of `SyntheticMouseEvent` type
                                println("button clicked at ${event.movementX}, ${event.movementY}")

                                val nativeEvent =
                                    event.nativeEvent // [MouseEvent](https://developer.mozilla.org/en/docs/Web/API/MouseEvent)
                            }
                        }
                    ) {
                        Text("Button")
                    }
                }
            }
        }
        Div({
            style {
                property("z-index", "20")
                property("filter", "blur(8px)")
            }
        }) {
            Img("https://foyr.com/learn/wp-content/uploads/2019/01/game-room-decor-ideas-1536x864.jpg") {
                style {
                    width(100.percent)
                    height(100.percent)
                    backgroundRepeat("repeat-y")
                    backgroundPosition("center")
                    property("object-fit", "cover")
                }
            }
        }
//        repeat(100) {
//            Div({
//                style {
//                    margin(16.px)
//                }
//            }) {
//                Button(attrs = {
//                    onClick { count -= 1 }
//                }) {
//                    Text("hello")
//                }
//
//                Span({ style { padding(15.px) } }) {
//                    Text("$count")
//                }
//
//                Button(attrs = {
//                    onClick { count += 1 }
//                }) {
//                    Text("+")
//                }
//            }
//        }
    }
}