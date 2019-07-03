package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal}

@js.native
trait SVG extends Renderer {}

@js.native
@JSGlobal("L.SVG")
object SVG extends Class {}

@js.native
@JSGlobal("L.svg")
object svg extends js.Any {
  def apply(options: js.UndefOr[js.Dictionary[_]] = js.undefined): SVG = js.native
}
