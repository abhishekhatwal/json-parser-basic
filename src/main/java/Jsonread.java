import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Jsonread {
    public static void main(String[] args)
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
}
