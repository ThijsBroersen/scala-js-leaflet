package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait FeatureGroup extends LayerGroup {

  def setStyle(style: js.Dictionary[_]): this.type = js.native
  def bringToFront(): this.type                    = js.native
  def bringToBack(): this.type                     = js.native
  def getBounds(): LatLngBounds                    = js.native
}

@js.native
@JSGlobal("L.FeatureGroup")
object FeatureGroup extends Class {}

@js.native
@JSGlobal("L.featureGroup")
object featureGroup extends js.Any {

  def apply(layers: Array[Layer]): FeatureGroup = js.native
}
