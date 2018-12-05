package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Draggable extends Evented {
  def enable(): Unit = js.native
  def disable(): Unit = js.native
}

@js.native
@JSGlobal("L.Draggable")
object Draggable extends js.Any {
  def apply(el: HTMLElement, dragHandle: js.UndefOr[HTMLElement] = js.undefined,
    preventOutline: js.UndefOr[Boolean] = js.undefined, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Draggable = js.native

  @js.native
  trait down extends Event
  @js.native
  trait dragstart extends Event
  @js.native
  trait predrag extends Event
  @js.native
  trait drag extends Event
  @js.native
  trait dragend extends DragEndEvent
}

//trait DraggableOptions extends js.Object {
//  val clickTolerance: Int = js.native
//}
//
//object DraggableOptions {
//  def apply(
//    clickTolerance: js.UndefOr[Int] = js.undefined
//  ): DraggableOptions = {
//    OptionsUtil.merge[DraggableOptions](
//      Seq(
//        js.Dynamic.literal(
//          clickTolerance = clickTolerance
//        )
//      )
//    )
//  }
//}
