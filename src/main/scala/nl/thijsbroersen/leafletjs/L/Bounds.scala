package nl.thijsbroersen.leafletjs.L

import nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Bounds extends js.Object {
  def min: Point
  def max: Point

  def extend(point: Point): this.type                             = js.native
  def getCenter(round: js.UndefOr[Boolean] = js.undefined): Point = js.native
  def getBottomLeft(): Point                                      = js.native
  def getTopRight(): Point                                        = js.native
  def getTopLeft(): Point                                         = js.native
  def getBottomRight(): Point                                     = js.native
  def getSize(): Point                                            = js.native
  def contains(otherBounds: Bounds): Boolean                      = js.native
  def contains(point: Point): Boolean                             = js.native
  def intersects(otherBounds: Bounds): Boolean                    = js.native
  def overlaps(otherBounds: Bounds): Boolean                      = js.native
}

@js.native
@JSGlobal("L.Bounds")
object Bounds extends js.Any {}

@js.native
@JSGlobal("L.bounds")
object bounds extends js.Any {

  def apply(corner1: L.Point, corner2: L.Point): L.Bounds = js.native
  def apply(points: js.Array[L.Point]): L.Bounds          = js.native
}
