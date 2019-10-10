package nl.thijsbroersen.leafletjs.L

import nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

/**
  * Created by thijs on 10-4-17.
  */
@js.native
@JSGlobal("L.Proj")
object Proj extends js.Any {

  @js.native
  @JSName("CRS")
  class CRS(code: String, proj4def: String, options: js.UndefOr[js.Dictionary[_]] = js.undefined) extends L.CRS {}

  @js.native
  trait GeoJSON extends L.GeoJSON {}

  @js.native
  @JSName("GeoJSON")
  object GeoJSON extends Class {}

  @js.native
  @JSName("geoJson")
  object geoJson extends js.Any {
    def apply(geojson: js.UndefOr[js.Dynamic] = js.undefined,
              options: js.UndefOr[js.Dictionary[_]] = js.undefined): GeoJSON = js.native
  }

  @js.native
  trait ImageOverlay extends L.ImageOverlay {}

  @js.native
  @JSName("ImageOverlay")
  object ImageOverlay extends Class {}

  @js.native
  @JSName("imageOverlay")
  object imageOverlay extends js.Any {
    def apply(imageUrl: String, bounds: Bounds, options: js.UndefOr[js.Dictionary[_]] = js.undefined): ImageOverlay =
      js.native
  }
}

//trait CRSOptions extends js.Object {
//  val origin: js.Array[Double] = js.native
//  val transformation: Transformation = js.native
//  val scales: js.Array[Double] = js.native
//  val resolutions: js.Array[Double] = js.native
//  val bounds: Bounds = js.native
//}
//
//object CRSOptions {
//  def apply(
//    origin: js.UndefOr[js.Array[Double]] = js.undefined,
//    transformation: js.UndefOr[Transformation] = js.undefined,
//    scales: js.UndefOr[Array[Double]] = js.undefined,
//    resolutions: js.UndefOr[Array[Double]] = js.undefined,
//    bounds: js.UndefOr[Bounds] = js.undefined
//  ): CRSOptions = {
//    OptionsUtil.merge[CRSOptions](
//      Seq(
//        js.Dynamic.literal(
//          origin = origin,
//          transformation = transformation,
//          scales = scales,
//          resolutions = resolutions,
//          bounds = bounds
//        )
//      )
//    )
//  }
//}
