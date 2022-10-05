package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayerProperty.name}")
    private String playerName;
    @Value("${musicPlayerProperty.volume}")
    private int playerVolume;
    @Value("${musicPlayerProperty.useEqualizer}")
    private boolean useEqualizer;
    @Value("${musicPlayerProperty.playerThemeName}")
    private String playerThemeName;

    @Autowired
    @Qualifier("myRockMusicBean")
    Music music;
    @Autowired
    @Qualifier("jazzMusic")
    Music music1;
    @Autowired
    @Qualifier("classicalMusic")
    Music music2;

    RockMusic rockMusic;
    ClassicalMusic classicalMusic;
    JazzMusic jazzMusic;


    private List<Music> musicList = new ArrayList<>();


    //CONSTRUCTORS
    public MusicPlayer(){}
    public MusicPlayer(List<Music> musicList){this.musicList=musicList;}
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, JazzMusic jazzMusic, RockMusic rockMusic){
        this.classicalMusic=classicalMusic;
        this.jazzMusic=jazzMusic;
        this.rockMusic=rockMusic;
    }

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

    public void playRandomMusic(MusicType musicType){
        Random rnd = new Random();
        int randomSong = rnd.nextInt(3);
        switch (musicType) {
            case ROCK:
                System.out.println(rockMusic.getRandomSong());
                break;
            case CLASSICAL:
                System.out.println(classicalMusic.getRandomSong());
                break;
            case JAZZ:
                System.out.println(jazzMusic.getRandomSong());
                break;
        }
    }

}
