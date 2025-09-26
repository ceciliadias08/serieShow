import core.*;
import core.Character;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Julius julius = new Julius();
        Rochelle rochelle = new Rochelle();
        Chris chris = new Chris();
        Tonya tonya = new Tonya();
        Drew drew = new Drew();
        Greg greg = new Greg();
        SrOmar srOmar = new SrOmar();
        Caruso caruso = new Caruso();
        Brooklyn brooklyn = new Brooklyn();
        Episode episode = null;

        boolean executing = true;
        while (executing == true){
            System.out.println("\n=== Menu Chris-OOP ===");
            System.out.println("1. Register default characters");
            System.out.println("2. List characters");
            System.out.println("3. Catchphrases (all)");
            System.out.println("4. Search character by name");
            System.out.println("5. Remove character by name");
            System.out.println("6. Add character manually");
            System.out.println("7. Update a character's age");
            System.out.println("8. Chris study");
            System.out.println("9. Julius work and calculate account");
            System.out.println("10. Create an EXAMPLE episode and print");
            System.out.println("11. Exit");
            System.out.print("Select: ");

            int option;
            Scanner sc = new Scanner(System.in);
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1: {
                    brooklyn.addCharacter(chris);
                    brooklyn.addCharacter(caruso);
                    brooklyn.addCharacter(drew);
                    brooklyn.addCharacter(greg);
                    brooklyn.addCharacter(julius);
                    brooklyn.addCharacter(rochelle);
                    brooklyn.addCharacter(srOmar);
                    brooklyn.addCharacter(tonya);
                    break;
                }
                case 2:
                    brooklyn.getCharacters();
                    break;
                case 3:{
                    List<Character> everybody = brooklyn.getCharacters();
                    if (everybody == null){
                        System.out.println("No character register, register a character first");
                        break;
                    } else {
                        System.out.println("Famous quotes: ");
                        for(Character characters : everybody){
                            System.out.println ("The character " + characters.getName() + " says " + characters.quotes());
                        }
                    }
                    break;
                }
                case 4: {
                    UtilSOUT.sout();
                    String name = sc.nextLine();
                    brooklyn.searchByName(name);
                    System.out.println("Found " + name);
                    break;
                }
                case 5:
                    UtilSOUT.sout();
                    String nameToRemove = sc.nextLine();
                    brooklyn.removeByName(nameToRemove);
                    break;
                case 6:{
                    System.out.println("What kind of character do you want to create, enter 1 for adult or 2 for child?");
                    int choice = Integer.parseInt(sc.nextLine());
                    System.out.println("What is the name of the character that you wanna create?");
                    String newCharacterName = sc.nextLine();
                    System.out.println("What is the age of " + newCharacterName + " ?");
                    int newAge = Integer.parseInt(sc.nextLine());
                    Character newcharacter;
                    if (choice == 1){
                        newcharacter = new Adult(newCharacterName, newAge);
                    } else if (choice == 2){
                        newcharacter = new Child(newCharacterName, newAge);
                    } else{
                        System.out.println("Invalid number, choose number 1 for adult or number 2 for child");
                        break;
                    }
                    brooklyn.addCharacter(newcharacter);
                    break;
                }
                case 7:
                    System.out.println("Which character would you like to update the age?");
                    String nameAgeToUpdate = sc.nextLine();
                    var optionalCharacter = brooklyn.searchByName(nameAgeToUpdate);
                    if (optionalCharacter.isEmpty()){
                        System.out.println("This character doesn't exist, try again.");
                        break;
                    }
                    System.out.println("Enter the new age for " + optionalCharacter.get().getName());
                    int ageToUpdate = Integer.parseInt(sc.nextLine());
                    optionalCharacter.get().setAge(ageToUpdate);
                    System.out.println("The new age for " + nameAgeToUpdate + " is " + optionalCharacter.get().getAge());
                    break;
                case 8:
                    chris.study("math");
                    break;
                case 9:
                    julius.work("delivery", 12);
                    julius.calculateAmount(5.32);
                    break;
                case 10:
                    episode = new Episode(3, 6, "Everybody hates Thanksgiving", "Chris wants to spend Thanksgiving somewhere different from his family.");
                    episode.addEvent(new Event("Holiday", "Chris wants to celebrate Thanksgiving with Greg", "Greg's House").addParticipant(chris).addParticipant(greg));
                    episode.print();
                    break;
                case 11:
                    executing = false;
                    System.out.println("Program closed, see you soon!");
                    break;
                default:
                    System.out.println("Invalid option, try again with options 1 to 11");
                    break;
            }
        }

    }
}
