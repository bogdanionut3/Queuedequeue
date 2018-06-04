package move_elements_while_dequeue;
//Pe masura ce se face dequeue, elementele ramase se vor muta pe pozitiile ramase goale.
public class Main {
    public static void main(String[] args){
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        System.out.println(myQueue.dequeue());
       // System.out.println(myQueue.dequeue());
     //   System.out.println(myQueue.dequeue());
        System.out.println(myQueue.toString());
    }
}
