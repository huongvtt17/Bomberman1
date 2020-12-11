package sample;

import javafx.scene.image.Image;

public class Images {
    public static Image[] bomber;
    public static Image enemy;
    public static Image wall;
    public static Image brick;
    public static Image bomb;
    public static Image[] bombang;
    public static Image win;
    public static Image item_bom;
    public static Image item_speed;
    public static Image item_flames;
    public static Image[] item;



    public static void initImages(){
        Images.bomber = new Image[5];
        Images.bomber[0] = new Image(Images.class.getResource("/resources/image/bomber_right.png").toExternalForm());
        Images.bomber[1] = new Image(Images.class.getResource("/resources/image/bomber_left.png").toExternalForm());
        Images.bomber[2] = new Image(Images.class.getResource("/resources/image/bomber_up.png").toExternalForm());
        Images.bomber[3] = new Image(Images.class.getResource("/resources/image/bomber_down.png").toExternalForm());
        Images.bomber[4] = new Image(Images.class.getResource("/resources/image/bomber_die.png").toExternalForm());
        Images.enemy = new Image(Images.class.getResource("/resources/image/enemy.png").toExternalForm());
        Images.wall = new Image(Images.class.getResource("/resources/image/wall.png").toExternalForm());
        Images.brick = new Image(Images.class.getResource("/resources/image/brick.png").toExternalForm());
        Images.bomb = new Image(Images.class.getResource("/resources/image/bomb.png").toExternalForm());

        Images.win = new Image(Images.class.getResource("/resources/image/win.png").toExternalForm());
        Images.item_bom = new Image(Images.class.getResource("/resources/image/powerup_bombs.png").toExternalForm());
        Images.item_speed = new Image(Images.class.getResource("/resources/image/powerup_speed.png").toExternalForm());
        Images.item_flames = new Image(Images.class.getResource("/resources/image/powerup_flames.png").toExternalForm());
        Images.item = new Image[3];
        Images.item[0] = Images.item_bom;
        Images.item[1] = Images.item_speed;
        Images.item[2] = Images.item_flames;

        Images.bombang = new Image[5];
        Images.bombang[0] = new Image(Images.class.getResource("/resources/image/bomb_right.png").toExternalForm());
        Images.bombang[1] = new Image(Images.class.getResource("/resources/image/bomb_left.png").toExternalForm());
        Images.bombang[2] = new Image(Images.class.getResource("/resources/image/bomb_up.png").toExternalForm());
        Images.bombang[3] = new Image(Images.class.getResource("/resources/image/bomb_down.png").toExternalForm());
        Images.bombang[4] = new Image(Images.class.getResource("/resources/image/bombang.png").toExternalForm());
    }
}
