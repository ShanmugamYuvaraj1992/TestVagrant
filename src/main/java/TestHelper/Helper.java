package TestHelper;

import Constants.TestConstants;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Helper {

    /**
     * This method is used to retrieve given string from the json file and return as JSONArray
     * @param filePath
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public JSONArray getJsonData(String filePath) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(filePath);
        Object obj = jsonParser.parse(reader);
        JSONObject jsonObject = (JSONObject) obj;
        return (JSONArray) jsonObject.get("player");
    }

    /**
     * This method is used to get the count of the players available from other country
     * @param arrayJsonValue
     * @return
     */
    public int getForeignPlayersCount(JSONArray arrayJsonValue) {
        int count = 0;
        if (!arrayJsonValue.isEmpty()) {
            for (Object array : arrayJsonValue) {
                JSONObject jsonObject = (JSONObject) array;
                String country = (String) jsonObject.get("country");
                if (!(country.equalsIgnoreCase(TestConstants.country))) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * This method is used to get the count of wicket keepers available in team
     * @param arrayJsonValue
     * @return
     */
    public int getWicketKeepersAvailableCount(JSONArray arrayJsonValue) {
        int count = 0;
        if (!arrayJsonValue.isEmpty()) {
            for (Object array : arrayJsonValue) {
                JSONObject jsonObject = (JSONObject) array;
                String role = (String) jsonObject.get("role");
                if (!(role.equalsIgnoreCase(TestConstants.role))) {
                    count++;
                }
            }
        }
        return count;
    }
}
