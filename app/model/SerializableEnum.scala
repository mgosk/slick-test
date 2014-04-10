package model

/**
 * Created by Marcin on 4/10/2014.
 */

import play.api.libs.json._
import play.api.libs.json.JsString
import play.api.libs.json.JsSuccess
import play.api.db.slick.Config.driver.simple._

trait SerializableEnum[T] {
  def mapping: Map[String, T]

  def reverseMapping:Map[T,String] = mapping.map(_.swap)

  implicit def enumWrites = new Writes[T] {
    def writes(o: T): JsValue = JsString(reverseMapping(o))
  }

  implicit val enumReads = new Reads[T] {
    def reads(json: JsValue): JsResult[T] = json match {
      case JsString(s) => JsSuccess(mapping(s))
      case _ => JsError("Enum type should be of proper type")
    }
  }
  implicit val enumTypeMapper = MappedColumnType.base[T, String](reverseMapping, mapping)
}
