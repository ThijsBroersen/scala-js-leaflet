package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait GridLayer extends Layer {
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
  def getContainer(): HTMLElement = js.native
  def setOpacity(opacity: Double): this.type = js.native
  def setZIndex(zIndex: Int): this.type = js.native
  def isLoading(): Boolean = js.native
  def redraw(): this.type = js.native
  def getTileSize(): Point = js.native
  def createTile(coords: Point, done: js.UndefOr[js.Function0[Unit]] = js.undefined): HTMLElement
}

@js.native
@JSGlobal("L.GridLayer")
object GridLayer extends Class {}

@js.native
@JSGlobal("L.gridLayer")
object gridLayer extends js.Object {

  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): GridLayer = js.native
}

//trait GridLayerOptions extends LayerOptions {
//  val tileSize: Point = js.native
//  val opacity: Double = js.native
//  val updateWhenIdle: Boolean = js.native
//  val updateWhenZooming: Boolean = js.native
//  val updateInterval: Int = js.native
//  val zIndex: Int = js.native
//  val bounds: LatLngBounds = js.native
//  val minZoom: Int = js.native
//  val maxZoom: Int = js.native
//  val noWrap: Boolean = js.native
//  override val pane: String = js.native
//  val className: String = js.native
//  val keepBuffer: Int = js.native
//}
//
//object GridLayerOptions {
//  def apply(
//    tileSize: js.UndefOr[Point] = js.undefined,
//    opacity: js.UndefOr[Double] = js.undefined,
//    updateWhenIdle: js.UndefOr[Boolean] = js.undefined,
//    updateWhenZooming: js.UndefOr[Boolean] = js.undefined,
//    updateInterval: js.UndefOr[Int] = js.undefined,
//    zIndex: js.UndefOr[Int] = js.undefined,
//    bounds: js.UndefOr[LatLngBounds] = js.undefined,
//    minZoom: js.UndefOr[Int] = js.undefined,
//    maxZoom: js.UndefOr[Int] = js.undefined,
//    noWrap: js.UndefOr[Boolean] = js.undefined,
//    pane: js.UndefOr[String] = js.undefined,
//    className: js.UndefOr[String] = js.undefined,
//    keepBuffer: js.UndefOr[Int] = js.undefined,
//    layerOptions: LayerOptions = LayerOptions()
//  ): GridLayerOptions = {
//    OptionsUtil.merge[GridLayerOptions](Seq(layerOptions, js.Dynamic.literal(
//      tileSize = tileSize, opacity = opacity, updateWhenIdle = updateWhenIdle, updateWhenZooming = updateWhenZooming,
//      updateInterval = updateInterval, zIndex = zIndex, bounds = bounds, minZoom = minZoom, maxZoom = maxZoom,
//      noWrap = noWrap, pane = pane, className = className, keepBuffer = keepBuffer
//    )))
//  }
//}
