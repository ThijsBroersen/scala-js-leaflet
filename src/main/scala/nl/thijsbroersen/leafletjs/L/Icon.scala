package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import js.annotation.JSGlobal

//trait IconOptions extends js.Object {
//  val iconUrl: String = js.native
//  val iconRetinaUrl: String = js.native
//  val iconSize: Point = js.native
//  val iconAnchor: Point = js.native
//  val popupAnchor: Point = js.native
//  val shadowUrl: String = js.native
//  val shadowRetinaUrl: String = js.native
//  val shadowSize: Point = js.native
//  val shadowAnchor: Point = js.native
//  val className: String = js.native
//  val tooltipAnchor: Point = js.native
//}
//
//object IconOptions {
//  def apply(
//    iconUrl: js.UndefOr[String] = js.undefined,
//    iconRetinaUrl: js.UndefOr[String] = js.undefined,
//    iconSize: js.UndefOr[Point] = js.undefined,
//    iconAnchor: js.UndefOr[Point] = js.undefined,
//    popupAnchor: js.UndefOr[Point] = js.undefined,
//    shadowUrl: js.UndefOr[String] = js.undefined,
//    shadowRetinaUrl: js.UndefOr[String] = js.undefined,
//    shadowSize: js.UndefOr[Point] = js.undefined,
//    shadowAnchor: js.UndefOr[Point] = js.undefined,
//    className: js.UndefOr[String] = js.undefined,
//    tooltipAnchor: js.UndefOr[Point] = js.undefined
//  ): IconOptions = {
//    OptionsUtil.merge[IconOptions](Seq(js.Dynamic.literal(
//      iconUrl = iconUrl, iconRetinaUrl = iconRetinaUrl, iconSize = iconSize, iconAnchor = iconAnchor,
//      popupAnchor = popupAnchor, shadowUrl = shadowUrl, shadowRetinaUrl = shadowRetinaUrl, shadowSize = shadowSize,
//      shadowAnchor = shadowAnchor, className = className, tooltipAnchor = tooltipAnchor
//    )))
//  }
//}

@js.native
trait Icon extends Layer {
  def createIcon(oldIcon: js.UndefOr[HTMLElement]): HTMLElement = js.native
  def createShadow(oldIcon: js.UndefOr[HTMLElement]): HTMLElement = js.native
}

@js.native
@JSGlobal("L.Icon")
object Icon extends Class {}

@js.native
@JSGlobal("L.icon")
object icon extends js.Object {

  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Icon = js.native
}

//@js.native
//trait IconDefault extends Icon {}
//
//@js.native
//@JSGlobal("L.Icon.Default")
//object IconDefault extends js.Any {
//  def apply(options: IconOptions): IconDefault = js.native
//}
