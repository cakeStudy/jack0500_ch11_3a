import java.util.LinkedList;

public class ch11_3a
{
    /* Write a method called removeEvenInRange that accepts three parameters: a LinkedList, a starting index, and an
    ending index. The method’s behavior is to remove all occurrences of the even numbers that appear in the list
    between the starting index (inclusive) and the ending index (exclusive). Other values and occurrences of the even
    numbers that appear outside the given index range are not affected.
    For example, for the list                              [1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16], a call of
    removeEvenInRange(list, 5, 13) should produce the list [1, 1, 2, 0, 4, 5, 3, 11, 9, 0, 14, 0, 16].
    Notice that the even numbers located at indexes between 5 inclusive and 13 exclusive in the original list (before any
    modifications were made) have been removed. */

    public void run()
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(0);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(8);
        linkedList.add(3);
        linkedList.add(11);
        linkedList.add(9);
        linkedList.add(12);
        linkedList.add(0);
        linkedList.add(14);
        linkedList.add(0);
        linkedList.add(16);

        System.out.println(removeEvenInRange(linkedList, 5, 13));
    }

    public LinkedList<Integer> removeEvenInRange(LinkedList<Integer> linkedList, int indexStart, int indexSlut)
    {
        LinkedList<Integer> listFinal = linkedList;

        try
        {
            for (int i = indexStart; i <= indexSlut; i++)
            {
                if(listFinal.get(i)%2 == 0 && listFinal.get(i) != 0)
                {
                    listFinal.remove(i);
                    i--;
                    indexSlut--;
                }
            }
        }catch (IndexOutOfBoundsException IOOBe)
        {
            return listFinal;
        }
        return listFinal;
    }
}
