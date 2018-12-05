package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Popup extends Layer {

}

@js.native
@JSGlobal("L.Popup")
object Popup extends Class {}

@js.native
@JSGlobal("L.popup")
object popup extends js.Any {

  def apply[T <: Layer](options: js.UndefOr[js.Dictionary[Any]] = js.undefined, source: js.UndefOr[T]): Popup = js.native
}

//trait PopupOptions extends LayerOptions {
//  val maxWidth: Int = js.native
//  val minWidth: Int = js.native
//  val maxHeight: Int = js.native
//  val autoPan: Boolean = js.native
//  val autoPanPaddingTopLeft: Point = js.native
//  val autoPanPaddingBottomRight: Point = js.native
//  val autoPanPadding: Point = js.native
//  val keepInView: Boolean = js.native
//  val closeButton: Boolean = js.native
//  val closeOnClick: Boolean = js.native
//  val autoClose: Boolean = js.native
//  val className: String = js.native
//}
//
//object PopupOptions extends LayerOptions {
//  def apply(
//    maxWidth: js.UndefOr[Int] = js.undefined,
//    minWidth: js.UndefOr[Int] = js.undefined,
//    maxHeight: js.UndefOr[Int] = js.undefined,
//    autoPan: js.UndefOr[Boolean] = js.undefined,
//    autoPanPaddingTopLeft: js.UndefOr[Point] = js.undefined,
//    autoPanPaddingBottomRight: js.UndefOr[Point] = js.undefined,
//    autoPanPadding: js.UndefOr[Point] = js.undefined,
//    keepInView: js.UndefOr[Boolean] = js.undefined,
//    closeButton: js.UndefOr[Boolean] = js.undefined,
//    closeOnClick: js.UndefOr[Boolean] = js.undefined,
//    autoClose: js.UndefOr[Boolean] = js.undefined,
//    className: js.UndefOr[String] = js.undefined,
//    layerOptions: LayerOptions = LayerOptions()
//  ): PopupOptions = {
//    OptionsUtil.merge[PopupOptions](
//      Seq(
//        layerOptions,
//        js.Dynamic.literal(
//          maxWidth = maxWidth,
//          minWidth = minWidth,
//          maxHeight = maxHeight,
//          autoPan = autoPan,
//          autoPanPaddingTopLeft = autoPanPaddingTopLeft,
//          autoPanPaddingBottomRight = autoPanPaddingBottomRight,
//          autoPanPadding = autoPanPadding,
//          keepInView = keepInView,
//          closeButton = closeButton,
//          closeOnClick = closeOnClick,
//          autoClose = autoClose,
//          className = className
//        )
//      )
//    )
//  }
//}