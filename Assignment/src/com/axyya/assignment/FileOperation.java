package com.axyya.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FileOperation {

	static File f1 = null;

	public static void main(String[] args) {

		// 1. Create a text file in a new folder and few paragraphs
		try {
			f1 = new File("D://newFolder//first.txt");

			System.out.println(f1.length());

			// 4.grant all permissions over the file
			f1.setReadable(true); // read
			f1.setWritable(true); // write
			f1.setExecutable(true); // execute

			// 2. check if a file or directory has read and write permission
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());

			// 3. revoke all permissions over the file
			System.out.println(f1.canExecute());

			//7. store text file content line by line into an array

			FileWriter fr = new FileWriter("D://newFolder//first.txt");

			fr.write("i have created a new file by using io stream");
			System.out.println(f1.lastModified());

			File f2 = new File("D://newFolder//first1.txt");
			
			FileReader file = new FileReader(f2);
			BufferedReader fRead = new BufferedReader(file);
			String[] arr= new String[9];
			int i=0;
			System.out.println("Contents of File: ");  
			for (int j = 0; j < arr.length; j++) {
				arr[j]= fRead.readLine();
				System.out.println(arr[j]);
			}
			file.close();
			
			//8. find the longest word in a text file
			FileOperation o1 = new FileOperation();
			System.out.println("Longest Word is= "+ o1.longWord());
			
			// 5. print file size in bytes, kb, mb
			System.out.println("\n" + fileSizeInBytes());
			System.out.println(fileSizeInKiloBytes());
			System.out.println(fileSizeInMegaBytes());

			fr.close();
			System.out.println("successful");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public String longWord() {
		String word= "";
		String current= "";
		try {
			Scanner scan= new Scanner(new File("D://newFolder//first1.txt"));
			while(scan.hasNext()) {
				current= scan.next();
				if(current.length()>word.length()) {
					word=current;
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return word;
	}
	
	

	public static String fileSizeInBytes() {
		long size = f1.length();
		return size + " bytes";
	}

	public static String fileSizeInKiloBytes() {
		long size = f1.length();
		return size / 1024 + " kb";
	}

	public static String fileSizeInMegaBytes() {
		long size = f1.length();
		return size / (1024 * 1024) + " bytes";
	}

}
