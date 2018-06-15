/**
   Writing in comments for Justin.

   Always check the documentation:
   https://docs.oracle.com/javase/7/docs/api/java/io/File.html
 */

import java.io.*;

public class picturerenamer
{
		public static void main(String[] args)
		{
				File dir = new File("D:\\safey\\Pictures\\2017-04");
				int i = 0; // counter for naming photos
				if (dir.isDirectory()) // make sure it's a directory
				{
						for (final File f : dir.listFiles())
						{
								i++;
								if (Integer.toString(i).length()==1) // i / 10 == 0 if i is a single digit
								{                                    // which is faster than a string conv.
										// java has automatic conversion using the + operator between
										// a string and a numeric. therefore string + Integer.toString(i)
										// can be rewritten as string + numeric to get the string
										File newfile = new File("00" + Integer.toString(i) + ".jpg");

										if (f.renameTo(newfile))
										{
												System.out.println("Rename succesful");
										}
										else
										{
												System.out.println("Rename failed");
										}

								}
								if (Integer.toString(i).length()==2) // I know it's logically sound, but
								{                                    // wouldn't you want this to be else-if
										                             // for clarity?
										File newfile = new File("0" + Integer.toString(i) + ".jpg");

										if (f.renameTo(newfile))
										{
												System.out.println("Rename succesful");
										}
										else
										{
												System.out.println("Rename failed");
										}

								}
								else // this is using the previous if statement (the one checking for length 2)
								{
										File newfile = new File(Integer.toString(i) + ".jpg");

										if (f.renameTo(newfile))
										{
												System.out.println("Rename succesful");
										}
										else
										{
												System.out.println("Rename failed");
										}

								}
						}
				}
		}
}
