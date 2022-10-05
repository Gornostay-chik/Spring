package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    private RockMusic musicRock;
    private ClassicalMusic musicClassic;
    private JazzMusic musicJazz;
    private List<Music> musicList = new ArrayList<>();
    private String playerName;
    private int playerVolume;
    private boolean useEqualizer;
    private String playerThemeName;

    //CONSTRUCTORS
    public MusicPlayer(){}
    //Inversion Of Control
    //Dependency Injection via Constructor
    @Autowired
    public MusicPlayer(ClassicalMusic musicClassic, JazzMusic musicJazz){this.musicClassic = musicClassic; this.musicJazz=musicJazz;}
    public MusicPlayer(List<Music> musicList){this.musicList=musicList;}

    //Dependency Injection via Setter
    //Когда spring будет внедрять зависимость, он:
    //- отбросит "set"
    //- переведет 'Music' -> 'music'
    //- в ApplicationContext в property 'name' подставит получившееся 'music' и передаст в него в качестве вргумента бин musicBean
    //SETTER

    @Autowired
    public void setMusicJazz(JazzMusic musicJazz) {this.musicJazz = musicJazz;}
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

    public void playRockMusic(){
        System.out.println("Playing music: " + musicRock.getSong());
    }
    public void playClassicMusic(){
        System.out.println("Playing music: " + musicClassic.getSong());
    }
    public void playJazzMusic(){
        System.out.println("Playing music: " + musicJazz.getSong());
    }
    public String playClassicJazzMusic(){
        System.out.println("Playing different music: " + musicClassic.getSong());
        System.out.println("Playing different music: " + musicJazz.getSong());
        return "Play CLASSIC+JAZZ";
    }

    public void playMusicList(){
        for (Music currentMusic:musicList) {
            System.out.println("LISTMUSIC now playing: " + currentMusic.getSong());
        }
    }

}
