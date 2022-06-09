package com.revature.controller;

import io.javalin.Javalin;

public class RequestMapping {
	
	public static void configureRoutes(Javalin app) {
		
		app.get("/welcome", ctx -> 
		
		{ctx.result("Welcome to the app.");
		});
		
	}

}
