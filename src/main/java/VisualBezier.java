import javax.swing.*;
import java.awt.*;

public class VisualBezier extends VisualCurve{

    public VisualBezier(IPoint argA, IPoint argB, IPoint argC, IPoint argD) {
        bezier = new Bezier(argA, argB, argC, argD);
    }

    protected Bezier bezier;

    public void Draw(Graphics g) {

    }

    public IPoint GetPoint(double t) {
        return bezier.GetPoint(t);
    }

}
