package com.jp.test;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		   FileWriter myWriter;

			try {
				// abren la conexion a la base de datos
				myWriter = new FileWriter("C://filenotfound.txt");

				myWriter.write("Hi, I'm trying to write something.");
				myWriter.close();

			} catch (IOException e) {

				System.out.println("Exception: " + e);

			} finally {
				// cerrar la conexion.
				System.out.println("End of execution.");

			}
	}

}
