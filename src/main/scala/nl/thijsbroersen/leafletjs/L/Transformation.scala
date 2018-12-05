package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.Transformation")
class Transformation(a: Int, b: Int, c: Int, d: Int) extends js.Object {
  def transform(point: Point, scale: Double): Point = js.native
  def untransform(point: Point, scale: Double): Point = js.native
}
