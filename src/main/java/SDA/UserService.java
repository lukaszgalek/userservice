package SDA;

import java.util.ArrayList;
import java.util.List;

public class UserService {
  // private User [] users = new User[5];
  List<User> users = new ArrayList<>();
//    private int count = 0;

   public void addUser (User user) {
       users.add(user);
   }
    public void printAll(){
       for (int i=0; i<users.size();i++){
           System.out.println(users.get(i));

//   public void addUser(User user){
////       users[users.length]=user;
//       users[count++]= user;
//   }
//public void printAll(){
//       for (int i=0; i<users.length;i++){
//           System.out.println(users[i]);
//       }
}

}}
