package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Tooltip extends Layer {

}

@js.native
@JSGlobal("L.tooltip")
object Tooltip extends js.Any {

  def apply[T <: Layer](options: js.UndefOr[js.Dictionary[Any]] = js.undefined, source: js.UndefOr[T]): Tooltip = js.native
}

//trait TooltipOptions extends LayerOptions {
//  override val pane: String = js.native
//  val offset: Boolean = js.native
//  val direction: String = js.native
//  val permanent: Boolean = js.native
//  val sticky: Boolean = js.native
//  val interactive: Boolean = js.native
//  val opacity: Double = js.native
//}
//
//object TooltipOptions {
//  def apply(
//    pane: String = "tooltipPane",
//    offset: Point = point(0, 0),
//    direction: String = "auto",
//    permanent: Boolean = false,
//    sticky: Boolean = false,
//    interactive: Boolean = false,
//    opacity: Double = 1.0,
//    layerOptions: LayerOptions = LayerOptions()
//  ): TooltipOptions = {
//    OptionsUtil.merge[TooltipOptions](
//      Seq(
//        layerOptions,
//        js.Dynamic.literal(
//          pane = pane,
//          offset = offset,
//          direction = direction,
//          permanent = permanent,
//          sticky = sticky,
//          interactive = interactive,
//          opacity = opacity
//        )
//      )
//    )
//  }
//}