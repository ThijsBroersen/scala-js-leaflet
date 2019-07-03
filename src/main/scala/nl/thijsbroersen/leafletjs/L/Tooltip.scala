package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Tooltip extends DivOverlay {}

@js.native
@JSGlobal("L.tooltip")
object Tooltip extends js.Any {

  def apply(options: js.UndefOr[js.Dictionary[_]] = js.undefined, source: js.UndefOr[Layer]): Tooltip =
    js.native
}
