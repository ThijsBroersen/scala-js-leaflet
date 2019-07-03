package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.LineUtil")
object LineUtil extends js.Any {
  def simplify(points: Array[Point], tolerance: Double): Array[Point] = js.native
  def pointToSegmentDistance(p: Point, p1: Point, p2: Point): Int     = js.native
  def closestPointOnSegment(p: Point, p1: Point, p2: Point): Int      = js.native
  def clipSegment(a: Point,
                  b: Point,
                  bounds: Bounds,
                  useLastCode: js.UndefOr[Boolean] = js.undefined,
                  round: js.UndefOr[Boolean] = js.undefined): Array[Point] | Boolean = js.native
  def isFlat(latlngs: Array[LatLng]): Boolean                                        = js.native
}
