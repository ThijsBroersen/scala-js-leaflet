package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Point extends js.Object {
  def x: Double
  def y: Double

  def add(otherPoint: Point): Point = js.native
  def subtract(otherPoint: Point): Point = js.native
  def divideBy(num: Double): Point = js.native
  def multiplyBy(num: Double): Point = js.native
  def scaleBy(scale: Point): Point = js.native
  def unscaleBy(scale: Point): Point = js.native
  def round(): Point = js.native
  def floor(): Point = js.native
  def ceil(): Point = js.native
  def distanceTo(otherPoint: Point): Double = js.native
  def equals(otherPoint: Point): Boolean = js.native
  def contains(otherPoint: Point): Boolean = js.native
  override def toString(): String = js.native
}

@js.native
@JSGlobal("L.Point")
object Point extends Class {}

@js.native
@JSGlobal("L.point")
object point extends js.Any {

  def apply(x: Double, y: Double, round: js.UndefOr[Boolean] = js.undefined): Point = js.native

  def apply(coords: Array[Double]): Point = js.native

  def apply(coords: js.Dynamic): Point = js.native
}