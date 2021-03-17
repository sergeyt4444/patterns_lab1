import javafx.scene.canvas.GraphicsContext;

import javax.swing.*;
import java.awt.*;

public class VisualBezier extends VisualCurve{

    public VisualBezier(IPoint argA, IPoint argB, IPoint argC, IPoint argD) {
        bezier = new Bezier(argA, argB, argC, argD);
    }

    protected Bezier bezier;

    public void Draw(GraphicsContext g) {
        double aX = bezier.a.GetX();
        double aY = bezier.a.GetY();

        double tempStartX = aX;
        double tempStartY = aY;
        double tempFinishX, tempFinishY;

        for (double temp = 0.01; temp <=1; temp+=0.01) {
            IPoint tempPoint = bezier.GetPoint(temp);
            tempFinishX = tempPoint.GetX();
            tempFinishY = tempPoint.GetY();
            g.strokeLine(tempStartX, tempStartY, tempFinishX, tempFinishY);
            tempStartX = tempFinishX;
            tempStartY = tempFinishY;
        }

    }

    public IPoint GetPoint(double t) {
        return bezier.GetPoint(t);
    }

}
