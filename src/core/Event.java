package core;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String type;
    private String description;
    private String place;

    private List<Character> characters = new ArrayList<>();

    public Event(String type, String description, String place){
        this.type = type;
        this.description = description;
        this.place = place;
    }

    public Event addParticipant(Character character){
        characters.add(character);
        return this;
    }

    @Override
    public String toString(){
        return type + " happened at " + place + " and the description is " + description;
    }

    public List<Character> getParticipants() {
        return characters;
    }
}
