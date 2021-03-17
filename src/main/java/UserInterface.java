import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.canvas.*;

public class UserInterface extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        IPoint a = new Point();
        a.SetX(100);
        a.SetY(100);
        IPoint b = new Point();
        b.SetX(300);
        b.SetY(140);
        IPoint c = new Point();
        c.SetX(150);
        c.SetY(130);
        IPoint d = new Point();
        d.SetX(250);
        d.SetY(170);
        VisualLine visualLine = new VisualLine(a,b);
        VisualBezier visualBezier = new VisualBezier(a,b,c,d);

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(100,100,100,100));
        hBox.setSpacing(200);

        final Canvas canvasLine = new Canvas(400,400);
        GraphicsContext gLine = canvasLine.getGraphicsContext2D();
        gLine.setStroke(Color.BLACK);
        gLine.setLineWidth(4);
        gLine.strokeRect(0, 0, 400, 400);
        visualLine.Draw(gLine);

        final Canvas canvasBezier = new Canvas(400,400);
        GraphicsContext gBezier = canvasBezier.getGraphicsContext2D();
        gBezier.setStroke(Color.BLACK);
        gBezier.setLineWidth(4);
        gBezier.strokeRect(0, 0, 400, 400);
        visualBezier.Draw(gBezier);

        Group root = new Group();
        hBox.getChildren().addAll(canvasLine, canvasBezier);
        root.getChildren().add(hBox);

        //Creating a Scene
        Scene scene = new Scene(root, 1200, 600);

        //Setting title to the scene
        stage.setTitle("Sample application");

        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }


}
