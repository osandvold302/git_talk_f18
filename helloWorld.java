public class helloWorld{
  public final int x;
  public helloWorld(int d){
    this.x = d;
  }

  public static void main(String [] args){
    helloWorld a = new helloWorld(5);
    System.out.println(a.x);
    a.x = 10;
    System.out.println(a.x);
  }
}
