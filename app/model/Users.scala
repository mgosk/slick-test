package model

import play.api.db.slick.Config.driver.simple._
import scala.slick.session.Session


/**
 * Created by Marcin on 4/10/2014.
 */
/** Table definition for users. */

case class User( login: String, UserStatus: String)

object Users extends Table[(String,UserStatus)]("users") {
  def login = column[String]("login")

  def status = column[UserStatus]("status")

  def * = login ~ status
}


