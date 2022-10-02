package org.example.springcourse;

public class MusicPlayer {
    private Music music;

    //Inversion Of Control
    public MusicPlayer(Music music){
        this.music = music;
    }



    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

}
