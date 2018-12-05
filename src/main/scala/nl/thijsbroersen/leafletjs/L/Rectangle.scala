package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait Rectangle extends Polygon {

  def setBounds(latLngBounds: LatLngBounds): this.type = js.native
}

@js.native
@JSGlobal("L.Rectangle")
object Rectangle extends Class {}

@js.native
@JSGlobal("L.rectangle")
object rectangle extends js.Any {
  def apply(latLngBounds: LatLngBounds, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Rectangle = js.native
}
