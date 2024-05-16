import java.util.*;
import java.io.*;
class StackX{
    private int max;
    private int[] arr;
    private int top;
    public StackX(int m){
        max=m;
        arr=new int[max];
        top=-1;
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public boolean isFull(){
        return(top==max-1);
    }
    public void push(int d){
        if(!isFull()){
            top++;
            arr[top]=d;}
        else{
            System.out.print("Stack overflow: Cannot push.");
        }
    }
    public int pop(){
        if(!isEmpty()){
            int temp=arr[top];
            top--;
            return temp;
        }
        else{
            System.out.print("Stack underflow: Nothing to pop.");
            return -1;
        }
    }
    public int peek(){
        if(!isEmpty())
            return(arr[top]);
        else
            System.out.print("Stack underflow: Nothing to display.");
            return -1;
    }
}

class StackApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m,ch,n,y=0;
        System.out.print("Welcome to stack operations:\nEnter the size of the stack:");
        m=sc.nextInt();
        StackX st=new StackX(m);
        do{
            System.out.print("\nMENU\n1.PUSH\n2.POP\n3.PEEK\n4.EXIT\nEnter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:System.out.print("Enter the element to insert:");
                       n=sc.nextInt();
                       st.push(n);
                       break;
                case 2:n=st.pop();
                       if(n!=-1)
                        System.out.print("The popped element is "+n);
                       break;
                case 3:n=st.peek();
                       if(n!=-1)
                        System.out.print("The topmost element is "+n);
                       break;
                case 4:y=1;
                       break;
                default:System.out.print("Wrong Choice!!");
            }
        }while(y==0);
    }
}