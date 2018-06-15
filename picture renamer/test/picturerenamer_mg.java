/**
   Here's how I'd take your code and rewrite it. - MG

   Always check the documentation:
   https://docs.oracle.com/javase/7/docs/api/java/io/File.html
*/

import java.io.*;

public class picturerenamer_mg
{
		public static void main(String[] args)
		{
				File picDir = new File("./pictures/"); // path is OS dependent
                                                       // TODO: look up how to make OS - independent
				int fileCount = 0; // counter for naming photos
				if (picDir.isDirectory()) // make sure it's a directory
				{
						for (final File f : picDir.listFiles())
						{
								fileCount++;
								String fileName = String.format("%03d", fileCount);
								File newFile = new File(fileName + ".jpg");

								/* or
								switch (Integer.toString(fileCount).length())
								{
								case 1:
										newFile = new File("00" + fileCount + ".jpg");
										break;
								case 2:
										newFile = new File("0" + fileCount + ".jpg");
										break;
								default:
										newFile = new File(fileCount + ".jpg");
								}
								*/

								// notice where the files end up
								if (f.renameTo(newFile))
										System.out.println("Rename successful!: " + f.getAbsolutePath() +
														   " => " + newFile.getAbsolutePath());
								else
										System.out.println("Rename failed. " + f.getAbsolutePath());
						}
				}
		}
}
