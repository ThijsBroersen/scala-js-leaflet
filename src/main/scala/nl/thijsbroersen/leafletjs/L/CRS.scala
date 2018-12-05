package nl.thijsbroersen.leafletjs.L

import nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait CRS extends js.Object {
  def latLngToPoint(latlng: LatLng, zoom: Int): Point = js.native
  def pointToLatLng(point: Point, zoom: Int): LatLng = js.native
  def project(latlng: LatLng): Point = js.native
  def unproject(point: Point): LatLng = js.native
  def scale(zoom: Int): Double = js.native
  def zoom(scale: Int): Double = js.native
  def getProjectedBounds(zoom: Int): Bounds = js.native
  def distance(latlng1: LatLng, latlng2: LatLng): Double = js.native
  def wrapLatLng(latlng: LatLng): LatLng = js.native
  def wrapLatLngBounds(bounds: LatLngBounds): LatLngBounds = js.native

  val code: String = js.native
  val wrapLng: Array[Double] = js.native
  val wrapLat: Array[Double] = js.native
  val infinite: Boolean = js.native
}

@js.native
@JSGlobal("L.CRS")
object CRS extends js.Any {
  val EPSG3395: L.CRS = js.native
  val EPSG3857: L.CRS = js.native
  val EPSG4326: L.CRS = js.native
  val Earth: L.CRS = js.native
  val Simple: L.CRS = js.native
}
