

import java.util.*; //brings all utilites

public class classShuffle{
  public static void main(String[] args){ //every java program looks for main

    System.out.println("Your args are"+Arrays.asList(args));

  Scanner keyboard = new Scanner(System.in);

  String cards[] = {"A-D","2-D","3-D","5-D","6-D","7-D","8-D","9-D","10-D","J-D","Q-D","K-D"};

  ArrayList<String> deck = new ArrayList<String>(Arrays.asList(cards));

  //System.out.println("Original order: "+Arrays.asList(cards));
  //Collections.shuffle(cards);
  //System.out.println("Shuffled order: "+Arrays.asList(cards));

  System.out.println("Orginial order:"+deck);//creates deck
  Collections.shuffle(deck);//shuffles deck
  System.out.println("Shuffled order: "+deck);

System.out.println("Your cards are:");

  for (int i=0; i<7; i++){
    System.out.println(deck.get(i));
  }


  }//end main
}//class

//come up with something to put into arrays
