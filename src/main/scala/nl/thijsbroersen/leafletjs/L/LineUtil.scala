package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.LineUtil")
object LineUtil extends js.Any {
  def simplify(points: js.Array[Point], tolerance: Double): js.Array[Point] = js.native
  def pointToSegmentDistance(p: Point, p1: Point, p2: Point): Int           = js.native
  def closestPointOnSegment(p: Point, p1: Point, p2: Point): Int            = js.native
  def clipSegment(a: Point,
                  b: Point,
                  bounds: Bounds,
                  useLastCode: js.UndefOr[Boolean] = js.undefined,
                  round: js.UndefOr[Boolean] = js.undefined): js.Array[Point] | Boolean = js.native
  def isFlat(latlngs: js.Array[LatLng]): Boolean                                        = js.native
}
