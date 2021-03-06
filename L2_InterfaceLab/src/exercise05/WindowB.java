package exercise05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/************************************************************************
 * <p> Lab 02 Exercise 05
 * 	   This class is a general window for displaying graphical
 * 	   components.This format can be used for all window displays.
 ************************************************************************/
public class WindowB extends Application {
	
	public static final int  WIDTH  = 500;
	public static final int  HEIGHT = 500;
	
	/*****************************************************************
	 * override: start
	 *           overrides the start method in the Application class
	 * ***************************************************************/
	@Override
	public void start(Stage stage) {
		
		/*******************************************************************
		 * required:  Pane 
		 * 			  create a Pane to hold graphics.  
		 * *****************************************************************/
		KeyLambda pane  = new KeyLambda();
		pane.setStyle("-fx-background-color: black;");
		
		/**********************************************************
		 * required:  Scene
		 * 			  create a scene object to hold the pane object
		 * 			  and place it in the stage for display
		 * ********************************************************/
		Scene scene = new Scene(pane, WIDTH, HEIGHT, Color.LIGHTGREY);   
		stage.setTitle("Display Window");			
		stage.setScene(scene);					
		stage.show();
		
	}
	
	/********************************************************************
	 * main method: launch application
	 *              needed to launch JavaFX program when running in IDE
	 * ******************************************************************/
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
