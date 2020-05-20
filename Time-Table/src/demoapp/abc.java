package demoapp;







import java.util.Random;


public class abc {

	public static int getRandomNumber(Object[] args) {
		// TODO Auto-generated method stub

	
		 int rnd = new Random().nextInt(args.length);
		 return rnd;
	}

}
