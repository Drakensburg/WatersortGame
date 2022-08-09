/**
 *                                             _o8888888o_
 *                                          .o888'      '888o.
 *                                       .o88'      (      '88o.
 *                                      ,88'      .) )       '88,
 *                                     ,88'      `(,' (,      '88,
 *                                    ,88'       ). (, ('      '88,
 *                                    88'       ( ) ; ' )       '88
 *                                    88        ')_,_)_(`        88
 *                                    88         [_____]         88
 *                                    88          \_ _/          88
 *                                    88           |_|_          88
 *                                    88,     __.-'(__ )        ,88
 *                                    '88,     '-. \___ )      ,88'
 *                                     '88,     _.\_)__ )     ,88'
 *                                      '88o,  _   (__ )    ,o88'
 *                                        '88o, `'-\_/'   ,o88'
 *                                          '888o,_   _,o888'
 *                                             '8JGS88888'
 * ====================================================================================================
 * ===================QUOD CREATIO NON POTEST NISI PER SOMNIUM DIVINITATIS ACHIEVING===================
 * ====================================================================================================
 * 888888888888 88        88 88888888888        db   888888888888 88888888888 ,ad8888ba,  88        88'
 *      88      88        88 88                d88b       88      88         d8''    `'8b 88        88 
 *      88      88        88 88               d8'`8b      88      88        d8'           88        88 
 *      88      88aaaaaaaa88 88aaaaa         d8'  `8b     88      88aaaaa   88            88aaaaaaaa88 
 *      88      88''''''''88 88'''''        d8YaaaaY8b    88      88'''''   88            88''''''''88 
 *      88      88        88 88            d8''''''''8b   88      88        Y8,           88        88 
 *      88      88        88 88           d8'        `8b  88      88         Y8a.    .a8P 88        88 
 *      88      88        88 88888888888 d8'          `8b 88      88888888888 `'Y8888Y''  88        88 
 * ====================================================================================================
 * ================IT IS ONLY THROUGH CREATION THAT ONE CAN DREAM OF ACHIEVING DIVINITY================
 * ====================================================================================================
 *
 * @updater  Tjaart Pelser - 34588353
 * @version 03-11-2021
 */
import java.util.Scanner; 
import java.io.IOException;
 
public class Watersort extends Strategy
{
	static int iTotBottles = 5;
	static int iBottleSize = 4;
	
	static StackAsMyArrayList<Character>[] bottles = new StackAsMyArrayList[iTotBottles];
	
	public static void main(String[]args)
	{
		startScreen();
	}
	
	static void startScreen()
	{
		clearConsole(); 

		Scanner myObj = new Scanner(System.in);
		System.out.println("\nSTART GAME? : Y/N\n");

		String userInput = myObj.nextLine().toUpperCase();
		String YES = "Y";
		String NO  = "N";

		if(userInput.equals(YES))
		{
			clearConsole(); 
			startGame();
		}
		else if (userInput.equals(NO))
		{
			System.exit(0);
		}
		else
		{
			startScreen();
		}
	}
	
	static void showAll()
	{
		for(int i = 0; i < iTotBottles; i++)
		{
			System.out.println("BOTTLE " + (i+1) + ": " + bottles[i].toString());
		}
	}
	
	static void startGame()
	{
		StackAsMyArrayList<Character> bottleOne = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottleTwo = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottleThr = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottleFor = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottleFiv = new StackAsMyArrayList<Character>();
		
		String ONE   = "1";
		String TWO   = "2";
		String THREE = "3";
		String FOUR  = "4";
		String FIVE  = "5";
		
		String EXIT = "EXIT";
		
		bottles[0] = bottleOne;
		bottles[1] = bottleTwo;
		bottles[2] = bottleThr;
		bottles[3] = bottleFor;
		bottles[4] = bottleFiv;
		
		Mix(bottles, iTotBottles, iBottleSize);
		
		int i = 0;
		
		while(solved(bottles) != true)
		{	
	        i++;
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("\n\n\n===================================");
			System.out.println("SORT THE BOTTLES(TO EXIT TYPE EXIT)");
			System.out.println("MOVE: " + i);
			System.out.println("===================================\n");
			
			showAll();
			
			System.out.println("\nCHOOSE BOTTLE TO POUR: \n");
			String pickOne = myObj.nextLine().toUpperCase();
			System.out.println("\n");
			
			if(pickOne.toUpperCase().equals(EXIT))
			{
				System.exit(0);
			}
			
			System.out.println("CHOOSE BOTTLE TO RECEIVE: \n");
			String pickTwo = myObj.nextLine().toUpperCase();
			System.out.println("\n");
			
			if(pickTwo.toUpperCase().equals(EXIT))
			{
				System.exit(0);
			}
			
			if ((pickOne.equals(ONE) && pickTwo.equals(ONE))||(pickOne.equals(TWO) && pickTwo.equals(TWO))||(pickOne.equals(THREE) && pickTwo.equals(THREE))||(pickOne.equals(FOUR) && pickTwo.equals(FOUR))||(pickOne.equals(FIVE) && pickTwo.equals(FIVE)))
			{
				System.out.println("==WARNING==");
				System.out.println("INVALID MOVE!");
				System.out.println("==WARNING==\n\n\n");
				i--;
			}
			else if (!(bottles[Integer.parseInt(pickTwo)-1].getStackSize() < iBottleSize))
			{
				System.out.println("==WARNING==");
				System.out.println("BOTTLE " + pickTwo + " WILL SPILL IF MORE INK IS ADDED!");
				System.out.println("==WARNING==\n\n\n");
				i--;
			}
			else if ((bottles[Integer.parseInt(pickOne)-1].getStackSize() == 0))
			{
				System.out.println("==WARNING==");
				System.out.println("BOTTLE " + pickOne + " CAN'T BE POURED AS IT IS EMPTY!");
				System.out.println("==WARNING==\n\n\n");
				i--;
			}
			else if ((pickOne.equals(ONE))||(pickOne.equals(TWO))||(pickOne.equals(THREE))||(pickOne.equals(FOUR))||(pickOne.equals(FIVE))||(pickTwo.equals(ONE))||(pickTwo.equals(TWO))||(pickTwo.equals(THREE))||(!pickTwo.equals(FOUR))||(!pickTwo.equals(FIVE)))
			{
				System.out.println("==MOVED==");
				System.out.println(bottles[Integer.parseInt(pickOne)-1].peek() + " FROM BOTTLE " + pickOne + " TO BOTTLE " + pickTwo);
				System.out.println("==MOVED==");
				bottles[Integer.parseInt(pickTwo)-1].push(bottles[Integer.parseInt(pickOne)-1].pop());
			}
			else
			{
				System.out.println("==WARNING==");
				System.out.println("INVALID MOVE!");
				System.out.println("==WARNING==\n\n\n");
				i--;
			}
		}
					
	    clearConsole();
		System.out.println("====COMPLETED====");
		showAll();
		System.out.println("====WINNER====");
		System.out.println("GAME WON IN " + i + " MOVES!");
		System.out.println("====WINNER====");

		Scanner myObj = new Scanner(System.in);
		System.out.println("\nPLAY AGAIN? : Y/N\n");

		String userInput = myObj.nextLine().toUpperCase();
		String YES = "Y";
		String NO  = "N";

		if(userInput.equals(YES))
		{
			clearConsole(); 
			startGame();
		}
		else if (userInput.equals(NO))
		{
			System.exit(0);
		}
		else
		{
			startScreen();
		}
	}
	
	public static boolean solved( StackAsMyArrayList bottles[])
	{
		for(int i = 0; i < iTotBottles; i++)
		{
			if(bottles[i].checkStackUniform() == false)
			{
				return false;
			}
		}
		
		return true;
	}
	
	private static void clearConsole() 
	{
		System.out.println("\n__          __  _______ ______ _____   _____  ____  _____ _______ ");
		System.out.println("\\ \\        / /\\|__   __|  ____|  __ \\ / ____|/ __ \\|  __ \\__   __|");
		System.out.println(" \\ \\  /\\  / /  \\  | |  | |__  | |__) | (___ | |  | | |__) | | |   ");
		System.out.println("  \\ \\/  \\/ / /\\ \\ | |  |  __| |  _  / \\___ \\| |  | |  _  /  | |   ");
		System.out.println("   \\  /\\  / ____ \\| |  | |____| | \\ \\ ____) | |__| | | \\ \\  | |   ");
		System.out.println("    \\/  \\/_/    \\_\\_|  |______|_|  \\_\\_____/ \\____/|_|  \\_\\ |_|   ");
		
		for(int i = 0; i<=2; i++)
		{
			System.out.println("\n ");
		}
	}
}


 /**
 *                                             _o8888888o_
 *                                          .o888'      '888o.
 *                                       .o88'      (      '88o.
 *                                      ,88'      .) )       '88,
 *                                     ,88'      `(,' (,      '88,
 *                                    ,88'       ). (, ('      '88,
 *                                    88'       ( ) ; ' )       '88
 *                                    88        ')_,_)_(`        88
 *                                    88         [_____]         88
 *                                    88          \_ _/          88
 *                                    88           |_|_          88
 *                                    88,     __.-'(__ )        ,88
 *                                    '88,     '-. \___ )      ,88'
 *                                     '88,     _.\_)__ )     ,88'
 *                                      '88o,  _   (__ )    ,o88'
 *                                        '88o, `'-\_/'   ,o88'
 *                                          '888o,_   _,o888'
 *                                             '8JGS88888'
 */