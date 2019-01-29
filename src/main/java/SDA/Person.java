package SDA;

public class Person {
    private String imie;
    private String nazwisko;
    private Integer wiek;


    public Person(String imie, String nazwisko, Integer wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Integer getWiek() {
        return wiek;
    }
}
