package Computer;

public class Network {
    private int user;
    private static final int MAX_USER = 100;
    private static final int MIN_USER = 0;
    public Network(int user){
        this.user = ++user > MAX_USER ? MAX_USER : user;
    }
    public void connect(){
        user = ++user > MAX_USER ? MAX_USER : user;
    }
    public void disConnect(){
        user = --user < MIN_USER ? MAX_USER : user;
    }
}
