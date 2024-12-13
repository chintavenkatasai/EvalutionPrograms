package FilesSample;

import java.io.File;
import java.io.*;
import java.io.IOException;

public class FileHandling {
public static void main(String[] args) throws IOException {
     File f=new File("./resume.txt");
//      if(f.exists())
//      {
//    	  f.delete();
//      }
//      else
//      {
//    	  f.createNewFile();
//      }
      System.out.println(f);
      
//     System.out.println(f.);
      FileReader fi=new FileReader(f);
      BufferedReader br=new BufferedReader(fi);
      int i;
      while((i=br.read())!=-1)
      {
    	  System.out.print((char)i);
      }
}
}
