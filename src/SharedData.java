import java.util.HashMap;
import java.util.Map;

public class SharedData {

    private static SharedData data;

    Map<String, String> sharedData = new HashMap<>();

    private SharedData() {
    }

    public static SharedData getData(){
        if (data == null){
            data = new SharedData();
        }
        return data;
    }

    public Map<String, String> addData(String key, String value){
        sharedData.put(key, value);
        return sharedData;
    }



}
