package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait LayerGroup extends Layer {
  def toGeoJSON(): js.Dynamic = js.native
  def addLayer[S <: Layer](layer: S): this.type = js.native
  def removeLayer[S <: Layer](layer: S): this.type = js.native
  def removeLayer(id: Int): this.type = js.native
  def hasLayer[T <: Layer](layer: T): Boolean = js.native
  def hasLayer(id: Int): Boolean = js.native
  def clearLayers(): this.type = js.native
  def invoke(methodName: String, args: Any*): this.type = js.native
  def eachLayer[T <: Layer](fn: js.Function1[T, js.Any], context: js.UndefOr[js.Object] = js.undefined): this.type = js.native
  def getLayer[S <: Layer](id: Int): Layer = js.native
  def getLayers[S <: Layer](): Array[Layer] = js.native
  def setZIndex(zIndex: Int): this.type = js.native
  def getLayerId[T <: Layer](layer: T): Int = js.native
}

@js.native
@JSGlobal("L.LayerGroup")
object LayerGroup extends Class {}

@js.native
@JSGlobal("L.layerGroup")
object layerGroup extends js.Any {

  def apply(layers: Array[Layer]): LayerGroup = js.native
}