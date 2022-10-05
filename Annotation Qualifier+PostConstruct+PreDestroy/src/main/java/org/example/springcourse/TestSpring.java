package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Music rockMusic1 = context.getBean("myRockMusicBean", Music.class);
        Music rockMusic2 = context.getBean("myRockMusicBean", Music.class);
        System.out.println("Scope=PROTOTYPE: " + ((rockMusic1==rockMusic2)?"the same":"not the same") + " object");

        Music classicalMusic1 = context.getBean("classicalMusic", Music.class);
        Music classicalMusic2 = context.getBean("classicalMusic", Music.class);
        System.out.println("Scope=DEFAULT: " + (classicalMusic1==classicalMusic2?"the same":"not the same") + " object");

        Music jazzMusic1 = context.getBean("jazzMusic", Music.class);
        Music jazzMusic2 = context.getBean("jazzMusic", Music.class);
        System.out.println("Scope=SINGLETON: " + (jazzMusic1==jazzMusic2?"the same":"not the same") + " object");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playRandomMusic(MusicType.JAZZ);

        System.out.println("Name player:" + musicPlayer.getPlayerName());
        System.out.println("Volume player:" + musicPlayer.getPlayerVolume());

        context.close();

    }
}
