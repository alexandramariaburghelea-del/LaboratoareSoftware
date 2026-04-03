package lab5.advanced;

public abstract class ACalculator {
    protected Object state;
    public Object result(){
        return state;
    };
    public Object clear(){
        state = null;
        return this;
    }
    public abstract void init(Object a);

}
