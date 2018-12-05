package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait GeoJSON extends FeatureGroup {
  def addData(data: js.Dynamic): this.type = js.native
  def resetStyle[T <: Layer](layer: T): this.type = js.native
  def setStyle(style: String): this.type = js.native
}

@js.native
@JSGlobal("L.GeoJSON")
object GeoJSON extends Class {

  def geometryToLayer(featureData: js.Dynamic, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): GeoJSON = js.native

  def coordsToLatLng(coords: Array[Double]): LatLng = js.native

  def coordsToLatLngs(coords: Array[Double], levelsDeep: js.UndefOr[Int] = js.undefined, coordsToLatLng: js.Function1[Array[Double], LatLng]): Array[LatLng] = js.native

  def latLngToCoords(latlng: LatLng, precision: js.UndefOr[Int] = js.undefined): Array[Double] = js.native

  def latLngsToCoords(latlng: LatLng, levelsDeep: js.UndefOr[Int] = js.undefined, closed: js.UndefOr[Boolean] = js.undefined): Array[Double] = js.native

  def asFeature(geojson: js.Dynamic): js.Dynamic = js.native
}

@js.native
@JSGlobal("L.geoJSON")
object geoJSON extends js.Any {

  def apply(geojson: js.UndefOr[js.Dynamic] = js.undefined, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): GeoJSON = js.native
}

//trait GeoJSONOptions extends LayerOptions {
//  val pointToLayer: js.Function2[js.Dynamic, LatLng, Marker] = js.native
//  val style: js.Function1[js.Dynamic, PathOptions] = js.native
//  val onEachFeature: js.Function1[js.Dynamic, Marker] = js.native
//  val filter: js.Function1[js.Dynamic, Boolean] = js.native
//  val coordsToLatLng: js.Function1[Array[Double], LatLng] = js.native
//}
//
//object GeoJSONOptions {
//  def apply(
//    pointToLayer: js.UndefOr[js.Function2[js.Dynamic, LatLng, Marker]] = js.undefined,
//    style: js.UndefOr[js.Function1[js.Dynamic, PathOptions]] = js.undefined,
//    onEachFeature: js.UndefOr[js.Function1[js.Dynamic, Marker]] = js.undefined,
//    filter: js.UndefOr[js.Function1[js.Dynamic, Boolean]] = js.undefined,
//    coordsToLatLng: js.UndefOr[js.Function1[Array[Double], LatLng]] = js.undefined
//  ): GeoJSONOptions = {
//    OptionsUtil.merge[GeoJSONOptions](
//      Seq(
//        js.Dynamic.literal(
//          pointToLayer = pointToLayer,
//          style = style,
//          onEachFeature = onEachFeature,
//          filter = filter,
//          coordsToLatLng = coordsToLatLng
//        )
//      )
//    )
//  }
//}
