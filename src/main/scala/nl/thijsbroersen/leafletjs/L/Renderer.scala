package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Renderer extends Layer {

}

@js.native
@JSGlobal("L.Renderer")
object Renderer extends Class {}

//trait RendererOptions extends Layer {
//  val padding: Double = js.native
//}
//
//object RendererOptions {
//  def apply(
//    padding: Double = 0.1,
//    layerOptions: LayerOptions = LayerOptions()
//  ): RendererOptions = {
//    OptionsUtil.merge[RendererOptions](
//      Seq(
//        layerOptions,
//        js.Dynamic.literal(
//          padding = padding
//        )
//      )
//    )
//  }
//}