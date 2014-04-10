package model

/**
 * Created by Marcin on 4/10/2014.
 */
sealed trait UserStatus

case object NewUser extends UserStatus
case object ActiveUser extends UserStatus
case object BlockedUser extends UserStatus

object UserStatus extends SerializableEnum[UserStatus] {
  def mapping = Map[String, UserStatus](
    "NEW" -> NewUser,
    "ACTIVE" -> ActiveUser,
    "BLOCKED" -> BlockedUser
  )
}