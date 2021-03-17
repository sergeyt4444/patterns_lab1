public class Line extends ACurve{

    public Line(IPoint argA, IPoint argB) {
        a = argA;
        b = argB;
    }

    @Override
    public IPoint GetPoint(double t) {
        Point result = new Point();
        result.SetX(a.GetX()*(1-t) + t*b.GetX());
        result.SetY(a.GetY()*(1-t) + t* b.GetY());
        return result;
    }
}
