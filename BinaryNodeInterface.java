package Project3;

public interface BinaryNodeInterface<T> 
{
	
	public T getData();
	public boolean hasLeftChild();
	public boolean isLeaf();
	public boolean hasRightChild();
	public int GetNumberOfNodes_BNode();
	public int GetHeight_BNode();
	public T GetLeftmostData_BNode( );
	public T GetRightmostData_BNode( );
	public void Pre_Order_BNode();
	public void In_Order_BNode();
	public void Post_Order_BNode();
	
}
