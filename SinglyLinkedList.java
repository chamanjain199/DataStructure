class SinglyLinkedList{
  public Node head;
  public Node tail;
  public int size;

  public Node createSinglyLinkedList(int value){
       
       Node node=new Node();
       node.next=null;
       node.value=value;
       head=node;
       tail=node;
       size++;
       


    return head;
  }

}