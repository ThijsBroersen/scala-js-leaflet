package nl.thijsbroersen.leafletjs.L

import nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal}

@js.native
@JSGlobal("L.Projection")
object Projection extends js.Object {

  val LonLat: L.Projection            = js.native
  val Mercator: L.Projection          = js.native
  val SphericalMercator: L.Projection = js.native
  //    @js.native
  //    @JSName("L.Projection.Mercator")
  //    object Mercator extends L.Projection {}
  //
  //    @js.native
  //    @JSName("L.Projection.SphericalMercator")
  //    object SphericalMercator extends L.Projection {}
}

@js.native
trait Projection extends js.Object {
  def project(latlng: LatLng): Point  = js.native
  def unproject(point: Point): LatLng = js.native

  def bounds: LatLngBounds = js.native
}
