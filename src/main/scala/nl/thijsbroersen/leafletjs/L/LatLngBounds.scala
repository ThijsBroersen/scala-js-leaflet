package nl.thijsbroersen.leafletjs.L

import nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait LatLngBounds extends js.Object {

  def extend(latLng: LatLng): LatLngBounds                                                     = js.native
  def extend(otherBounds: LatLngBounds): LatLngBounds                                          = js.native
  def pad(bufferRatio: Double): LatLngBounds                                                   = js.native
  def getCenter(): LatLng                                                                      = js.native
  def getSouthWest(): LatLng                                                                   = js.native
  def getNorthEast(): LatLng                                                                   = js.native
  def getNorthWest(): LatLng                                                                   = js.native
  def getSouthEast(): LatLng                                                                   = js.native
  def getWest(): Double                                                                        = js.native
  def getSouth(): Double                                                                       = js.native
  def getEast(): Double                                                                        = js.native
  def getNorth(): Double                                                                       = js.native
  def contains(otherBounds: LatLngBounds): Boolean                                             = js.native
  def contains(latLng: LatLng): Boolean                                                        = js.native
  def intersects(otherBounds: LatLngBounds): Boolean                                           = js.native
  def overlaps(otherBounds: Bounds): Boolean                                                   = js.native
  def toBBoxString(): String                                                                   = js.native
  def equals(otherBounds: LatLngBounds, maxMargin: js.UndefOr[Double] = js.undefined): Boolean = js.native
  def isValid(): Boolean                                                                       = js.native
}

@js.native
@JSGlobal("L.LatLngBounds")
object LatLngBounds extends Class {}

@js.native
@JSGlobal("L.latLngBounds")
object latLngBounds extends js.Any {

  def apply(corner1: L.LatLng, corner2: L.LatLng): L.LatLngBounds = js.native
  def apply(latlngs: Array[LatLng]): L.LatLngBounds               = js.native
}
