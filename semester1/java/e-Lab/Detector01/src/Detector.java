//elab-source:Detector.java
public class Detector {
    private long[] arrAns;
    private long trueAns;
    private int numAns;
    public Detector(long[] arrAns, long trueAns) {
        this.arrAns = arrAns;
        this.trueAns = trueAns;
    }
    public int findNumTrue(int line) {
        int num = 0;
        this.numAns = 0;
        long i = trueAns;
        long numStdAns = arrAns[line];
        while (i > 0){
            numAns++;
            if(i%10 == numStdAns%10) num++;
            i /= 10;
            numStdAns /= 10;
        }
        return num;
    }

    public long[] getArrAns() {
        return arrAns;
    }

    public long getTrueAns() {
        return trueAns;
    }

    public int getNumAns() {
        return numAns;
    }
}
