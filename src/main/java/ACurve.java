public abstract class ACurve implements ICurve{

    protected IPoint a,b;

    public ACurve() {
        a = b = null;
    }

    public ACurve(IPoint argA, IPoint argB) {
        a = argA;
        b = argB;
    }

    public abstract IPoint GetPoint(double t);

}
