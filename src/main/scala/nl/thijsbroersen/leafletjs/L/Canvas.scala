package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Canvas extends Renderer {

}

@js.native
@JSGlobal("L.Canvas")
object Canvas extends Class {}

@js.native
@JSGlobal("L.canvas")
object canvas extends js.Any {
  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Canvas = js.native
}