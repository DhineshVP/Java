import java.util.*;

 class ArrayName
{
  public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first array name :");
     String a = sc.nextline ();
    System.out.println("Enter the Second array name :");
     String b = sc.nextLine ();
       String x[][] = new String ["a"]["b"];

       for(int i = 0; i < a ; i++)
{
         for(int j = 0; j < b ; j++)
{
            System.out.println("Enter the array Name");
                 x [i][j] = sc.nextLine ();
 }
 }
       for(int i = 0; i < a ; i++)
{
         for(int j = 0; j < b ; j++)
{
		System.out.print(x[i][j]+ " ");
  }
		System.out.println();
  }

}
}