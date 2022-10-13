package ASSIGNMENT_2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AS_2_4 extends Application{
	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage myStage){
		BorderPane root = new BorderPane();
		
		GridPane gridpane = new GridPane();
//		gridpane.setGridLinesVisible(true);
		root.setPadding(new Insets(10, 10, 30, 10));
		
		String states[] = { "Karnataka", "Maharastra", "Kerala", "Goa","AndraPradesh" ,"Telangana","TamilNadu"};
		 
		HBox hbox = new HBox();
		HBox hbox2 = new HBox();
		
		Label label = new Label("Employee Registration Form");
		root.setTop(label);
		root.setAlignment(label, Pos.CENTER);
		 
		Label labelname = new Label("Enter Your Name :");
		TextField tfname = new TextField();
		Label labelgender = new Label("Select your Gender :");
		
		RadioButton r1 = new RadioButton("male"); 
        RadioButton r2 = new RadioButton("female"); 
        hbox.getChildren().addAll(r1,r2);
        
        Label labelDOB = new Label("Enter your date of birth :");
        DatePicker date = new DatePicker(); 
        Label labelstate = new Label("Select your state :");
        ChoiceBox cBox = new ChoiceBox(FXCollections.observableArrayList(states));
        
        Label labelQuali = new Label("Select Your Qualification :");

        String Education[] = { "UG", "PG", "PhD" }; 
        
      
        for (int i = 0; i < Education.length; i++) { 
  
            // create a checkbox 
            CheckBox c = new CheckBox(Education[i]); 
  
            // add label 
            hbox2.getChildren().add(c); 
  
            // set IndeterMinate 
            c.setIndeterminate(true); 
        } 
		
		
		gridpane.add(labelname, 0, 0, 1, 1);
		gridpane.add(tfname, 1, 0, 1, 1);
		gridpane.add(labelgender, 0, 1, 1, 1);
		gridpane.add(hbox, 1, 1, 1, 1);
		gridpane.add(labelDOB, 0, 2, 1, 1);
		gridpane.add(date, 1, 2, 1, 1);
		gridpane.add(labelstate, 0, 3, 1, 1);
		gridpane.add(cBox, 1, 3, 1, 1);
		gridpane.add(labelQuali, 0, 4, 1, 1);
		gridpane.add(hbox2, 1, 4, 1, 1);
		
		gridpane.setHgap(10);
		gridpane.setVgap(15);
		gridpane.setPadding(new Insets(20,30,20,30));
		
		ColumnConstraints coloumn1 = new ColumnConstraints();
		ColumnConstraints coloumn2 = new ColumnConstraints();
		
		gridpane.getColumnConstraints().add(coloumn1);
		gridpane.getColumnConstraints().add(coloumn2);
		
		coloumn1.setPrefWidth(200);
		coloumn2.setPrefWidth(250);
		
		GridPane.setHalignment(labelname, HPos.RIGHT);
		GridPane.setHalignment(labelgender, HPos.RIGHT);
		GridPane.setHalignment(labelDOB, HPos.RIGHT);
		GridPane.setHalignment(labelstate, HPos.RIGHT);
		GridPane.setHalignment(labelQuali, HPos.RIGHT);
		
		
		Button btn = new Button("Register");
		root.setBottom(btn);
		root.setAlignment(btn, Pos.CENTER);
		
		
		btn.setOnAction(e->{
			// creating a dialog box
			Dialog dialog = new Dialog();
			dialog.setTitle("Registration Successfull");
			dialog.setHeaderText("Registration Status");
			dialog.setContentText("Employee Registration is successfull");
			
			// adding image to the dialog box
			Image img = new Image("ASSIGNMENT_2\\i_icon.jpeg",50,50,true,true);
			ImageView imageview = new ImageView(img);
			dialog.setGraphic(imageview);
			
			// adding button to the dialog box
			dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
			dialog.show();
		});
		
		
		root.setCenter(gridpane);
		Scene myscene = new Scene(root,600,300);
		myStage.setScene(myscene);
		myStage.show();
	}
}
