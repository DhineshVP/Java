import java.util.*;

 class Mahe
{
  public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first array name :");
     int a = sc.nextInt();
    System.out.println("Enter the Second array name :");
     int b = sc.nextInt();
       int x[][] = new int[a][b];

       for(int i = 0; i < a ; i++)
{
         for(int j = 0; j < b ; j++)
{
            System.out.println("Enter the array values");
                 x [i][j] = sc.nextInt();
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