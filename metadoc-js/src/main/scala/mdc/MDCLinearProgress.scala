package mdc

import scala.scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom

@js.native
@JSGlobal("mdc.linearProgress.MDCLinearProgress")
object MDCLinearProgress extends js.Object {
  def attachTo(element: dom.Element): MDCLinearProgress = js.native
}

/**
  * The MDC Linear Progress component is a spec-aligned linear progress indicator component.
  *
  * @see https://material.io/components/web/catalog/linear-progress/
  */
@js.native
trait MDCLinearProgress extends js.Object {

  /**
    * Toggles the component between the determinate and indeterminate state.
    */
  var determinate: Boolean = js.native

  /**
    * Sets the progress bar to this value. Value should be between [0, 1].
    */
  var progress: Double = js.native

  /**
    * Sets the buffer bar to this value. Value should be between [0, 1].
    */
  var buffer: Double = js.native

  /**
    * Reverses the direction of the linear progress indicator.
    */
  var reverse: Boolean = js.native

  /**
    * Puts the component in the open state.
    */
  def open(): Unit = js.native

  /**
    * Puts the component in the closed state.
    */
  def close(): Unit = js.native
}
