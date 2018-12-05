package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Path extends Layer {

  def redraw(): this.type = js.native
  def setStyle(style: js.Dictionary[Any]): this.type = js.native
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
}

@js.native
@JSGlobal("L.Path")
object Path extends Class {}

//trait PathOptions extends Layer with InteractiveLayerOptions {
//  val stroke: Boolean = js.native
//  val color: String = js.native
//  val weight: Int = js.native
//  val opacity: Double = js.native
//  val lineCap: String = js.native
//  val lineJoin: String = js.native
//  val dashArray: String = js.native
//  val dashOffset: String = js.native
//  val fill: Boolean = js.native
//  val fillColor: String = js.native
//  val fillOpacity: Double = js.native
//  val fillRule: String = js.native
//  val renderer: Renderer = js.native
//  val className: String = js.native
//}
//
//object PathOptions {
//  def apply(
//    stroke: Boolean = true,
//    color: String = "#3388ff",
//    weight: Int = 3,
//    opacity: Double = 1.0,
//    lineCap: String = "round",
//    lineJoin: String = "round",
//    dashArray: String = null,
//    dashOffset: String = null,
//    fill: js.UndefOr[Boolean] = js.undefined,
//    fillColor: String = null,
//    fillOpacity: Double = 0.2,
//    fillRule: String = "evenodd",
//    renderer: Renderer = null,
//    className: String = null,
//    interactiveLayerOptions: InteractiveLayerOptions = InteractiveLayerOptions(),
//    layerOptions: LayerOptions = LayerOptions()
//  ): PathOptions = {
//    OptionsUtil.merge[PathOptions](
//      Seq(
//        layerOptions,
//        interactiveLayerOptions,
//        js.Dynamic.literal(
//          stroke = stroke,
//          color = color,
//          weight = weight,
//          opacity = opacity,
//          lineCap = lineCap,
//          lineJoin = lineJoin,
//          dashArray = dashArray,
//          dashOffset = dashOffset,
//          fill = fill,
//          fillColor = fillColor,
//          fillOpacity = fillOpacity,
//          fillRule = fillRule,
//          renderer = renderer,
//          className = className
//        )
//      )
//    )
//  }
//}
