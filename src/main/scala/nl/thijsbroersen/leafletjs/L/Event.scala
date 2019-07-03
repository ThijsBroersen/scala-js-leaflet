package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js.annotation.JSName

@js.native
trait Event extends js.Object {
  @JSName("type")
  def `type`: String            = js.native
  def target: js.Object         = js.native
  def sourceTarget: js.Object   = js.native
  def propagatedFrom: js.Object = js.native
}

@js.native
trait KeyboardEvent extends Event {
  def originalEvent: dom.KeyboardEvent = js.native
}

@js.native
trait MouseEvent extends Event {
  def latlng: LatLng                = js.native
  def layerPoint: Point             = js.native
  def containerPoint: Point         = js.native
  def originalEvent: dom.MouseEvent = js.native
}

@js.native
trait LocationEvent extends Event {
  def latlng: LatLng           = js.native
  def bounds: LatLngBounds     = js.native
  def accuracy: Double         = js.native
  def altitude: Double         = js.native
  def altitudeAccuracy: Double = js.native
  def heading: Double          = js.native
  def speed: Double            = js.native
  def timestamp: Double        = js.native
}

@js.native
trait ErrorEvent extends Event {
  def message: String = js.native
  def code: Int       = js.native
}

@js.native
trait LayerEvent extends Event {
  def layer: Layer = js.native
}

@js.native
trait LayerControlEvent extends Event {
  def layer: Layer = js.native
  def name: String = js.native
}

@js.native
trait TileEvent extends Event {
  def tile: HTMLElement = js.native
  def coords: Point     = js.native
}

@js.native
trait TileErrorEvent extends Event {
  def tile: HTMLElement = js.native
  def coords: Point     = js.native
  def error: js.Error   = js.native
}

@js.native
trait ResizeEvent extends Event {
  def oldSize: Point = js.native
  def newSize: Point = js.native
}

@js.native
trait GeoJSONEvent extends Event {
  def layer: Layer          = js.native
  def properties: js.Object = js.native
  def geometryType: String  = js.native
  def id: String            = js.native
}

@js.native
trait PopupEvent extends Event {
  def popup: Popup = js.native
}

@js.native
trait TooltipEvent extends Event {
  def tooltip: Tooltip = js.native
}

@js.native
trait DragEndEvent extends Event {
  def distance: Double = js.native
}

@js.native
trait ZoomAnimEvent extends Event {
  def center: LatLng    = js.native
  def zoom: Int         = js.native
  def noUpdate: Boolean = js.native
}
