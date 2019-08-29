//elab-source:Stamp.java
public class Stamp {
    private double[] arrMoney;
    private int stamp;
    public void setStamp(double[] money) {
        this.arrMoney = money;
    }

    public void calStamp() {
        double sumMoney = 0;
        for(double i : arrMoney){
           sumMoney += i;
        }
        stamp = (int)sumMoney/50;
    }

    public int getStamp() {
        return stamp;
    }
}
