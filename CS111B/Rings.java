import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
public class Rings extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage) throws Exception 
   {
      Group root = new Group();
      Scene scene = new Scene(root);
      Canvas canvas =new Canvas(600, 400);
      GraphicsContext gc = canvas.getGraphicsContext2D();
      gc.strokeOval(55,50,150,150);
      gc.strokeOval(220,50,150,150);
      gc.strokeOval(390,50,150,150);
      gc.strokeOval(130,135,150,150);
      gc.strokeOval(300,135,150,150);
      //gc.fillOval(155,100,10,20);
      //gc.fillOval(230,100,10,20);
      //gc.strokeArc(150,160,100,50,0,180,ArcType.CHORD);
      root.getChildren().add(canvas);
      primaryStage.setTitle("HappyFace in JavaFX");
      primaryStage.setScene(scene);
      primaryStage.show();
   }


}

/*
1.I would change the last two parameters to have the same value.
for example;  gc.fillOval(155,100,15,15);

2.I would change the "gc.strokeArc" angle starting at 0 degegree and entering
180 as the angle. For exmple, gc.strokeArc(150,160,100,50,0,180,ArcType.CHORD);


*/