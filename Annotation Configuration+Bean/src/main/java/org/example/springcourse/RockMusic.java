package org.example.springcourse;

import org.springframework.stereotype.Component;

@Component("myRockMusicBean")
public class RockMusic implements Music{

    @Override
    public String getSong(){
        return "This is ROCK song";
    }

}
