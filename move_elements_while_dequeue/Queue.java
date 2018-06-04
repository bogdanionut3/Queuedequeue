package move_elements_while_dequeue;

public class Queue {
    private int[] content = new int[7];
    private int head = 1;
    private int tail = 1;

    public void enqueue(int element) {
        content[tail] = element;
        tail++;
    }

    public int dequeue() {
        int element = content[head];
        moveElements();
        head++;
        return element;
        }

   public void moveElements(){
        for(int i = 1; i<=content.length/2;i++){
            content[i] = content[head];
        }
   }

    public String toString() {
        //reprezentare citibila a obiectului. Vreem sa vedem starea obiectului dupa parcurgerea pasilor (un fel de debug) Scoate ceva in evidenta
        return "Queue.Queue{" +
                "tail=" +content+
                '}' +//\n = rand nou
                "\ntail = " + tail+
                "\nhead = " + head+
                "\ncontent[tail]= " + content[tail-1]+
                "\ncontent[head]= " + content[head];
    }
}
