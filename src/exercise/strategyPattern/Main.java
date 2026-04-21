package exercise.strategyPattern;

public class Main {
    public static void main(String[] args){
        User Thanh = new User("clown lord", "Thanh", "ClownLord@gmail.com");

        XMLStorage xmlStorage = new XMLStorage();
        xmlStorage.store(Thanh);

        MySQLStorage mySQLStorage = new MySQLStorage();
        mySQLStorage.store(Thanh);
    }
}
