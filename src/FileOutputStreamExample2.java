import java.io.FileOutputStream;

//Java FileOutputStream Example 1: write byte
public class FileOutputStreamExample2 {
	public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
          fout.write(65);    
          fout.close();    
          System.out.println("success...");    
         }catch(Exception e){System.out.println(e);}    
   }    
}
//The content of a text file testout.txt is set with the data A.
