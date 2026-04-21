package exercise.strategyPattern;

public class XMLStorage implements UserStorage{
    @Override
    public void store(User user){
        System.out.println("Đã lưu " + user.toString() + " vào file XML");
    }
}
