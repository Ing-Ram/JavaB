public interface ListInterface {



    public boolean isEmpty();
    //This Determines whether a list is empty.
    //Precondition: None.
    //Postcondition: Returns true if the list is empty,
    //otherwise returns false.

    //throws: None.

    public int size();
    //Determines the lengths of a list.
    //Precondition: None.
    //Postcondition: Returns the number of items that are
    //currently in the list.
    //Throws: None.

    public void removeAll();
    //Deletes all the irems form the list.
    //Precondition: None.
    //Postcondition: Returns the number of items that are
    //  currently in the list
    //throws: None.

    public void add(int index, Object item)throws ListIndexOutOfBoundsException;
    //Adds an item to the list at poistion index.
    //Precondition: index indicates the position a which
    //the item should be inserted in the list.
    //PostCondition: if insertion is successful, item is
    // at position index in the list, and other items are
    // renumbered acordingly.
    //Throws: ListIndexOutOfBoundsException if index < 1
    //or index > size()+1
    //Throws: ListException if item cannot be placed on the list

    public Object get(int index)throws ListIndexOutOfBoundsException;
    //Retrieves a list item by position
    //Precondition: index is the number of the item to be retrieved
    //Postcondition: if 1<= index <= size(), the item at position index in te  list is returned.
    //Throws: ListIndexExceptionOutOfBounds if index < 1 or index > size()

    public void remove(int index)throws ListIndexOutOfBoundsException;
    //Deletes an item for the list at a given position
    //Precondition: index indicates where the deletion should occur.
    //Postcondition: If 1 <= index <= size(), the item at
    //position index in the list is deleted, and other items are
    //renumbered accordingly
    //Throws: ListIndexOutOfBoundsException if idex < 1 or index > size()

}//end ListInterface
