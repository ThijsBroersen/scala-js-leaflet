package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait GeoJSON extends FeatureGroup {
  def addData(data: js.Dynamic): this.type = js.native
  def resetStyle(layer: Layer): this.type  = js.native
  def setStyle(style: String): this.type   = js.native
}

@js.native
@JSGlobal("L.GeoJSON")
object GeoJSON extends Class {

  def geometryToLayer(featureData: js.Dynamic, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): GeoJSON =
    js.native

  def coordsToLatLng(coords: Array[Double]): LatLng = js.native

  def coordsToLatLngs(coords: Array[Double],
                      levelsDeep: js.UndefOr[Int] = js.undefined,
                      coordsToLatLng: js.Function1[Array[Double], LatLng]): Array[LatLng] = js.native

  def latLngToCoords(latlng: LatLng, precision: js.UndefOr[Int] = js.undefined): Array[Double] = js.native

  def latLngsToCoords(latlng: LatLng,
                      levelsDeep: js.UndefOr[Int] = js.undefined,
                      closed: js.UndefOr[Boolean] = js.undefined): Array[Double] = js.native

  def asFeature(geojson: js.Dynamic): js.Dynamic = js.native
}

@js.native
@JSGlobal("L.geoJSON")
object geoJSON extends js.Any {

  def apply(geojson: js.UndefOr[js.Dynamic] = js.undefined,
            options: js.UndefOr[js.Dictionary[Any]] = js.undefined): GeoJSON = js.native
}
