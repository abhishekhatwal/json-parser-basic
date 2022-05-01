import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Jsonwrite
{
    public static void main(String[] args)
    {
        JSONObject obj=new JSONObject();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of deail to be put json file");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("enter key");
            String key= sc.next();

            System.out.println("enter value");
            String value=sc.next();

            obj.put(key,value);

        }
        try
        {
            FileWriter file=new FileWriter("JSONcreate.json");
            file.write(String.valueOf(obj));
            file.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(obj);
    }
}
