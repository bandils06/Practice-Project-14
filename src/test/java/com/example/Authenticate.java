package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Authenticate {

	@Test
	@DisplayName("Testcase for Authentication of User")
	void userAuthenticate() {
		assertNotNull(App.id);
		assertEquals(App.D_id,App.id);
	}
	
	@Test
	@DisplayName("Testcase for Authentication of Password")
	void passwordAuthenticate() {
		assertNotNull(App.pwd);
		assertEquals(App.D_pwd, App.pwd);
	}
	
	@BeforeAll
	@DisplayName("First Testcase.")
	static void authenticationTestCase() {
		App.inputID();
	    App.inputPassword();
	    
	    assertNotNull(App.id);
	    assertNotNull(App.pwd);		
	}
	
	@AfterAll
	@DisplayName("Last Testcase.")
	static void last() {
		
		if (App.authenticate())
			System.out.println("Authentication Successfull...");
		else System.out.println("Authentication Failed...");
		
		App.id = null;
		App.pwd = null;
		
		assertNull(App.id);
		assertNull(App.pwd);
	}

}
