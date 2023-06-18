public class Main {
    public static void main(String[] args) {
        List1 list=new List1();


        list.printClassName(list);

        for(int i=100; i>=1; i--)
            list.pushFront(i);

        list.print();
        list.reverse1();
        list.print();
        }
    }

