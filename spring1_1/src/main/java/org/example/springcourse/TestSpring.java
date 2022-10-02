package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //Music music = context.getBean("musicBean", Music.class);
        //это проблема, поскольку зависимость создается вручную
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //DependencyInjection
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        context.close();

    }
}
