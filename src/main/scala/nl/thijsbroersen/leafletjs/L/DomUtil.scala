package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

@js.native
@JSGlobal("L.DomUtil")
object DomUtil extends js.Object {
  var TRANSFORM: String = js.native
  var TRANSITION: String = js.native
  var TRANSITION_END: String = js.native

  def get(id: String | HTMLElement): HTMLElement = js.native
  def getStyle(el: HTMLElement, styleAttrib: String): String = js.native
  def create(tagName: String, className: js.UndefOr[String] = js.undefined, container: js.UndefOr[HTMLElement] = js.undefined): HTMLElement = js.native
  def remove(el: HTMLElement): Unit = js.native
  def empty(el: HTMLElement): Unit = js.native
  def toFront(el: HTMLElement): Unit = js.native
  def toBack(el: HTMLElement): Unit = js.native
  def hasClass(el: HTMLElement, name: String): Boolean = js.native
  def addClass(el: HTMLElement, name: String): Unit = js.native
  def removeClass(el: HTMLElement, name: String): Unit = js.native
  def setClass(el: HTMLElement, name: String): Unit = js.native
  def getClass(el: HTMLElement): String = js.native
  def setOpacity(el: HTMLElement, opacity: Double): Unit = js.native
  def testProp(props: js.Array[String]): String | Boolean = js.native
  def setTransform(el: HTMLElement, offset: Point, scale: js.UndefOr[Double] = js.undefined): Unit = js.native
  def setPosition(el: HTMLElement, position: Point): Unit = js.native
  def getPosition(el: HTMLElement): Point = js.native
  def disableTextSelection(): Unit = js.native
  def enableTextSelection(): Unit = js.native
  def disableImageDrag(): Unit = js.native
  def enableImageDrag(): Unit = js.native
  def preventOutline(el: HTMLElement): Unit = js.native
  def restoreOutline(): Unit = js.native
}