import java.util.Scanner;

class lauch
{
    public static void main(String[] args) {
        

        System.out.println("enter the lenth of the array");
        Scanner scan= new Scanner(System.in);

        int len= scan.nextInt();
        
        int arr[]= new int [len];
        for (int i=0;i<=arr.length-1;i++)
        {
            System.out.print("enter the number in the array__"+arr[i]);
            arr[i]=scan.nextInt();
        }
         
        int help=0;
        for (int i=0;i<=arr.length-2;i++)
        {
            for (int j=0;j<=arr.length-i-2;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    help=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=help;

                }


            }
        }

        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }





    }
}