package core;

import java.util.ArrayList;
import java.util.List;

public class Episode{
    private int season;
    private int episodeNumber;
    private String title;
    private String synopsis;
    private List<Event> events = new ArrayList<>();

    // public Episode(int season, int episodeNumber, String title, String synopsis){}

    public Episode(int season, int episodeNumber, String title, String synopsis) {
        this.season = season;
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.synopsis = synopsis;
    }

    public void addEvent(Event event){
        events.add(event);
    }

    public void print(){
        System.out.printf("S%02dE%02d — %s%n", season, episodeNumber, title);
        System.out.println("Synopsis: " + synopsis);
        System.out.println("-- Events --");
        for (Event e : events) System.out.println("* " + e);
    }


}
