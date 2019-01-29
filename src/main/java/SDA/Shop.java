package SDA;

import java.util.LinkedList;
import java.util.Queue;

public class Shop {
    private Queue<Person> queue= new LinkedList<>();


    public void addClient (Person person) {

        if (queue.size()>=3){

            System.out.println("kolejka jest pełna "+ person + " klient musi zaczekac");
        }else if( person.getWiek()<18) {
            System.out.println("osoba jest niepelnoletnia");
        }else{
        queue.add(person);
    }}

    public void serveCustomer (){
        queue.poll();
    }
        public void wyswietl() {
        for (Person person :queue) {
            System.out.println(person);
        }
        }

    public void getAll( String imie){
        for( Person person  : queue) {
            if(person.getImie().equals(imie)){
                System.out.println(person);
            }
        }}
//    public void show(Person person) {
//        if (queue.contains(person)) {
//            queue.element();}
//    }

    }

