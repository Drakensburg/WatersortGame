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
 
public class Strategy
{
	static Character red     = new Character('r');
	static Character green   = new Character('g');
	static Character blue  	 = new Character('b');
	
	static Character[] colour = new Character[3];

	static void Mix(StackAsMyArrayList<Character>[] bottles, int iTotBottles, int iBottleSize)
	{
		StackAsMyArrayList<Character> Jug = new StackAsMyArrayList<Character>();
		
		colour[0] = red;
		colour[1] = green;
		colour[2] = blue;
		
		for(int i = 0; i < iTotBottles-2; i++)
		{
			for(int x = 0; x < iBottleSize; x++)
				Jug.push(colour[i]);
		}
		
		while(Jug.peek() != null )
		{
			int random = (int) (Math.random() * iTotBottles);
			
			if (bottles[random].getStackSize() < iBottleSize)
			{
				bottles[random].push(Jug.pop());
			}
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