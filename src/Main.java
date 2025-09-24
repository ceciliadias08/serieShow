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
            System.out.println("\n=== Menu Chris-POO ===");
            System.out.println("1. Registrar personagens padrão");
            System.out.println("2. Listar personagens");
            System.out.println("3. Frases de efeito (todos)");
            System.out.println("4. Buscar personagem por nome");
            System.out.println("5. Remover personagem por nome");
            System.out.println("6. Adicionar personagem manualmente");
            System.out.println("7. Atualizar idade de um personagem");
            System.out.println("8. Chris estudar");
            System.out.println("9. Julius trabalhar e calcular conta");
            System.out.println("10. Criar um EXEMPLO de episodio e imprimir");
            System.out.println("11. Sair");
            System.out.print("Escolha: ");

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
                    julius.calcularConta(5.32);
                    break;
                case 10:
                    episode = new Episode(3, 6, "Todo mundo odeia acao de gracas", "Chris quer passar o dia de acao em um lugar diferente da familia");
                    episode.addEvent(new Event("Data comemorativa", "Chris quer celebrar o dia de acao de gracas com o Greg", "Casa do Greg").addParticipant(chris).addParticipant(greg));
                    episode.print();
                    break;
                case 11:
                    executing = false;
                    System.out.println("Programa encerrado, ate logo!");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente com as opcoes de 1 a 11");
                    break;

                    //Como funciona o Java? 4 passos
                    //
            }
        }

    }
}
