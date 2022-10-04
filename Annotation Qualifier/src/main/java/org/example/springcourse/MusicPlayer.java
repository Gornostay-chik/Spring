package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("myRockMusicBean")
    Music music;

    Music music1;
    Music music2;
    private List<Music> musicList = new ArrayList<>();
    private String playerName;
    private int playerVolume;
    private boolean useEqualizer;
    private String playerThemeName;

    //CONSTRUCTORS
    public MusicPlayer(){}
    //Inversion Of Control
    //Dependency Injection via Constructor
    public MusicPlayer(List<Music> musicList){this.musicList=musicList;}
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("jazzMusic") Music music2){
        this.music1=music1;
        this.music2=music2;
    }

    //Dependency Injection via Setter
    //Когда spring будет внедрять зависимость, он:
    //- отбросит "set"
    //- переведет 'Music' -> 'music'
    //- в ApplicationContext в property 'name' подставит получившееся 'music' и передаст в него в качестве вргумента бин musicBean
    //SETTER
    public void setMusic(Music music) {this.music = music;}
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

    public String playMusic(){
        //System.out.println("Now playing: " + music.getSong());
        return "Now playing: " + music.getSong();
    }
    public String play2Music(){
        //System.out.println("Now playing: " + music1.getSong() + " " + music2.getSong());
        return "Now playing: " + music1.getSong() + ", " + music2.getSong();
    }
    public void playMusicList(){
        for (Music currentMusic:musicList) {
            System.out.println("LISTMUSIC now playing: " + currentMusic.getSong());
        }
    }

}
