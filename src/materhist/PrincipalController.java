/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package materhist;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

/**
 *
 * @author sistemas
 */
public class PrincipalController implements Initializable {

    private Node pInicial;
    private Node pPesquisaAluno;
    // ...
    @FXML
    private StackPane spane;

    @FXML
    private void paneInicial() {
        int index = spane.getChildren().indexOf(pInicial);
        spane.getChildren().get(index).toFront();
    }

    @FXML
    private void panePesquisaAluno() {
        int index = spane.getChildren().indexOf(pPesquisaAluno);
        spane.getChildren().get(index).toFront();
    }

    private void initPanes() {
        try {
            pInicial = (Node) FXMLLoader.load(getClass().getResource("/panes/PaneInicial.fxml"));
            pPesquisaAluno = (Node) FXMLLoader.load(getClass().getResource("/panes/PanePesquisaAluno.fxml"));
        } catch (IOException ex) {
            System.out.println("ERRO: Inicialização dos panes.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initPanes();

        spane.getChildren().add(pPesquisaAluno);
        spane.getChildren().add(pInicial);

    }
}
