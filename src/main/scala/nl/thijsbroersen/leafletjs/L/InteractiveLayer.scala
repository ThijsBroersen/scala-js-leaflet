package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js

/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait InteractiveLayer extends Layer {

}

//trait InteractiveLayerOptions extends LayerOptions {
//  val interactive: Boolean = js.native
//  val bubblingMouseEvents: Boolean = js.native
//}
//
//object InteractiveLayerOptions {
//  def apply(
//    interactive: js.UndefOr[Boolean] = js.undefined,
//    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
//    layerOptions: LayerOptions = LayerOptions()
//  ): InteractiveLayerOptions = {
//    OptionsUtil.merge[InteractiveLayerOptions](
//      Seq(
//        layerOptions,
//        js.Dynamic.literal(
//          interactive = interactive
//        )
//      )
//    )
//  }
//}
