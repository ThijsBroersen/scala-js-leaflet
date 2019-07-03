package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.html.Div
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Map extends Evented {
  def addControl(layer: Control): this.type                                                             = js.native
  def removeControl(layer: Control): this.type                                                          = js.native
  def addLayer(layer: Layer): this.type                                                                 = js.native
  def removeLayer(layer: Layer): this.type                                                              = js.native
  def hasLayer(layer: Layer): Boolean                                                                   = js.native
  def eachLayer(f: js.Function1[Layer, Unit], context: js.UndefOr[js.Object] = js.undefined): this.type = js.native
  def openPopup(popup: Popup): this.type                                                                = js.native
  def openPopup(content: String | HTMLElement,
                latLng: LatLng,
                options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def closePopup(popup: js.UndefOr[Popup]): this.type                              = js.native
  def openTooltip(tooltip: Tooltip): this.type                                     = js.native
  def openTooltip(content: String | HTMLElement,
                  latLng: LatLng,
                  options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def closeTooltip(tooltip: js.UndefOr[Tooltip]): this.type                          = js.native

  def setView(center: LatLng, zoom: Int, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def setZoom(zoom: Int, options: js.Dictionary[Any]): this.type                                            = js.native
  def zoomIn(delta: Int, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type                 = js.native
  def zoomOut(delta: Int, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type                = js.native
  def setZoomAround(latLng: LatLng, zoom: Int, options: js.Dictionary[Any]): this.type                      = js.native
  def setZoomAround(offset: Point, zoom: Int, options: js.Dictionary[Any]): this.type                       = js.native
  def fitBounds(bounds: LatLngBounds, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type    = js.native
  def fitWorld(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type                           = js.native
  def panTo(latLng: LatLng, options: js.Dictionary[Any]): this.type                                         = js.native
  def panBy(offset: Point): this.type                                                                       = js.native
  def flyTo(latLng: LatLng,
            zoom: js.UndefOr[Int] = js.undefined,
            options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type                             = js.native
  def flyToBounds(bounds: LatLngBounds, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def setMaxBounds(bounds: Bounds): this.type                                                              = js.native
  def setMinZoom(zoom: Int): this.type                                                                     = js.native
  def setMaxZoom(zoom: Int): this.type                                                                     = js.native
  def panInsideBounds(bounds: LatLngBounds, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type =
    js.native
  def invalidateSize(options: js.Dictionary[Any]): this.type = js.native
  def invalidateSize(animate: Boolean): this.type            = js.native
  def stop(): this.type                                      = js.native

  def locate(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def stopLocate(): this.type                                                   = js.native

  //  def addHandler(name: String, handlerclass: )
  def remove(): this.type                                                                      = js.native
  def createPane(name: String, container: js.UndefOr[HTMLElement] = js.undefined): HTMLElement = js.native
  def getPane(pane: String | HTMLElement): HTMLElement                                         = js.native
  def getPanes(): js.Dictionary[HTMLElement]                                                   = js.native
  def getContainer(): HTMLElement                                                              = js.native
  def whenReady(fn: js.Function0[_], context: js.UndefOr[js.Object] = js.undefined): this.type = js.native

  def getCenter(): LatLng       = js.native
  def getZoom(): Int            = js.native
  def getBounds(): LatLngBounds = js.native
  def getMinZoom(): Int         = js.native
  def getMaxZoom(): Int         = js.native
  def getBoundsZoom(bounds: LatLngBounds,
                    inside: js.UndefOr[Boolean] = js.undefined,
                    padding: js.UndefOr[Point] = js.undefined): Int     = js.native
  def getSize(): Point                                                  = js.native
  def getPixelBounds(): Bounds                                          = js.native
  def getPixelOrigin(): Point                                           = js.native
  def getPixelWorldBounds(zoom: js.UndefOr[Int] = js.undefined): Bounds = js.native

  def getZoomScale(toZoom: Int, fromZoom: Int): Int              = js.native
  def getScaleZoom(scale: Int, fromZoom: Int): Int               = js.native
  def project(latlng: LatLng, zoom: Int): Point                  = js.native
  def unproject(point: Point, zoom: Int): LatLng                 = js.native
  def layerPointToLatLng(point: Point): LatLng                   = js.native
  def latLngToLayerPoint(latlng: LatLng): Point                  = js.native
  def wrapLatLng(latlng: LatLng): LatLng                         = js.native
  def wrapLatLngBounds(latLngBounds: LatLngBounds): LatLngBounds = js.native
  def distance(latlng1: LatLng, latlng2: LatLng): Double         = js.native
  def containerPointToLayerPoint(point: Point): Point            = js.native
  def layerPointToContainerPoint(point: Point): Point            = js.native
  def containerPointToLatLng(point: Point): LatLng               = js.native
  def latLngToContainerPoint(latlng: LatLng): Point              = js.native
  def mouseEventToContainerPoint(ev: MouseEvent): Point          = js.native
  def mouseEventToLayerPoint(ev: MouseEvent): Point              = js.native
  def mouseEventToLatLng(ev: MouseEvent): LatLng                 = js.native
}

@js.native
@JSGlobal("L.Map")
object Map extends Class {}

@js.native
@JSGlobal("L.map")
object map extends js.Any {

  def apply(id: String | Div, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Map = js.native
}
