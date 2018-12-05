package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Circle extends CircleMarker {

}

@js.native
@JSGlobal("L.Circle")
object Circle extends Class {}

@js.native
@JSGlobal("L.circle")
object circle extends js.Any {
  def apply(latlng: LatLng, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Circle = js.native
  //  def apply(latlng: LatLng, radius: Double, options: js.UndefOr[CircleOptions] = js.undefined): Circle = js.native
}

//trait CircleOptions extends CircleMarkerOptions {
//
//}
//
//object CircleOptions {
//  def apply(
//    circleMarkerOptions: CircleMarkerOptions = CircleMarkerOptions()
//  ): CircleOptions = {
//    OptionsUtil.merge[CircleOptions](
//      Seq(
//        circleMarkerOptions,
//        js.Dynamic.literal()
//      )
//    )
//  }
//}
