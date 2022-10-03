package org.example.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String playerName;
    private int playerVolume;
    private boolean useEqualizer;
    private String playerThemeName;

    //CONSTRUCTORS
    public MusicPlayer(){}
    //Inversion Of Control
    //Dependency Injection via Constructor
    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(List<Music> musicList){this.musicList=musicList;}

    //Dependency Injection via Setter
    //Когда spring будет внедрять зависимость, он:
    //- отбросит "set"
    //- переведет 'Music' -> 'music'
    //- в ApplicationContext в property 'name' подставит получившееся 'music' и передаст в него в качестве вргумента бин musicBean
    //SETTER
    public void setMusic(Music music) {
        this.music = music;
    }
    public void setPlayerName(String playerName) { this.playerName = playerName;}
    public void setPlayerVolume(int playerVolume) { this.playerVolume = playerVolume;}
    public void setUseEqualizer(boolean useEqualizer) {this.useEqualizer = useEqualizer;}
    public void setPlayerThemeName(String playerThemeName) {this.playerThemeName = playerThemeName;}
    public void setMusicList(List<Music> musicList){this.musicList=musicList;}

    //GETTERS
    public String getPlayerName() {return playerName;}
    public int getPlayerVolume() {return playerVolume;}
    public boolean isUseEqualizer() {return useEqualizer;}
    public String getPlayerThemeName() {return playerThemeName;}

    public void playMusic(){
        System.out.println("Playing music: " + music.getSong());
    }

    public void playMusicList(){
        for (Music currentMusic:musicList) {
            System.out.println("LISTMUSIC now playing: " + currentMusic.getSong());
        }
    }

}
