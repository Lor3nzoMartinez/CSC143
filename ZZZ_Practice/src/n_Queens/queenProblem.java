package n_Queens;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class queenProblem extends Application {

	public static void row(Stage applicationStage) {
		Pane pane = new Pane();                    // Create an empty pane    
	      Scene scene = new Scene(pane);             // Create a scene containing the pane
	      Canvas canvas = new Canvas(400, 400);      // Create a canvas in which to draw
	      
	      // Get the canvas' graphics context to draw
	      GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
	            
	      
	      Color binColor1 = Color.rgb(119,136,153);
	      Color binColor2 = Color.rgb(255,255,255);
	      
	      graphicsContext.setFill(binColor1);
	      graphicsContext.fillRect(50, 100, 50, 50);
	      graphicsContext.fillRect(150, 100, 50, 50);
	      graphicsContext.fillRect(250, 100, 50, 50);
	      graphicsContext.fillRect(350, 100, 50, 50);
	      
	      graphicsContext.setFill(binColor2);
	      graphicsContext.fillOval(50, 0, 50, 50);
	      graphicsContext.setFill(binColor1);
	      graphicsContext.fillText("Q", 70, 33, 50);
	      

	      
	      
	      pane.getChildren().add(canvas);                // Add canvas to pane 
	      applicationStage.setTitle("Histogram viewer"); // Set window's title
	      applicationStage.setScene(scene);              // Set window's scene
	      applicationStage.show(); 
		
	}
	
	
	
	@Override
	   public void start(Stage applicationStage) {
	      Pane pane = new Pane();                    // Create an empty pane    
	      Scene scene = new Scene(pane);             // Create a scene containing the pane
	      Canvas canvas = new Canvas(400, 400);      // Create a canvas in which to draw
	      
	      // Get the canvas' graphics context to draw
	      GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
	            
	      
	      Color binColor1 = Color.rgb(119,136,153);
	      Color binColor2 = Color.rgb(255,255,255);
	      
	      graphicsContext.setFill(binColor1);
	      graphicsContext.fillRect(50, 0, 50, 50);
	      graphicsContext.fillRect(150, 0, 50, 50);
	      graphicsContext.fillRect(250, 0, 50, 50);
	      graphicsContext.fillRect(350, 0, 50, 50);
	      
	      graphicsContext.setFill(binColor2);
	      graphicsContext.fillOval(50, 0, 50, 50);
	      graphicsContext.setFill(binColor1);
	      graphicsContext.fillText("Q", 70, 33, 50);
	      
	      
	      
	      
	      pane.getChildren().add(canvas);                // Add canvas to pane 
	      applicationStage.setTitle("Histogram viewer"); // Set window's title
	      applicationStage.setScene(scene);              // Set window's scene
	      applicationStage.show();                       // Display window
	   }
	   
	   public static void main(String [] args) {
	       launch(args); // Launch application
	       row(null);
	   }
	}