public class TestDriveArrayADT extends ListArrayBased{

    public static void main(String args){
        ListArrayBased aList = new ListArrayBased();
        Object dataItem;
        aList.add(1,"first");
        dataItem = aList.get(1);
        System.out.println(dataItem.toString());


    }
}
