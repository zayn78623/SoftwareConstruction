package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	int op=-1;
	int values=0;
	@Override
	public void start(Stage primaryStage) {
		try {
			//demo
			//Testing again
			VBox v= new VBox();
			//creating buttons
			Button one= new Button("1");
			Button two= new Button("2");
			Button three= new Button("3");
			Button four= new Button("4");
			Button five= new Button("5");
			Button six= new Button("6");
			Button seven= new Button("7");
			Button eight= new Button("8");
			Button nine= new Button("9");
			Button zero= new Button("0");
			Button cal= new Button("=");
			Button add= new Button("+");
			Button sub= new Button("-");
			Button div= new Button("/");
			Button mul= new Button("*");
			Button ce= new Button("C");
			GridPane pane= new GridPane();
			
			TextField field= new TextField(); field.setPrefWidth(400);
			field.setPrefHeight(100); 
			
			one.setPrefSize(65, 65); 
			two.setPrefSize(65, 65); 
			three.setPrefSize(65, 65);
			four.setPrefSize(65, 65); 
			five.setPrefSize(65, 65); 
			six.setPrefSize(65, 65);
			seven.setPrefSize(65, 65); 
			eight.setPrefSize(65, 65); 
			nine.setPrefSize(65, 65); 
			zero.setPrefSize(65, 65);
			add.setPrefSize(65, 65); 
			sub.setPrefSize(65,65);
			mul.setPrefSize(65, 65);
			div.setPrefSize(65, 65);
			cal.setPrefSize(65,65); 
			ce.setPrefSize(65, 65);
			
			one.setOnAction(e->{
				field.appendText("1");
				
			});
			two.setOnAction(e->{
				field.appendText("2");
			});
			three.setOnAction(e->{
				field.appendText("3");
			});
			four.setOnAction(e->{
				field.appendText("4");
			});
			five.setOnAction(e->{
				field.appendText("5");
			});
			six.setOnAction(e->{
				field.appendText("6");
			});
			seven.setOnAction(e->{
				field.appendText("7");
			});
			eight.setOnAction(e->{
				field.appendText("8");
			});
			nine.setOnAction(e->{
				field.appendText("9");
			});
			zero.setOnAction(e->{
				field.appendText("0");
			});
			add.setOnAction(e->{
				values=Integer.parseInt(field.getText());
				op=1;
				field.setText("");
				
			});
			sub.setOnAction(e->{
				values=Integer.parseInt(field.getText());
				op=2;
				field.setText("");
			});
			mul.setOnAction(e->{
				values=Integer.parseInt(field.getText());
				op=3;
				field.setText("");
			});
			div.setOnAction(e->{
				values=Integer.parseInt(field.getText());
				op=4;
				field.setText("");
			});
			ce.setOnAction(e->{
				field.setText("");
			});
			cal.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent ev) {
					calculate(field.getText());
					
				}

				private void calculate(String text) {
					
					Integer calcu= Integer.parseInt(field.getText());
					
					switch (op) {
					case 1:
						Integer res= values+calcu;
						field.setText(String.valueOf(res));
						break;
					case 2:
						res= values-calcu;
						field.setText(String.valueOf(res));
						break;
					case 3:
						 res= values*calcu;
						field.setText(String.valueOf(res));
						break;
					case 4:
						 res= values/calcu;
						field.setText(String.valueOf(res));
						break;

					default:
						break;
					}
					
				}

			});
			
			pane.add(one, 1, 1);
			pane.add(two, 1, 2);
			pane.add(three, 1, 3);
			pane.add(four, 2, 1);
			pane.add(five, 2, 2);
			pane.add(six, 2, 3);
			pane.add(seven, 3, 1);
			pane.add(eight, 3, 2);
			pane.add(nine, 3, 3);
			pane.add(add, 4, 1);
			pane.add(sub, 4, 2);
			pane.add(mul, 5, 1);
			pane.add(div, 5, 2);
			pane.add(cal, 5, 3);
			pane.add(zero, 4, 3);
			pane.add(ce, 6, 3);
			
			pane.setHgap(10);
			pane.setVgap(10);
			v.getChildren().addAll(field,pane);
			
			  
			Scene scene = new Scene(v,500,370);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
