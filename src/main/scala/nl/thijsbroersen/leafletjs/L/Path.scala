package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Path extends Layer {

  def redraw(): this.type                            = js.native
  def setStyle(style: js.Dictionary[Any]): this.type = js.native
  def bringToFront(): this.type                      = js.native
  def bringToBack(): this.type                       = js.native
}

@js.native
@JSGlobal("L.Path")
object Path extends Class {}
