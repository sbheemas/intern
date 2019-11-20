public class SimpleInterest {
    double p;
    double t;
    double r;
    SimpleInterest(double p, double t, double r){
        this.p = p;
        this.t = t;
        this.r = r;
    }
    public double getInterest(){
        return this.p*this.t*this.r/100;
    }
}
