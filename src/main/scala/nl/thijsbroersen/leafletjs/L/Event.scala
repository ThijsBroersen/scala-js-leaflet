package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import org.scalajs.dom

import scala.scalajs.js.annotation.JSName

@js.native
trait Event extends js.Object {
  @JSName("type")
  def `type`: String
  def target: js.Object
}

@js.native
trait KeyboardEvent extends Event {
  def originalEvent: dom.KeyboardEvent

}

@js.native
trait MouseEvent extends Event {
  def latlng: LatLng
  def layerPoint: Point
  def containerPoint: Point
  def originalEvent: dom.MouseEvent
}

@js.native
trait LayerEvent extends Event {
   def layer: Layer
}

@js.native
trait ResizeEvent extends Event {
  def oldSize: Point
  def newSize: Point
}

@js.native
trait PopupEvent extends Event {
  def popup: Popup

}

@js.native
trait TooltipEvent extends Event {
  def tooltip: Tooltip

}

@js.native
trait DragEndEvent extends Event {
  def distance: Double

}