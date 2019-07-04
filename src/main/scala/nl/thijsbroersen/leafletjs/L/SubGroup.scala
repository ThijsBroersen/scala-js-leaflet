package nl.thijsbroersen.leafletjs.L

import scala.scalajs.js

@js.native
trait SubGroup extends FeatureGroup {
  def setParentGroup(parentGroup: Layer): this.type     = js.native
  def setParentGroupSafe(parentGroup: Layer): this.type = js.native
  def getParentGroup(): Layer                           = js.native
}
