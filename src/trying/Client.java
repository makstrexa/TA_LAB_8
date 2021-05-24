package trying;

public class Client {

    public static void main(String[] args) {

        CalcTime calcTime = new CalcTime();
        HashTable<Integer, Object> hashTable = new HashTable<>();
        Tree bTree = new Tree();
        System.out.println("\n\u001B[35mTree");
        System.out.println("\n1000 elems");

        calcTime.start();
        for (int i = 0; i < 1000; i++) {
            bTree.insert((int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + calcTime.finish() + " ms");

        calcTime.start();
        Tree.finder(bTree, 145);
        System.out.println("Search takes " + calcTime.finish() + " ms");

        System.out.println("10000 elems");

        calcTime.start();
        for (int i = 0; i < 10000; i++) {
            bTree.insert((int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + calcTime.finish() + " ms");

        calcTime.start();
        Tree.finder(bTree, 145);
        System.out.println("Search takes " + calcTime.finish() + " ms");

        System.out.println("100000 elems");

        calcTime.start();
        for (int i = 0; i < 100000; i++) {
            bTree.insert((int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + calcTime.finish() + " ms");

        calcTime.start();
        Tree.finder(bTree, 145);
        System.out.println("Search takes " + calcTime.finish() + " ms");

        System.out.println("200000 elems");

        calcTime.start();
        for (int i = 0; i < 200000; i++) {
            bTree.insert((int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + calcTime.finish() + " ms");

        calcTime.start();
        Tree.finder(bTree, 145);
        System.out.println("Search takes " + calcTime.finish() + " ms");


        System.out.println("\n\u001B[33mHash table");
        System.out.println("\n1000 elems");

        calcTime.start();
        for (int i = 0; i < 1000; i++) {
            hashTable.setValue(i, (int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + calcTime.finish() + " ms");


        calcTime.start();
        hashTable.getValue(145);
        System.out.println("Search takes " + calcTime.finish() + " ms");

        System.out.println("10000 elems");

        calcTime.start();
        for (int i = 0; i < 10000; i++) {
            hashTable.setValue(i, (int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + calcTime.finish() + " ms");

        calcTime.start();
        hashTable.getValue(145);
        System.out.println("Search takes " + calcTime.finish() + " ms");

        System.out.println("100000 elems");

        calcTime.start();
        for (int i = 0; i < 100000; i++) {
            hashTable.setValue(i, (int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + calcTime.finish() + " ms");

        calcTime.start();
        hashTable.getValue(145);
        System.out.println("Search takes " + calcTime.finish() + " ms");

        System.out.println("200000 elems");

        calcTime.start();
        for (int i = 0; i < 200000; i++) {
            hashTable.setValue(i, (int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + calcTime.finish() + " ms");

        calcTime.start();
        hashTable.getValue(145);
        System.out.println("Search takes " + calcTime.finish() + " ms");
    }
}
