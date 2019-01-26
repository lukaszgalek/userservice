package SDA;

import java.util.ArrayList;
import java.util.List;

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
       // System.out.println(user1.getImie());
//       user1.setImie("lukas");
        //System.out.println("cos \n");

        List<String> users = new ArrayList<>();
        users.add("jan");
        users.add("krzysiek");
        System.out.println(users);
        for (String user:users){
            System.out.println(user + "\n");}


        UserService service = new UserService();

        service.addUser(user1);
        service.addUser(user2);
//        service.printAll();

        List<Integer> liczby = new ArrayList<>();
        liczby.add(2);
        liczby.add(3);
        liczby.add(1);
        for (Integer liczba:liczby){
            System.out.println(liczba);
        }


//        user.add(user1);
//        user.add(user2);

//        for (User dane:user){
//            System.out.println(dane);}
        System.out.println("\n");

        service.printAll();


        System.out.println("\n\n");


        Dictionary engDictionary = new Dictionary ();
        engDictionary.addTranslation("piłka","ball");
        engDictionary.addTranslation("laptop","laptop");
        engDictionary.addTranslation("telefon","mobile phone");
        engDictionary.addTranslation("pies","dog");
        engDictionary.addTranslation("kubek","cup");

        System.out.println(engDictionary.getTranslation("piłka"));
    }}

