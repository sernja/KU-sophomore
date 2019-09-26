package Computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer com = new Computer();

        Radio radio = new Radio();

        RemoteControl.increaseVolume(com);

        RemoteControl.decreaseVolume(radio);
    }
}
