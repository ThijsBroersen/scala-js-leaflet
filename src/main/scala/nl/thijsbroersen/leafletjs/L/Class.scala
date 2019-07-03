package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Class extends js.Object {
  def extend(props: js.Dynamic): js.Function0[js.Dynamic] = js.native
  def include(properties: js.Dynamic): this.type          = js.native
  def mergeOptions(options: js.Dynamic): this.type        = js.native
  def addInitHook(fn: js.Function0[Unit]): this.type      = js.native
}

@js.native
@JSGlobal("L.Class")
object Class extends Class {}
