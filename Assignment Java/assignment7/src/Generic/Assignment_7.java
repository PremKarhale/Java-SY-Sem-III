
package Generic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
class Assignment_7
{
    static int count=0;
    static void even_odd(int num)
    {
        if (num%2==0)
        {System.out.println(num+" is even number");
            count+=1;
        } else
        {
            System.out.println(num+" is odd number");
        }
    }
    static void prime_no(int num)
    {
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a prime number.");
            count += 1;
        }
        else
            System.out.println(num + " is not a prime number.");
    }
    static void Palindrome(String str1)
    {
        StringBuilder s1=new StringBuilder(str1);
        if(str1.equals(s1.reverse().toString()))
        {
            System.out.println(str1+" is palindrome");
            count+=1;
        }
        else
        {
            System.out.println(str1+" is not palindrome");
        }
    }
    static void check(int ch,int num)
    {
        switch(ch)
        {
            case 1:
                even_odd(num);
                break;
            case 2:
                prime_no(num);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    static void integer_op()
    {
        int element,n,ch;
        Scanner in=new Scanner(System.in);
        ArrayList<Integer>nums=new ArrayList<Integer>();
        System.out.println("Enter the number of elements:");
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number:");
            element=in.nextInt(); //creating object
            nums.add(element);
        }
        System.out.println("1.Even or Odd");
        System.out.println("2.Prime or not");
        System.out.println("Choose:");

        ch=in.nextInt();
        Iterator itr = nums.iterator();
        count=0;
        while(itr.hasNext())
        {
            check(ch, (int)itr.next());
        }
        switch (ch) {
            case 1 -> {
                System.out.println("The total number of even and odd numbers occured are:");
                System.out.println("The number of even number are:" + count);
                System.out.println("The number of odd number are:" + (nums.size() - count));
            }
            case 2 -> {
                System.out.println("The total number of Prime and Non-Prime numbers occured are:");
                System.out.println("The number of PRIME number are:" + count);
                System.out.println("The numbers which are NOT Prime number are:" + (nums.size() - count));
            }
        }
    }
    static void string_op()
    {
        int m;
        String str1;
        ArrayList<String>words=new ArrayList<String>();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of Strings:");
        m=in.nextInt();
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter string:");
            str1=in.next();
            words.add(str1);
        }
        count=0;
        for(String w:words)
        {
            Palindrome(w);
        }
        System.out.println("The number of Palindrome string are:"+count);
        System.out.println("The number of non-palindrome string is:"+(words.size()-count));
    }
    public class palindrome{
        public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Choose type");
        System.out.println("1. String");
        System.out.println("2. Integer");
        int ch=in.nextInt();
        switch (ch) {
            case 1 -> string_op();
            case 2 -> integer_op();
        }
    }
    }
}

