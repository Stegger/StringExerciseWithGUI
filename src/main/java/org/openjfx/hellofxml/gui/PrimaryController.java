/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.openjfx.hellofxml.gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.openjfx.hellofxml.bll.StringUtils;

public class PrimaryController
{

    @FXML
    private Label lblHeader;
    @FXML
    private TextField txtInput;
    @FXML
    private Button primaryButton;
    @FXML
    private TextArea txtOutput;

    private StringUtils stringUtils;

    /**
     * Constructs the controller BEFORE gui components are initialized!!
     */
    public PrimaryController()
    {
        stringUtils = new StringUtils();
    }
    
    @FXML
    private void switchToSecondary() throws IOException
    {
        String txt = txtInput.getText();
        String output = stringUtils.addTagsToText(txt);
        txtOutput.setText(output);
    }

    @FXML
    private void handleExerciseTwo(ActionEvent event)
    {
        String txt = txtInput.getText();
        String output = stringUtils.nrOfCharsInTxt(txt) + "";
        txtOutput.setText(output);
    }

    @FXML
    private void handleExerciseThree(ActionEvent event)
    {
        String input = txtInput.getText();
        String output = stringUtils.addSnabelA(input);
        txtOutput.setText(output);
    }

    @FXML
    private void handleExerciseFour(ActionEvent event)
    {
        String txt = txtInput.getText();
        String out = stringUtils.reverseText(txt);
        txtOutput.setText(out);
    }
    
    @FXML
    private void handleExerciseFive(ActionEvent event)
    {
        String txt = txtInput.getText();
        String out = stringUtils.convertToMorse(txt);
        txtOutput.setText(out);
    }

}