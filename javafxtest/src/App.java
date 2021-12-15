import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class App extends Application {
    Stage window;
    Scene mainScene, dinoScene, foodScene, matScene;

 public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("DodoDex");
        Label mainHeading = new Label("Ark - DodoDex");
        // Lables
        Label dinoTitle = new Label("Dinosaurs");
        Label foodTitle = new Label("Food Items");
        Label materialTitle = new Label("Materials");

        // Dinosaur Buttons
        Button raptorBtn = new Button("Raptor");
        raptorBtn.setOnAction(e -> {
            Dinosaur raptor = new Dinosaur();
            raptor.display("Raptor (Dinosaur) - DodoDex", "Raptor", "Dinosaur", "raptor.png", "200", "150", "15", "480", "Simple Kibble", "Carnivore");
            raptor.favoriteFood("Kibble");
            raptor.foodType("Carnivore");
        });

        Button dodoBtn = new Button("Dodo");
        dodoBtn.setOnAction(e -> {
            Dinosaur dodo = new Dinosaur();
            dodo.display("Dodo (Dinosaur) - DodoDex", "Dodo", "Bird", "dodo.png", "40", "100", "5", "65", "Berries", "Omnivore");
            dodo.favoriteFood("Berries");
            dodo.foodType("Omnivore");
        });

        Button rexBtn = new Button("Rex");
        rexBtn.setOnAction(e -> {
            Dinosaur rex = new Dinosaur();
            rex.display("Rex (Dinosaur) - DodoDex", "Rex", "Dinosaur", "rex.png", "1100", "420", "62", "515", "Raw Prime Meat", "Carnivore");
            rex.favoriteFood("Raw Prime Meat");
            rex.foodType("Carnivore");
        });

        Button alloBtn = new Button("Allosaurus");
        alloBtn.setOnAction(e -> {
            Dinosaur allo = new Dinosaur();
            allo.display("Allosaurus (Dinosaur) - DodoDex", "Allosaurus", "Dinosaur", "allo.png", "630", "250", "35", "650", "Superior Kibble", "Carnivore");
            allo.favoriteFood("Kibble");
            allo.foodType("Carnivore");
        });

        Button trikeBtn = new Button("Trike");
        trikeBtn.setOnAction(e -> {
            Dinosaur trike = new Dinosaur();
            trike.display("Trike (Dinosaur) - DodoDex", "Trike", "Dinosaur", "trike.png", "375", "150", "32", "150", "Simple Kibble", "Herbivore");
            trike.favoriteFood("Kibble");
            trike.foodType("Herbivore");
        });

        Button diloBtn = new Button("Dilophosaur");
        diloBtn.setOnAction(e -> {
            Dinosaur dilo = new Dinosaur();
            dilo.display("Dilophosaur (Dinosaur) - DodoDex", "Dilophosaur", "Dinosaur", "dilo.png", "130", "100", "10", "120", "meat", "Carnivore");
            dilo.favoriteFood("meat");
            dilo.foodType("Carnivore");
        });

        Button pteraBtn = new Button("Pteranodon");
        pteraBtn.setOnAction(e -> {
            Dinosaur ptera = new Dinosaur();
            ptera.display("Pteranodon (Dinosaur) - DodoDex", "Pteranodon", "Dinosaur", "ptera.png", "210", "150", "15", "260", "Regular Kibble", "Carnivore");
            ptera.favoriteFood("kibble");
            ptera.foodType("Carnivore");
        });

        Button brontoBtn = new Button("Brontosaurus");
        brontoBtn.setOnAction(e -> {
            Dinosaur bronto = new Dinosaur();
            bronto.display("Brontosaurus (Dinosaur) - DodoDex", "Brontosaurus", "Dinosaur", "bronto.png", "2070", "240", "60", "150", "Exceptional Kibble", "Herbivore");
            bronto.favoriteFood("Kibble");
            bronto.foodType("Herbivore");
        });

        Button paraBtn = new Button("Parasaur");
        paraBtn.setOnAction(e -> {
            Dinosaur para = new Dinosaur();
            para.display("Parasaur (Dinosaur) - DodoDex", "Parasaur", "Dinosaur", "para.png", "200", "450", "12", "200", "Berries", "Herbivore");
            para.favoriteFood("Berries");
            para.foodType("Herbivore");
        });

        Button spinoBtn = new Button("Spinosaurus");
        spinoBtn.setOnAction(e -> {
            Dinosaur spino = new Dinosaur();
            spino.display("Spinosaurus (Dinosaur) - DodoDex", "Spinosaurus", "Dinosaur", "spino.png", "700", "350", "40", "452", "Exceptional Kibble", "Carnivore");
            spino.favoriteFood("Kibble");
            spino.foodType("Carnivore");
        });

        Button mammothBtn = new Button("Mammoth");
        mammothBtn.setOnAction(e -> {
            Dinosaur mammoth = new Dinosaur();
            mammoth.display("Mammoth (Dinosaur) - DodoDex", "Mammoth", "Mammal", "mammoth.png", "850", "330", "48", "150", "Superior Kibble", "Herbivore");
            mammoth.favoriteFood("Kibble");
            mammoth.foodType("Carnivore");
        });

        Button galliBtn = new Button("Gallimimnus");
        galliBtn.setOnAction(e -> {
            Dinosaur galli = new Dinosaur();
            galli.display("Gallimimus (Dinosaur) - DodoDex", "Gallimimnus", "Dinosaur", "galli.png", "150", "300", "8", "825", "Crops", "Herbivore");
            galli.favoriteFood("Crops");
            galli.foodType("Herbivore");
        });

        Button compyBtn = new Button("Compy");
        compyBtn.setOnAction(e -> {
            Dinosaur compy = new Dinosaur();
            compy.display("Compy (Dinosaur) - DodoDex", "Compy", "Dinosaur", "compy.png", "50", "100", "4", "120", "mutton", "carnivore");
            compy.favoriteFood("Mutton");
            compy.foodType("Carnivore");
        });

        Button direBtn = new Button("Direwolf");
        direBtn.setOnAction(e -> {
            Dinosaur dire = new Dinosaur();
            dire.display("Direwolf (Dinosaur) - DodoDex", "Direwolf", "Mammal", "dire.png", "330", "260", "33", "287", "Superior Kibble", "carnivore");
            dire.favoriteFood("Kibble");
            dire.foodType("Carnivore");
        });

        Button saberBtn = new Button("Sabertooth Tiger");
        saberBtn.setOnAction(e -> {
            Dinosaur saber = new Dinosaur();
            saber.display("Sabertooth Tiger (Dinosaur) - DodoDex", "Sabertooth Tiger", "Mammal", "saber.png", "250", "200", "30", "230", "Regular Kibble", "carnivore");
            saber.favoriteFood("Kibble");
            saber.foodType("Carnivore");
        });



        // Food Buttons
        Button kibbleBtn = new Button("Kibble");
        kibbleBtn.setOnAction(e -> {
            Food kibble = new Food();
            kibble.display("Kibble (Food) - DodoDex", "Kibble", "Kibble is the best food. \n There are some varieties of kibble such as: \n - Basic Kibble \n - Simple Kibble \n - Regular Kibble \n - Superior Kibble \n - Exceptional Kibble\n - Extraordinary Kibble \nSome creatures do not prefer it. It comes in various varieties and some are harder to make than others.", "Omnivore", "100", "true", "rare");
            kibble.type("omnivore");
        });

        Button berriesBtn = new Button("Berries");
        berriesBtn.setOnAction(e -> {
            Food berries = new Food();
            berries.display("Berries (Food) - DodoDex", "Berries", "Berries are the most common food. They are found in any bush that you can pick up.\nThere are a wide variety of berries such as: \n - Amarberry \n - AzulBerry \n - Mejoberry \n - Narcoberry \n - Stimberry\n - Tintoberry \nThese berries all have different effects on the dinosaur and the player.", "Herbivore", "1.5", "false", "Extremely Common");
            berries.type("Herbivore");
        });

        Button meatBtn = new Button("Raw Meat");
        meatBtn.setOnAction(e -> {
            Food meat = new Food();
            meat.display("Raw Meat (Food) - DodoDex", "Raw Meat", "Meat is found from almost every land animal. It can be obtained by harvesting the corpses of creatures with, in order of efficiency, a Carnivore, a Metal Pick, A Sword/a Stone Pick, a Hatchet, or your fists. It can be found in white, green and blue supply drops.", "Carnivore", "10", "false", "Extremely Common");
            meat.type("Carnivore");
        });

        Button fishBtn = new Button("Raw Fish");
        fishBtn.setOnAction(e -> {
            Food fish = new Food();
            fish.display("Raw Fish (Food) - DodoDex", "Raw Fish", "Fish is found from almost every aquatic animal. Fish Meat can be used to tame Carnivores when they are unconscious. Open the inventory of the creature you want to tame and put the Raw Fish inside of it.", "Carnivore", "5", "false", "Common");
            fish.type("Carnivore");
        });

        Button primeBtn = new Button("Raw Prime Meat");
        primeBtn.setOnAction(e -> {
            Food prime = new Food();
            prime.display("Raw Prime Meat (Food) - DodoDex", "Raw Prime Meat", "Raw Prime Meat is only obtained from very large and dangerous creatures. \nRaw Prime Meat spoils very fast. After harvesting, a useful tactic is to store the meat immediately in a tamed creature's inventory for transport, \nas it spoils in 4 minutes and 40 seconds in a Player's inventory, but lasts around 18 Minutes and 40 seconds \nin a creature's inventory. However, if the Player wants to save Raw Prime Meat this way for later use, \nit should not be given to a tamed carnivore, as they may eat it if they don't have any normal Raw Meat to eat.", "Carnivore", "20", "false", "uncommon");
            prime.type("Carnivore");
        });

        Button muttonBtn = new Button("Raw Mutton");
        muttonBtn.setOnAction(e -> {
            Food mutton = new Food();
            mutton.display("Raw Mutton (Food) - DodoDex", "Raw Mutton", "Raw Mutton is very rare and only obtainable from sheep. Can be used to tame carnivores at slightly increased speed and Taming Effectiveness compared to Raw Prime Meat. This is particularly useful for creatures without a preferred kibble, such as the Dimorphodon since the Taming Effectiveness is better to the next best thing.", "Carnivore", "20", "false", "rare");
            mutton.type("Carnivore");
        });

        Button honeyBtn = new Button("Honey");
        honeyBtn.setOnAction(e -> {
            Food honey = new Food();
            honey.display("Honey (Food) - DodoDex", "Honey", "Giant Bee Honey is gathered from a bee hive that is produced by a tamed Giant Bee. \nImportant Uses:\n - It can be eaten directly by survivors for a substantial amount of Food. \n - It is an ingredient for Sweet Vegetable Cake. \n - When thrown on the ground, Honey works as bait for attracting nearby creatures. \n - When thrown into the water, it calms aggressive Leedsichthys.", "Omivore", "20", "false", "rare");
            honey.type("Omnivore");
        });


        // Material Buttons
        Button charcoalBtn = new Button("Charcoal");
        charcoalBtn.setOnAction(e -> {
            Materials charcoal = new Materials();
            charcoal.display("Charcoal (Material) - DodoDex", "Charcoal", "Charcoal is made by the human. Used to make gunpowder", "Can be found in campfires, and furnaces", "0.25", "true", "Common");
        });

        Button oilBtn = new Button("Oil");
        oilBtn.setOnAction(e -> {
            Materials oil = new Materials();
            oil.display("Oil (Material) - DodoDex", "Oil", "Oil is used to make gasoline. Gasoline is used to power up generators which is important for anything electrical.", "Oil is found in the depths of the ocean and can be found in specific caves.", "0.2", "true", "Uncommon");
        });

        Button fiberBtn = new Button("Fiber");
        fiberBtn.setOnAction(e -> {
            Materials fiber = new Materials();
            fiber.display("Fiber (Material) - DodoDex", "Fiber", "Fiber is used to make nearly everything. Every piece of clothing, to tools and weapons and even building items.", "Found from any plant on the ground.", "0.01", "true", "Common");
        });

        Button chitinBtn = new Button("Chitin");
        chitinBtn.setOnAction(e -> {
            Materials chitin = new Materials();
            chitin.display("Chitin (Material) - DodoDex", "Chitin", "Chitin is used to make armor and can also be used to make cementing paste. ", "Found from various creatures with exoskeletons.", "0.01", "true", "Common");
        });

        Button hideBtn = new Button("Hide");
        hideBtn.setOnAction(e -> {
            Materials hide = new Materials();
            hide.display("Hide (Material) - DodoDex", "Hide", "Hide, like fiber, is used to make a large variety of items like weapons, armor, tools, sattles, etc...", "Found by harvesting most dinosaurs", "0.01", "true", "Common");
        });



            // creating the scenes
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(mainHeading, dinoTitle, dodoBtn, rexBtn, alloBtn, spinoBtn, raptorBtn, diloBtn, compyBtn, pteraBtn, trikeBtn, brontoBtn, paraBtn, galliBtn, mammothBtn, direBtn, saberBtn, foodTitle, kibbleBtn, berriesBtn, meatBtn, fishBtn, primeBtn, muttonBtn, honeyBtn,  materialTitle, charcoalBtn, hideBtn, fiberBtn, chitinBtn, oilBtn);

        mainScene = new Scene(layout, 1920, 1080);
        window.setScene(mainScene);
        window.show();

    }

}