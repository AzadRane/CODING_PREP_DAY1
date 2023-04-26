import java.io.*;
import java.util.*;

public class AdditionOfTwoIntCLA
{
    public static void main(String args[])
    {
        if(args.length==2)
        {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        System.out.println("Addition is "+(m+n));
            
        }
        else
        {
            System.out.println("Less no . or Arguments!!!!!!!!");
        }
    }
}