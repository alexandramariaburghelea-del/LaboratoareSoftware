package lab5.advanced;

public class DoubleCalculator extends ACalculator {
    public void init(Object a){
        state=(Double)a;
    }
    public DoubleCalculator add(Double a){
        state=(Double)state+a;
        return this;
    }
    public DoubleCalculator subtract(Double a){
        state=(Double)state-a;
        return this;
    }
    public DoubleCalculator multiply(Double a){
        state=(Double)state*a;
        return this;
    }
}
