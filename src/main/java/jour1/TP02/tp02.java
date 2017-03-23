package main.jour1.TP02;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Iterator;

/**
 * . jour1.TP02
 *
 * @author alamoulie
 * @date 22/03/17
 */
public class tp02 {



    private static final String JSON = "[\n" +
            "  {\n" +
            "    \"name\" : \"Tupac Shakur\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\" : \"Big Small\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\" : \"Dr Dre\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\" : \"EPMD\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\" : \"Eminem\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\" : \"Ice Cube\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\" : \"50 cent\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"name\" : \"Moob Deep\"\n" +
            "  }\n" +
            "]";

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(JSON);
            JSONArray jsonArray = (JSONArray) obj;

            Iterator<JSONObject> iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject name = iterator.next();
                System.out.println(name.get("name"));
            }

        } catch (Exception e) {
            System.out.println("ERROR");
        }




    }
}
