import java.io.*;
public class ByteStreamTest{
	public static void main(String[] args)throws IOException {
//declaired maximum length of UI
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
//set the limit for while loop
		while( bOutput.size()!= 10){
//write the data inside the while loop
			bOutput.write(System.in.read());
		}
//value stored in the variable b
		byte b [] = bOutput.toByteArray();
//for user declairing the statement
		System.out.println("Print the content");
//for loop executed with condition
		for(int x= 0; x < b.length; x++){
//println statement for the char executed line by line
			System.out.println((char)b[x] + " ");
		}
//println statement for the output
		System.out.println(" ");
//int c declaired
		int c;
//bInput object created
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
//typecasting
		System.out.println("Converting character to Uppercase");
//for loop initiated
		for(int y = 0; y<1; y++){
//while loop with condition
			while((c= bInput.read())!= -1){
//println statemnet for char c
				System.out.println(Character.toUpperCase((char)c));
			}
//reset for bInput
			bInput.reset();

		}
	}
}