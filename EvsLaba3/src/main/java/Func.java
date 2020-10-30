import java.util.ArrayList;
import java.util.LinkedList;

public class Func {
    public


    void add()
    /**
     * This function is made for adding new elements to ArrayList and LinkedList
     * We use function nanoTime to get the current time, and with variable
     * duration we get a time was spend for using each of this functions
     */
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        long startTime = System.nanoTime();
        for (int i =0; i<2000; i++)
            arrayList.add(100);
        long endTime = System.nanoTime();
        long duration = (endTime-startTime);
        System.out.println("ArrayList добавление - "+ duration);
        startTime = System.nanoTime();
        for (int i =0; i<2000; i++)
            list.add(100);
        endTime = System.nanoTime();
        duration = (endTime-startTime);
        System.out.println("LinkedList добавление - "+ duration);
    }


    /**
     * Almost the same, but we get the element from the needed position
     */
    void get()
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i =0; i<2000; i++)
            arrayList.add(100);
        for (int i =0; i<2000; i++)
            list.add(100);
        long startTime = System.nanoTime();
        for (int i =0; i<2000; i++)
            arrayList.get(i);
        long endTime = System.nanoTime();
        long duration = (endTime-startTime);
        System.out.println("ArrayList получение - "+ duration);
        startTime = System.nanoTime();
        for (int i =0; i<2000; i++)
            list.get(i);
        endTime = System.nanoTime();
        duration = (endTime-startTime);
        System.out.println("LinkedList получение - "+ duration);

    }

    /**
     * In this function we remove element from each position and
     * count the time was spent for this function
     */
    void delete()
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i =0; i<2000; i++)
            arrayList.add(100);

        for (int i =0; i<2000; i++)
            list.add(100);

        long startTime = System.nanoTime();
        for (int i = 1999; i>=0; i--)
            arrayList.remove(i);
        long endTime = System.nanoTime();
        long duration = (endTime-startTime);
        System.out.println("ArrayList удаление - "+ duration);
        startTime = System.nanoTime();
        for (int i =1999; i>=0; i--)
            list.remove(i);
        endTime = System.nanoTime();
        duration = (endTime-startTime);
        System.out.println("LinkedList удаление - "+ duration);
    }
}
