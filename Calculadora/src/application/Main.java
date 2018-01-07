package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class Main extends Application { 			// classe de visualização e controle extendida a aplication do JavaFx
	
	@Override             								// sobrescrever o método start
	public void start (Stage stage) throws Exception {  	// método start (lógica e componentes)
		
		AnchorPane pane = new AnchorPane(); 					//criar um painel
		pane.setPrefSize(300, 400);
		
		// INITCOMPONENTS
		TextField txtViewAritmetica = new TextField(); 		// mostar o cálculo feito, por ex: 10 - 15 = 
		txtViewAritmetica.setPromptText("0");
		
		TextField txtViewResposta = new TextField();			// mostrar o resultado do cálculo aritmético
		txtViewResposta.setPromptText("0");
		
		Button btnZero = new Button("0");
		
		Button btnDot= new Button(".");
		Button btnEqual = new Button("=");
		Button btnPlus = new Button("+");
		
	
		pane.getChildren().addAll(txtViewAritmetica, txtViewResposta, btnZero,
				btnDot, btnEqual, btnPlus);		// adicionar todos componentes para o painel
		
		
		Scene scene = new Scene (pane);								// criar cena e passa o painel
		stage.setScene(scene); 											// indicar a cena utilizada no stage
		stage.show();														// abrir o stage
		
		
		//LAYOUT OF COMPONENTS
			
				txtViewAritmetica.setLayoutX(5);
				txtViewAritmetica.setLayoutY(5);
				
				
				txtViewResposta.setLayoutX(5);
		
				txtViewResposta.setLayoutY(40);
				
				//CONTINUAR DA PAG 25, DANDO O PRIMEIRO TOQUE DE REQUINTE
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
