public class BinaryHeapByArrayjMain {
  public static void main(String[] args) {
    BinaryHeapbyArray obj = new BinaryHeapbyArray(5);
    obj.insert(12);
    obj.insert(7);
   obj.insert(6);
    obj.insert(10);
    obj.insert(8);
    //obj.display();
    //System.out.println(obj.getSizeoftree());
    System.out.println(obj.extract());
    System.out.println(obj.extract());
    System.out.println(obj.extract());
    System.out.println(obj.extract());
    System.out.println(obj.extract());
  }
}
