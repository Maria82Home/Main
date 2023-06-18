//import List1;
public class Main {
    public static void main(String[] args) {
        List1 list=new List1();
//        list.value=5;

        list.printClassName(list);
//        list.pushFront(5);
//        list.pushFront(7);
//        list.pushFront(9);
//        list.pushFront(11);
//        list.pushFront(13);
        for(int i=100; i>=1; i--)
            list.pushFront(i);

        list.print();
        list.reverse1();
        list.print();
        }
    }

