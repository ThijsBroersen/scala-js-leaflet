package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Layer extends Evented {

  def addTo(map: Map | LayerGroup): this.type                       = js.native
  def remove(): this.type                                           = js.native
  def removeFrom(map: Map): this.type                               = js.native
  def getPane(name: js.UndefOr[String] = js.undefined): HTMLElement = js.native
  def getAttribution(): String                                      = js.native

  def bindPopup(content: String | HTMLElement | js.Function1[this.type, String | HTMLElement] | Popup,
                options: js.UndefOr[js.Object] = js.undefined): this.type = js.native
  def unbindPopup(): this.type                                            = js.native
  def openPopup(latlng: js.UndefOr[LatLng] = js.undefined): this.type     = js.native
  def closePopup(): this.type                                             = js.native
  def togglePopup(): this.type                                            = js.native
  def isPopupOpen(): Boolean                                              = js.native
  def setPopupContent(content: String | HTMLElement | Popup): this.type   = js.native
  def getPopup(): Popup                                                   = js.native

  def bindTooltip(content: String | HTMLElement | js.Function1[this.type, String | HTMLElement] | Tooltip,
                  options: js.UndefOr[js.Object] = js.undefined): this.type = js.native
  def unbindTooltip(): this.type                                            = js.native
  def openTooltip(latlng: js.UndefOr[LatLng] = js.undefined): this.type     = js.native
  def closeTooltip(): this.type                                             = js.native
  def toggleTooltip(): this.type                                            = js.native
  def isTooltipOpen(): Boolean                                              = js.native
  def setTooltipContent(content: String | HTMLElement | Tooltip): this.type = js.native
  def getTooltip(): Tooltip                                                 = js.native

}
