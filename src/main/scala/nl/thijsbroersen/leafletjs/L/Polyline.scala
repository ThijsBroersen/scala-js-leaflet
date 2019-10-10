package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by thijs on 12-4-17.
  */
@js.native
trait Polyline extends Path {

  def toGeoJSON(): js.Dynamic                          = js.native
  def getLatLngs(): js.Array[LatLng]                   = js.native
  def setLatLngs(latlngs: js.Array[LatLng]): this.type = js.native
  def isEmpty(): Boolean                               = js.native
  def getCenter(): LatLng                              = js.native
  def getBounds(): LatLngBounds                        = js.native
  def addLatLng(latlng: LatLng): this.type             = js.native
}

@js.native
@JSGlobal("L.Polyline")
object Polyline extends Class {}

@js.native
@JSGlobal("L.polyline")
object polyline extends js.Any {
  def apply(latlngs: js.Array[LatLng], options: js.UndefOr[js.Dictionary[_]] = js.undefined): Polyline = js.native
}

//trait PolylineOptions extends PathOptions {
//  val smoothFactor: Double = js.native
//  val noClip: Boolean = js.native
//}
//
//object PolylineOptions {
//  def apply(
//    smoothFactor: js.UndefOr[Double] = js.undefined,
//    noClip: js.UndefOr[Boolean] = js.undefined,
//    pathOptions: PathOptions = PathOptions()
//  ): PolylineOptions = {
//    OptionsUtil.merge[PolylineOptions](
//      Seq(
//        pathOptions,
//        js.Dynamic.literal(
//          smoothFactor = smoothFactor,
//          noClip = noClip
//        )
//      )
//    )
//  }
//}
