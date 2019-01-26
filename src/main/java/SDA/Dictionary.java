package SDA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
//    private Map<String, String> dictionary = new HashMap<>();
    private Map<String, List <String>> dictionary = new HashMap<>();


//    public void addTranslation(String pol, String ang) {
    public void addTranslation(String pol, List <String> ang) {

        if (dictionary.containsKey(pol)) {
            System.out.println(" powtarza sie");
        } else {
            dictionary.put(pol, ang);
            System.out.println(ang);
        }

    }

//    public String getTranslation(String pol) {
    public List<String> getTranslation(String pol) {

        return dictionary.get(pol);
    }

//    public void edit(String pol, String ang) {
    public void edit(String pol, List<String> ang) {
        if (dictionary.containsKey(pol)) {
            dictionary.put(pol, ang);
        } else {
            System.out.println("nie zlaleziono");
        }}
        public void usuwanie(String pol){
            if (dictionary.containsKey(pol)) {
                dictionary.remove(pol);
            }else {
                System.out.println("brak takiej wartości");}


        }
        public List<String> search ( String fraza){
        List<String> correctKeys = new ArrayList<>();
        for(String key: dictionary.keySet()){
            if(key.contains(fraza)){
                correctKeys.add(key);
            }
        }
     return correctKeys;}
//        public Map<String, String> getFullList(){
//        return dictionary;
//        }

    }