//Write a Java program to build the GUI application using JavaFX for the following requirements:
//
//a) Create Context menu involving the menu items in the order: New & View.
//b) Create sub menus for the above main context menu: New → File, Folder & Image.
//View → Large, Medium & Small.
//The context menu must be displayed on right-click of the mouse button.

package ASSIGNMENT_2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.input.ContextMenuEvent;

public class AS_2_3 extends Application {
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage myStage) {
		
		FlowPane rootnode = new FlowPane();
		
		// create a menu
		Menu NewMenu = new Menu("New");
		// create a menu items
		MenuItem file = new MenuItem("File");
		MenuItem folder = new MenuItem("Folder");
		MenuItem image = new MenuItem("Image");
		
		NewMenu.getItems().addAll(file,folder,image);
		
		Menu ViewMenu = new Menu("View");
		MenuItem large = new MenuItem("Large");
		MenuItem medium = new MenuItem("Medium");
		MenuItem small = new MenuItem("Small");
		
		ViewMenu.getItems().addAll(large,medium,small);
		
		// create a context menu
		ContextMenu contextMenu = new ContextMenu(NewMenu,ViewMenu);
				
		Scene myscene = new Scene(rootnode,400,300);	

		// set a context menu to the scene
		rootnode.setOnContextMenuRequested(
                new EventHandler<ContextMenuEvent>() {
      public void handle(ContextMenuEvent ae) {
        // Popup menu at the location of the right click.
    	  contextMenu.show(rootnode, ae.getScreenX(), ae.getScreenY());
      }
    });
		
		myStage.setScene(myscene);
		myStage.show();
	}
}
