package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Circle extends CircleMarker {
  def getBounds(): LatLngBounds = js.native
}

@js.native
@JSGlobal("L.Circle")
object Circle extends Class {}

@js.native
@JSGlobal("L.circle")
object circle extends js.Any {
  def apply(latlng: LatLng, options: js.UndefOr[js.Dictionary[_]] = js.undefined): Circle = js.native
}
