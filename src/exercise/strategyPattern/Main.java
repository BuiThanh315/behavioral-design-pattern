package exercise.strategyPattern;

public class Main {
    public static void main(String[] args){
        User Thanh = new User("clown lord", "Thanh", "ClownLord@gmail.com");

        XMLStorage xmlStorage = new XMLStorage();
        UserController userController1 = new UserController(xmlStorage);
        userController1.store(Thanh);

        MySQLStorage mySQLStorage = new MySQLStorage();
        UserController userController2 = new UserController(mySQLStorage);
        userController2.store(Thanh);
    }
}
