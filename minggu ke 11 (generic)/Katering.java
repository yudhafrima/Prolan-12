package generic;

/**
 *
 * @author Iscariot
 */
public class Katering<T> {
  T ob; // declare an object of type T

  Katering(T o) {
    ob = o;
  }

  T getob() {
    return ob;
  }

  void showType() {
    System.out.println("Type of T is " + ob.getClass().getName());
  }
}