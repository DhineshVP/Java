import java.io.*;

public class TestSample{
	public static void main(String args[])throws IOException{

		DataInputStream d = new DataInputStream(new fileInputStream("test.txt"));
		DataOutputStream out = new DataOutputStream(new DataOutputStream("test1.txt"));

        String count;
        while((count = d.readLine()) != null){
            String u = count.toUpperCase();
            System.out.println(u);
            out.writeBytes(u + " ,");
        }
        d.close();
        out.close();
    }
}