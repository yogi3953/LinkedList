import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedListOperations{
    Node head=null;
    
    public Node insertAtFront(int data,Node head)
    {
        Node newNode=new Node(data);
        System.out.println("headin insertat front"+head);
        newNode.next=head;
        head=newNode;
        System.out.println("node"+newNode);
        System.out.println("node.next"+newNode.next);
        return head;
    }
    public Node insertAtEnd(int data,Node head)
    {
        Node newNode=new Node(data);
        System.out.println("headin insertat end"+head);
        if(head==null)
        {
            head=newNode;
            return head;
        }
        System.out.println("next in insertat end"+head.next);
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
        return head;
    }
    
    public Node deleteAtFront(Node head)
    {
        if(head==null)
        {
            return head;
        }
        Node temp=head;
        head=temp.next;
        temp=null;
        return head;
    }
    
    public Node deleteAtEnd(Node head)
    {
        Node current=head;
        if(current.next==null)
        {
            current=null;
        }
        while(current.next.next!=null)
        {
            current=current.next;
        }
         current.next=null;
        return head;
    }
    public void search(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" >> ");
            current=current.next;
        }
        System.out.println("null");
    }
}
class LinkedList
{
    public static void main(String[]args)
    {
        LinkedListOperations llp=new LinkedListOperations();
        while(true)
        {
            System.out.println("Which Operation do you want to perform:");
            System.out.println("1.Insertion at Beginning  2.Insertion at End  3)Deletion at Beginning 4)Deletion at End   5)Simply print the list");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            if(choice==0 || choice>5)
            System.out.print("INVALID OPTION:PLEASE CHOOSE FROM ABOVE OPTIONS");
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter data: ");
                    int data=sc.nextInt();
                    llp.head=llp.insertAtFront(data,llp.head);
            }
                break;
            case 2:
                {
                    System.out.print("Enter data: ");
                    int data=sc.nextInt();
                    llp.head=llp.insertAtEnd(data,llp.head);
                }
                break;
            case 3:
            llp.head=llp.deleteAtFront(llp.head);
                break;
            case 4:
            llp.head=llp.deleteAtEnd(llp.head);
                break;
            case 5:
                
                llp.search(llp.head);
                break;
            default:
            System.out.print("Exiting...");
                    sc.close();
                System.out.println("Invalid Options");
        }
    }
    }
}
