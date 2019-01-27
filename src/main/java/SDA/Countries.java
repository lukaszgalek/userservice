package SDA;

import java.util.HashSet;
import java.util.Set;

public class Countries {
    Set<Country> countries = new HashSet<>();

    public void getCountry( String kraj){
        for( Country country : countries) {
            if(country.getNazwa().equals(kraj)){
                System.out.println(country);
            }
        }
}

    public void getStolica( String kraj){
        for( Country country : countries) {
            if(country.getStolica().equals(kraj)){
                System.out.println(country);
            }
        }
    }
    //   bez modyfikacji  public void addCountry(String kraj) {
//        countries.add(kraj);
//    }
    public void addCountry(Country kraj) {
        if (countries.contains(kraj)) {
            System.out.println("taki kraj już jest");
        }else{
            countries.add(kraj);}
    }
//
//    public void getCountries() {
//        for (String kraje : countries) {
//            System.out.println(kraje);
//        }
    // albo tak   public Set<String> getCountries(){
    //              return countries;
//    }
//
//    public void removeCountry(String kraj){
//        countries.remove(kraj);
//    }
//
//    public void updateCountry (String kraj, String kraj2){
//    if( countries.contains(kraj))
//        countries.remove(kraj);
//        countries.add(kraj2);
//    }




// ---------------------------------PRZED modyfikacja na dole ------------------------------
//    {
//        countries.add("Polska");
//        countries.add("Niemcy");
//        countries.add("Czechy");
//        countries.add("Ukraina");
//
//    }
//
//    //   bez modyfikacji  public void addCountry(String kraj) {
////        countries.add(kraj);
////    }
//    public void addCountry(String kraj) {
//        if (countries.contains(kraj)) {
//            System.out.println("taki kraj już jest");
//        }else{
//            countries.add(kraj);}
//    }
//
//    public void getCountries() {
//        for (String kraje : countries) {
//            System.out.println(kraje);
//        }
//    }
//
//    public void removeCountry(String kraj){
//        countries.remove(kraj);
//    }
//
//    public void updateCountry (String kraj, String kraj2){
//        countries.remove(kraj);
//        countries.add(kraj2);
//    }
}
