import java.io.*;
import java.util.*;

public class CLADemo
{
    public static void main(String args[])
    {
        if(args.length==0)
        {
            System.out.println("NO ARGUMENTS PASSED");
        }
        else
        {
            for(int i=0;i<args.length;i++)
            {
                System.out.println(args[i]+" ");
            }
        }
    }

}