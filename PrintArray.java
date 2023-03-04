import java.util.*;

 class PrintArray
{
  public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first array :");
     String a = sc.nextLine();
    System.out.println("Enter the first array :");
     String b = sc.nextLine();
       String m = new String[a][b];

       for(i = 0; i < a ; i++)
{
         for(j = 0; j < b ; j++)
{
            System.out.println("Enter the array values");
                 m [i][j] = sc.nextLine();

}
}

       for(i = 0; i < a ; i++)
{
         for(j = 0; j < b ; j++)
{
		System.out.println(m[i][j]+ " ");
}
}
		System.out.println();
}
}