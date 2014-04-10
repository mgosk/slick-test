package model

import play.api.db.slick.Config.driver.simple._


/**
 * Created by Marcin on 4/10/2014.
 */
/** Table definition for users. */

case class User( login: String, UserStatus: String)

class Users(tag: Tag) extends Table[(String,UserStatus)](tag,"users") {
  def login = column[String]("login")

  def status = column[UserStatus]("status")

  def * = (login , status)
}


