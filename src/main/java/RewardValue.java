
public class RewardValue {
    double milesValue;
    double cashValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public RewardValue(double milesValue, boolean isMiles){
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035;
        }
    }
    public double getcashValue(){
        return cashValue;
    }

    public  double getMilesValue(){
        return milesValue;
    }
}