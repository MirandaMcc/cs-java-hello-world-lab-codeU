package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
		//java version "1.8.0_60"
		String version = System.getProperty("java.version");
		String sub = version.substring(0,3);
		System.out.println(version);
		System.out.println(sub);
        return Double.parseDouble(sub);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
		getVersion();
    }
}
