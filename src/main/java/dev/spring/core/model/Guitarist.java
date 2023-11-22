package dev.spring.core.model;

public class Guitarist implements Singer {

    @Override
    public void sing() {
        String lyric = "You're gonna live forever in me";
        System.out.println(lyric);
    }
}
