package nl.thijsbroersen.leafletjs.L

import nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Marker extends Layer {

  def toGeoJSON(): GeoJSON                    = js.native
  def getLatLng(): LatLng                     = js.native
  def setLatLng(latlng: LatLng): this.type    = js.native
  def setZIndexOffset(offset: Int): this.type = js.native
  def getIcon(): Icon                         = js.native
  def setIcon(icon: Icon): this.type          = js.native
  def setOpacity(opacity: Double): this.type  = js.native
}

@js.native
@JSGlobal("L.marker")
object marker extends js.Any {

  def apply(latlng: L.LatLng, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Marker = js.native

}

@js.native
@JSGlobal("L.Marker")
object Marker extends Class {}
