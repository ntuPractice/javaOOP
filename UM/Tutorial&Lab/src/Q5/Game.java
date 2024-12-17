package Q5;

import java.util.Random;

public class Game {
    private String name;
    private int score;

    public Game(String name){
        this.name=name;
        this.score=0;
    }

    public int getScore(){
        return this.score;
    }

    public String getName(){
        return this.name;
    }

    public void move(){
        Random rand=new Random();
        int roll=rand.nextInt(6)+1;
        score+=roll;
        System.out.println(this.name+" rolled a "+roll+". Total score:"+this.score);
    }
}

class Tester{
    public static void main(String[] args) {
        Game p1=new Game("Jane");
        Game p2=new Game("Brian");
        boolean gameWon=false;
        while (!gameWon){
           p1.move();
           if(p1.getScore()>100){
               System.out.println(p1.getName()+" win the game. Score:"+p1.getScore());
               gameWon=true;
               break;
           }
           p2.move();
           if(p2.getScore()>100){
               System.out.println(p2.getName()+" win the game. Score:"+p2.getScore());
               gameWon=true;
               break;
           }
            System.out.println();
        }
    }
}
