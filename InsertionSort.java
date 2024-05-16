import java.util.*;
import java.io.*;
class Insertion{
    private int[] arr;
    private int max;
    public Insertion(int m){
        max=m;
        arr=new int[max];
    }
    public void insert(){
        int d;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter "+max+" elements:");
        for(int i=0;i<max;i++){
            d=sc.nextInt();
            arr[i]=d;
        }
        System.out.print("Inserted successfully.");
    }
    public void display(){
        if(max>=0){
        for(int i=0;i<max;i++){
            System.out.print(arr[i]+" ");
        }
    }}
    public void sort(){
        int temp,j,i;
        for(j=1;j<max;j++){
            i=j;
            while(i>=1){
                if(arr[i-1]>arr[i]){
                    temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
                i--;
            }
        }
    }    
}
class InsertionSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int m=sc.nextInt();
        Insertion is=new Insertion(m);
        is.insert();
        System.out.print("\nThe unsorted array is:");
        is.display();
        is.sort();
        System.out.print("\nThe sorted array is:");
        is.display();
    }
}




/*0     1     2     3     4
50   40    30    20    10  

j=1

0     1     2     3     4
50   40    30    20    10

a[j]=40
a[j-1]=50
a[j-1]>a[j] --->temp=a[j-1]
                a[j-1]=a[j]
                a[j]=temp ---> 0     1     2     3     4
                               40    50    30    20    10


j=2

0     1     2     3     4
40    50    30    20    10

a[j]=30
a[j-1]=50
a[j-1]>a[j] --->temp=a[j-1]
                a[j-1]=a[j]
                a[j]=temp --->0     1     2     3     4
                              40    30    50    20    10

j--; j=1

0     1     2     3     4
40    30    50    20    10

a[j]=30
a[j-1]=40
a[j-1]>a[j] --->temp=a[j-1]
                a[j-1]=a[j]
                a[j]=temp --->0     1     2     3     4
                              30    40    50    20    10

j=3

0     1     2     3     4
30    40    50    20    10

a[j]=20
a[j-1]=50
a[j-1]>a[j] --->temp=a[j-1]
                a[j-1]=a[j]
                a[j]=temp --->0     1     2     3     4
                              30    40    20    50    10

j--;j=2

a[j]=20
a[j-1]=40
a[j-1]>a[j] --->temp=a[j-1]
                a[j-1]=a[j]
                a[j]=temp --->0     1     2     3     4
                              30    20    40    50    10

j--; j=1

a[j]=20
a[j-1]=30
a[j-1]>a[j] --->temp=a[j-1]
                a[j-1]=a[j]
                a[j]=temp --->0     1     2     3     4
                              20    30    40    50    10

j=4*/





/*int temp,j;
for(j=1;j<max;j++){
    while(j==1){
        if(arr[j-1]>arr[j]){
            temp=arr[j-1];
            arr[j-1]=arr[j];
            a[j]=temp;
        }
        j--;
    }
}*/
