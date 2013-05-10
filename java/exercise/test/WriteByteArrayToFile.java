package com.java.exercise.test;

/**
 * 
 * Unit Testing
 *
 * Write a class that calculates if there is enough space on a file system to write x bytes.
 * 
 * Class to check if File system has enough space to write bytes to a file.
 * @author v497sff
 *
 */
public class WriteByteArrayToFile {

	public boolean canWriteFile(String File, String filePath) {

		File file = new File("c:");

		String strFilePath = "C://FileIO//demo.txt";

		boolean canWrite = false;

		try {
			FileOutputStream fos = new FileOutputStream(strFilePath);
			long freeSpace = file.getFreeSpace();
			String strContent = "Write File using Java FileOutputStream example !";
			final byte[] utf8Bytes = strContent.getBytes("UTF-8");
			int stringSize = utf8Bytes.length;

			System.out.println("freeSpace" + freeSpace + "\n");
			System.out.println("stringSize" + stringSize + "\n");

			/*
			 * To write byte array to a file, use void write(byte[] bArray)
			 * method of Java FileOutputStream class.
			 * 
			 * This method writes given byte array to a file.
			 */

			if (freeSpace > stringSize) {

				canWrite = true;

				fos.write(strContent.getBytes());

			}

			/*
			 * Close FileOutputStream using, void close() method of Java
			 * FileOutputStream class.
			 */

			fos.close();

		} catch (FileNotFoundException ex) {
			System.out.println("FileNotFoundException : " + ex);
		} catch (IOException ioe) {
			System.out.println("IOException : " + ioe);
		}
		return canWrite;

	}
}
