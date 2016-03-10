package com.infoowl.demo.movies;

/**
 * Created by hilal on 3/3/2016.
 */


public class HelloWorld {

    private final long id;
    private final String content;

    public HelloWorld(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
