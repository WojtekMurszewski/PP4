import java.util.LinkedList;

public class Fifo {
    
    private LinkedList<String> objects = new LinkedList<String>();;

    public void addObject(String object){
        objects.addLast(object);
        System.out.println(objects);
    }

    public void removeObject(){
        objects.removeFirst();
        System.out.println(objects);
    }

    public static void main(String[] args) {
        Fifo fifo = new Fifo();
        fifo.addObject("java");
        fifo.addObject("python");
        fifo.removeObject();
    }
}
