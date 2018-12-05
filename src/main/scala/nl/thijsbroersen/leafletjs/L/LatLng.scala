package nl.thijsbroersen.leafletjs.L

import nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait LatLng extends js.Object {
  def lat: Double
  def lng: Double
  def alt: Double

  def equals(otherLatLng: LatLng, maxMargin: js.UndefOr[Int] = js.undefined): Boolean = js.native
  def distanceTo(otherLatLng: LatLng): Double = js.native
  def wrap(): LatLng = js.native
  def toBounds(sizeInMeters: Int): LatLngBounds = js.native
  override def toString(): String = js.native
}

@js.native
@JSGlobal("L.LatLng")
object LatLng extends Class {}

@js.native
@JSGlobal("L.latLng")
object latLng extends js.Any {

  def apply(latitude: Double, longitude: Double, altitude: js.UndefOr[Double] = js.undefined): L.LatLng = js.native

  def apply(coords: Array[Double]): L.LatLng = js.native

  def apply(coords: js.Dynamic): L.LatLng = js.native
}