package prob5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/*операции вставки, удаления, добавления и поиска по образцу*/
public class Timer {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        int k = 5000000;
        Date startLinked = new Date();
        for (int i = 0; i < k; i++) {
            list2.add(i);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();
        Date startArray = new Date();
        for (int i = 0; i < k; i++) {
            list1.add(i);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();
        System.out.println("==============Add====================\n LinkedList: " + linkedTime + " ms \n ArrayList: " + arrayTime + " ms");



        int k2 = 1000;
        startLinked = new Date();
        for(int i = 0; i < k2; i++) {
            list2.remove();
        }
        finishLinked = new Date();
        linkedTime = finishLinked.getTime() - startLinked.getTime();
        startArray = new Date();
        for(int i = 0; i < k2; i++) {
            list1.remove(0);
        }
        finishArray = new Date();
        arrayTime = finishArray.getTime() - startArray.getTime();
        System.out.println("==============Remove====================\n LinkedList: " + linkedTime + " ms \n ArrayList: " + arrayTime + " ms");



        int elementToSearch = 4567890;
        Iterator<Integer> iter = list2.iterator();
        startLinked = new Date();
        while (iter.hasNext()) {
            if (iter.next() == elementToSearch) {
                finishLinked = new Date();
                linkedTime = finishLinked.getTime() - startLinked.getTime();
            }
        }
        Iterator<Integer> iter2 = list1.iterator();
        startArray = new Date();
        while (iter.hasNext()) {
            if (iter.next() == elementToSearch){
                finishArray = new Date();
                arrayTime = finishArray.getTime() - startArray.getTime();
            }
        }
        System.out.println("==============Find====================\n LinkedList: " + linkedTime + " ms \n ArrayList: " + arrayTime + " ms");



        int insertElement = 123;
        startLinked = new Date();
        list2.add(2500000, insertElement);
        finishLinked = new Date();
        linkedTime = finishLinked.getTime() - startLinked.getTime();

        startArray = new Date();
        list2.add(2500000, insertElement);
        finishArray = new Date();
        arrayTime = finishArray.getTime() - startArray.getTime();
        System.out.println("==============Insert====================\n LinkedList: " + linkedTime + " ms \n ArrayList: " + arrayTime + " ms");
    }


}
