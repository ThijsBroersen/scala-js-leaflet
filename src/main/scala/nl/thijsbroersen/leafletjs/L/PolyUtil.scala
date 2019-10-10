package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.PolyUtil")
object PolyUtil extends js.Any {
  def clipPolygon(points: js.Array[Point], bounds: Bounds, round: js.UndefOr[Boolean] = js.undefined): js.Array[Point] =
    js.native
}
