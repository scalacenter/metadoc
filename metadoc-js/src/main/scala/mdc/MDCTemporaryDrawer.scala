package mdc

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom

/**
  * The MDC Drawer component is a spec-aligned drawer component.
  *
  * @see https://material.io/components/web/catalog/drawers/
  */
@js.native
@JSGlobal("mdc.drawer.MDCTemporaryDrawer")
class MDCTemporaryDrawer extends js.Object {
  def this(element: dom.Element) = this()

  /**
    * Puts the component in the open state.
    */
  var open: Boolean = js.native
}
