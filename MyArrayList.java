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
 
public class MyArrayList<E> 
{
  private int size; // Number of elements in the list
  private E[] data;
  private int MAXELEMENTS = 100;
  /** Create an empty list */
  public MyArrayList() {
	   data = (E[])new Object[MAXELEMENTS];// cannot create array of generics
       size = 0; // Number of elements in the list
  }
  
  public int getMAXELEMENTS(){
	  return MAXELEMENTS;
  }
	  
   
  
  public boolean checkSpace()
  {
	  if (size+1<MAXELEMENTS)
		  return true;
	  else
		  return false;
  }
  
  public void add(int index, E e) {   
    // Ensure the index is in the right range
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size); 
    // Move the elements to the right after the specified index
    for (int i = size - 1; i >= index; i--)
      data[i + 1] = data[i];
    // Insert new element to data[index]
    data[index] = e;
    // Increase size by 1
    size++;
  }

  public boolean contains(Object e) {
    for (int i = 0; i < size; i++)
      if (e.equals(data[i])) return true;
    return false;
  }

  public E get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    return data[index];
  }
  
  public E remove(int index) {
	if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    E e = data[index];
    // Shift data to the left
    for (int j = index; j < size - 1; j++)
      data[j] = data[j + 1];
    data[size - 1] = null; // This element is now null
    // Decrement size
    size--;
    return e;
  }
  
  public void clear()
  {
     size = 0;
  }
 
  public MyArrayList<E> merge(MyArrayList<E> param)
  {
	  int i=0; //counter in calling array
	  int j=0; // counter in param array
	  int k=0; // counter in return array
	  MyArrayList<E> returnArray = new MyArrayList();
	  
	  if (this.getSize() ==0) // same as if (size==0)
		  return param;
	  if (param.getSize()==0)
		  return this;
	  if ((this.getSize()+ param.getSize()) > MAXELEMENTS)
		   throw new IndexOutOfBoundsException
        ("Combined list out of bounds");
		
	  // traverse both list until one list is completely done
	  while (i<this.getSize() && j<param.getSize())
	  {
		  // Compare single value from each list and copy smallest into result
		  if (((Comparable)data[i]).compareTo(param.data[j]) <0)
		  {
			returnArray.data[k]= this.data[i];
			k++;
			i++;	
		  }
		  else
		  {
			returnArray.data[k]=param.data[j];
			k++;
			j++;
		  }
	  }
	  
	  // copy remainder of the array
	  if (i < this.getSize())
	  {
		  for (i=i;i<getSize();i++) //for starts at current position
		  {
			returnArray.data[k]= this.data[i];
			k++;
		  }
	  }
	  if (j < param.getSize())
	  {
		  for (j=j;j<param.getSize();j++)
		  {
			returnArray.data[k]=param.data[j];
			k++;
		  }
	  }
	  returnArray.size = k; // set size of return array
	  return returnArray;
  }		  
		  
	  
  public String toString() {
    String result="[";
    for (int i = 0; i < size; i++) {
      result+= data[i];
      if (i < size - 1) result+=", ";
    }
    return result.toString() + "]";
  }

  
  public int getSize() {
    return size;
  }
  
 public boolean sortList() {
    E hold;
	for (int i = 0; i < size-1; i++)
	 {
	   for (int j = 0; j<size-1; j++)
	    {  	 
	     if(((Comparable)data[j]).compareTo(data[j+1])>0)
	      {
	       hold= data[j+1];
	       data[j+1]=data[j];
	       data[j]=hold;
	      }       
	   }
     } 
	 return true;	  	
  }
	//===ADDITIONS
	public boolean checkUniform()
	{
		boolean bIsUniform = false;
		
		for (int i = 0; i < size; i++)
		{
			if(((Comparable)data[0]).compareTo(data[i]) != 0)
			{
				bIsUniform = false;
				break;
			}
			else
			{
				bIsUniform = true;
			}
		}
		
		if(bIsUniform == true)
		{
			return true;
		}
		else if (data[0] == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//===ADDITIONS
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