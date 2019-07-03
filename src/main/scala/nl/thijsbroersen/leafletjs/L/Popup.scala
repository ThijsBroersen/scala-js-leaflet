package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Popup extends DivOverlay {
  def getLatLng(): LatLng                  = js.native
  def setLatLng(latlng: LatLng): this.type = js.native
  def getContent(): String | HTMLElement   = js.native
  def setContent(htmlContent: String | HTMLElement | js.Function1[this.type, String | HTMLElement]): this.type =
    js.native
  def getElement(): String | HTMLElement = js.native
  def update(): Unit                     = js.native
  def isOpen(): Boolean                  = js.native
  def bringToFront(): this.type          = js.native
  def bringToBack(): this.type           = js.native
  def openOn(map: Map): this.type        = js.native
}

@js.native
@JSGlobal("L.Popup")
object Popup extends Class {}

@js.native
@JSGlobal("L.popup")
object popup extends js.Any {

  def apply(options: js.UndefOr[js.Dictionary[_]] = js.undefined, source: js.UndefOr[Layer]): Popup =
    js.native
}
