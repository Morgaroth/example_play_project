package controllers

import play.api._
import play.api.mvc._
import models.User

object Application extends Controller {

  def index = Action {
    val user = new User()
    Ok(user.updated)
  }



}