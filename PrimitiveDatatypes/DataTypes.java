import java.util.*;
import java.io.*;
class DataTypes{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();
        for(long i=0;i<t;i++)
        {
            try
            {
                long x = sc.nextLong();
                //x = sc.nextByte();
                System.out.println("Bir byte sayısı giriniz:"+ x);
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
                System.out.println(x+" can be fitted in:");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

/*-150 can be fitted in:
        * short
        * int
        * long
        150000 can be fitted in:
        * int
        * long
        1500000000 can be fitted in:
        * int
        * long
        213333333333333333333333333333333333 can't be fitted anywhere.
        -100000000000000 can be fitted in:
        * long
*/
