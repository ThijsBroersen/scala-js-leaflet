package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.{HTMLElement, HTMLVideoElement}

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by thijs on 12-4-17.
  */
@js.native
trait VideoOverlay extends ImageOverlay {
  override def getElement(): HTMLVideoElement = js.native
}

@js.native
@JSGlobal("L.VideoOverlay")
object VideoOverlay extends Class {}

@js.native
@JSGlobal("L.videoOverlay")
object videoOverlay extends js.Object {

  def apply(videoUrl: String | js.Array[String] | HTMLVideoElement,
            bounds: LatLngBounds,
            options: js.UndefOr[js.Dictionary[Any]] = js.undefined): VideoOverlay = js.native
  //  def wms(baseUrl: js.UndefOr[String] = js.undefined, options: js.UndefOr[js.Object] = js.undefined): L.WMSlayer = js.native
}

//trait VideoOverlayOptions extends ImageOverlayOptions {
//  val autoplay: Boolean = js.native
//  val loop: Boolean = js.native
//}
//
//object VideoOverlayOptions {
//  def apply(
//    autoplay: js.UndefOr[Boolean] = js.undefined,
//    loop: js.UndefOr[Boolean] = js.undefined,
//    imageOverlayOptions: ImageOverlayOptions = ImageOverlayOptions()
//  ): ImageOverlayOptions = {
//    OptionsUtil.merge[ImageOverlayOptions](
//      Seq(
//        imageOverlayOptions,
//        js.Dynamic.literal(
//          autoplay = autoplay, loop = loop
//        )
//      )
//    )
//  }
//}
