package SDA;

public class UserService {
   private User [] users = new User[5];
   private int count = 0;

   public void addUser(User user){
//       users[users.length]=user;
       users[count++]= user;
   }
public void printAll(){
       for (int i=0; i<users.length;i++){
           System.out.println(users[i]);
       }
}

}
