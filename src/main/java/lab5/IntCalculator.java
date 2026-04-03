package lab5;

public class IntCalculator {
    private int state;
    public IntCalculator(int state) {
        this.state = state;
    }

    public IntCalculator add(int a) {
        state+=a;
        return this;
    }
    public IntCalculator subtract(int a) {
        state-=a;
        return this;
    }
    public IntCalculator multiply(int a) {
        state*=a;
        return this;
    }
    public int result() {
        return state;
    }

    public IntCalculator clear() {
        state=0;
        return this;
    }


}
