public class MyLinkedListTest {
    public static void main(String[] args) {
MyLinkedList myLinkedList = new MyLinkedList("HaNoi");
myLinkedList.addFirst("vancouver");

myLinkedList.add(2,"Atalanta");
myLinkedList.add(3,"austin");
myLinkedList.println();
        System.out.println(myLinkedList.get(0));
    }
}
