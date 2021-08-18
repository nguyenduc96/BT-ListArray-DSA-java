import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList(10);
        myList.add(0, 30);
        myList.add(1, 9);
        myList.add(2, 1996);
        myList.add(3, 20);
        myList.add(4, 10);
        myList.add(5, 2001);
        myList.add(6, 1);
        myList.add(7, 2);
        myList.add(8, 3);
        myList.add(9, 4);
        System.out.println(Arrays.toString(myList.getElements()));
        System.out.println("size = " + myList.size());
        System.out.println("==========");
        myList.remove(9);
        System.out.println(Arrays.toString(myList.getElements()));
        System.out.println("size = " + myList.size());
        System.out.println("==========");
        myList.clone();
        System.out.println(Arrays.toString(myList.getElements()));
        System.out.println("size = " + myList.size());
        System.out.println("==========");
        System.out.println(myList.contains(1996));
        System.out.println("==========");
        System.out.println(myList.get(2));
        System.out.println("==========");
        System.out.println(myList.indexOf(12));
        System.out.println(myList.indexOf(1996));
        System.out.println("==========");
        myList.clear();
        System.out.println(Arrays.toString(myList.getElements()));
        System.out.println("size = " + myList.size());
        System.out.println("==========");
    }
}
