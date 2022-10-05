package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //получаем бин myRockMusic из класса RockMusic с помощью аннотации @Component
        //Music rockMusic = context.getBean("myRockMusicBean", Music.class);
        Music classicalMusic = context.getBean("classicalMusic", Music.class);

        MusicPlayer rockMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer classicMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer jazzMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //Autowired через поле (может быть приватым)
        rockMusicPlayer.playRockMusic();
        //Autowired через конструктор
        classicMusicPlayer.playClassicMusic();
        //Autowired через сеттер.метод
        jazzMusicPlayer.playJazzMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println("COMPUTER TO STRING: "+computer.toString());

        context.close();

    }
}
