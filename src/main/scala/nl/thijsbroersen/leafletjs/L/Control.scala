package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.Dictionary
import scala.scalajs.js.annotation.{ JSGlobal, JSName }

@js.native
trait Control extends Class {

  def getPosition(): String = js.native
  def setPosition(position: String): this.type = js.native
  def getContainer(): HTMLElement = js.native
  def addTo(map: Map): this.type = js.native
  def remove(): this.type = js.native
  def onAdd(map: Map): HTMLElement
  def onRemove(map: Map): Unit
}

@js.native
@JSGlobal("L.Control")
object Control extends Class {}

//trait ControlOptions extends js.Object {
//  val position: String = js.native
//}
//
//object ControlOptions {
//  def apply(
//    position: js.UndefOr[String] = js.undefined
//  ): ControlOptions = {
//    OptionsUtil.merge[ControlOptions](
//      Seq(
//        js.Dynamic.literal(
//          position = position
//        )
//      )
//    )
//  }
//}

@js.native
trait Attribution extends Control {
  def setPrefix(prefix: String): this.type = js.native
  def addAttribution(text: String): this.type = js.native
  def removeAttribution(text: String): this.type = js.native
}

//trait AttributionOptions extends ControlOptions {
//  val prefix: String = js.native
//}
//
//object AttributionOptions extends js.Any {
//  def apply(
//    prefix: js.UndefOr[String] = js.undefined,
//    controlOptions: ControlOptions = ControlOptions()
//  ): AttributionOptions = {
//    OptionsUtil.merge[AttributionOptions](
//      Seq(
//        controlOptions,
//        js.Dynamic.literal(
//          prefix = prefix
//        )
//      )
//    )
//  }
//}

@js.native
trait Layers extends Control {
  def addBaseLayer(layer: Layer, name: String): this.type = js.native
  def addOverlay(layer: Layer, name: String): this.type = js.native
  def removeLayer(layer: Layer): this.type = js.native
  def expand(): this.type = js.native
  def collapse(): this.type = js.native
}

//trait LayersOptions extends ControlOptions {
//  val collapsed: Boolean = js.native
//  val autoZIndex: Boolean = js.native
//  val hideSingleBase: Boolean = js.native
//  val sortLayers: Boolean = js.native
//  val sortFunction: js.Function4[Layer, Layer, String, String, Boolean] = js.native
//}
//
//object LayersOptions extends js.Any {
//  def apply(
//    collapsed: js.UndefOr[Boolean] = js.undefined,
//    autoZIndex: js.UndefOr[Boolean] = js.undefined,
//    hideSingleBase: js.UndefOr[Boolean] = js.undefined,
//    sortLayers: js.UndefOr[Boolean] = js.undefined,
//    sortFunction: js.UndefOr[js.Function4[Layer, Layer, String, String, Boolean]] = js.undefined,
//    controlOptions: ControlOptions = ControlOptions()
//  ): LayersOptions = {
//    OptionsUtil.merge[LayersOptions](
//      Seq(
//        controlOptions,
//        js.Dynamic.literal(
//          collapsed = collapsed,
//          autoZIndex = autoZIndex,
//          hideSingleBase = hideSingleBase,
//          sortLayers = sortLayers,
//          sortFunction = sortFunction
//        )
//      )
//    )
//  }
//}

@js.native
trait Scale extends Control {

}

//trait ScaleOptions extends ControlOptions {
//  val maxWidth: Int = js.native
//  val metric: Boolean = js.native
//  val imperial: Boolean = js.native
//  val updateWhenIdle: Boolean = js.native
//}
//
//object ScaleOptions extends js.Any {
//  def apply(
//    maxWidth: js.UndefOr[Int] = js.undefined,
//    metric: js.UndefOr[Boolean] = js.undefined,
//    imperial: js.UndefOr[Boolean] = js.undefined,
//    updateWhenIdle: js.UndefOr[Boolean] = js.undefined,
//    controlOptions: ControlOptions = ControlOptions()
//  ): ScaleOptions = {
//    OptionsUtil.merge[ScaleOptions](
//      Seq(
//        controlOptions,
//        js.Dynamic.literal(
//          maxWidth = maxWidth,
//          metric = metric,
//          imperial = imperial,
//          updateWhenIdle = updateWhenIdle
//        )
//      )
//    )
//  }
//}

@js.native
trait Zoom extends Control {

}

//trait ZoomControlOptions extends ControlOptions {
//  val zoomInText: String = js.native
//  val zoomInTitle: String = js.native
//  val zoomOutText: String = js.native
//  val zoomOutTitle: String = js.native
//}
//
//object ZoomControlOptions extends js.Any {
//  def apply(
//    zoomInText: js.UndefOr[String] = js.undefined,
//    zoomInTitle: js.UndefOr[String] = js.undefined,
//    zoomOutText: js.UndefOr[String] = js.undefined,
//    zoomOutTitle: js.UndefOr[String] = js.undefined,
//    controlOptions: ControlOptions = ControlOptions()
//  ): ZoomControlOptions = {
//    OptionsUtil.merge[ZoomControlOptions](
//      Seq(
//        controlOptions,
//        js.Dynamic.literal(
//          zoomInText = zoomInText,
//          zoomInTitle = zoomInTitle,
//          zoomOutText = zoomOutText,
//          zoomOutTitle = zoomOutTitle
//        )
//      )
//    )
//  }
//}

@js.native
@JSGlobal("L.control")
object control extends js.Object {

  @js.native
  @JSName("attribution")
  object attribution extends js.Any {
    def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Attribution = js.native
  }

  @js.native
  @JSName("layers")
  object layers extends js.Any {
    def apply[T <: Layer](
      baselayers: js.UndefOr[Dictionary[T]] = js.undefined,
      overlays: js.UndefOr[Dictionary[T]] = js.undefined,
      options: js.UndefOr[js.Dictionary[Any]] = js.undefined
    ): Layers = js.native
  }

  @js.native
  @JSName("scale")
  object scale extends js.Any {
    def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Scale = js.native
  }

  @js.native
  @JSName("zoom")
  object zoom extends js.Any {
    def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Zoom = js.native
  }
}
