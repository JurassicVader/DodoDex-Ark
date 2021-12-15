import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Materials {
    public void display(String title, String name, String description, String location, String weight, String stackable, String rarity) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(1280);
        window.setMinHeight(720);
        // creating labels
        Label nameLbl = new Label();
        Label descriptionLbl = new Label();
        Label locationLbl = new Label();
        Label stats = new Label();
        Label weightLbl = new Label();
        Label stackableLbl = new Label();
        Label rarityLbl = new Label();
        // setting label texts
        nameLbl.setText("Material Name: " + name);
        descriptionLbl.setText("Description of the item: " + description);
        locationLbl.setText("Location: " + location);
        stats.setText("STATS");
        weightLbl.setText("Weight: " + weight + "lbs");
        stackableLbl.setText("Is " + name + " stackable: " + stackable);
        rarityLbl.setText("Rarity of item: " + rarity);

        // creating the scene
        VBox layout = new VBox(10);
        layout.getChildren().addAll(nameLbl, descriptionLbl, locationLbl, stats, weightLbl, stackableLbl, rarityLbl);
        Scene matsScene = new Scene(layout);
        window.setScene(matsScene);
        window.showAndWait();

    }

}
