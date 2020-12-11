package staicObeject;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Item extends StaticObj {
    public int type; //3- win, 0- tăng số lượng bom, 2- tăng khoảng cách nổ, 1- tăng speed


    public Item() {

    }

    public Item(Image image, int x, int y, int type) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.type = type;
    }



    @Override
    public void paint(GraphicsContext gc) {
        gc.drawImage(image, x, y);
    }
}
