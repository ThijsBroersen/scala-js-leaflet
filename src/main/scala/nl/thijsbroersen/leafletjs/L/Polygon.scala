package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait Polygon extends Polyline {

}

@js.native
@JSGlobal("L.Polygon")
object Polygon extends Class {}

@js.native
@JSGlobal("L.polygon")
object polygon extends js.Any {
  def apply(latlngs: js.Array[LatLng], options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Polygon = js.native
}
