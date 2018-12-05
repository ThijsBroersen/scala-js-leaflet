package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait DomEvent extends Evented {
  def run(el: HTMLElement, newPos: Point, duration: js.UndefOr[Double] = js.undefined, easeLinearity: js.UndefOr[Double] = js.undefined): Unit = js.native
  def stop(): Unit = js.native
}

@js.native
@JSGlobal("L.DomEvent")
object DomEvent extends Class {}
