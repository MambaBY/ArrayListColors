import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
    ArrayList <String> colors = new ArrayList<>(){
        {
            add("blue");
            add("gray");
            add("orange");
            add("green");
            add("yellow");
            add("red");
        }
    };

    public void printElements(){
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

    public void addPlusToElements(){
        ListIterator<String> iterator = colors.listIterator();
        while (iterator.hasNext()){
            iterator.set(iterator.next().concat("+"));
        }
    }

    public void printElementsInReverseOrder(){
        ListIterator<String> iterator = colors.listIterator(colors.size());
        while (iterator.hasPrevious()){

            System.out.print(iterator.previous()+ " ");
        }
    }





}
