package mathRandom;

import java.text.DecimalFormat;
import java.util.Random;

public class MathRandom {

 public static void main(String[] args) {
	 int[] results = new int[6];
	 int totalRolls = 10000;
	 for(int i = 0; i < totalRolls; i++){
		 int roll = rollUnfairDie();
		 System.out.println("Roll #"+(i+1)+" Die is "+roll);
		 results[roll-1]=results[roll-1]+1;
	 }
	 for(int i=0;i<6;i++){
		 DecimalFormat decimalFormat = new DecimalFormat("#.00");
		 System.out.println(i+1+" was rolled "+(decimalFormat.format(((double)results[i]/totalRolls*100)))+" percent of the time.");
	 }
 }
 
 public static int rollFairDie(){
//	 Random gen = new Random();
//	 return gen.nextInt(6)+1;
	 double rand = Math.random(); // creates a random double between 0 and 1 exclusive
	 int roll = (int) (rand*6); // 0 to 5
	 return roll+1;
 }
 
 public static int rollUnfairDie(){
 //returns numbers 1-6, but with uneven distribution
	 int[] unfairRolls={0,1,1,2,3,4,5,6};
	 double rand = Math.random()*(unfairRolls.length-1);
	 int roll = unfairRolls[(int)(rand+1)];
	 return roll;
 }

}