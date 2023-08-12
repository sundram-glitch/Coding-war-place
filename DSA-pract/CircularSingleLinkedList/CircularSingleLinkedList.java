class Node{
   private Node next;
   private int NodeValue;
   
   public Node getNext(){
 	   return next;
   }
   public void setNext(Node next){
   this.next = next;
   }
 
   public int getValue(){
        return NodeValue;
   }
   public void  setValue(int NodeValue){
   this.NodeValue = NodeValue;
   } 
}
 
public class CircularSingleLinkedList{
   private Node node;
   private Node head;
   private Node tail;
   private int  size;
   public CircularSingleLinkedList(int NodeValue){
   node = new Node();
   node.setValue(NodeValue);
   head=node;
   tail=node;
   tail.setNext(head);
   size+=1;
   }
 
   public boolean isExists(){//common and appropiate
   return head!=null;
   }
 
   public void check(int NodeValue)throws Exception{//common and appropiate
   if(!isExists()) throw new Exception("Linkedlist does not exists !!");
   node = new Node();
   node.setValue(NodeValue);//new.setValue(10);
   size+=1;
   }

   public void insertAtFirst(int NodeValue)throws Exception{
   check(NodeValue);
   node.setNext(head);//2020.setNext(1010);
   head=node;//1010assinged2020
   tail.setNext(node);//1010.setNext(2020);
   }
 
   public void insertAtLast(int NodeValue)throws Exception{
   check(NodeValue);
   tail.setNext(node);//prev head node with nextNewNode for next occurance track
   tail=node;//prev tail node with newNode tacker
   tail.setNext(head);//newNode with newNode for Circular
   }
   
   public void insertAt(int NodeValue,int location)throws Exception{
   check(NodeValue);
   if(location <= 1){
 	   insertAtFirst(NodeValue);
 		return ;   
   }
   else if(location >= size){
 	   insertAtLast(NodeValue);
 		return ;   
   };
   Node tempNode = head;
   for (int i = 0; i<location-1;i++ ){
 	   tempNode = tempNode.getNext();
   }
   Node nextNode = tempNode.getNext();
   node.setNext(nextNode);
   tempNode.setNext(node);
   }
 
   public void traverse()throws Exception{
   if(!isExists()) throw new Exception("Linkedlist does not exists !!");
   Node tempNode=head;
   for (int i=0;i<size;i++){
   System.out.print(tempNode.getValue());//getFirst start occurance
   if( i<size-1)System.out.print("-->");// point fourth node item
   tempNode=tempNode.getNext();//ref next occurances iterate
   }
   }
 
   public void search(int NodeValue)throws Exception{
   if(!isExists()) throw new Exception("Linkedlist does not exists !!");
   Node tempNode=head;
   int value=0;
   for (int i=0;i<=size;i++){
       value=tempNode.getValue();
 	   if(value== NodeValue){
   System.out.println(i);//getFirst start occurance
       return ;
 	   }//if
   tempNode=tempNode.getNext();//ref next occurances iterate
   }//for
   return;
   }
 
   public void delete(int location)throws Exception{
   if(!isExists()) throw new Exception("Linkedlist does not exists !!");
   else if(location<=1){//delete head element
   head = head.getNext();//replace with others node occurance
   size-=1;
   tail.setNext(head);
   }//else if-2
   else if(location >=size){//delete tail node item
   Node tempNode = head;
   for (int i=0;i<size-1;i++ )
	   tempNode = tempNode.getNext();//tempNode points to 2nd last
   if(tempNode == head) tail=head=null;
   tempNode.setNext(head);
   tail=tempNode;//tail started pointing to 2nd last
   size-=1;
   }//else if-2
   else {
   Node tempNode=head;
   for (int i=0;i<location-1;i++ ){
   tempNode = tempNode.getNext();
   }//else
   tempNode.setNext(tempNode.getNext().getNext());
   size-=1;
   }
   }
}