/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author sistemas
 */
public class PaneInicialController implements Initializable {

    @FXML
    private ImageView iview;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iview.setImage(new Image(getClass().getResourceAsStream("/imagens/logo_topo.png")));
    }    
}
