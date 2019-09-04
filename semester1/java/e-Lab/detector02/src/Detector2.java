//elab-source:Detector2.java
public class Detector2 {
    private String ansStd[];
    private String ans;
    private int line;

    public Detector2(String[] ansStd, String ans, int line) {
        this.ansStd = ansStd;
        this.ans = ans;
        this.line = line;
    }

    public String[] getAnsStd() {
        return ansStd;
    }
    public String getAns() {
        return ans;
    }
    public int getLine() {
        return line;
    }
}
