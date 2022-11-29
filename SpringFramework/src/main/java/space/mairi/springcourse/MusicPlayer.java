package space.mairi.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

//    private Music music1;
//    private Music music2;
//
//    public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                       @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    //@Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }


//    public void playMusic( MusicGenre genre) {
//        Random random = new Random();
//
//        int randomNumber = random.nextInt(3);
//
//        if(genre == MusicGenre.CLASSICAL){
//            System.out.println(classicalMusic.getSong().get(randomNumber));
//
//        }else {
//            System.out.println(rockMusic.getSong().get(randomNumber));
//        }
//    }
}