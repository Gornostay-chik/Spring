package org.example.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class JazzMusic implements Music{
    private List<String> songList;
    @PostConstruct
    public void initMethod(){System.out.println("This is init-method for JAZZ.");}

    @PreDestroy
    public void destroyMethod(){System.out.println("This is destroy-method for JAZZ.");}
    public JazzMusic(){
        this.songList = new ArrayList<>();
        this.songList.add("JAZZ song1");
        this.songList.add("JAZZ song2");
        this.songList.add("JAZZ song3");
    }
    @Override
    public String getSong(){
        return "Something Jazz Song";
    }

    public String getRandomSong(){
        Random rnd = new Random();
        int randomSong = rnd.nextInt(3);
        return this.songList.get(randomSong);
    }

}
