package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.SVGElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
trait SVGOverlay extends Overlay {
  def getElement(): SVGElement = js.native
}

@js.native
@JSGlobal("L.SVGOverlay")
object SVGOverlay extends Class {}

@js.native
@JSGlobal("L.svgOverlay")
object svgOverlay extends js.Object {

  def apply(svg: String | SVGElement,
            bounds: LatLngBounds,
            options: js.UndefOr[js.Dictionary[_]] = js.undefined): SVGOverlay = js.native
  //  def wms(baseUrl: js.UndefOr[String] = js.undefined, options: js.UndefOr[js.Object] = js.undefined): L.WMSlayer = js.native
}
