package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js

@js.native
trait Layer extends Evented {

  def addTo(map: Map): this.type = js.native
  def remove(): this.type = js.native
  def removeFrom(map: Map): this.type = js.native
  def getPane(name: js.UndefOr[String] = js.undefined): HTMLElement = js.native
  def getAttribution(): String = js.native

  def bindPopup(content: js.Function1[this.type, HTMLElement], options: js.UndefOr[js.Object] = js.undefined): this.type = js.native
  def unbindPopup(): this.type = js.native
  def openPopup(latlng: js.UndefOr[LatLng] = js.undefined): this.type = js.native
  def closePopup(): this.type = js.native
  def togglePopup(): this.type = js.native
  def isPopupOpen(): Boolean = js.native
  def setPopupContent(content: HTMLElement): this.type = js.native
  def getPopup(): Popup = js.native

  def bindTooltip(content: js.Function1[this.type, HTMLElement], options: js.UndefOr[js.Object] = js.undefined): this.type = js.native
  def unbindTooltip(): this.type = js.native
  def openTooltip(latlng: js.UndefOr[LatLng] = js.undefined): this.type = js.native
  def closeTooltip(): this.type = js.native
  def toggleTooltip(): this.type = js.native
  def isTooltipOpen(): Boolean = js.native
  def setTooltipContent(content: HTMLElement): this.type = js.native
  def getTooltip(): Tooltip = js.native
}

//@js.native
//class WMSlayer extends BaseTileLayer[WMSlayer] {
//
//}
//trait LayerOptionsKeys {
//  val pane: String = "pane"
//  val attribution: String = "attribution"
//}
//
//trait LayerOptions extends js.Object {
//  val pane: String = js.native
//  val attribution: String = js.native
//}
//
//object LayerOptions {
//  def apply(
//    pane: js.UndefOr[String] = js.undefined,
//    attribution: js.UndefOr[String] = js.undefined
//  ): LayerOptions = {
//    OptionsUtil.merge[LayerOptions](
//      Seq(
//        js.Dynamic.literal(
//          pane = pane, attribution = attribution
//        )
//      )
//    )
//  }
//}

//object LayerOptions2 extends LayerOptionsKeys {
//  def apply(
//    pane: String = null,
//    attribution: String = null
//  ): js.Dictionary[_] = {
//    scala.collection.immutable.Map(
//      this.pane -> pane,
//      this.attribution -> attribution
//    ).filter(_._2 != null).toJSDictionary
//  }
//}