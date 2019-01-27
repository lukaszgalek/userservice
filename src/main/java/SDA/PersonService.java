package SDA;

import java.util.*;

public class PersonService {
    private Map<Integer, User >personService = new HashMap<>();

private static  int id ;



   public void addUser(User user){
       personService.put(++this.id,user);
//               id++;
   }


//
//   public List<User> getYounger (){
//      List<User> tempList= new ArrayList<>();
//       for(temp:tempList){
//           if (()


//       if (liczba < 18){
//           for(younger:personService)
//               if()





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
