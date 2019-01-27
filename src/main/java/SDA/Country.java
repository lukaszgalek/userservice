package SDA;

public class Country {

    private String nazwa ;
    private String stolica ;
    private int liczbaL;

    public Country(String nazwa, String stolica, int liczbaL) {
        this.nazwa = nazwa;
        this.stolica = stolica;
        this.liczbaL = liczbaL;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getStolica() {
        return stolica;
    }

    public int getLiczbaL() {
        return liczbaL;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nazwa='" + nazwa + '\'' +
                ", stolica='" + stolica + '\'' +
                ", liczbaL=" + liczbaL +
                '}';
    }
}
