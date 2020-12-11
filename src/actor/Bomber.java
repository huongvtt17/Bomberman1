package actor;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import screen.GameScr;
import staicObeject.Bomb;
import staicObeject.Item;

public class Bomber extends Actor {
    public Bomber() {

    }

    public Bomber(Image image, int x, int y) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = 5;
    }


    @Override
    public void paint(GraphicsContext gc) {
        gc.drawImage(image, x, y);
    }

    @Override
    public void move(int x, int y) {
        if (isDie) {
            return;
        }
        if (x < 0 || x > 570) {
            return;
        }
        if (y < 0 || y > 570) {
            return;
        }

        // check brick or wall chặn lối đi
        Rectangle me =
                new Rectangle(x + 1, y + 1, 28, 28);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if ((GameScr.dataMap[i][j] == 1 || GameScr.dataMap[i][j] == 4)
                        && me.intersects(j * 30, i * 30, 30, 30)) {
                    return;
                }
            }
        }
        this.x = x;
        this.y = y;
    }

    /**
     * Check enemy tấn công.
     *
     * @param enemy Enemy
     * @return true or false
     */
    public boolean enemyAttack(Enemy enemy) {
        Rectangle me =
                new Rectangle(x + 1, y + 1, 28, 28);
        if (me.intersects(enemy.x, enemy.y, 30, 30)) {
            return true;
        }
        return false;
    }

    public boolean pickItem(Item item) {
        Rectangle me =
                new Rectangle(x + 1, y + 1, 28, 28);
        if (me.intersects(item.x, item.y, 30, 30)) {
            return true;
        }
        return false;
    }



}
