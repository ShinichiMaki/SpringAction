package com.spring.chapter1.knight;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FakePrintStream extends PrintStream {
	private static StringBuffer printBuffer = new StringBuffer();

	public FakePrintStream() {
		// TODO Auto-generated constructor stub
		super(new ByteArrayOutputStream());
	}

	@Override
	public void println(String x) {
		// TODO Auto-generated method stub
		printBuffer.append(x).append("\n");
	}

	public String getPrintedString() {
		return printBuffer.toString();
	}

	public void clear() {
		printBuffer = new StringBuffer();
	}
}
