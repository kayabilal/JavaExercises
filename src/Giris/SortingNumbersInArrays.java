package Giris;
import java.util.Scanner;
import java.util.Arrays;
public class SortingNumbersInArrays {
    public static void main(String[] args) {
        int size,temp=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the size of the array you want to sort");
        size=scan.nextInt();
        if(size>0){
            int[] arr=new int[size];
            for(int i=0;i<size;i++){
                System.out.printf("%d. enter the elements:",i+1);
                arr[i]=scan.nextInt();
            }
            System.out.println("unsorted array"+ Arrays.toString(arr));

            for (int i=0;i<size;i++){
                for(int j=i+1;j<size;j++){
                    if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.println("sorted array:" + Arrays.toString(arr));
        }
        else{
            System.out.println("incorrect entry");
        }
    }
}
