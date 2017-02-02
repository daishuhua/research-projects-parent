package com.daishuhua.bean;

import org.springframework.stereotype.Component;

/**
 * Created by shuhuadai on 2017/2/3.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
