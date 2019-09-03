package advJava;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SudokuRecursive extends Application {
	
	
	public final int SIZE = 9;
	//textfield to store values
	
	private TextField[][] myCells = new
			TextField[SIZE][SIZE];
	
	//solve button
	private Button solveButton = new Button("Solve");
	
	//clear button
	private Button clearButton = new Button("Clear");
	
	//label for status
	private Label statusLabel = new Label();
	
	//Override the start method of application
	@Override
	
	public void start(Stage primaryStage) {
		
		//2D array of grid plane
		GridPane[][] myPanels = new GridPane[3][3];
		
		//main GRid Pane
		GridPane myGridPane = new GridPane();
		
		//setting style to red
		myGridPane.setStyle("-fx border-color: red");
		
		//loop to initialize the grid pane
		for (int idx = 0; idx < 3; idx++){
			for(int jdy = 0; jdy < 3; jdy++) {
				//Initializing the 2D array of Grid Pane
				myGridPane.add(myPanels[idx][jdy] = new GridPane(), jdy, idx);
				//setting each GridPane's style to red
				myPanels[idx][jdy].setStyle("-fx-border-color: red");
				
			}
			
		}
		
		for ( int idx = 0; idx < 9; idx++) {
			for( int jdy = 0; jdy < 9; jdy++) {
				
				myPanels[idx/3][jdy/3].add(myCells[idx][jdy] = TextField(), jdy%3, idx % 3);
					
				
			}
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
