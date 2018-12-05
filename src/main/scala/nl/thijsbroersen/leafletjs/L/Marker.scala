package nl.thijsbroersen.leafletjs.L

import nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

//trait MarkerOptions extends LayerOptions with InteractiveLayerOptions {
//  val icon: Icon = js.native
//  val draggable: Boolean = js.native
//  val keyboard: Boolean = js.native
//  val title: String = js.native
//  val alt: String = js.native
//  val zIndexOffset: Int = js.native
//  val opacity: Double = js.native
//  val riseOnHover: Boolean = js.native
//  val riseOffset: Int = js.native
//}
//
//object MarkerOptions {
//  def apply(
//    icon: js.UndefOr[Icon] = js.undefined,
//    draggable: js.UndefOr[Boolean] = js.undefined,
//    keyboard: js.UndefOr[Boolean] = js.undefined,
//    title: js.UndefOr[String] = js.undefined,
//    alt: js.UndefOr[String] = js.undefined,
//    zIndexOffset: js.UndefOr[Int] = js.undefined,
//    opacity: js.UndefOr[Double] = js.undefined,
//    riseOnHover: js.UndefOr[Boolean] = js.undefined,
//    riseOffset: js.UndefOr[Int] = js.undefined,
//    interactiveLayerOptions: InteractiveLayerOptions = InteractiveLayerOptions(),
//    layerOptions: LayerOptions = LayerOptions()
//  ): MarkerOptions = {
//    OptionsUtil.merge[MarkerOptions](
//      Seq(
//        layerOptions,
//        interactiveLayerOptions,
//        js.Dynamic.literal(
//          icon = icon,
//          draggable = draggable,
//          keyboard = keyboard,
//          title = title,
//          alt = alt,
//          zIndexOffset = zIndexOffset,
//          opacity = opacity,
//          riseOnHover = riseOnHover,
//          riseOffset = riseOffset
//        )
//      )
//    )
//    //    OptionsUtil.merge2[MarkerOptions](
//    //      Seq(
//    //        layerOptions,
//    //        interactiveLayerOptions.asInstanceOf[js.Dictionary[_]],
//    //        scala.collection.immutable.Map(
//    //        this.icon -> icon,
//    //        this.draggable -> draggable,
//    //        this.keyboard -> keyboard,
//    //        this.title -> title,
//    //        this.alt -> alt,
//    //        this.zIndexOffset -> zIndexOffset,
//    //        this.opacity -> opacity,
//    //        this.riseOnHover -> riseOnHover,
//    //        this.riseOffset -> riseOffset
//    //      //      this.pane -> pane,
//    //      //      this.attribution -> attribution
//    //      ).toJSDictionary
//    //      )
//    //    )
//  }
//}

/*object MarkerOptions extends MarkerOptionsKeys {

  def apply(
    icon: js.UndefOr[Icon] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[String] = js.undefined,
    alt: js.UndefOr[String] = js.undefined,
    zIndexOffset: js.UndefOr[Int] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    riseOnHover: js.UndefOr[Boolean] = js.undefined,
    riseOffset: js.UndefOr[Int] = js.undefined,
    //             pane: Option[String] = None,
    //             attribution: Option[String] = None,
    layerOptions: js.Dictionary[_] = LayerOptions2()
  ): js.Dictionary[js.Any] = {
    OptionsUtil.merge2(
      Seq(
        layerOptions,
        scala.collection.immutable.Map(
        this.icon -> icon,
        this.draggable -> draggable,
        this.keyboard -> keyboard,
        this.title -> title,
        this.alt -> alt,
        this.zIndexOffset -> zIndexOffset,
        this.opacity -> opacity,
        this.riseOnHover -> riseOnHover,
        this.riseOffset -> riseOffset
      //      this.pane -> pane,
      //      this.attribution -> attribution
      ).filter(_._2 != null).toJSDictionary
      )
    )
  }
}*/

/*object MarkerOptions {
  def apply(
             icon: Icon = null,
             draggable: Boolean = false,
             keyboard: Boolean = true,
             title: String = "",
             alt: String = "",
             zIndexOffset: Int = 0,
             opacity: Double = 1.0,
             riseOnHover: Boolean = false,
             riseOffset: Int = 250,
             pane: String = "markerPane"
           ): MarkerOptions = {
    OptionsUtil.merge[MarkerOptions](
      Seq(
        js.Dynamic.literal(
          icon = icon,
          draggable = draggable,
          keyboard = keyboard,
          title = title,
          alt = alt,
          zIndexOffset = zIndexOffset,
          opacity = opacity,
          riseOnHover = riseOnHover,
          riseOffset = riseOffset,
          pane = pane
        )
      )
    )
  }
}*/

@js.native
trait Marker extends Layer {

  def toGeoJSON(): GeoJSON = js.native
  def getLatLng(): LatLng = js.native
  def setLatLng(latlng: LatLng): this.type = js.native
  def setZIndexOffset(offset: Int): this.type = js.native
  def setIcon(icon: Icon): this.type = js.native
  def setOpacity(opacity: Double): this.type = js.native
}

@js.native
@JSGlobal("L.marker")
object marker extends js.Any {

  def apply(latlng: L.LatLng, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Marker = js.native

}

@js.native
@JSGlobal("L.Marker")
object Marker extends Class {

}

/*@js.native
trait SmoothMarkerBouncing extends Marker {
  def setBouncingOptions(options: js.Object): this.type = js.native
  def isBouncing(): Boolean = js.native
  def bounce(): Unit = js.native
  def bounce(n: Int): Unit = js.native
  def stopBouncing(): Unit = js.native
  def toggleBouncing(): Unit = js.native
}

@js.native
@JSGlobal("L.marker")
object smoothMarkerBouncing extends js.Any {

  def apply(latlng: L.LatLng, options: js.UndefOr[SmoothMarkerBouncingOptions] = js.undefined): SmoothMarkerBouncing = js.native

  def setBouncingOptions(options: js.Object): SmoothMarkerBouncing = js.native
  def getBouncingMarkers(): Array[SmoothMarkerBouncing] = js.native
  def stopAllBouncingMarkers(): Unit = js.native
}

trait SmoothMarkerBouncingOptions extends MarkerOptions {
  val bounceHeight: Int = js.native
  val contractHeight: Int = js.native
  val bounceSpeed: Int = js.native
  val contractSpeed: Int = js.native
  val shadowAngle: Double = js.native
  val elastic: Boolean = js.native
  val exclusive: Boolean = js.native
}

object SmoothMarkerBouncingOptions {
  def apply(
    bounceHeight: Int = 15,
    contractHeight: Int = 12,
    bounceSpeed: Int = 52,
    contractSpeed: Int = 52,
    shadowAngle: js.UndefOr[Double] = js.undefined,
    elastic: Boolean = true,
    exclusive: Boolean = false,
    markerOptions: MarkerOptions = MarkerOptions()
  ): SmoothMarkerBouncingOptions = {
    OptionsUtil.merge[SmoothMarkerBouncingOptions](
      Seq(
        markerOptions,
        js.Dynamic.literal(
          bounceHeight = bounceHeight,
          contractHeight = contractHeight,
          bounceSpeed = bounceSpeed,
          contractSpeed = contractSpeed,
          shadowAngle = shadowAngle,
          elastic = elastic,
          exclusive = exclusive
        )
      )
    )
  }
}*/
