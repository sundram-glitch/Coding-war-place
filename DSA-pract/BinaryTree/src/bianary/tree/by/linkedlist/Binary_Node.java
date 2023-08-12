package bianary.tree.by.linkedlist;

public class Binary_Node {
  private int value,height;
  private Binary_Node left,right;
  
  public int getHeight() {
	  return height;
  }//end of method
  
  public void setHeight(int height) {
	  this.height = height;
  }//end of method
  
  public int  getValue() {
	  return value;
  }
  
  public void setValue(int value) {
	  this.value = value;
  }
  
  public  Binary_Node getLeft() {
	  return left;
  }
  
  public void setLeft(Binary_Node left) {
  this.left = left;
  }
  
  public Binary_Node getRight() {
  return right;
  }
  
  public void setRight(Binary_Node right) {
	  this.right = right;
  }
  
  @Override
	public String toString() {
	return ""+value;
  }
}
