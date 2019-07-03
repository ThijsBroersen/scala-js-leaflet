package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Transformation extends Icon {
  def transform(point: Point, scale: js.UndefOr[Double] = js.undefined): Point   = js.native
  def untransform(point: Point, scale: js.UndefOr[Double] = js.undefined): Point = js.native
}

@js.native
@JSGlobal("L.Transformation")
object Transformation extends js.Any {}

@js.native
@JSGlobal("L.transformation")
object transformation extends js.Any {

  def apply(a: Int, b: Int, c: Int, d: Int): Transformation = js.native
}
