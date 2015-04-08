package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class SAMP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("samp", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class SCRIPT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("script", consumer, initialAttributes), CoreAttributeGroupFacade {
    var charset : String
        get()  = attributeString_ffbab22b.get(this, "charset")
        set(newValue) {attributeString_ffbab22b.set(this, "charset", newValue)}

    var type : ScriptType
        get()  = attributeScriptTypeScriptTypeValues_494179c6.get(this, "type")
        set(newValue) {attributeScriptTypeScriptTypeValues_494179c6.set(this, "type", newValue)}

    var src : String
        get()  = attributeString_ffbab22b.get(this, "src")
        set(newValue) {attributeString_ffbab22b.set(this, "src", newValue)}

    var defer : Boolean
        get()  = attributeBoolean_e08d580a.get(this, "defer")
        set(newValue) {attributeBoolean_e08d580a.set(this, "defer", newValue)}

    var async : Boolean
        get()  = attributeBoolean_e08d580a.get(this, "async")
        set(newValue) {attributeBoolean_e08d580a.set(this, "async", newValue)}


}

public class SECTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("section", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class SELECT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("select", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var autoFocus : Boolean
        get()  = attributeBoolean_e08d580a.get(this, "autofocus")
        set(newValue) {attributeBoolean_e08d580a.set(this, "autofocus", newValue)}

    var disabled : Boolean
        get()  = attributeBoolean_e08d580a.get(this, "disabled")
        set(newValue) {attributeBoolean_e08d580a.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeString_ffbab22b.get(this, "form")
        set(newValue) {attributeString_ffbab22b.set(this, "form", newValue)}

    var multiple : Boolean
        get()  = attributeBoolean_e08d580a.get(this, "multiple")
        set(newValue) {attributeBoolean_e08d580a.set(this, "multiple", newValue)}

    var name : String
        get()  = attributeString_ffbab22b.get(this, "name")
        set(newValue) {attributeString_ffbab22b.set(this, "name", newValue)}

    var size : String
        get()  = attributeString_ffbab22b.get(this, "size")
        set(newValue) {attributeString_ffbab22b.set(this, "size", newValue)}


}

public class SMALL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("small", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class SOURCE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("source", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var src : String
        get()  = attributeString_ffbab22b.get(this, "src")
        set(newValue) {attributeString_ffbab22b.set(this, "src", newValue)}

    var type : String
        get()  = attributeString_ffbab22b.get(this, "type")
        set(newValue) {attributeString_ffbab22b.set(this, "type", newValue)}

    var media : String
        get()  = attributeString_ffbab22b.get(this, "media")
        set(newValue) {attributeString_ffbab22b.set(this, "media", newValue)}


}

public class SPAN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("span", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class STRONG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("strong", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class STYLE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("style", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var type : String
        get()  = attributeString_7e4dbf20.get(this, "type")
        set(newValue) {attributeString_7e4dbf20.set(this, "type", newValue)}

    var media : String
        get()  = attributeString_467827b8.get(this, "media")
        set(newValue) {attributeString_467827b8.set(this, "media", newValue)}

    var scoped : Boolean
        get()  = attributeBoolean_e08d580a.get(this, "scoped")
        set(newValue) {attributeBoolean_e08d580a.set(this, "scoped", newValue)}


}

public class SUB(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("sub", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class SUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("sup", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}

public class SVG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("svg", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {

}
