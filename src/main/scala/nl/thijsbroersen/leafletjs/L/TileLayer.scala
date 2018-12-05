package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSGlobal, JSName }

/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait TileLayer extends GridLayer {
  def setUrl(url: String, noReDraw: js.UndefOr[Boolean] = js.undefined): this.type = js.native
  def createTile(coords: Point, done: js.UndefOr[js.Function0[Unit]] = js.undefined): HTMLElement = js.native
}

@js.native
@JSGlobal("L.TileLayer")
object TileLayer extends Class {}

@js.native
@JSGlobal("L.tileLayer")
object tileLayer extends js.Object {

  def apply(urlTemplate: String, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): TileLayer = js.native

  @js.native
  @JSName("wms")
  object wms extends js.Object {

    def apply(baseUrl: String, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): TileLayerWMS = js.native
  }
}

//trait TileLayerOptions extends GridLayerOptions {
//  override val minZoom: Int = js.native
//  override val maxZoom: Int = js.native
//  val maxNativeZoom: js.UndefOr[Int] = js.native
//  val minNativeZoom: js.UndefOr[Int] = js.native
//  val subdomains: Array[String] = js.native
//  val errorTileUrl: String = js.native
//  val zoomOffset: Int = js.native
//  val tms: Boolean = js.native
//  val zoomReverse: Boolean = js.native
//  val detectRetina: Boolean = js.native
//  val crossOrigin: Boolean = js.native
//}
//
//object TileLayerOptions {
//  def apply(
//    minZoom: js.UndefOr[Int] = js.undefined,
//    maxZoom: js.UndefOr[Int] = js.undefined,
//    maxNativeZoom: js.UndefOr[Int] = js.undefined,
//    minNativeZoom: js.UndefOr[Int] = js.undefined,
//    subdomains: js.UndefOr[Array[String]] = js.undefined,
//    errorTileUrl: js.UndefOr[String] = js.undefined,
//    zoomOffset: js.UndefOr[Int] = js.undefined,
//    tms: js.UndefOr[Boolean] = js.undefined,
//    zoomReverse: js.UndefOr[Boolean] = js.undefined,
//    detectRetina: js.UndefOr[Boolean] = js.undefined,
//    crossOrigin: js.UndefOr[Boolean] = js.undefined,
//    gridLayerOptions: GridLayerOptions = GridLayerOptions()
//  ): TileLayerOptions = {
//    OptionsUtil.merge[TileLayerOptions](
//      Seq(
//        gridLayerOptions,
//        js.Dynamic.literal(
//          minZoom = minZoom, maxZoom = maxZoom, maxNativeZoom = maxNativeZoom, minNativeZoom = minNativeZoom,
//          subdomains = subdomains, errorTileUrl = errorTileUrl, zoomOffset = zoomOffset, tms = tms,
//          zoomReverse = zoomReverse, detectRetina = detectRetina, crossOrigin = crossOrigin
//        )
//      )
//    )
//  }
//}

@js.native
trait TileLayerWMS extends TileLayer {
  def setParams(params: js.UndefOr[js.Dictionary[Any]] = js.undefined, noReDraw: js.UndefOr[Boolean] = js.undefined): this.type = js.native
}

//trait TileLayerWMSOptions extends TileLayerOptions {
//  val layers: String = js.native
//  val styles: String = js.native
//  val format: String = js.native
//  val transparent: Boolean = js.native
//  val version: String = js.native
//  val crs: CRS = js.native
//  val uppercase: Boolean = js.native
//}
//
//object TileLayerWMSOptions {
//  def apply(
//    layers: js.UndefOr[String] = js.undefined,
//    styles: js.UndefOr[String] = js.undefined,
//    format: js.UndefOr[String] = js.undefined,
//    transparent: js.UndefOr[Boolean] = js.undefined,
//    version: js.UndefOr[String] = js.undefined,
//    crs: js.UndefOr[CRS] = js.undefined,
//    uppercase: js.UndefOr[Boolean] = js.undefined,
//    tileLayerOptions: TileLayerOptions = TileLayerOptions()
//  ): TileLayerWMSOptions = {
//    OptionsUtil.merge[TileLayerWMSOptions](
//      Seq(
//        tileLayerOptions,
//        js.Dynamic.literal(
//          layers = layers, styles = styles, format = format, transparent = transparent,
//          version = version, crs = crs, uppercase = uppercase
//        )
//      )
//    )
//  }
//}

//@ScalaJSDefined
//class CustomLayer(urlTemplate: String, options: js.UndefOr[TileLayerOptions] = js.undefined) extends js.Object {
//
//}
//
//object CustomLayer {
//  def apply(urlTemplate: String, options: js.UndefOr[TileLayerOptions] = js.undefined): CustomLayer = TileLayer.extend(
//    CustomLayer(urlTemplate, options)
//  )
//}