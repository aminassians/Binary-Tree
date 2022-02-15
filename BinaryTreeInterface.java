package Project3;

public interface BinaryTreeInterface<T>
{
	public T getRootData();
	public int GetHeight_BTree();
	public int GetNumberOfNodes_BTree();
	public boolean isEmpty();
	public void clear();
	public T GetLeftmostData_BTree();
	public T GetRightmostData_BTree( );
	public void Pre_Order_BTree();
	public void In_Order_BTree();
	public void Post_Order_BTree();
	public BinaryNode<T> getRoot();
	/*Sets this binary tree to a new one-node binary tree
	  @param rootData is the new tree's root
	 */
	public void setTree(T rootData);
	
	/*Sets this binary tree to a new binary tree
	  @param rootData is the new tree's root
	  @param leftTree is the left subtree of the new tree
	  @param rightTree is the right subtree of the new tree
	 */
	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree);

}//end BinaryTreeInterface
