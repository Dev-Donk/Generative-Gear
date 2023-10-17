
package generativeGear;

import generativeGear.init.Parts;
import generativeGear.init.Parts.PartType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import generativeGear.init.Materials;
import generativeGear.objects.gear.SwordItem;

public class Generative_Gear extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
            stage.setTitle("Generative Gear");
            stage.setWidth(800);
            stage.setHeight(800);
            stage.setResizable(false);
        
        final int imageScale = 256;
        
        Pane swordPane = new Pane();
        
        Text swordStats = new Text();
            swordStats.setFont(new Font(15));
        VBox stats = new VBox();
            stats.getChildren().addAll(swordStats);
        
        BorderPane bp = new BorderPane();
            bp.setPrefSize(imageScale, imageScale);

        
        Scene scene = new Scene(bp);
        scene.setFill(Color.DARKGRAY);
        
        bp.setOnMouseReleased((e) -> {
            
            if(swordPane.getChildren() != null) {
                bp.getChildren().clear();
                swordPane.getChildren().clear();
            }

            SwordItem sword = new SwordItem(new Parts[]{
                Parts.getRandomPartOfType(PartType.UNIVERSAL_POMMEL),
                Parts.getRandomPartOfType(PartType.SWORD_HANDLE),
                Parts.getRandomPartOfType(PartType.SWORD_GUARD),
                Parts.getRandomPartOfType(PartType.SWORD_BLADE_BODY),
                Parts.getRandomPartOfType(PartType.SWORD_BLADE_TIP)
            });
            
            sword.getBladeBody().setMaterial(Materials.COPPER);

            try {
                // Handle
                ImageView handleView = createImageView(sword.getHandle().toString() + "_" + sword.getHandle().getMaterial().toString(), imageScale);
                    handleView.setX((stage.getWidth() / 4));
                    handleView.setY((stage.getHeight() / 4) + 192);

                // Pommel      
                ImageView pommelView = createImageView(sword.getPommel().toString() + "_" + sword.getPommel().getMaterial().toString(), imageScale);
                    pommelView.setX(snapToOriginX(sword.getHandle(), sword.getPommel(), imageScale) + handleView.getX());
                    pommelView.setY(snapToOriginY(sword.getHandle(), sword.getPommel(), imageScale) + handleView.getY());

                // Guard
                ImageView guardView = createImageView(sword.getGuard().toString() + "_" + sword.getGuard().getMaterial().toString(), imageScale);
                    guardView.setX(snapToAnchorX(sword.getHandle(), sword.getGuard(), imageScale) + handleView.getX());
                    guardView.setY(snapToAnchorY(sword.getHandle(), sword.getGuard(), imageScale) + handleView.getY());

                // Blade
                ImageView bladeBodyView = createImageView(sword.getBladeBody().toString() + "_" + sword.getBladeBody().getMaterial().toString(), imageScale);;

                // Guard Connector
                if (sword.getGuard().hasSpacer()) {
                    ImageView spacerView = createImageView(sword.getGuard().getSpacer().toString() + "_" + sword.getGuard().getSpacer().getMaterial().toString(), imageScale);;
                        spacerView.setX(snapToAnchorX(sword.getGuard(), sword.getGuard().getSpacer(), imageScale) + handleView.getX());
                        spacerView.setY(snapToAnchorY(sword.getGuard(), sword.getGuard().getSpacer(), imageScale) + handleView.getY());

                    bladeBodyView.setX(snapToAnchorX(sword.getGuard().getSpacer(), sword.getBladeBody(), imageScale) + handleView.getX());
                    bladeBodyView.setY(snapToAnchorY(sword.getGuard().getSpacer(), sword.getBladeBody(), imageScale) + handleView.getY());

                    swordPane.getChildren().add(spacerView);
                } else {
                    bladeBodyView.setX(snapToAnchorX(sword.getGuard(), sword.getBladeBody(), imageScale) + handleView.getX());
                    bladeBodyView.setY(snapToAnchorY(sword.getGuard(), sword.getBladeBody(), imageScale) + handleView.getY());
                }

                // Blade Tip
                ImageView bladeTipView = createImageView(sword.getBladeTip().toString() + "_" + sword.getBladeTip().getMaterial().toString(), imageScale);
                    bladeTipView.setX(snapToAnchorX(sword.getBladeBody(), sword.getBladeTip(), imageScale) + handleView.getX());
                    bladeTipView.setY(snapToAnchorY(sword.getBladeBody(), sword.getBladeTip(), imageScale) + handleView.getY());
                    
                swordPane.getChildren().addAll(handleView, pommelView, bladeBodyView, guardView, bladeTipView);
                swordStats.setText("Durability: " + sword.getDurability()
                                    + "\t\tWeight: " + sword.getWeight()
                                    + "\t\tAttack Damage: " + sword.getAttackDamage());
                    
                bp.getChildren().addAll(swordPane, stats);
                
                System.out.println(sword.toString());

            } catch (FileNotFoundException err) {
                System.err.println(sword.toString());
                System.exit(0);
            }

        });
        
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static int snapToAnchorX(Parts partParent, Parts partChild, int scale) {
        int net = (partParent.getCurrentAnchorX() - partChild.getCurrentOriginX());
        
        partChild.setAnchorX(net + 1);

        return net * (scale / 16);
    }
    public static int snapToAnchorY(Parts partParent, Parts partChild, int scale) {
        int net = -(partChild.getCurrentOriginY() - partParent.getCurrentAnchorY());
        
        partChild.setAnchorY(net  - 1);

        return net * (scale / 16);
    }
    
    public static int snapToOriginX(Parts partParent, Parts partChild, int scale) {
        int net = (partParent.getOriginX() - partChild.getOriginX());
        
        partChild.setOriginX(net + partChild.getOriginX() + 1);

        return net * (scale / 16);
    }
    public static int snapToOriginY(Parts partParent, Parts partChild, int scale) {
        int net = -(partChild.getOriginY() - partParent.getOriginY());
        
        partChild.setOriginY(net + partChild.getOriginY() - 1);       

        return net * (scale / 16);
    }
    
    public ImageView createImageView(String fileName, int imageScale) throws FileNotFoundException {
        return new ImageView(new Image(
                new FileInputStream(new File("assets\\parts\\" + fileName + ".png")),
                imageScale, imageScale, false, false));
    }
    
}
