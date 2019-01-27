package SDA;

import java.util.HashSet;
import java.util.Set;

public class Countries {
    Set<String> countries = new HashSet<>();

    {
        countries.add("Polska");
        countries.add("Niemcy");
        countries.add("Czechy");
        countries.add("Ukraina");

    }

    //   bez modyfikacji  public void addCountry(String kraj) {
//        countries.add(kraj);
//    }
    public void addCountry(String kraj) {
        if (countries.contains(kraj)) {
            System.out.println("taki kraj już jest");
        }else{
            countries.add(kraj);}
    }

    public void getCountries() {
        for (String kraje : countries) {
            System.out.println(kraje);
        }
    }

    public void removeCountry(String kraj){
        countries.remove(kraj);
    }

    public void updateCountry (String kraj, String kraj2){
        countries.remove(kraj);
        countries.add(kraj2);
    }
}
