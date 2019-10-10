package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

/**
  * Created by thijs on 12-4-17.
  */
@js.native
trait Polygon extends Polyline {}

@js.native
@JSGlobal("L.Polygon")
object Polygon extends Class {}

@js.native
@JSGlobal("L.polygon")
object polygon extends js.Any {
  def apply(latlngs: js.Array[LatLng] | js.Array[js.Array[LatLng]],
            options: js.UndefOr[js.Dictionary[_]] = js.undefined): Polygon = js.native
}
