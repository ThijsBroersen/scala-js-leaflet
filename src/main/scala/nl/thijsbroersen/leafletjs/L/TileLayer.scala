package nl.thijsbroersen.leafletjs.L

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}

/**
  * Created by thijs on 12-4-17.
  */
@js.native
trait TileLayer extends GridLayer {
  def setUrl(url: String, noReDraw: js.UndefOr[Boolean] = js.undefined): this.type                = js.native
  def createTile(coords: Point, done: js.UndefOr[js.Function0[Unit]] = js.undefined): HTMLElement = js.native
}

@js.native
@JSGlobal("L.TileLayer")
object TileLayer extends Class {}

@js.native
@JSGlobal("L.tileLayer")
object tileLayer extends js.Object {

  def apply(urlTemplate: String, options: js.UndefOr[js.Dictionary[_]] = js.undefined): TileLayer = js.native

  @js.native
  @JSName("wms")
  object wms extends js.Object {

    def apply(baseUrl: String, options: js.UndefOr[js.Dictionary[_]] = js.undefined): TileLayerWMS = js.native
  }

  object wmts extends js.Object {
    def apply(url: String, options: js.UndefOr[js.Dictionary[_]] = js.undefined): TileLayerWMTS = js.native
  }
}

@js.native
trait TileLayerWMS extends TileLayer {
  def setParams(params: js.Dictionary[_], noReDraw: js.UndefOr[Boolean] = js.undefined): this.type = js.native
}

@js.native
trait TileLayerWMTS extends TileLayer {
  def defaultWmtsParams: js.Dictionary[js.Any] = js.native
}
