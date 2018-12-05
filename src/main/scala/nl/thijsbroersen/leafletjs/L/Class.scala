package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Class extends js.Object {
  def extend(props: js.Object): js.Function0[js.Object] = js.native
  def include(properties: js.Object): this.type = js.native
  def mergeOptions(options: js.Object): this.type = js.native
  def addInitHook(fn: js.Function0[Unit]): this.type = js.native
}

@js.native
@JSGlobal("L.Class")
object Class extends Class {}