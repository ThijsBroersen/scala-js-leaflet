package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait CircleMarker extends Path {

  def toGeoJSON(): GeoJSON = js.native
  def getLatLng(): LatLng = js.native
  def setLatLng(latlngs: LatLng): this.type = js.native
  def getRadius(): LatLng = js.native
  def setRadius(radius: Int): Int = js.native
}

@js.native
@JSGlobal("L.CircleMarker")
object CircleMarker extends Class {}

@js.native
@JSGlobal("L.circleMarker")
object circleMarker extends js.Any {
  def apply(latlng: LatLng, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): CircleMarker = js.native
}

//trait CircleMarkerOptions extends PathOptions {
//  val radius: Int = js.native
//}
//
//object CircleMarkerOptions {
//  def apply(
//    radius: Int = 10,
//    pathOptions: PathOptions = PathOptions()
//  ): CircleMarkerOptions = {
//    OptionsUtil.merge[CircleMarkerOptions](
//      Seq(
//        pathOptions,
//        js.Dynamic.literal(
//          radius = radius
//        )
//      )
//    )
//  }
//}
