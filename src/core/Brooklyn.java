package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Brooklyn {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character charac){
        characters.add(charac);
        System.out.println("New character added " + charac.getName());
    }

    public void clearList(){
        characters.clear();
        System.out.println("All character were deleted");
    }

    public boolean removeByName(String searchName){
        boolean removed = false;
        removed = characters.removeIf(character -> character.getName().equalsIgnoreCase(searchName));
        if (removed){
            System.out.println("Character successfully deleted");
        }else{
            System.out.println("Character not found");
        }
        return removed;
    }

    public List<Character> getCharacters() {
        return new ArrayList<>(characters);
    }

    public Optional<Character> searchByName(String name){
        for(Character c : characters){
            if(c.getName().equalsIgnoreCase(name)){
                System.out.println(c.getName() + " founded");
                return Optional.of(c);
            }
        }
        System.out.println("No character were found");
        return null;
    }

}
