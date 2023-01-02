package LockedMe.com;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingFiles 
{
	ArrayList<String> fileNames = null;
	Iterator<String>fileNamesIterator=null;
	SortingFiles()
	{
		File folder = new File("C:\\Users\\Administrator\\eclipse-workspace\\LockedMe.com\\");
		fileNames = new ArrayList<String>();
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) 
		{
			  if (listOfFiles[i].isFile()) 
			  {
			    fileNames.add(listOfFiles[i].getName());
		      }
		}	  
	}
	public void display()
	{
		
		Collections.sort(fileNames);
		System.out.println("File Names in Ascending Order:");
		fileNamesIterator=fileNames.iterator();
		while(fileNamesIterator.hasNext())
		{
			System.out.println(fileNamesIterator.next());
		}
	}
	
}
