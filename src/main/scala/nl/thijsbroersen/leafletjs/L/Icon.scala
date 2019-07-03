package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import js.annotation.{JSGlobal, JSName}

@js.native
trait Icon extends Layer {
  def createIcon(oldIcon: js.UndefOr[HTMLElement]): HTMLElement   = js.native
  def createShadow(oldIcon: js.UndefOr[HTMLElement]): HTMLElement = js.native
}

@js.native
@JSGlobal("L.Icon")
object Icon extends Class {
  @js.native
  @JSName("Default")
  object Default extends Icon {}
}

@js.native
@JSGlobal("L.icon")
object icon extends js.Object {

  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Icon = js.native
}
