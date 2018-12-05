package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait ImageOverlay extends Layer {
  def setOpacity(opacity: Double): this.type = js.native
  def bringToFront(): this.type = js.native
  def bringToBack(): this.type = js.native
  def setUrl(url: String): this.type = js.native
  def setBounds(bounds: LatLngBounds): this.type = js.native
  def getBounds(): LatLngBounds = js.native

  /**
   *
   * @return HTMLElement, which is an instance of HTMLImageElement
   */
  def getElement(): HTMLElement = js.native
}

@js.native
@JSGlobal("L.ImageOverlay")
object ImageOverlay extends Class {}

@js.native
@JSGlobal("L.imageOverlay")
object imageOverlay extends js.Object {

  def apply(imageUrl: String, bounds: LatLngBounds, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): ImageOverlay = js.native
  //  def wms(baseUrl: js.UndefOr[String] = js.undefined, options: js.UndefOr[js.Object] = js.undefined): L.WMSlayer = js.native
}

//trait ImageOverlayOptions extends LayerOptions with InteractiveLayerOptions {
//  val opacity: Double = js.native
//  val alt: String = js.native
//  val crossOrigin: Boolean = js.native
//  val errorOverlayUrl: String = js.native
//  val zIndex: Int = js.native
//  val className: String = js.native
//}
//
//object ImageOverlayOptions {
//  def apply(
//    opacity: js.UndefOr[Double] = js.undefined,
//    alt: js.UndefOr[String] = js.undefined,
//    crossOrigin: js.UndefOr[Boolean] = js.undefined,
//    errorOverlayUrl: js.UndefOr[String] = js.undefined,
//    zIndex: js.UndefOr[Int] = js.undefined,
//    className: js.UndefOr[String] = js.undefined,
//    interactiveLayerOptions: InteractiveLayerOptions = InteractiveLayerOptions(),
//    layerOptions: LayerOptions = LayerOptions()
//  ): ImageOverlayOptions = {
//    OptionsUtil.merge[ImageOverlayOptions](
//      Seq(
//        layerOptions,
//        interactiveLayerOptions,
//        js.Dynamic.literal(
//          opacity = opacity,
//          alt = alt,
//          crossOrigin = crossOrigin,
//          errorOverlayUrl = errorOverlayUrl,
//          zIndex = zIndex,
//          className = className
//        )
//      )
//    )
//  }
//}
