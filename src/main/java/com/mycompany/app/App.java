package com.mycompany.app;

/**
 * Hello world! 
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
		
		String version = App.class.getPackage().getImplementationVersion();
		System.out.println("Version: " + (version != null ? version : "unknown"));
    }

    public String getMessage() {
        return MESSAGE;
    }
}
