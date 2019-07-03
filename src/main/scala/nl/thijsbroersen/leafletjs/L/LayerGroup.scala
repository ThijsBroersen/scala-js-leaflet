package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait LayerGroup extends Layer {
  def toGeoJSON(): js.Dynamic                           = js.native
  def addLayer(layer: Layer): this.type                 = js.native
  def removeLayer(layer: Layer): this.type              = js.native
  def removeLayer(id: Int): this.type                   = js.native
  def hasLayer(layer: Layer): Boolean                   = js.native
  def hasLayer(id: Int): Boolean                        = js.native
  def clearLayers(): this.type                          = js.native
  def invoke(methodName: String, args: Any*): this.type = js.native
  def eachLayer(fn: js.Function1[Layer, Unit], context: js.UndefOr[js.Object] = js.undefined): this.type =
    js.native
  def getLayer(id: Int): Layer          = js.native
  def getLayers(): Array[Layer]         = js.native
  def setZIndex(zIndex: Int): this.type = js.native
  def getLayerId(layer: Layer): Int     = js.native
}

@js.native
@JSGlobal("L.LayerGroup")
object LayerGroup extends Class {}

@js.native
@JSGlobal("L.layerGroup")
object layerGroup extends js.Any {

  def apply(layers: js.UndefOr[Array[Layer]] = js.undefined,
            options: js.UndefOr[js.Dictionary[_]] = js.undefined): LayerGroup = js.native
}
