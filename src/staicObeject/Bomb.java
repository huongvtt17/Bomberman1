package staicObeject;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import sample.Images;
import screen.GameScr;

import java.util.Arrays;

public class Bomb extends StaticObj {
    public int timeBomb;

    public Bomb() {
    }

    public Bomb(Image image, int x, int y) {
        this.image = image;
        this.x = x;
        this.y = y;
        timeBomb = 1000;
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.drawImage(this.image, x, y);
        if (timeBomb > 0 && timeBomb < 50) {
            this.paintBang(gc);
        }
    }

    public int getX(int x) {
        double num = (double) x;
        return 30 * ((int) (Math.round((num / 30) * 1) / 1));
    }

    public int getY(int y) {
        double num = (double) y;
        return 30 * ((int) (Math.round((num / 30) * 1) / 1));
    }

    public void paintBang(GraphicsContext gc) {
        boolean[] array = checkBang(GameScr.dataMap);
        if (array[0]) {
            gc.drawImage(Images.bombang[0], x + 30, y);
        }
        if (array[1]) {
            gc.drawImage(Images.bombang[1], x - 30, y);
        }
        if (array[2]) {
            gc.drawImage(Images.bombang[2], x, y - 30);
        }
        if (array[3]) {
            gc.drawImage(Images.bombang[3], x, y + 30);
        }

    }

    public boolean checkBangBrick(Brick brick) {
        if (brick.x == x + 30 && brick.y == y) {
            return true;
        }
        if (brick.x == x - 30 && brick.y == y) {
            return true;
        }
        if (brick.x == x && brick.y == y - 30) {
            return true;
        }
        if (brick.x == x && brick.y == y + 30) {
            return true;
        }
        return false;
    }

    public boolean[] checkBang(int arr[][]) {
        boolean[] array = new boolean[4];
        Arrays.fill(array, Boolean.TRUE);
        if (this.x <= 0) {
            array[1] = false;
        }
        if (this.x + 30 >= 600) {
            array[0] = false;
        }
        if (this.y <= 0) {
            array[2] = false;
        }
        if (this.y + 30 >= 600) {
            array[3] = false;
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (arr[i][j] == 1) {
                    int cx = 30 * j;
                    int cy = 30 * i;
                    if (cx + 30 == x && y == cy) {
                        array[1] = false;
                    }
                    if (cx - 30 == x && y == cy) {
                        array[0] = false;
                    }
                    if (cx == x && cy + 30 == y) {
                        array[2] = false;
                    }
                    if (cx == x && cy - 30 == y) {
                        array[3] = false;
                    }
                }
            }
        }
        return array;
    }


}
