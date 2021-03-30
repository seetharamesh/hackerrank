package hackkerrank;

import java.util.*;

//Write your Checker class here
class Checker implements Comparator<Player>{
     @Override
     public int compare(Player o1, Player o2) {
         /*The compare method compares two arguments, returning a negative integer if first argument is less than second
          * 0 if both args are same, 
          * or a positive integer if first arg is greater than second
*/
     
         if (o1.score == o2.score){
             return o1.name.compareTo(o2.name);//alphabetically
         } else {
             //System.out.println( o2.score - o1.score);
             return o2.score - o1.score;//descending order
         }
 
     // return (o2.score == o1.score) ? o1.name.compareTo(o2.name) : o2.score - o1.score;
     
 }
}

class Player{
 String name;
 int score;
 
 Player(String name, int score){
     this.name = name;
     this.score = score;
 }
}

class ComparatorExample {

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();

     Player[] player = new Player[n];
     Checker checker = new Checker();
     
     for(int i = 0; i < n; i++){
         player[i] = new Player(scan.next(), scan.nextInt());
     }
     scan.close();

     Arrays.sort(player, checker);
     for(int i = 0; i < player.length; i++){
         System.out.printf("%s %s\n", player[i].name, player[i].score);
     }
 }
}
