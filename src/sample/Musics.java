package sample;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Musics {
    public static MediaPlayer enemy_die;
    public static MediaPlayer game;
    public static MediaPlayer bombang;
    public static MediaPlayer bomber_die;
    public static MediaPlayer win;
    public static MediaPlayer new_bom;
    public static MediaPlayer pickItem;

    private static MediaPlayer createMusic(String url) {
        MediaPlayer mediaPlayer = new MediaPlayer(
                new Media(Musics.class.getResource(url).toString()));
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        return mediaPlayer;
    }

    private static MediaPlayer createMusicOne(String url) {
        return new MediaPlayer(new Media(Musics.class.getResource(url).toString()));
    }

    public static void initMusics() {
        Musics.enemy_die = createMusicOne("/resources/music/enemy_die.wav");
        Musics.bombang = createMusicOne("/resources/music/bomb_bang.wav");
        Musics.bomber_die = createMusicOne("/resources/music/bomber_die.wav");
        Musics.new_bom = createMusicOne("/resources/music/putBomb.wav");
        Musics.win = createMusicOne("/resources/music/win.wav");
        Musics.pickItem = createMusicOne("/resources/music/pickItem.wav");
        Musics.game = createMusic("/resources/music/stage.wav");
    }



}
