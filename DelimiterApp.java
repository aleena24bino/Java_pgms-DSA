import java.io.*;
import java.util.*;
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

class Bracket{
    private String input;
    public Bracket(String in){
        input=in;
    }
    public int check(){
        int n=input.length();
        StackX st=new StackX(n);
        int pass=1;
        for(int i=0;i<n;i++){
            char ch=input.charAt(i);
            switch(ch){
                case '{':
                case '[':
                case '(':
                    st.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!st.isEmpty()){
                        char chx=st.pop();
                        if(ch=='}'&& chx!='{' || ch==']'&& chx!='[' || ch==')'&& chx!='('){
                            pass=0;
                        }
                    }
                    else{
                        pass=0;
                    }
                    break;
                default:break;
            }
            if(pass==0){
                break;
            }
        }
        if(!st.isEmpty()){
            pass=0;
        }
        return pass;
    }
}

class DelimiterApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.print("Enter the string with delimiter:");
        input=sc.nextLine();
        Bracket br=new Bracket(input);
        int m=br.check();
        if(m==0){
            System.out.print("Delimiter not matching.");
        }
        else{
            System.out.print("Delimiter matching found.");
        }
    }
}