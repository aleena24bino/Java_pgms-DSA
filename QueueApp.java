import java.io.*;
import java.util.*;
class Queue{
    private int max;
    private int[] arr;
    private int front;
    private int rear;
    public Queue(int m){
        max=m;
        front=0;
        rear=-1;
        arr=new int[max];
    }
    public boolean isEmpty(){
        return(rear+1==front);
    }
    public boolean isFull(){
        return(rear==max-1);
    }
    public void insert(int item){
        if(!isFull()){
            rear++;
            arr[rear]=item;
        }
        else{
            System.out.print("Cannot insert!!");
        }
    }
    public int delete(){
        if(!isEmpty()){
            int temp=arr[front];
            front++;
            return temp;
        }
        else{
            return -1;
        }
    }
    public int peek(){
        if(!isEmpty()){
            return(arr[front]);
        }
        else{
            return -1;
        }}
    public int size(){
        int s=rear-front+1;
        return s;
    }
}

class QueueApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the maximum number of elements in the Queue:");
        int m,ch,d,y=0;
        m=sc.nextInt();
        Queue Q=new Queue(m);
        do{
        System.out.print("\nQueue Operations\n1.Insert\n2.Delete\n3.Peek\n4.Size\n5.Exit");
        System.out.print("\nEnter your choice:");
        ch=sc.nextInt();
        switch(ch){
            case 1:System.out.print("Enter the number to insert:");
                d=sc.nextInt();
                Q.insert(d);
                break;
            case 2:d=Q.delete();
                if(d!=-1){
                    System.out.print("The deleted element is:"+d);
                }
                else{
                    System.out.print("Queue is empty!! Cannot delete.");
                }
                break;
            case 3:d=Q.peek();
                if(d!=-1){
                    System.out.print("The peeked element is:"+d);
                }
                else{
                    System.out.print("Queue is empty!! Nothing to peek.");
                }
                break;
            case 4:d=Q.size();
                System.out.print("The size(filled in) is "+d);
                break;
            case 5:y=1;
                break;
            default:System.out.print("Invalid Choice!!");
        }
        }while(y==0);
    }
}