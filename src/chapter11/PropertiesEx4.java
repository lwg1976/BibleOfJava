package chapter11;

import java.util.*;

public class PropertiesEx4 {

	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		System.out.println("Java.version : " + sysProp.getProperty("java.version"));
		System.out.println("user.language : " + sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}
}