package com.ControlFlowproj;

public class AsciiChars {
// TODO: Print valid Numeric Input
	public static void printNumbers() {
		for (int i = 48; i <= 57; i++) {
			System.out.println(" The ASCII value of " + i + "  =  " + (char) i);
		}
	}

// TODO: Print valid lower case Input
	public static void printLowerCase() {
		for (int i = 97; i <= 122; i++) {
			System.out.println(" The ASCII value of " + i + "  =  " + (char) i);
		}
	}

// TODO: Print valid Upper case Input
	public static void printUpperCase() {
		for (int i = 65; i <= 90; i++) {
			System.out.println(" The ASCII value of " + i + "  =  " + (char) i);
		}
	}
}
