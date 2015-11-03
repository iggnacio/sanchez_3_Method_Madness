/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_madness;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Method_Madness extends Application {
    

    public static void main(String[] args) {
        launch(args);
}
            @Override
                    public void start(Stage primaryStage){
                        primaryStage.setTitle("Drawing operations Test");
                        Group root = new Group();
                        Canvas canvas = new Canvas(3000,2500);
                        GraphicsContext gc = canvas.getGraphicsContext2D();
                            drawBackground(gc);
                            drawBoat(gc);
        drawWorm(gc);
        drawFishingLine(gc);
                            drawFish(gc);
                            drawName(gc);
                            drawBubbles(gc);
                            drawPlant(gc);
                            drawRocks(gc);
                        
                                root.getChildren().add(canvas);
                            
primaryStage.setScene(new Scene(root));
                                primaryStage.show();
                        
  }
    private void drawName(GraphicsContext gc) {
                        gc.setFill(Color.BLACK);
                        
                        
  }
    private void drawBubbles(GraphicsContext gc) {
        
                        gc.setFill(Color.BLUE);
                        gc.fillOval(235, 90, 15, 15);
                        gc.setFill(Color.BLUE);
                        gc.fillOval(235, 110, 10, 10);  //Bubble For Fish 1
                                gc.setFill(Color.BLUE);
                                gc.fillOval(556, 190, 15, 15);
                                gc.setFill(Color.BLUE);
                                gc.fillOval(565,210,10,10); // Bubble For Fish 2
                                        gc.setFill(Color.BLUE);
                                        gc.fillOval(795, 315, 15, 15);
                                        gc.setFill(Color.BLUE);
                                        gc.fillOval(795, 335, 10, 10); //Bubble For Fish 3
                                                gc.setFill(Color.BLUE);
                                                gc.fillOval(335, 410, 15, 15);
                                                gc.setFill(Color.BLUE);
                                                gc.fillOval(335,430,10,10); //Bubble For Fish 4
                                                        gc.setFill(Color.BLUE);
                                                        gc.fillOval(1175, 410, 15, 15);                                
                                                        gc.setFill(Color.BLUE);
                                                        gc.fillOval(1175,430,10,10); //Bubble For Fish 5
  }   
    
 private void drawFish(GraphicsContext gc){
                        gc.setFill(Color.CORAL);
                        gc.setStroke(Color.BLACK);
                        gc.fillOval(250, 100, 250, 150); //This X Axis Will Be the One That “drawFishingLine” Will Cross 
                        gc.setFill(Color.BLACK); //The Y Axis Will Be Where The Worm Is Placed Based On The Code Above
                        gc.fillOval(275, 150, 25,25);
                                    gc.setFill(Color.CORAL);
                                    gc.setStroke(Color.BLACK);
                                    gc.fillOval(575, 200, 250, 150);
                                    gc.setFill(Color.BLACK);
                                    gc.fillOval(600,250, 25,25);   
                                            gc.setFill(Color.CORAL);
                                            gc.setStroke(Color.BLACK);
                                            gc.fillOval(805, 325, 250, 150);
                                            gc.setFill(Color.BLACK);
                                            gc.fillOval(850,355, 25,25);
                                                        gc.setFill(Color.CORAL);
                                                        gc.setStroke(Color.BLACK);
                                                        gc.fillOval(350, 420, 250, 150);
                                                        gc.setFill(Color.BLACK);
                                                        gc.fillOval(400,465, 25,25);
                                                                gc.setFill(Color.CORAL);
                                                                gc.setStroke(Color.BLACK);
                                                                gc.fillOval(1200, 425, 250, 150); //same "x" dimensions as the boat
                                                                gc.setFill(Color.BLACK);
                                                                gc.fillOval(1255,450, 25,25);

 }
  private void drawRocks(GraphicsContext gc){
                        gc.setFill(Color.LIGHTSLATEGRAY); //All Rocks Have Same Dimensions Except for the “X” Value
                        gc.fillOval(5,950,155,75); //The “X” Increases By 150 px
                                gc.setFill(Color.LIGHTSLATEGRAY);
                                gc.fillOval(155, 950, 155, 75);
                                        gc.setFill(Color.LIGHTSLATEGRAY);
                                        gc.fillOval(305, 950, 155, 75);
                                            gc.setFill(Color.LIGHTSLATEGRAY);
                                            gc.fillOval(455, 950, 155, 75);
                                                    gc.setFill(Color.LIGHTSLATEGRAY);
                                                    gc.fillOval(605, 950, 155, 75);
                                                            gc.setFill(Color.LIGHTSLATEGRAY);
                                                            gc.fillOval(755, 950, 155, 75);
                                                                    gc.setFill(Color.LIGHTSLATEGRAY);    
                                                                    gc.fillOval(905, 950, 155, 75);
                                                                        gc.setFill(Color.LIGHTSLATEGRAY);
                                                                        gc.fillOval(1055, 950, 155, 75);
                                                                                gc.setFill(Color.LIGHTSLATEGRAY);
                                                                                gc.fillOval(1200, 950, 155, 75); //All Indentions Refers 1 Rock
                                                                                        gc.setFill(Color.LIGHTSLATEGRAY);
                                                                                        gc.fillOval(1350, 950, 155, 75); //All Indentions Refers 1 Rock
                                    gc.setFill(Color.LIGHTSLATEGRAY);
                                    gc.fillOval(1500, 950, 155, 75); //All Indentions Refers 1 Rock
                                                 gc.setFill(Color.LIGHTSLATEGRAY);
                                                 gc.fillOval(1650, 950, 155, 75); //All Indentions Refers 1 Rock
}
  private void drawBackground(GraphicsContext gc){
                        gc.setFill(Color.LIGHTSKYBLUE); // Sea Background
                        gc.fillRect(1, 1, 2500, 3000);  //Computer Size Dimensions In Monitor
}
  private void drawPlant(GraphicsContext gc){
                        gc.setFill(Color.DARKGREEN); //All Dimensions Are The Same Except For “X” Value
                        gc.fillOval(5, 850, 50, 115); //The “X” Value Increases by 50 px
                                gc.setFill(Color.DARKGREEN);
                            gc.fillOval(55, 850, 50, 115);
                                        gc.setFill(Color.DARKGREEN);
                                gc.fillOval(105, 850, 50, 115);
                                             gc.setFill(Color.DARKGREEN);
                                             gc.fillOval(155, 850, 50, 115);
                                                    gc.setFill(Color.DARKGREEN);
                                                    gc.fillOval(205, 850, 50, 115);
                                                            gc.setFill(Color.DARKGREEN);
                                                            gc.fillOval(505, 850, 50, 115);
                                                                    gc.setFill(Color.DARKGREEN);
                                                                    gc.fillOval(555, 850, 50, 115);
                                                                        gc.setFill(Color.DARKGREEN);
                                                                        gc.fillOval(605, 850, 50, 115);
                                                                                gc.setFill(Color.DARKGREEN);
                                                                                gc.fillOval(655, 850, 50, 115);
                                                                                        gc.setFill(Color.DARKGREEN);
                                                                                        gc.fillOval(705, 850, 50, 115); //All Indentions Refer To 2 Leafs
                                                                                                gc.setFill(Color.DARKGREEN);
                                                                                                gc.fillOval(1055, 850, 50, 115);
                                                                    gc.setFill(Color.DARKGREEN);
                                                                    gc.fillOval(1105, 850, 50, 115);
                                                                            gc.setFill(Color.DARKGREEN);
                                                                            gc.fillOval(1155, 850, 50, 115);
                                                                                    gc.setFill(Color.DARKGREEN);
                                                                                    gc.fillOval(1205, 850, 50, 115);
                                                                                            gc.setFill(Color.DARKGREEN);
                                                                                            gc.fillOval(1255, 850, 50, 115);
                                                                                                gc.setFill(Color.DARKGREEN);
                                                                                                gc.fillOval(1505, 850, 50, 115);
                                                                                                        gc.setFill(Color.DARKGREEN);
                                                                                                        gc.fillOval(1555, 850, 50, 115);
                                                                                                                gc.setFill(Color.DARKGREEN);
                                                                                                                gc.fillOval(1605, 850, 50, 115);
                                                                                                                        gc.setFill(Color.DARKGREEN);
                                                                                                                        gc.fillOval(1655, 850, 50, 115);
                                                                                    
}
  private void drawBoat(GraphicsContext gc){
                    gc.setFill(Color.BROWN);
                    gc.fillOval(1200, -200, 550, 300); //This Is The Dimension For The Boat
                        
            

}
  private void drawFishingLine(GraphicsContext gc){
        gc.setFill(Color.GRAY);
        gc.fillRect(1000,250,5,5); //This Will Be The Fishing Line
            gc.setFill(Color.SILVER);
gc.fillOval(250,100,10,10); //This WIll Be The Hook
    gc.setFill(Color.LIGHTSKYBLUE);
gc.fillOval(255,105,15,6);
}
 private void drawWorm(GraphicsContext gc){
        
//gc.setFill(Color.PINK);
//        gc.fillOval(240,105,20,40); //This Will Be The Worm On The Fishing Line
//gc.setFill(Color.BLACK);
//gc.fillOval(245,110,5,5);//This Will Be The Worm's Eye 

}
}
//void is a return type
