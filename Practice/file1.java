package practice1;
import java.io.*; 
public class file1 {
	 
	    
	public static void main(String args[])throws Exception{    
	     FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to Example for BufferedStream and FileStream";    
	    byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
	}    
	}  

