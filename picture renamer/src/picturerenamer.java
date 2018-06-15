import java.io.*;

  public class picturerenamer
  {
 
 public static void main(String[] args)
 {
	 File dir = new File("D:\\safey\\Pictures\\2017-04");
int i = 0;
	 if (dir.isDirectory()) { // make sure it's a directory
	     for (final File f : dir.listFiles()) 
	     {
	    	 i++;
	    	 if (Integer.toString(i).length()==1)
	             {
	    		 File newfile =new File("00"+Integer.toString(i)+".jpg");
	             
	    		 if(f.renameTo(newfile))
	         {
	                 System.out.println("Rename succesful");
	             }
	    		 else
	         {
	                 System.out.println("Rename failed");
	             }
 
	             }
	    	 if (Integer.toString(i).length()==2)
             {
    		 File newfile =new File("0"+Integer.toString(i)+".jpg");
             
    		 if(f.renameTo(newfile))
         {
                 System.out.println("Rename succesful");
             }
    		 else
         {
                 System.out.println("Rename failed");
             }

             }
	    	 else
	    	 {
	    		 File newfile =new File(Integer.toString(i)+".jpg");
	             
	    		 if(f.renameTo(newfile))
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
 }}