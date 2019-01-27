package SDA;

import java.time.LocalDate;
import java.time.Period;

public class User {

    private String imie;
    private String nazwisko;
    private String login;
    private String haslo;
    private LocalDate dataUro;

    public User(String imie, String nazwisko, String login, String haslo, LocalDate dataUro) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.login = login;
        this.haslo = haslo;
        this.dataUro = dataUro;


    }
    public boolean isAdult(){
        LocalDate today = LocalDate.now();
        Period period = Period.between(dataUro,today);
        if(period.getYears()>=18){
            return true;
        }else {
            return false;
        }

        // lub taki sposób   zasmiazst if return period.getYears()>=18;
    }
//

    public int getAge ( ){
        return Period.between(dataUro,LocalDate.now()).getYears();
    }

    public LocalDate getDataUro() {
        return dataUro;
    }
    public void setDataUro( int year, int month, int day){
        this.dataUro = LocalDate.of(year, month, day);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getLogin() {
        return login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    @Override
    public String toString() {
        return "User{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                '}';
    }
}
