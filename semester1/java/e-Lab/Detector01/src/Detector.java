//elab-source:Detector.java
public class Detector {
    private long countTrue;
    private long countAns;
    private long trueAns;
    private long[] arrAns;
    private long[] arrCountTrue;
    private int line;

    public Detector(long[] arrAns, long trueAns, int line) {
        this.arrAns = arrAns;
        this.trueAns = trueAns;
        this.arrCountTrue = new long[line];
    }

    public void saveAns(long countAns, long countTrue, int line) {
        this.countTrue = countTrue;
        this.countAns = countAns;
        this.line = line;
        this.arrCountTrue[line-1] = countTrue;
    }

    public long getTrueAns() {
        return trueAns;
    }
    public long[] getArrAns() {
        return arrAns;
    }
    public int getLine() {
        return line;
    }
    public long getCountAns() {
        return countAns;
    }
    public long getCountTrue() {
        return countTrue;
    }

    public String toString(){
        return getLine() + ": " + getCountTrue() + "/" + getCountAns();
    }
    public String avg(){
        int countSum = 0;
        for(long i : arrCountTrue){
            countSum += i;
        }
        double ans = countSum/(double)getLine();
        return "Average: " + ans;
    }
}
