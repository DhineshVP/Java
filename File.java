import java.io.*;

  class File 
{
   public static void main(String[] args)throws IOException

{

    String filename = "d:\\movie";
    File f1 = new File(filename);
 
       if(f1.isdirectory())
{
       if(f1.exists())
{
        System.out.println("Exist");
}    else  {
         System.out.println("Doesn't Exist");
}
}
}
}