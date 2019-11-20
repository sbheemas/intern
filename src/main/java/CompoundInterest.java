public class CompoundInterest {
    double p;
    double t;
    double r;
    double n;

    CompoundInterest(double p, double t, double r, double n){
        this.p = p;
        this.t = t;
        this.r = r;
        this.n=  n;

    }
    public double getInterest(){
    double amount;

    amount = this.p*Math.pow((1+((this.r/100)/this.n)),this.t*this.n);
    return (amount - this.p);
    }
}
