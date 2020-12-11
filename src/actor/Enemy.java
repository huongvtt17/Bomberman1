package actor;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import screen.GameScr;
import staicObeject.Bomb;

import java.util.Random;

public class Enemy extends Actor {
    public boolean moveX;
    public boolean changeDirection;

    public Enemy() {

    }

    public Enemy(Image image, int x, int y) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = 2;
        this.moveX = new Random().nextBoolean(); // random di chuyển dọc or ngang
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.drawImage(image, x, y);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean canMove(int x, int y, Bomb bomb) {
        if (x < 0 || x > 570) {
            return false;
        }
        if (y < 0 || y > 570) {
            return false;
        }
        Rectangle me =
                new Rectangle(x + 1, y + 1, 28, 28);

        if (bomb.timeBomb > 50 && me.intersects(bomb.x, bomb.y, 30, 30)) {
            return false;
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if ((GameScr.dataMap[i][j] == 1 || GameScr.dataMap[i][j] == 4)
                        && me.intersects(j * 30, i * 30, 30, 30)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Tự động di chuyển, bị cản đường sẽ quay đầu.
     */
    public void autoMove(Bomb bomb) {
        if (this.moveX) {
            if (!this.changeDirection) {
                if (this.canMove(this.x + this.speed, this.y, bomb)) {
                    this.move(this.x + this.speed, this.y);
                    return;
                }
                changeDirection = true;
                this.move(this.x - this.speed, this.y);
                return;

            }
            if (this.canMove(this.x - this.speed, this.y, bomb)) {
                this.move(this.x - this.speed, this.y);
                return;
            }
            changeDirection = false;
            this.move(this.x + this.speed, this.y);
            return;
        }
        if (!this.changeDirection) {
            if (this.canMove(this.x, this.y + this.speed, bomb)) {
                this.move(this.x, this.y + this.speed);
                return;
            }
            changeDirection = true;
            this.move(this.x, this.y - this.speed);
            return;
        }
        if (this.canMove(this.x, this.y - this.speed, bomb)) {
            this.move(this.x, this.y - this.speed);
            return;
        }
        changeDirection = false;
        this.move(this.x, this.y + this.speed);
    }


}
