//elab-source:PositiveMixedFraction.java
public class PositiveMixedFraction {
    private long wholeNumber;
    private long nominator;
    private long denominator;

    public PositiveMixedFraction(){
        this.wholeNumber = 0;
        this.nominator = 0;
        this.denominator = 1;
    }

    public PositiveMixedFraction(long wholeNumber, long nominator, long denominator){
        this.wholeNumber = wholeNumber;
        this.nominator = nominator;
        this.denominator = denominator;

        calculate();
    }

    public void calculate(){
       if(getWholeNumber() < 0 || getNominator() < 0 || getDenominator() <= 0){
           if(getWholeNumber() < 0)
                throw new RuntimeException("Error WholeNumber = " + getWholeNumber());
           if(getNominator() < 0)
                throw new RuntimeException("Error Nominator = " + getNominator());
           if(getDenominator() <= 0)
                throw new RuntimeException("Error Denominator = " + getDenominator());
       } else if(getNominator() > getDenominator()){
           this.wholeNumber += nominator/denominator;
           this.nominator = nominator%denominator;
       }
       else if(getNominator() == getDenominator()){
           this.wholeNumber += 1;
           this.nominator = 0;
           this.denominator = 1;
       }

    }

    public long getDenominator() {
        return denominator;
    }
    public long getNominator() {
        return nominator;
    }

    public long getWholeNumber() {
        return wholeNumber;
    }
}
