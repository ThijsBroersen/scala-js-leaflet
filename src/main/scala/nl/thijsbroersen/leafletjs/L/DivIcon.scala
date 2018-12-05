package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait DivIcon extends Icon {}

@js.native
@JSGlobal("L.DivIcon")
object DivIcon extends Class {}

@js.native
@JSGlobal("L.divIcon")
object divIcon extends js.Any {

  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): DivIcon = js.native
}

//trait DivIconOptions extends IconOptions {
//  val html: String = js.native
//  val bgPos: Point = js.native
//}
//
//object DivIconOptions {
//  def apply(
//    html: js.UndefOr[String] = js.undefined,
//    bgPos: js.UndefOr[Point] = js.undefined,
//    iconOptions: IconOptions = IconOptions()
//  ): DivIconOptions = {
//    OptionsUtil.merge[DivIconOptions](
//      Seq(
//        iconOptions, js.Dynamic.literal(
//        html = html,
//        bgPos = bgPos
//      )
//      )
//    )
//  }
//}
