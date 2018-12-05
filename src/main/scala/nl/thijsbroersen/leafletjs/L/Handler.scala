package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Handler extends Class {
  def enable(): this.type = js.native
  def disable(): this.type = js.native
  def enabled(): Boolean = js.native
  def addHooks(): Unit
  def removeHooks(): Unit
}

@js.native
@JSGlobal("L.Handler")
object Handler extends Class {}
