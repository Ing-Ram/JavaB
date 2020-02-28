public abstract class BinaryTreeBasis<T> {
  protected TreeNode<T> root;
  
  public BinaryTreeBasis() {
    root = null;} // end default constructor
  
  public BinaryTreeBasis(T rootItem) {
    root = new TreeNode(rootItem, null, null);
    } // end constructor
  
  public boolean isEmpty() {
    // Returns true if the tree is empty, else returns false.
    return root == null;
    } // end isEmpty
  
  public void makeEmpty() {
    // Removes all nodes from the tree.
    root = null;
    
    } // end make Empty
    
  public T getRootItem() throws TreeException {
    // returns the item in the tree's root
    if (root == null) {    
    throw new TreeException("TreeException:  Empty tree");
    }
    else {   
      return root.item;
      }
    } // end getRootItem
    
  public abstract void setRootItem(T newItem);
    // Throws UnsupportedOperationException if operation isn't //supported.
  } // end BinaryTreeBasis
