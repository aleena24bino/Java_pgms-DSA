import java.util.*;
import java.io.*;
class StackX{
    private int max;
    private char[] arr;
    private int top;
    public StackX(int m){
        max=m;
        arr=new char[max];
        top=-1;
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public boolean isFull(){
        return(top==max-1);
    }
    public void push(char d){
        if(!isFull()){
            top++;
            arr[top]=d;}
        else{
            System.out.print("Stack overflow: Cannot push.");
        }
    }
    public char pop(){
        if(!isEmpty()){
            char temp=arr[top];
            top--;
            return temp;
        }
        else{
            System.out.print("Stack underflow: Nothing to pop.");
            return 'n';
        }
    }
    public char peek(){
        if(!isEmpty())
            return(arr[top]);
        else
            System.out.print("Stack underflow: Nothing to display.");
            return 'n';
    }
}

class Reverser{
    private String input;
    private String output;
    public Reverser(String in){
        input=in;
    }
    public String doRev(){
        char d;
        int len=input.length();
        StackX st=new StackX(len);
        for(int i=0;i<len;i++){
            d=input.charAt(i);
            st.push(d);
        }
        output="";
        while(!st.isEmpty()){
            d=st.pop();
            output+=d;
        }
        return output;
    }
}

class ReverseApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input,output;
        System.out.print("Enter the string:");
        input=sc.nextLine();
        if(input.equals("")){
            System.out.print("Not possible");
        }
        else{
            Reverser rev=new Reverser(input);
            output=rev.doRev();
            System.out.print("The reversed string is:"+output);
        }
    }
}