import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Food {
    public boolean type(String diet_type) {
        if (diet_type == "Herbivore" || diet_type == "Omnivore" || diet_type == "Carnivore") {
            return true;
        } else {
            return false;
        }
    }

    public void display(String title, String name, String description, String diet_type, String food_points, String craftable, String rarity) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(1280);
        window.setMinHeight(720);
        // creating labels
        Label nameLbl = new Label();
        Label descriptionLbl = new Label();
        Label diet_typeLbl = new Label();
        Label stats = new Label();
        Label food_pointsLbl = new Label();
        Label craftableLbl = new Label();
        Label rarityLbl = new Label();
        // setting label texts
        nameLbl.setText("Food Name: " + name);
        descriptionLbl.setText("Description of the item: " + description);
        diet_typeLbl.setText("Diet Type: " + diet_type);
        stats.setText("STATS");
        food_pointsLbl.setText("Food points: " + food_points);
        craftableLbl.setText("Is " + name + " craftable: " + craftable);
        rarityLbl.setText("Rarity of item: " + rarity);

        // creating the scene
        VBox layout = new VBox(10);
        layout.getChildren().addAll(nameLbl, descriptionLbl, diet_typeLbl, stats, food_pointsLbl, craftableLbl, rarityLbl);
        Scene foodScene = new Scene(layout);
        window.setScene(foodScene);
        window.showAndWait();

    }

}
