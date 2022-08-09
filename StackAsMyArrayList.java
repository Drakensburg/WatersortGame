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
 
public class StackAsMyArrayList<E> 
{   
	MyArrayList<E> theStack;
    public StackAsMyArrayList()
    {  theStack = new MyArrayList<E>();       
    }
	
    public void push(E newElement) //insert at end of array!
    {  
		   if (!theStack.checkSpace())
		   throw new IndexOutOfBoundsException
                    ("Stack out of bounds");
		   theStack.add(theStack.getSize(),newElement);
    }
	
	public E pop() //remove end of array
    {  
		E temp = null;
		
		boolean isDone = false;
		if (theStack.getSize() > 0)
			temp=theStack.remove(theStack.getSize()-1);
		return temp; // temp will be null in special case of empty list
    }
    
	public String toString()
	{
		return theStack.toString();
	}
	//===ADDITIONS
	public E peek()
    {  
		E temp = null;
		
		boolean isDone = false;
		if (theStack.getSize() > 0)
			temp=theStack.get(theStack.getSize()-1);
		return temp;
    }
	
	public int getStackSize()
	{
		return theStack.getSize();
	}
	
	public boolean checkStackUniform()
	{
		if ((theStack.getSize() == 0)||(theStack.getSize() == 4))
		{
			return theStack.checkUniform();
		}
		else
		{
			return false;	
		}
	}
	//===ADDITIONS
}//end class

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