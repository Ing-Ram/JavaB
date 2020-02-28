public class ListArrayBased implements ListInterface{
    private static final int MAX_LIST = 50;
    private Object items[];
    private int numItems;

    public ListArrayBased(){
        //Constructor
        items = new Object[MAX_LIST];
        numItems = 0;
    } //End default constructor

    public boolean isEmpty(){
        return (numItems ==0);
    }//end isEmpty method

    public int size(){
        return numItems;
    }// End size method- Returns:numItems

    public void removeAll(){
        //create a new array; marks old array for
        //Garbarge collection
        items = new Object[MAX_LIST];
        numItems = 0;
        }//End removeAll method

    public void add(int index, Object item)throws ListIndexOutOfBoundsException{
        if (numItems > MAX_LIST) {
            throw new ListIndexOutOfBoundsException("ListException on add");
        }   //End if
        if (index >= 1 && index <= numItems + 1) {
            //Make room for new element by shifting all items at
            //position >= index toward the end of the list
            //(no shift if index == numItems+1)
            for (int pos = numItems; pos >= index; pos--){
                items[translate(pos + 1)] = items[translate(pos)];
            }//End forloop
            //insert new item
            items[translate(index)] = item;
            numItems++;
        } else { //index out of range
            throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on add");
        }//end If
    }//end add

    public Object get(int index) throws ListIndexOutOfBoundsException{
        if(index >= 1 && index <= numItems){
            return items[translate(index)];
        }else { //index out of range
            throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on get");
        }// end if
    }//end get


    public void remove(int index) throws ListIndexOutOfBoundsException {
        if(index >= 1 && index <= numItems) {
            //Delete item by shifting all items at positions > index
            //toward the beginning of the list
            // (no shift if index == size)
            for (int pos = index + 1; pos <= size(); pos++) {
                items[translate(pos - 1)] = items[translate(pos)];
            } // end for loop
        } else { //index out of range
            throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on remove");
            }//End if
    }//End remove

    private int translate(int position){
        return position - 1;
    }//End ListArrayBased
}//End ListArrayBased class

