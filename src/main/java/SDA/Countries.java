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

    public void addCountry(String kraj) {
        countries.add(kraj);
    }

    public void getCountries() {
        for (String kraje : countries) {
            System.out.println(kraje);
        }


    }
}
