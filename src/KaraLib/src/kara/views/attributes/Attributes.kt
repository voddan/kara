package kara.views

import java.net.URL
import kara.controllers.Request

object Attributes {
    val c = ClassAttribute("class")
    val id = IdAttribute("id")
    val title = IdAttribute("title")

    val href = LinkAttribute("href")
    val rel = StringAttribute("rel")
    val target = StringAttribute("target")
    val mimeType = MimeAttribute("type")
    val width = IntAttribute("width")
    val height = IntAttribute("height")
    val action = LinkAttribute("action")
    val enctype = EnumAttribute("enctype", javaClass<EncodingType>())
    val method = EnumAttribute("method", javaClass<FormMethod>())
    val src = LinkAttribute("src")
    val alt = TextAttribute("alt")
    val autocomplete = BooleanAttribute("autocomplete", "on", "off")
    val autofocus = TickerAttribute("autofocus")
    val checked = TickerAttribute("checked")
    val disabled = TickerAttribute("disabled")
    val maxlength = IntAttribute("maxlength")
    val multiple = TickerAttribute("multiple")
    val inputType = EnumAttribute("type", javaClass<InputType>())
    val name = StringAttribute("name")
    val pattern = RegexpAttribute("pattern")
    val placeholder = TextAttribute("placeholder")
    val readonly = TickerAttribute("readonly")
    val required = TickerAttribute("required")
    val size = IntAttribute("size")
    val step = IntAttribute("step")
    val value = StringAttribute("value")
    val forId = IdAttribute("for")
    val label = TextAttribute("label")
    val selected = TickerAttribute("selected")
    val cols = IntAttribute("cols")
    val rows = IntAttribute("rows")
    val wrap = EnumAttribute("wrap", javaClass<Wrap>())
}
