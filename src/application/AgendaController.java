package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class AgendaController {
	
	private String cand1 = "Gurpegui";
	private String cand2 = "Álvarez";
	private String cand3 = "Pascual";
	private String cand4 = "Maeso";
	
	@FXML
	private Button btn1;
	
	@FXML
	private Button btn2;
	

    // To Creating a Observable List
//    ObservableList<data> datos = FXCollections.observableArrayList(cand1, cand2, cand3, cand4);

    // Create a ListView
    @FXML
    ListView<String> lista1 = new ListView<String>();
    @FXML
    ListView<String> lista2 = new ListView<String>();

    public void initialize(){
    	lista1.getItems().addAll(cand1,cand2, cand3, cand4);
    	
    	lista1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	}
    
    public void cambioDerch(ActionEvent event) {
    	Object a =lista1.getSelectionModel().getSelectedItem();
    	lista2.getItems().add((String) a);
    	lista1.getSelectionModel().clearSelection();
    	lista1.getItems().remove(a);

	}
    
    public void cambioIzq(ActionEvent event) {
    	Object a =lista2.getSelectionModel().getSelectedItem();
    	lista1.getItems().add((String) a);
    	lista2.getSelectionModel().clearSelection();
    	lista2.getItems().remove(a);

	} 
}
