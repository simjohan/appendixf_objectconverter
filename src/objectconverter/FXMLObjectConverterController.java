/*
 * Copyright (C) 2015 sinjo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package objectconverter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author sinjo
 */
public class FXMLObjectConverterController implements Initializable {
    
    @FXML private TextField objectText;
    @FXML private TextField valuesText;
    @FXML private TextArea textArea;
    
    
    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        objectText.setText(null);
        valuesText.setText(null);
        textArea.setText(null);
    }
    
    @FXML
    private void handleConvertButtonAction(ActionEvent event) {
        Convert c = new Convert(Integer.valueOf(objectText.getText()), valuesText.getText());
        textArea.setText(c.getStringResult());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textArea.setText("Converts raw objectdata to readable parameters / info."
                + "\nEnter the object-nr found in steps in object and it's data into the values field."
                + "\nMake sure there is no leading/trailing spaces in the data."
                + "\n\nCurrently supported objects are 35(ECR parameters) and 37(Function parameters)."
                + "\nSource: https://github.com/simjohan/appendixf_objectconverter.git");
    }    
    
}
