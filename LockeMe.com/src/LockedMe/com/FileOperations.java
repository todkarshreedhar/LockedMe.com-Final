package LockedMe.com;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations 
{
    Scanner sc= new Scanner(System.in);
	public void createFile(String filename) throws IOException
	{
		String fname="C:\\Users\\Administrator\\eclipse-workspace\\LockedMe.com\\" + filename;
		File f = new File(fname);
		if(f.createNewFile())
		{
			System.out.println("\nFile '" + f.getName() + "' created successfully");
		}
		else
		{
			System.out.println("File already exists in directory");
		
		}
		
	}
	public void deleteFile(String filename)
	{
		String fname="C:\\Users\\Administrator\\eclipse-workspace\\LockedMe.com\\" + filename;
		File f = new File(fname);
		if(f.delete())
		{
			System.out.println("\nFile '" + f.getName() + "' created successfully");
		}
		else
		{
			System.out.println("Error occured while deleting the File" + f.getName());
		}
	}
	public void searchFile(String filename)
	{
		String fname="C:\\Users\\Administrator\\eclipse-workspace\\LockedMe.com\\" + filename;
		File f = new File(fname);
		if(f.exists())
		{
			System.out.println("\nFile '" + f.getName() + "' found in the directory.Click Space to Proceed");
			
			
		}
		else
		{
			System.out.println("File '" + f.getName() + "' doesn't exists in directory..Click Space to Proceed");
			
		}
	}
	
}
