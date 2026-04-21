package exercise.strategyPattern;

public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user){
        System.out.println("Đã lưu " + user.toString() + " vào file MySQL");
    }
}
