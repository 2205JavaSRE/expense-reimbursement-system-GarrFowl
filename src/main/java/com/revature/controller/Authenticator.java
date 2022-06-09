package com.revature.controller;

import io.javalin.http.Context;

public class Authenticator {
	
	public static void authenticateByPathParam(Context ctx) {
		
		System.out.println("We are authenticating...");
		System.out.println(ctx.pathParam("username"));
		System.out.println(ctx.pathParam("password"));
	}
	
	public static void authenticateByFormParam(Context ctx) {
		String username = ctx.formParam("username");
	}

}
