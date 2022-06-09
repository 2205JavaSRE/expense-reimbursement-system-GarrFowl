package com.revature;

import com.revature.controller.RequestMapping;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import io.javalin.http.HttpCode;

public class MainDriver {
	
	public static void main(String[] args) {
		
		Javalin myApp = Javalin.create().start(8500);
		
		RequestMapping.configureRoutes(myApp);
		
	}
}
