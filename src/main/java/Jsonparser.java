
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Jsonparser
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int value;
        do {
            System.out.println("enter 1:to read json,enter 2: to create json");
            int choice=s.nextInt();

            switch (choice)
            {
                case 1: Jsonread();
                        break;
                case 2: Jsonwrite();
                        break;
                default:
                        System.out.println("enter valid number");
                        break;
            }
            System.out.println();
            System.out.println("do you want to continue if yes enter 1 if no enter 0");
            value=s.nextInt();
        }while(value==1);
    }


    //method to read json
       public static void Jsonread()
       {
           JSONParser j = new JSONParser();
           Object object = null;
           try
           {
               FileReader reader = new FileReader("jsonread.json");
               object = j.parse(reader);
           }
           catch (ParseException | FileNotFoundException e) {
               e.printStackTrace();
           }
           catch (IOException e)
           {
               e.printStackTrace();
           }
           JSONObject obj = (JSONObject) object;
           for (Object var : obj.entrySet())
           {
               System.out.println(var);
           }

       }


      //method to write json
       public static void Jsonwrite()
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
