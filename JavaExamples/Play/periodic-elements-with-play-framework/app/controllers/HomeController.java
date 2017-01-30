package controllers;

import play.mvc.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;

import models.Element;
import play.db.Database;
import play.libs.Json;

public class HomeController extends Controller {
	
	public HomeController() {
		// empty
	}
	
    public Result index() {
    	return ok(views.html.element.render());
    }

}
