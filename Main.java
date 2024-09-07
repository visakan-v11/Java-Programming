class LinkedList{
    Node head = null;

    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
void add(int val){
    Node new_node = new Node(val);

    if(head == null){
        head = new_node;
    }
    else{
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
    }
}

void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp=temp.next;
    }
    System.out.println("null");
}
void delete_first(){
    if(head!=null){
        head = head.next;
    }
}
void delete_last(){
    if(head!=null){
        if(head.next==null){
            delete_first();
        }
        Node temp = head;
        while(temp.next!=null && temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;
    }
}
void remove_dup(){
    Node temp = head;
    while(temp!=null && temp.next!=null){
        if(temp.data == temp.next.data){
            temp.next = temp.next.next;
        }
        else{
            temp = temp.next;
        }
    }
}
void seggregate(){
    Node i = head;
    Node j = head;
    while(j.next!=null){
        if(j.data==0){
            int k = i.data;
            i.data = k;
            j = j.next;
            i=i.next;
        }
        else{
            j = j.next;
        }
    }
    j=i;
    while(j.next!=null){
        if(j.data==1){
            int k = i.data;
            i.data = k;
            j = j.next;
            i=i.next;
        }
        else{
            j = j.next;
        }
    }
}
void add_mid(int val){
    Node new_node = new Node(val);
    if(head==null){
        head=new_node;
    }
    else{
        Node fast=head;
        Node slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        new_node.next = slow.next;
        slow.next = new_node.next;
    }
}
void dup(){
    Node i = head;
    Node j = head;
    if(i.data != j.data){
        i = i.next;
        i.data = j.data;
    }
}
}
public class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(300);
        list.add(500);
        list.display();
        list.remove_dup();
        list.display();
    }
}