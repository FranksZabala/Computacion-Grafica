package com.mycompany.figuras;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class FXMLController implements Initializable {
    
    
    @FXML
    
    private Canvas canvas;
    private GraphicsContext lienzo;
    private boolean mostrar;
 
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        
        
        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.GREEN);
        lienzo.strokeRect(10,10,60,30);
    }
    @FXML
    private void handleCuadro2Action(ActionEvent event) {
     
        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.RED);
        lienzo.strokeRect(10,60,60,30);
        lienzo.setFill(Color.BLUE);
        lienzo.fillRect(10, 60, 60, 30);
        
    }
    @FXML
    private void handleTrianguloAction(ActionEvent evet){
    
       double [] x={180,150,210};
        double [] y={10,60,60};
        
        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.GREEN);
        lienzo.setFill(Color.GREEN);
        lienzo.fillPolygon(x, y, 3);
        lienzo.strokePolygon(x, y, 3);
        
        
        /*double [] x1={180,150,210,180};
        double [] y1={110,60,60,10};
        
        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.GREEN);
        lienzo.setFill(Color.GREEN);
        lienzo.fillPolygon(x1, y1, 4);
        lienzo.strokePolygon(x1, y1, 4);
        
        
        double [] x2={180,150,210,180};
        double [] y2={10,60,60,110};
        
        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.GREEN);
        lienzo.setFill(Color.GREEN);
        lienzo.fillPolygon(x2, y2, 4);
        lienzo.strokePolygon(x2, y2, 4);*/
        
        
        
        
    }
    
    @FXML
    private void handleRomboAction(ActionEvent evet){
    
        double [] x={280,250,310};
        double [] y={10,60,60};
        
        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.DODGERBLUE);
        lienzo.setFill(Color.DODGERBLUE);
        lienzo.fillPolygon(x, y, 3);
        lienzo.strokePolygon(x, y, 3);
        
        
        double [] x1={280,250,310};
        double [] y1={110,60,60};
        
        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.DODGERBLUE);
        lienzo.setFill(Color.DODGERBLUE);
        lienzo.fillPolygon(x1, y1, 3);
        lienzo.strokePolygon(x1, y1, 3);
    }
    
    @FXML
    private void handleLimpiarAction(ActionEvent evet){
    
        lienzo=canvas.getGraphicsContext2D();
        
        double h=canvas.getHeight();
        double w=canvas.getWidth();
        
        lienzo.clearRect(2, 2, w-3, h-3);
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        lienzo=canvas.getGraphicsContext2D();
        
        double h=canvas.getHeight();
        double w=canvas.getWidth();
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(new Color(.15,.15,.15,.95));
        lienzo.setLineWidth(2);
        lienzo.strokeRect(0, 0, w, h);
        
        mostrar=false;
        
    }    
}
