package SDA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class PersonService {
    private Map<Integer, User >personService = new HashMap<>();

private static  int id ;



   public void addUser(User user){
       personService.put(++this.id,user);
//               id++;
   }


   public void usunUser(int id){
       personService.remove(id);
   }
   public User  getUserbyId(int id){
       return personService.get(id);
   }
   public void modyfikacje( int id,User user ) {
       if (personService.containsKey(id)) {
           personService.put(id, user);
       }}

       //        public void addUser (int id, User user ) {
//            personService.keySet();



}
