package lab5.advanced;

public class NewIntCalculator extends ACalculator {
    public void init(Object a) {
        state=(Integer) a;
    }
    public NewIntCalculator add(int a) {
        state=(Integer) state+a;
        return this;
    }
    public NewIntCalculator subtract(int a) {
        state=(Integer) state-a;
        return this;
    }
    public NewIntCalculator multibply(int a){
        state=(Integer) state*a;
        return this;
    }
}
