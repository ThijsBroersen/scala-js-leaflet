package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js

@js.native
trait Overlay extends Layer {
  def setOpacity(opacity: Double): this.type     = js.native
  def bringToFront(): this.type                  = js.native
  def bringToBack(): this.type                   = js.native
  def setUrl(url: String): this.type             = js.native
  def setBounds(bounds: LatLngBounds): this.type = js.native
  def setZIndex(value: Int): this.type           = js.native
  def getBounds(): LatLngBounds                  = js.native
}
