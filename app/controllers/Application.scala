package controllers

import play.api._
import play.api.mvc._
import models.User

object Application extends Controller {

  def index = Action {
    val user: User = new User()
    Ok(user.updsated)
  }


}