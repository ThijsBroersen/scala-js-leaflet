package nl.thijsbroersen.leafletjs.L

import nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Bounds extends js.Object {
  def min: Point
  def max: Point

  def getCenter(round: js.UndefOr[Boolean] = js.undefined): Point = js.native
  def getBottomLeft(): Point = js.native
  def getTopRight(): Point = js.native
  def getSize(): Point = js.native
  def contains(otherBounds: Bounds): Boolean = js.native
  def contains(point: Point): Boolean = js.native
  def intersects(otherBounds: Bounds): Boolean = js.native
  def overlaps(otherBounds: Bounds): Boolean = js.native
}

@js.native
@JSGlobal("L.Bounds")
object Bounds extends Class {}

@js.native
@JSGlobal("L.bounds")
object bounds extends js.Any {

  def apply(topLeft: L.Point, bottomRight: L.Point): L.Bounds = js.native
  def apply(points: Array[L.Point]): L.Bounds = js.native
}