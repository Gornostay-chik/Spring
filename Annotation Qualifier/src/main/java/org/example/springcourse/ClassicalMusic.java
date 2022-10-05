package org.example.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    private List<String> songList;
    @PostConstruct
    public void initMethod(){System.out.println("This is init-method for CLASSIC.");}

    @PreDestroy
    public void destroyMethod(){System.out.println("This is destroy-method for CLASSIC.");}
    public ClassicalMusic(){
        this.songList = new ArrayList<>();
        this.songList.add("ROCK song1");
        this.songList.add("ROCK song2");
        this.songList.add("ROCK song3");
    }
    //приватный конструктор делает невозможным создание объекта через конструктор класса!
    //для создания объекта можно использовать фабричный метод
    public static ClassicalMusic getClassicalMusic(){return new ClassicalMusic();}


    @Override
    public String getSong(){
        return "Something CLASSIC song";
    }

    public void myInitMethod(){
        System.out.println("This is classicalMusic INIT-method.");
    }

    public void myDestroyMethod(){
        System.out.println("This is classicalMusic DESTROY-method.");
    }

    public String getRandomSong(){
        Random rnd = new Random();
        int randomSong = rnd.nextInt(3);
        return this.songList.get(randomSong);
    }
}
