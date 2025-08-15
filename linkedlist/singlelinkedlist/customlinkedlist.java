package singlelinkedlist;
public class customlinkedlist {

    private Node head;
    private Node tail;
    private int size;

    public customlinkedlist(){
        this.size=0;
    }


    public void instertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head= node;

        if(tail == null){
            tail= head;
        }
        size+=1;

        }

    public void insterlast(int val){
        if(tail==null){
            instertFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size+=1;

    }   

    public int deletefirst(){
        int val =head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    //function to return node for a perticular index

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
            
        }
        return node;
    }

    public int deletelast(){
        if(size<=1){
           return deletefirst(); 
        }
        Node secondlast=get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if (index==size-1){
            return deletelast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        return val;
      
    }

    public Node find(int value){
        Node node =head;
        while(node!=null){
            if(node.value==value){
                return node ;
            }
            node=node.next;

        }
        return node;
    }

      


    
    

    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void insert(int val, int index){
        if (index==0){
            instertFirst(val);
            return;
        }
        if (index==size){
            insterlast(val);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node =new Node(val ,temp.next);
        temp.next=node;
        size++;

    }

    private class Node{

        
        private int value ;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;

        } 

 


    }
    //question 

    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;

            }else{
                node=node.next;
            }


        }
        tail=node;
        tail.next = null;

    }






    
   
}
