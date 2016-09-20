package mathRandom;

import java.util.Random;

public class MathRandom {

	public MathRandom() {
		for(int i=0;i<10;i++){
			System.out.println("Roll #"+(i+1)+" Die is "+rollFairDie());
		}
	}
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6)+1;
	}
	public static int rollUnFairDie(){
		Random gen = new Random();
	}
}
