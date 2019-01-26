package SDA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      User user1 = new User("lukas","galek","mail","jakies haslo");
      User user2 = new User("krzysiek","zdzisiek","mail2","jakies cos");
//        User user1 = new User();
        System.out.println(user1.getImie());
//       user1.setImie("lukas");
        System.out.println("cos \n");

        UserService service = new UserService();

        service.addUser(user1);
        service.addUser(user2);
        service.printAll();
    }
}
