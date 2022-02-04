import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<Person> people = new ArrayList<Person>();
    public void startGame(){
        people.add(new Person("Timmeh", "m", "😀", "descirpiodjosfjo;sdjf;oajs;dofijo;" ));
        people.add( new Person("Bimmeh", "f", "😍", "descirpiodjosfjo;sdjf;oajs;dofijo;" ));
        people.add( new Person("Simmeh", "m", "🥳", "descirpiodjosfjo;sdjf;oajs;dofijo;" ));
        people.add( new Person("Greg", "g", "😎", "descirpiodjosfjo;sdjf;oajs;dofijo;" ));
        System.out.println(people);

        for(int i = 0; i < 10; i++){
            compare2();
        }

        displayWinner();



    }
    //pick 2 people at random, show their symbols, and let the player ick the one 
    //they like the best
    //add a point to the person they liked the best,
    //run 10 times. display the winners profile at the end
    private void compare2(){
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        int face_1 = r.nextInt(people.size());
        int face_2 = r.nextInt(people.size());
        while(face_1 == face_2){
            face_2 = r.nextInt(people.size());
        }
        System.out.println("pick face 1 or 2");
        System.out.println(people.get(face_1).getSymbol());
        System.out.println(people.get(face_2).getSymbol());
        int choice = kb.nextInt();
        int winner_index = 0;
        if(choice == 1){
            winner_index = face_1;
        }
        else if(choice == 2){
            winner_index = face_2;
        }
        else{
            System.out.println("waaa");
        }
        people.get(winner_index).addPoint();
    }

    private void displayWinner(){
        int winner_index = 0;
        int winner_value = 0;
        for(int i = 0; i < people.size(); i ++){
            if(people.get(i).getPoints() > winner_value){
                winner_index = i;
                winner_value = people.get(i).getPoints();
            }
        }
        System.out.println("The winner is: " + people.get(winner_index).getSymbol());
        
    }
}
