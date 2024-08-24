import java.util.Scanner;
class Array2d
{
  public static void main(String args[])
  {
    int a[][]= new int[3][3];
    int i,j;
    int sum = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the elements : ");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        a[i][j]=s.nextInt();
      }	
    }
    System.out.println("Given two dimensional array is : ");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
      System.out.print(a[i][j]+"\t"); 
      sum+=a[i][j];
      }
      System.out.println();

    }
    System.out.println("Total sum : " +sum);
    sum = 0;
    for(i=0;i<3;i++)
      sum = sum+a[0][i];
    System.out.println("Sum of first row : "+sum);

    sum = 0;
    for(i=0;i<3;i++)
    {
      sum+=a[i][0];

    }
    System.out.println("Sum of first column : "+sum);

    sum = 0;
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        if(i==j)
          sum+=a[i][j];

      }
    }
    System.out.println("Sum of diagonal elements : "+sum);

  }

}