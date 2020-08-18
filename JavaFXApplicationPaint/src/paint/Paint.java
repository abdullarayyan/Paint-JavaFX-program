package paint;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class Paint extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hbox=new HBox(5);
hbox.setAlignment(Pos.CENTER);
//Colors Buttons
ToggleButton btred =new ToggleButton("Red");
btred.setStyle("-fx-background-color:red;");

ToggleButton btblue =new ToggleButton("Blue");
btblue.setStyle("-fx-background-color:blue;");

ToggleButton btgrean =new ToggleButton("Green");
btgrean.setStyle("-fx-background-color:green;");

ToggleButton btgray =new ToggleButton("Gray");
btgray.setStyle("-fx-background-color:gray;");

ToggleButton btblack =new ToggleButton("Black");
btblack.setStyle("-fx-background-color:black;");

ToggleButton btyellow =new ToggleButton("Yellow");
btyellow.setStyle("-fx-background-color:yellow;");

ToggleButton btpink =new ToggleButton("Pink");
btpink.setStyle("-fx-background-color:pink;");

ToggleButton btorange =new ToggleButton("Orange");
btorange.setStyle("-fx-background-color:orange;");

ToggleButton btbrown =new ToggleButton("Brown");
btbrown.setStyle("-fx-background-color:brown;");

ToggleButton btpurple =new ToggleButton("Purple");
btpurple.setStyle("-fx-background-color:purple;");

ToggleButton[] colorss = {btred,btblue ,btgrean,btgray,
     btblack,btyellow,btpink,btorange,btbrown,btpurple};
        
        ToggleGroup colors = new ToggleGroup();
        for (ToggleButton color : colorss) {
            color.setMinWidth(70);
            color.setToggleGroup(colors);
            color.setTextFill(Color.WHITE);
        }
      
hbox.getChildren().addAll(btred,btblue ,btgrean,btgray,
    btblack,btyellow,btpink,btorange,btbrown,btpurple);

   
    //Shapes Buttons
    ToggleButton drowbtn = new ToggleButton("Draw");
        Image p = new Image(getClass().getResourceAsStream("pin.png"));
    ImageView img4=new ImageView(p);
    img4.setFitHeight(25);
    img4.setFitWidth(25);
    drowbtn.setGraphic(img4);

        ToggleButton linebtn = new ToggleButton("Line");
        Image l = new Image(getClass().getResourceAsStream("line.png"));
    ImageView img2=new ImageView(l);
    img2.setFitHeight(25);
    img2.setFitWidth(25);
    linebtn.setGraphic(img2);

        ToggleButton rectbtn = new ToggleButton("Rectange");
        Image r = new Image(getClass().getResourceAsStream("rec.png"));
    ImageView img1=new ImageView(r);
    img1.setFitHeight(25);
    img1.setFitWidth(25);
    rectbtn.setGraphic(img1);

        ToggleButton circlebtn = new ToggleButton("Circle");
        Image c = new Image(getClass().getResourceAsStream("cir.png"));
    ImageView img=new ImageView(c);
    img.setFitHeight(25);
    img.setFitWidth(25);
    circlebtn.setGraphic(img);

        ToggleButton textbtn = new ToggleButton("Text");
        Image t = new Image(getClass().getResourceAsStream("text.png"));
    ImageView img3=new ImageView(t);
    img3.setFitHeight(25);
    img3.setFitWidth(25);
    textbtn.setGraphic(img3);
        ToggleButton[] toolsArr = {drowbtn, linebtn, rectbtn, circlebtn, textbtn};
        ToggleGroup tools = new ToggleGroup();
        for (ToggleButton tool : toolsArr) {
            tool.setMinWidth(90);
            tool.setToggleGroup(tools);
        }
        ColorPicker cpFill = new ColorPicker(Color.TRANSPARENT);
        Label text_here = new Label("Enter Text Here..");
        TextArea text = new TextArea();
        text.setPrefRowCount(2);
        Slider slider = new Slider(1, 20, 5);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        Label fill_color = new Label("Fill Color");
        Label line_width = new Label("5.0");
 
        VBox btns = new VBox(10);
        btns.getChildren().addAll(drowbtn, linebtn, rectbtn, circlebtn, 
        textbtn,text_here, text,fill_color, cpFill, line_width, slider);
        btns.setPadding(new Insets(8));
        btns.setStyle("-fx-background-color: lightblue");
        btns.setPrefWidth(100);
    //Draw Area [Canvas]
            StackPane cen =new StackPane();
        Canvas canvas = new Canvas(1180, 600);
        cen.getChildren().addAll(canvas);
        GraphicsContext gc;
        gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(1);
    //Create Shapes
        Line line = new Line();
        Rectangle rect = new Rectangle();
        Circle circ = new Circle();
    //Set The Color For Each Button
    btred.setOnMousePressed(e->{
        if (btred.isSelected()) {
        gc.setStroke(Color.RED);
      }
    });
    btblue.setOnMousePressed(e->{
        if (btred.isSelected()) {
        gc.setStroke(Color.BLUE);
      }
    });
    btgrean.setOnMousePressed(e->{
        if (btgrean.isSelected()) {
        gc.setStroke(Color.GREEN);
      }
    });
    btgray.setOnMousePressed(e->{
        if (btgray.isSelected()) {
        gc.setStroke(Color.GRAY);
      }
    });        
    btblack.setOnMousePressed(e->{
        if (btblack.isSelected()) {
        gc.setStroke(Color.BLACK);
      }
    });  
    btyellow.setOnMousePressed(e->{
        if (btyellow.isSelected()) {
        gc.setStroke(Color.YELLOW);
     }
    }); 
    btpink.setOnMousePressed(e->{
        if (btpink.isSelected()) {
        gc.setStroke(Color.PINK);
     }
    });
    btorange.setOnMousePressed(e->{
        if (btorange.isSelected()) {
        gc.setStroke(Color.ORANGE);
     }
    });
    btbrown.setOnMousePressed(e->{
        if (btbrown.isSelected()) {
        gc.setStroke(Color.BROWN);
     }
    });              
    btpurple.setOnMousePressed(e->{
        if (btpurple.isSelected()) {
        gc.setStroke(Color.PURPLE);
     }
    }); 
//Set Coordinates For Shapes By Mouse Event
        canvas.setOnMousePressed(e->{
            if(drowbtn.isSelected()) {
                gc.beginPath();
                gc.lineTo(e.getX(), e.getY());
            }
           
            else if(linebtn.isSelected()) {
                line.setStartX(e.getX());
                line.setStartY(e.getY());
            }
            else if(rectbtn.isSelected()) {
                gc.setFill(cpFill.getValue());
                rect.setX(e.getX());                
                rect.setY(e.getY());
            }
            else if(circlebtn.isSelected()) {
                gc.setFill(cpFill.getValue());
                circ.setCenterX(e.getX());
                circ.setCenterY(e.getY());
            }
            else if(textbtn.isSelected()) {
                gc.setLineWidth(1);
                gc.setFont(Font.font(slider.getValue()));
                gc.setFill(cpFill.getValue());
                gc.fillText(text.getText(), e.getX(), e.getY());
                gc.strokeText(text.getText(), e.getX(), e.getY());
            }
        });
        canvas.setOnMouseDragged(e->{
            if(drowbtn.isSelected()) {
                gc.lineTo(e.getX(), e.getY());
                gc.stroke();
            }
        });
        canvas.setOnMouseReleased(e->{
            if(drowbtn.isSelected()) {
                gc.lineTo(e.getX(), e.getY());
                gc.stroke();
                gc.closePath();
            }
            else if(linebtn.isSelected()) {
                line.setEndX(e.getX());
                line.setEndY(e.getY());
                gc.strokeLine(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY());        
            }
            else if(rectbtn.isSelected()) {
                rect.setWidth(Math.abs((e.getX() - rect.getX())));
                rect.setHeight(Math.abs((e.getY() - rect.getY())));
                if(rect.getX() > e.getX()) {
                    rect.setX(e.getX());
                }
                if(rect.getY() > e.getY()) {
                    rect.setY(e.getY());
                }
                gc.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
                gc.strokeRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
            }
            else if(circlebtn.isSelected()) {
                circ.setRadius((Math.abs(e.getX() - circ.getCenterX()) + Math.abs(e.getY() - circ.getCenterY())) / 2);
                if(circ.getCenterX() > e.getX()) {
                    circ.setCenterX(e.getX());
                }
                if(circ.getCenterY() > e.getY()) {
                    circ.setCenterY(e.getY());
                }
                gc.fillOval(circ.getCenterX(), circ.getCenterY(), circ.getRadius(), circ.getRadius());
                gc.strokeOval(circ.getCenterX(), circ.getCenterY(), circ.getRadius(), circ.getRadius());
            }
           
        });
//To Fill Shapes With Color
        cpFill.setOnAction(e->{
            gc.setFill(cpFill.getValue());
        });
        //Slider 
        slider.valueProperty().addListener(e->{
            double width = slider.getValue();
            if(textbtn.isSelected()){
                gc.setLineWidth(1);
                gc.setFont(Font.font(slider.getValue()));
                line_width.setText(String.format("%.1f", width));
            return;
            }
            line_width.setText(String.format("%.1f", width));
            gc.setLineWidth(width);
        });
       
//Stage & Scene
        BorderPane pane = new BorderPane();
        pane.setLeft(btns);
        pane.setCenter(cen);
        pane.setBottom(hbox);
        Scene scene = new Scene(pane, 1250, 700);
//This Section For Application Icon
        Image applicationIcon = new Image(getClass().getResourceAsStream("pain.png"));
        primaryStage.getIcons().add(applicationIcon);
        primaryStage.setTitle("Paint Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}