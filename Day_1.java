//package linkedlist;

public class creation {
    static class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static node head=null;
    static int count=0;
    static  void addFirst(int data)
    {
        count++;
        node temp=new node(data);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            temp.next=head;
            head=temp;
        }
    }

    static void addLast(int data)
    {
        count++;
        node temp=new node(data);
        if(head==null)
        {
            head=temp;
            return;
        }
        node trav=head;
        while(trav.next!=null)
        {
            trav=trav.next;
        }  
        trav.next=temp;
    }

    static void addin(int i,int data)
    {
        if(i<1||i>count+1)
        {
            System.out.println("Not possible");
            return;
        }
        if(i==1)
        {
            addFirst(data);
            return;
        }
        if(i==count+1)
        {
            addLast(data);
            return;
        } 
        node newnode=new node(data);  
        count++;
        node temp=head;
        for(int j=2;j<i;j++)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    static void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Empty list");
            return ;
        }
        count--;
        System.out.println("Deleting "+head.data);
        if(head.next==null)
        {
            head=null;
        }
        else
        {
            head=head.next;
        }
    }
   
    static void deleteLast()
    {
        if(head==null||head.next==null)
        {
            deleteFirst();
            return;
        }
        count--;
        node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        System.out.println("Deleting "+temp.next.data);
        temp.next=null;
    }

    static void deletein(int i)
    {
         if(i<1||i>count)
        {
            System.out.println("Not possible");
            return;
        }
        if(i==1)
        {
            deleteFirst();
            return;
        }
        if(i==count)
        {
            deleteLast();
            return;
        } 
        count--;
        node temp=head;
        for(int j=2;j<i;j++)
        {
            temp=temp.next;
        }
        System.out.println("Deleting "+temp.next.data);
        temp.next=temp.next.next;
    }
     static void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return ;
        }
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("e");
        System.out.println(count);
        addLast(12);
        System.out.println(count);
        addFirst(5);
        System.out.println(count);
        addFirst(15);
        System.out.println(count);
        addLast(1);
        System.out.println(count);
        display();
        addin(3,50);
        System.out.println(count);
        display();
        deletein(2);
        System.out.println(count);
        display();
    }
}
