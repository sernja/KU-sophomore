//elab-source:NumberGuessor.java
public class NumberGuessor {
    private int target;
    private int numRoll;
    public void setNumberGuessor(int numRoll, int target) {
        this.numRoll = numRoll;
        this.target = target;
    }

    public String checkTarget() {
       if(numRoll == target)  return "correct";
       else {
           if(numRoll > target) return "too high";
           else return "too low";
       }
    }
}
