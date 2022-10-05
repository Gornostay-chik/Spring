package org.example.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("myRockMusicBean")
@Scope("prototype")
public class RockMusic implements Music{

    private List<String> songList;

    @PostConstruct
    public void initMethod(){System.out.println("This is init-method for ROCK.");}

    @PreDestroy
    public void destroyMethod(){System.out.println("This is destroy-method for ROCK.");}

    public RockMusic(){
        this.songList = new ArrayList<>();
        this.songList.add("ROCK song1");
        this.songList.add("ROCK song2");
        this.songList.add("ROCK song3");
    }

    @Override
    public String getSong(){
        return "Something ROCK song";
    }

    public String getRandomSong(){
        Random rnd = new Random();
        int randomSong = rnd.nextInt(3);
        return this.songList.get(randomSong);
    }

}
