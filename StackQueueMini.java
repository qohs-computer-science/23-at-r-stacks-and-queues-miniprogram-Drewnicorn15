import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {
    Stack s = new Stack();
    Scanner scan = new Scanner(System.in);
    Queue q = new LinkedList();
    for(int i =0; i<5; i++)
    {
        System.out.println("enter a whole number");
        s.add(scan.nextInt());

    }
    while(!s.isEmpty())
        q.add(s.pop());
    while(!q.isEmpty())
    {
        Object temp = q.remove();
        s.add(temp);
        s.add(temp);
    }
    System.out.println("output: "+s);
    q = new LinkedList();
    for(int i =0; i<10; i++)
    {
        System.out.println("enter a whole number");
        q.add(scan.nextInt());

    }
    Queue even = new LinkedList();
    Queue odd = new LinkedList();
    while(!q.isEmpty())
    {
        Object temp = q.remove();
        if((Integer)temp %2==0){
            even.add(temp);
        }else{
            odd.add(temp);
        }
    }
    even.addAll(odd);
    q= even;
    System.out.println("output: "+q);
    scan.close();
  } // end main
} // end class
