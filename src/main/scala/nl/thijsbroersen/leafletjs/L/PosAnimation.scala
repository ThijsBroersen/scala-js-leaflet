package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.PosAnimation")
object PosAnimation extends js.Any {
  def apply(): PosAnimation = js.native

  @js.native
  trait start extends Event //TODO: test
  @js.native
  trait step extends Event
  @js.native
  trait end extends Event
}

@js.native
trait PosAnimation extends Evented {
  def run(el: HTMLElement,
          newPos: Point,
          duration: js.UndefOr[Double] = js.undefined,
          easeLinearity: js.UndefOr[Double] = js.undefined): Unit = js.native
  def stop(): Unit                                                = js.native
}
