import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dinosaur {


    public boolean favoriteFood(String fav_food) {
        if (fav_food == "Kibble" || fav_food == "Berries" || fav_food == "meat" || fav_food == "fish" || fav_food == "Mutton" || fav_food == "Prime Meat" || fav_food == "Crop") {
            return true;
        } else {
            return false;
        }
    }

    public boolean foodType(String food_type) {
        if (food_type == "Herbivore" || food_type == "Omnivore" || food_type == "Carnivore") {
            return true;
        } else {
            return false;
        }
    }
    public void display(String title, String name, String species, String picture, String health, String stamina, String melee, String movement_speed, String fav_food, String food_type) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(1280);
        window.setMinHeight(720);
        Image healthIcon = new Image("arkIcons/Health.png", 25, 25, false, false);
        Image melee_DamageIcon = new Image("arkIcons/Melee_Damage.png", 25, 25, false, false);
        Image speedIcon = new Image("arkIcons/Movement_Speed.png", 25, 25, false, false);
        Image staminaIcon = new Image("arkIcons/Stamina.png", 25, 25, false, false);
        String img = "arkPictures/" + picture;
        Label nameLabel = new Label();
        Label speciesLabel = new Label();
        Image picImg = new Image(img);
        Label stats = new Label();
        Label healthLabel = new Label();
        Label staminaLabel = new Label();
        Label meleeLabel = new Label();
        Label movementLabel = new Label();
        Label fav_foodLabel = new Label();
        Label food_typeLabel = new Label();
        nameLabel.setText("Dinosaur Name: " + name);
        speciesLabel.setText("Geneus Type: " + species);
        stats.setText("STATS:");
        healthLabel.setText("Health: " + health);
        staminaLabel.setText("Stamina: " + stamina);
        meleeLabel.setText("Melee: " + melee);
        movementLabel.setText("Movement Speed: " + movement_speed);
        fav_foodLabel.setText("Favorite Food: " + fav_food);
        food_typeLabel.setText("Diet Type: " + food_type);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(nameLabel, speciesLabel, new ImageView(picImg), stats, new ImageView(healthIcon), healthLabel,new ImageView(staminaIcon), staminaLabel, new ImageView(melee_DamageIcon), meleeLabel, new ImageView(speedIcon), movementLabel, fav_foodLabel, food_typeLabel);
        Scene dinoScene = new Scene(layout);
        window.setScene(dinoScene);
        window.showAndWait();

    }
}
