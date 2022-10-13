//Write a Java program to build the GUI application using JavaFX for the following requirements:
//
//a) Create a Menu control to display the menu items: File, Edit & Help.
//b) Create sub menus in the order: File → New, Open & Save. Edit → Cut, Copy & Paste.
//Help → Help Centre, About Us
//The program must use Mnemonics and Accelerators (wherever appropriate) to Menu Items.

package ASSIGNMENT_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AS_2_2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {
		
//		FlowPane rootnode = new FlowPane();
		BorderPane rootnode = new BorderPane();
		
		// creating a menu bar
		MenuBar mb = new MenuBar();
		
		// Create the File menu.
		Menu fileMenu = new Menu("_File"); // set the Mnemonics		
		// create the file menu items
		MenuItem open = new MenuItem("New");
		MenuItem close = new MenuItem("Open");
		MenuItem save = new MenuItem("Save");
		
		// add menu items to the menu
		fileMenu.getItems().addAll(open,close,save);
		
		// set Mnemonics true
		fileMenu.setMnemonicParsing(true);
		
		// Add keyboard accelerators for the File menu.
		open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
		close.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
		save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
		
		// add menu to the menu bar
		mb.getMenus().add(fileMenu);
		
		
		
		// Create the edit menu.
		Menu editMenu = new Menu("_Edit"); // set the Mnemonics		
		// create the edit menu items
		MenuItem cut = new MenuItem("cut");
		MenuItem copy = new MenuItem("copy");
		MenuItem paste = new MenuItem("paste");
		
		// add menu items to the menu
		editMenu.getItems().addAll(cut,copy,paste);
		
		// set Mnemonics true
		editMenu.setMnemonicParsing(true);
		
		// Add keyboard accelerators for the edit menu.
		cut.setAccelerator(KeyCombination.keyCombination("shortcut+x"));
		copy.setAccelerator(KeyCombination.keyCombination("shortcut+c"));
		paste.setAccelerator(KeyCombination.keyCombination("shortcut+v"));
		
		// add menu to the menu bar
		mb.getMenus().add(editMenu);
		
		
		// Create the help menu.
		Menu helpMenu = new Menu("_Help"); // set the Mnemonics		
		// create the help menu items
		MenuItem helpCenter = new MenuItem("Help Center");
		MenuItem aboutUs = new MenuItem("copAbout Us");
				
		// add menu items to the menu
		helpMenu.getItems().addAll(helpCenter,aboutUs);
				
		// set Mnemonics true
		helpMenu.setMnemonicParsing(true);
				
		
				
		// add help to the menu bar
		mb.getMenus().add(helpMenu);
		
		
//		rootnode.getChildren().add(mb);
		rootnode.setTop(mb);
		
		Scene scene = new Scene(rootnode,500,400);
		
		myStage.setScene(scene);
		myStage.show();
	}
}
