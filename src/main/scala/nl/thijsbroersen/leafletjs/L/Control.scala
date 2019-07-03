package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.Dictionary
import scala.scalajs.js.annotation.{JSGlobal, JSName}

@js.native
trait Control extends Class {

  def getPosition(): String                    = js.native
  def setPosition(position: String): this.type = js.native
  def getContainer(): HTMLElement              = js.native
  def addTo(map: Map): this.type               = js.native
  def remove(): this.type                      = js.native
}

@js.native
@JSGlobal("L.Control")
object Control extends Class {}

@js.native
trait Attribution extends Control {
  def setPrefix(prefix: String): this.type       = js.native
  def addAttribution(text: String): this.type    = js.native
  def removeAttribution(text: String): this.type = js.native
}

@js.native
trait Layers extends Control {
  def addBaseLayer(layer: Layer, name: String): this.type = js.native
  def addOverlay(layer: Layer, name: String): this.type   = js.native
  def removeLayer(layer: Layer): this.type                = js.native
  def expand(): this.type                                 = js.native
  def collapse(): this.type                               = js.native
}

@js.native
trait Scale extends Control {}

@js.native
trait Zoom extends Control {}

@js.native
@JSGlobal("L.control")
object control extends js.Object {

  @js.native
  @JSName("attribution")
  object attribution extends js.Any {
    def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Attribution = js.native
  }

  @js.native
  @JSName("layers")
  object layers extends js.Any {
    def apply(
        baselayers: js.UndefOr[Dictionary[Layer]] = js.undefined,
        overlays: js.UndefOr[Dictionary[Layer]] = js.undefined,
        options: js.UndefOr[js.Dictionary[Any]] = js.undefined
    ): Layers = js.native
  }

  @js.native
  @JSName("scale")
  object scale extends js.Any {
    def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Scale = js.native
  }

  @js.native
  @JSName("zoom")
  object zoom extends js.Any {
    def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Zoom = js.native
  }
}
