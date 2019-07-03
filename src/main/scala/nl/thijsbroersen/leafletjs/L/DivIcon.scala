package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by thijs on 12-4-17.
  */
@js.native
trait DivIcon extends Icon {}

@js.native
@JSGlobal("L.DivIcon")
object DivIcon extends Class {}

@js.native
@JSGlobal("L.divIcon")
object divIcon extends js.Any {

  def apply(options: js.UndefOr[js.Dictionary[_]] = js.undefined): DivIcon = js.native
}
