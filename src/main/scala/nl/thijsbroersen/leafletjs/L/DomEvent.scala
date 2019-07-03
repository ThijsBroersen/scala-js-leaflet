package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.DomEvent")
object DomEvent extends js.Any {
  def on(el: HTMLElement,
         types: String,
         fn: js.Function1[org.scalajs.dom.raw.Event, Unit],
         context: js.UndefOr[js.Dynamic] = js.undefined): this.type =
    js.native
  def on(el: HTMLElement, eventMap: js.Dynamic, context: js.UndefOr[js.Dynamic]): this.type = js.native
  def off(el: HTMLElement,
          types: String,
          fn: js.Function1[org.scalajs.dom.raw.Event, Unit],
          context: js.UndefOr[js.Dynamic] = js.undefined): this.type                         = js.native
  def off(el: HTMLElement, eventMap: js.Dynamic, context: js.UndefOr[js.Dynamic]): this.type = js.native
  def stopPropagation(ev: org.scalajs.dom.raw.Event): this.type                              = js.native
  def disableScrollPropagation(el: HTMLElement): this.type                                   = js.native
  def disableClickPropagation(el: HTMLElement): this.type                                    = js.native
  def preventDefault(ev: org.scalajs.dom.raw.Event): this.type                               = js.native
  def stop(ev: org.scalajs.dom.raw.Event): this.type                                         = js.native
  def getMousePosition(ev: org.scalajs.dom.raw.Event, container: js.UndefOr[HTMLElement] = js.undefined): Point =
    js.native
  def getWheelDelta(ev: org.scalajs.dom.raw.Event): Double = js.native
//  def addListener(el: HTMLElement,
//                  types: String,
//                  fn: js.Function1[org.scalajs.dom.raw.Event, Unit],
//                  context: js.UndefOr[js.Dynamic] = js.undefined): this.type =
//    js.native
//  def addListener(el: HTMLElement, eventMap: js.Dynamic, context: js.UndefOr[js.Dynamic] = js.undefined): this.type =
//    js.native
//  def removeListener(el: HTMLElement,
//                     types: String,
//                     fn: js.Function1[org.scalajs.dom.raw.Event, Unit],
//                     context: js.UndefOr[js.Dynamic] = js.undefined): this.type = js.native
//  def removeListener(el: HTMLElement, eventMap: js.Dynamic, context: js.UndefOr[js.Dynamic] = js.undefined): this.type =
//    js.native
}
