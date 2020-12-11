package staicObeject;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Brick extends StaticObj {

    public Brick() {

    }

    public Brick(Image image, int x, int y) {
        this.image = image;
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.drawImage(image, x, y);
    }
}
