package SDA;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
  private  Map<String, String> dictionary = new HashMap<>();




    public void addTranslation(String pol, String ang){
        dictionary.put(pol,ang);
//        if (pol != dictionary.get(pol)){
//
//        }

    }
    public String getTranslation(String pol){
        return dictionary.get(pol);
    }





}
