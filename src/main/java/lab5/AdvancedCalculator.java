package lab5;

public class AdvancedCalculator extends IntCalculator{
    public AdvancedCalculator(int state){
        super(state);
    }

    @Override
    public AdvancedCalculator add(int a) {
        super.add(a);
        return this;
    }

    @Override
    public AdvancedCalculator subtract(int a) {
        super.subtract(a);
        return this;
    }

    @Override
    public AdvancedCalculator multiply(int a) {
        super.multiply(a);
        return this;
    }

    public AdvancedCalculator divide(int a){
        return(AdvancedCalculator) super.clear().add(result()/a);
    }

    public AdvancedCalculator power(int a){
        return (AdvancedCalculator) super.clear().add((int)Math.pow(result(),a));

    }
    public AdvancedCalculator squareRoot(int a){
        return (AdvancedCalculator) super.clear().add((int)Math.sqrt(result()));
    }
}
