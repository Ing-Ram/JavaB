package SearchKeys;
public abstract class KeyedItem<KT extends Comparable <? super KT>> {
  private KT searchKey;
  
  public KeyedItem(KT key){
    searchKey = key;
  } // end cosntructor
  
  public KT getKey() {return searchKey;} // end getKeypublic 
  void setKey(KT key) {
    searchKey = key;
  
  }

  public int compareTo(KT c){
    if (this.searchKey.compareTo(c) < 0) {
          return -1;
    }
    else if (this.searchKey.compareTo(c) == 0) {
          return 0;
    }
    else  return 1;
    }
  } // end KeyedItem
