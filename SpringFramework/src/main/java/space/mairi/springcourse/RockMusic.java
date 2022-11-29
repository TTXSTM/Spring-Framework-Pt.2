package space.mairi.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

//    private List<String> songs = new ArrayList<String>();

//    {
//        songs.add("Hungarian Rhapsody");
//        songs.add("Toccata and Fugue in D minor");
//        songs.add("Symphony No.5 in C minor");
//    }

    @Override
    public String getSong() {
       return "Hungarian Rhapsody";
    }
}
