import java.io.*;
import javax.swing.JOptionPane;
  public class picturerenamer
  {
 
	  public static void main(String[] args)
		{
		  JOptionPane.showMessageDialog(null,"To get the full address it can be copied from the folder address bar.");
			String fileLocation=JOptionPane.showInputDialog("Please enter the full address of the folder that contains the pictures you want to rename.");
				File picDir = new File(fileLocation); // path is OS dependent
               
				
				
				// TODO: look up how to make OS - independent
				
				if (picDir.isDirectory()) // make sure it's a directory
				{
						for (final File f : picDir.listFiles())
						{
							 String fileName = f.getName();
					    	 System.out.println(fileName);
					    	 String fileName2=fileName.replaceAll("[^0-9]","");
					    	 int fileNamNum=Integer.parseInt(fileName2);
					    	 System.out.println(fileName2);
			
								String fileName3= String.format("%03d", fileNamNum);
								System.out.println(fileName3);
								File newFile = new File(fileLocation+"//"+fileName3 + ".jpg");

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