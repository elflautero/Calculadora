package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


/*
 * CONTINUAR DA PAG 25, DANDO O PRIMEIRO TOQUE DE REQUINTE
 */



public class Main extends Application { 	// classe de visualiza��o e controle extendida a aplication do JavaFx
	
	@Override             								// sobrescrever o m�todo start
	public void start (Stage stage) throws Exception {  	// m�todo start (l�gica e componentes)
		
		AnchorPane pane = new AnchorPane(); 					//criar um painel
		pane.setPrefSize(300, 400);
		
		
		// INITCOMPONENTS
		
		TextField txtViewArit = new TextField(); 		// View Aritm�tica mostar o c�lculo feito, por ex: 10 - 15 = 
		txtViewArit.setPromptText("0");
		
		TextField txtViewAnsw = new TextField();			// mostrar o resultado do c�lculo aritm�tico
		txtViewAnsw.setPromptText("0");
		
		Button btnZero = new Button("0");
		
		Button btnDot= new Button(".");
		Button btnEqual = new Button("=");
		Button btnPlus = new Button("+");
		
	
		pane.getChildren().addAll(txtViewArit, txtViewAnsw, btnZero,
				btnDot, btnEqual, btnPlus);						// adicionar todos componentes para o painel
		
		
		Scene scene = new Scene (pane);								// criar cena e passa o painel
		stage.setScene(scene); 											// indicar a cena utilizada no stage
		stage.show();														// abrir o stage
		
		
		//LAYOUT OF COMPONENTS
			
				txtViewArit.setLayoutX(5); 	//in�cio horizontal
				txtViewArit.setLayoutY(5); 		// in�cio vertical
				txtViewArit.setMinSize(270, 10);	// tamanho m�nimo
				txtViewArit.setPrefSize(290, 60);		// tamanho preferencial
				
				
				txtViewAnsw.setLayoutX(5);
				txtViewAnsw.setLayoutY(70);
				txtViewAnsw.setMinSize(270, 10);
				txtViewAnsw.setPrefSize(290, 60);
				
				btnZero.setLayoutX(5);
				btnZero.setLayoutY(280);
				btnZero.setMinSize(50, 50); 	
				btnZero.setPrefSize(60, 60);  		
				 
				btnDot.setLayoutX(75);
				btnDot.setLayoutY(280);
				btnDot.setMinSize(50, 50);
				btnDot.setPrefSize(60, 60);
				
				btnEqual.setLayoutX(145);
				btnEqual.setLayoutY(280);
				btnEqual.setMinSize(50, 50);
				btnEqual.setPrefSize(60, 60);
				
				btnPlus.setLayoutX(215);
				btnPlus.setLayoutY(280);
				btnPlus.setMinSize(50, 50);
				btnPlus.setPrefSize(60, 60);
				
				
		
		// CONTROLLERS
				
				btnZero.setOnAction(new EventHandler() {
			
					@Override
					public void handle(Event arg0) {
					System.out.println("N�mero 0");
					}
					});	
				
	} // ... fim: m�todo start
	

	
	public static void main(String[] args) {
		launch(args);
	}
	
} // ...fim: classe principal
