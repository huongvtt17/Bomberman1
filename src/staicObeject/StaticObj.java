package staicObeject;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class StaticObj {
    public int x;
    public int y;
    public Image image;
    public boolean canClear;

    public StaticObj() {

    }

    public abstract void paint(GraphicsContext gc);
}
