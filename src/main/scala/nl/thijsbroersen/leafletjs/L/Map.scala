package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.html.Div
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Map extends Evented {
  def addControl(layer: Control): this.type = js.native
  def removeControl(layer: Control): this.type = js.native
  def addLayer(layer: Layer): this.type = js.native
  def removeLayer(layer: Layer): this.type = js.native
  def hasLayer(layer: Layer): Boolean = js.native
  def eachLayer(f: => Unit): this.type = js.native
  def openPopup(popup: Popup): this.type = js.native
  def openPopup(content: String | HTMLElement, latLng: LatLng, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def closePopup(popup: js.UndefOr[Popup]): this.type = js.native
  def openTooltip(tooltip: Tooltip): this.type = js.native
  def openTooltip(content: String | HTMLElement, latLng: LatLng, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def closeTooltip(tooltip: js.UndefOr[Tooltip]): this.type = js.native

  def setView(latLng: LatLng, zoom: Int, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def setZoom(zoom: Int, options: js.Dictionary[Any]): this.type = js.native
  def zoomIn(delta: Int, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def zoomOut(delta: Int, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def setZoomAround(latLng: LatLng, zoom: Int, options: js.Dictionary[Any]): this.type = js.native
  def setZoomAround(offset: Point, zoom: Int, options: js.Dictionary[Any]): this.type = js.native
  def fitBounds(bounds: LatLngBounds, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def fitWorld(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def panTo(latLng: LatLng, options: js.Dictionary[Any]): this.type = js.native
  def panBy(offset: Point): this.type = js.native
  def flyTo(latLng: LatLng, zoom: js.UndefOr[Int] = js.undefined, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def flyToBounds(bounds: LatLngBounds, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def setMaxBounds(bounds: Bounds): this.type = js.native
  def setMinZoom(zoom: Int): this.type = js.native
  def setMaxZoom(zoom: Int): this.type = js.native
  def panInsideBounds(bounds: LatLngBounds, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def invalidateSize(options: js.Dictionary[Any]): this.type = js.native
  def invalidateSize(animate: Boolean): this.type = js.native
  def stop(): this.type = js.native

  def locate(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): this.type = js.native
  def stopLocate(): this.type = js.native

  //  def addHandler(name: String, handlerclass: )
  def remove(): this.type = js.native
  def createPane(name: String, container: js.UndefOr[HTMLElement] = js.undefined): HTMLElement = js.native
  def getPane(pane: String | HTMLElement): HTMLElement = js.native
  def getPanes(): js.Dictionary[HTMLElement] = js.native
  def getContainer(): HTMLElement = js.native
  def whenReady(fn: js.Function0[_], context: js.UndefOr[js.Object]): this.type = js.native

  def getCenter(): LatLng = js.native
  def getZoom(): Int = js.native
  def getBounds(): LatLngBounds = js.native
  def getMinZoom(): Int = js.native
  def getMaxZoom(): Int = js.native
  def getBoundsZoom(bounds: LatLngBounds, inside: js.UndefOr[Boolean] = js.undefined): Int = js.native
  def getSize(): Point = js.native
  def getPixelBounds(): Bounds = js.native
  def getPixelOrigin(): Point = js.native
  def getPixelWorldBounds(zoom: js.UndefOr[Int] = js.undefined): Bounds = js.native

  def getZoomScale(toZoom: Int, fromZoom: Int): Int = js.native
  def getScaleZoom(scale: Int, fromZoom: Int): Int = js.native
  def project(latlng: LatLng, zoom: Int): Point = js.native
  def unproject(point: Point, zoom: Int): LatLng = js.native
  def layerPointToLatLng(point: Point): LatLng = js.native
  def latLngToLayerPoint(latlng: LatLng): Point = js.native
  def wrapLatLng(latlng: LatLng): LatLng = js.native
  def wrapLatLngBounds(latLngBounds: LatLngBounds): LatLngBounds = js.native
  def distance(latlng1: LatLng, latlng2: LatLng): Double = js.native
  def containerPointToLayerPoint(point: Point): Point = js.native
  def layerPointToContainerPoint(point: Point): Point = js.native
  def containerPointToLatLng(point: Point): LatLng = js.native
  def latLngToContainerPoint(latlng: LatLng): Point = js.native
  def mouseEventToContainerPoint(ev: MouseEvent): Point = js.native
  def mouseEventToLayerPoint(ev: MouseEvent): Point = js.native
  def mouseEventToLatLng(ev: MouseEvent): LatLng = js.native
}

@js.native
@JSGlobal("L.Map")
object Map extends Class {}

@js.native
@JSGlobal("L.map")
object map extends js.Any {

  def apply(el: Div, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Map = js.native
}

//trait MapOptions extends js.Object {
//  val preferCanvas: Boolean = js.native
//  val attributionControl: Boolean = js.native
//  val zoomControl: Boolean = js.native
//  val closePopupOnClick: Boolean = js.native
//  val zoomSnap: Double = js.native
//  val zoomDelta: Double = js.native
//  val trackResize: Boolean = js.native
//  val boxZoom: Boolean = js.native
//  val doubleClickZoom: Boolean = js.native
//  val dragging: Boolean = js.native
//  val crs: CRS = js.native
//  val center: LatLng = js.native
//  val zoom: js.UndefOr[Int] = js.native
//  val minZoom: js.UndefOr[Int] = js.native
//  val maxZoom: js.UndefOr[Int] = js.native
//  val layers: Array[Layer] = js.native
//  val maxBounds: LatLngBounds = js.native
//  val renderer: js.UndefOr[Renderer] = js.native
//  val zoomAnimation: Boolean = js.native
//  val zoomAnimationThreshold: Int = js.native
//  val fadeAnimation: Boolean = js.native
//  val transform3DLimit: Double = js.native
//  val inertia: js.UndefOr[Boolean] = js.native
//  val inertiaDeceleration: Int = js.native
//  val inertiaMaxSpeed: Double = js.native
//  val easeLinearity: Double = js.native
//  val worldCopyJump: Boolean = js.native
//  val maxBoundsViscosity: Double = js.native
//  val keyboard: Boolean = js.native
//  val keyboardPanDelta: Int = js.native
//  val scrollWheelZoom: Boolean = js.native
//  val wheelDebounceTime: Int = js.native
//  val wheelPxPerZoomLevel: Int = js.native
//  val tap: Boolean = js.native
//  val tapTolerance: Int = js.native
//  val touchZoom: Boolean = js.native
//  val bounceAtZoomLimits: Boolean = js.native
//}
//
//object MapOptions {
//  def apply(
//    preferCanvas: js.UndefOr[Boolean] = js.undefined,
//    attributionControl: js.UndefOr[Boolean] = js.undefined,
//    zoomControl: js.UndefOr[Boolean] = js.undefined,
//    closePopupOnClick: js.UndefOr[Boolean] = js.undefined,
//    zoomSnap: js.UndefOr[Double] = js.undefined,
//    zoomDelta: js.UndefOr[Double] = js.undefined,
//    trackResize: js.UndefOr[Boolean] = js.undefined,
//    boxZoom: js.UndefOr[Boolean] = js.undefined,
//    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
//    dragging: js.UndefOr[Boolean] = js.undefined,
//    crs: js.UndefOr[CRS] = js.undefined, //CRS = CRS.EPSG3857,
//    center: js.UndefOr[LatLng] = js.undefined,
//    zoom: js.UndefOr[Int] = js.undefined,
//    minZoom: js.UndefOr[Int] = js.undefined,
//    maxZoom: js.UndefOr[Int] = js.undefined,
//    layers: js.UndefOr[Array[Layer]] = js.undefined, //Array[Layer] = Array(),
//    maxBounds: js.UndefOr[LatLngBounds] = js.undefined,
//    renderer: js.UndefOr[Renderer] = js.undefined,
//    zoomAnimation: js.UndefOr[Boolean] = js.undefined,
//    zoomAnimationThreshold: js.UndefOr[Int] = js.undefined,
//    transform3DLimit: js.UndefOr[Double] = js.undefined,
//    inertia: js.UndefOr[Boolean] = js.undefined,
//    inertiaDeceleration: js.UndefOr[Int] = js.undefined,
//    inertiaMaxSpeed: js.UndefOr[Double] = js.undefined,
//    easeLinearity: js.UndefOr[Double] = js.undefined,
//    worldCopyJump: js.UndefOr[Boolean] = js.undefined,
//    maxBoundsViscosity: js.UndefOr[Double] = js.undefined,
//    keyboard: js.UndefOr[Boolean] = js.undefined,
//    keyboardPanDelta: js.UndefOr[Int] = js.undefined,
//    scrollWheelZoom: js.UndefOr[Boolean | String] = js.undefined,
//    wheelDebounceTime: js.UndefOr[Int] = js.undefined,
//    wheelPxPerZoomLevel: js.UndefOr[Int] = js.undefined,
//    tap: js.UndefOr[Boolean] = js.undefined,
//    tapTolerance: js.UndefOr[Int] = js.undefined,
//    touchZoom: js.UndefOr[Boolean | String] = js.undefined,
//    bounceAtZoomLimits: js.UndefOr[Boolean] = js.undefined
//  ): MapOptions = {
//    OptionsUtil.merge[MapOptions](
//      Seq(
//        js.Dynamic.literal(
//          preferCanvas = preferCanvas,
//          attributionControl = attributionControl,
//          zoomControl = zoomControl,
//          closePopupOnClick = closePopupOnClick,
//          zoomSnap = zoomSnap,
//          zoomDelta = zoomDelta,
//          trackResize = trackResize,
//          boxZoom = boxZoom,
//          doubleClickZoom = doubleClickZoom,
//          dragging = dragging,
//          crs = crs,
//          center = center,
//          zoom = zoom,
//          minZoom = minZoom,
//          maxZoom = maxZoom,
//          layers = layers,
//          maxBounds = maxBounds,
//          renderer = renderer,
//          zoomAnimation = zoomAnimation,
//          zoomAnimationThreshold = zoomAnimationThreshold,
//          transform3DLimit = transform3DLimit,
//          inertia = inertia,
//          inertiaDeceleration = inertiaDeceleration,
//          inertiaMaxSpeed = inertiaMaxSpeed,
//          easeLinearity = easeLinearity,
//          worldCopyJump = worldCopyJump,
//          maxBoundsViscosity = maxBoundsViscosity,
//          keyboard = keyboard,
//          keyboardPanDelta = keyboardPanDelta,
//          scrollWheelZoom = scrollWheelZoom.asInstanceOf[js.UndefOr[js.Dynamic]],
//          wheelDebounceTime = wheelDebounceTime,
//          wheelPxPerZoomLevel = wheelPxPerZoomLevel,
//          tap = tap,
//          tapTolerance = tapTolerance,
//          touchZoom = touchZoom.asInstanceOf[js.UndefOr[js.Dynamic]],
//          bounceAtZoomLimits = bounceAtZoomLimits
//        )
//      )
//    )
//  }
//}

//trait LocateOptions extends js.Object {
//  val watch: Boolean = js.native
//  val setView: Boolean = js.native
//  val maxZoom: Int = js.native
//  val timeout: Int = js.native
//  val maximumAge: Int = js.native
//  val enableHighAccuracy: Boolean = js.native
//}
//
//object LocateOptions {
//  def apply(
//    watch: js.UndefOr[Boolean] = js.undefined,
//    setView: js.UndefOr[Boolean] = js.undefined,
//    maxZoom: js.UndefOr[Int] = js.undefined,
//    timeout: js.UndefOr[Int] = js.undefined,
//    maximumAge: js.UndefOr[Int] = js.undefined,
//    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
//  ): LocateOptions = {
//    OptionsUtil.merge[LocateOptions](
//      Seq(
//        js.Dynamic.literal(
//          watch = watch,
//          setView = setView,
//          maxZoom = maxZoom,
//          timeout = timeout,
//          maximumAge = maximumAge,
//          enableHighAccuracy = enableHighAccuracy
//        )
//      )
//    )
//  }
//}

//trait ZoomOptions extends js.Object {
//  val animate: Boolean = js.native
//}
//
//object ZoomOptions {
//  def apply(
//    animate: js.UndefOr[Boolean] = js.undefined
//  ): ZoomOptions = {
//    OptionsUtil.merge[ZoomOptions](
//      Seq(
//        js.Dynamic.literal(
//          animate = animate
//        )
//      )
//    )
//  }
//}
//
//trait PanOptions extends js.Object {
//  val animate: Boolean = js.native
//  val duration: Double = js.native
//  val easeLinearity: Double = js.native
//  val noMoveStart: Boolean = js.native
//}
//
//object PanOptions {
//  def apply(
//    animate: js.UndefOr[Boolean] = js.undefined,
//    duration: js.UndefOr[Double] = js.undefined,
//    easeLinearity: js.UndefOr[Double] = js.undefined,
//    noMoveStart: js.UndefOr[Boolean] = js.undefined
//  ): PanOptions = {
//    OptionsUtil.merge[PanOptions](
//      Seq(
//        js.Dynamic.literal(
//          animate = animate,
//          duration = duration,
//          easeLinearity = easeLinearity,
//          noMoveStart = noMoveStart
//        )
//      )
//    )
//  }
//}
//
//trait ZoomPanOptions extends /*ZoomOptions with */ PanOptions {
//  val pan: Boolean = js.native
//  val debounceMoveend: Boolean = js.native
//}
//
//object ZoomPanOptions {
//  def apply(
//    pan: js.UndefOr[Boolean] = js.undefined,
//    debounceMoveend: js.UndefOr[Boolean] = js.undefined,
//    //    zoomOptions: ZoomOptions = ZoomOptions(),
//    panOptions: PanOptions = PanOptions()
//  ): PanOptions = {
//    OptionsUtil.merge[ZoomPanOptions](
//      Seq(
//        //        zoomOptions,
//        panOptions,
//        js.Dynamic.literal(
//          pan = pan,
//          debounceMoveend = debounceMoveend
//        )
//      )
//    )
//  }
//}

//trait FitBoundsOptions extends /*ZoomOptions with */ PanOptions {
//  val paddingTopLeft: Point = js.native
//  val paddingBottomRight: Point = js.native
//  val padding: Point = js.native
//  val maxZoom: Int = js.native
//}
//
//object FitBoundsOptions {
//  def apply(
//    paddingTopLeft: js.UndefOr[Point] = js.undefined,
//    paddingBottomRight: js.UndefOr[Point] = js.undefined,
//    padding: js.UndefOr[Point] = js.undefined,
//    maxZoom: js.UndefOr[Int] = js.undefined,
//    panOptions: PanOptions = PanOptions()
//  ): FitBoundsOptions = {
//    OptionsUtil.merge[FitBoundsOptions](
//      Seq(
//        panOptions,
//        js.Dynamic.literal(
//          paddingTopLeft = paddingTopLeft,
//          paddingBottomRight = paddingBottomRight,
//          padding = padding,
//          maxZoom = maxZoom
//        )
//      )
//    )
//  }
//}