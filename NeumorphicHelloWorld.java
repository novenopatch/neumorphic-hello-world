import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class NeumorphicHelloWorld extends Application {
    @Override
public void start(Stage primaryStage) {
    // Création du contenu de la fenêtre
    Rectangle background = new Rectangle(400, 200);
    background.setFill(Color.rgb(219, 223, 227));
    background.setEffect(new DropShadow(8, Color.rgb(0, 0, 0, 0.2)));

    Label label = new Label("Hello, World!");
    label.setFont(Font.font("Arial", FontWeight.BOLD, 24));
    label.setTextFill(Color.rgb(46, 49, 52));
    label.setBackground(new Background(new BackgroundFill(Color.rgb(219, 223, 227), new CornerRadii(8), Insets.EMPTY)));
    label.setPadding(new Insets(16));
    label.setEffect(new DropShadow(4, Color.rgb(0, 0, 0, 0.2)));

    StackPane root = new StackPane();
    root.getChildren().addAll(background, label);

    // Animation de l'effet de fondu
    FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), label);
    fadeTransition.setFromValue(0);
    fadeTransition.setToValue(1);
    fadeTransition.setCycleCount(Timeline.INDEFINITE);
    fadeTransition.setAutoReverse(true);
    fadeTransition.play();

    // Animation de la rotation
    RotateTransition rotateTransition = new RotateTransition(Duration.seconds(6), label);
    rotateTransition.setByAngle(360);
    rotateTransition.setCycleCount(Timeline.INDEFINITE);
    rotateTransition.setInterpolator(Interpolator.LINEAR);
    rotateTransition.play();

    // Création de la scène
    Scene scene = new Scene(root, 400, 200);

    // Configuration de la scène dans la fenêtre principale
    primaryStage.setScene(scene);
    primaryStage.setTitle("Neumorphic Hello World");
    primaryStage.show();
}

public static void main(String[] args) {
    launch(args);
}
}