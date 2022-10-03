package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //Music music = context.getBean("musicBean", Music.class);
        //это проблема, поскольку зависимость создается вручную
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //DependencyInjection
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        ClassicalMusic classicalMusic = context.getBean("classicMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        //сравнение по указателям
        boolean comparison = firstMusicPlayer ==secondMusicPlayer;
        System.out.println("These objects is the same player:" + comparison);

        //выводит hash-объекта
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.playMusic();
        secondMusicPlayer.playMusicList();

        firstMusicPlayer.setPlayerVolume(10);

        System.out.println("The firstPlayerVolume is " + firstMusicPlayer.getPlayerVolume());
        System.out.println("The secondPlayerVolume is " + secondMusicPlayer.getPlayerVolume());

        System.out.println("firstPlayer name: " + firstMusicPlayer.getPlayerName());
        System.out.println("firstPlayer volume: " + firstMusicPlayer.getPlayerVolume());
        System.out.println("firstPlayer Equalizer: " + firstMusicPlayer.isUseEqualizer());
        System.out.println("firstPlayer playerThemeName: " + firstMusicPlayer.getPlayerThemeName());

        context.close();

    }
}
