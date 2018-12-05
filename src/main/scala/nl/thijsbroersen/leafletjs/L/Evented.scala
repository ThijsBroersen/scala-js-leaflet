package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
/**
 * Created by thijs on 12-4-17.
 */
@js.native
trait Evented extends Class {
  val options: js.Dictionary[js.Any] = js.native

  def on(`type`: String, fn: js.Function1[_ <: Event, Unit], context: js.UndefOr[js.Object] = js.undefined): this.type = js.native
  //  def on(eventMap: js.Object): this.type = js.native
  def off(`type`: js.UndefOr[String] = js.undefined, fn: js.Function1[_ <: Event, Unit]): this.type = js.native
  def off(): this.type = js.native
  def fire(`type`: String, data: js.UndefOr[js.Object] = js.undefined, propagate: js.UndefOr[Boolean] = js.undefined): this.type = js.native
  def listens(`type`: String): Boolean = js.native
  def once(`type`: String, fn: js.Function1[_ <: Event, Unit]): this.type = js.native
  def addEventParent(obj: Evented): this.type = js.native
  def removeEventParent(obj: Evented): this.type = js.native

  //Alias methods to above methods
  def addEventListener(tpe: String, fn: js.Function1[_ <: Event, Unit]): this.type = js.native
  def removeEventListener(tpe: js.UndefOr[String] = js.undefined, fn: js.Function1[_ <: Event, Unit]): this.type = js.native
  def clearAllEventListeners(): this.type = js.native
  def addOneTimeEventListener(tpe: String, fn: js.Function1[_ <: Event, Unit]): this.type = js.native
  def fireEvent(tpe: String, data: js.UndefOr[js.Object] = js.undefined, propagate: js.UndefOr[Boolean] = js.undefined): this.type = js.native
  def hasEventListeners(tpe: String): Boolean = js.native
}

@js.native
@JSGlobal("L.Evented")
object Evented extends Evented {}