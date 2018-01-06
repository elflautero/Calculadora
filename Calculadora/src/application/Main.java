package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class Main extends Application { 			// classe de visualização e controle extendida a aplication do JavaFx
	
	@Override             								// sobrescrever o método start
	public void start (Stage stage) throws Exception {  	// método start (lógica e componentes)
		
		AnchorPane pane = new AnchorPane(); 					//criar um painel
		pane.setPrefSize(400, 300);
		
		Scene scene = new Scene (pane);								// criar cena e passa o painel
		
		stage.setScene(scene); 											// indicar a cena utilizada no stage
		
		stage.show();														// abrir o stage
		
		TextField txtViewAritmetica = new TextField(); // mostar o cálculo feito, por ex: 10 - 15 = 
		txtViewAritmetica.setPromptText("0");
		
		TextField txtViewResposta = new TextField();		// mostrar o resultado do cálculo aritmético
		txtViewResposta.setPromptText("0");
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
