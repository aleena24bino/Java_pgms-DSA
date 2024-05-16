import java.io.*;
import java.util.*;
class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ch,n1,n2,yn;
        do{
            System.out.print("    MENU\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\nEnter your choice:");
            ch=sc.nextInt();
            System.out.print("\nEnter two numbers to operate on:");
            n1=sc.nextInt(); n2=sc.nextInt();
            switch(ch){
                case 1:System.out.print("\nSum is "+(n1+n2));
                       break;
                case 2:System.out.print("\nDifference is "+(n1-n2));
                       break;
                case 3:System.out.print("\nProduct is "+(n1*n2));
                       break;
                case 4:if(n2!=0){System.out.print("\nQuotient is "+(n1/n2));}
                       else{System.out.print("\nDivision is not possible");}
                       break;
                default:System.out.print("\nYour choice is wrong!!");}
            System.out.print("\nDo you want to continue?\nIf yes press 1:");
            yn=sc.nextInt();
        }while(yn==1);
    }    
}
