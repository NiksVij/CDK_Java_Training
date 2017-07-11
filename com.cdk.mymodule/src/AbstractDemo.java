/**
 * Created by vijayn on 7/6/2017.
 */
public class AbstractDemo {
    public static void main(String args[]){
        Animal pragnyaPet = new Donkey("Dhenchu");
        pragnyaPet.move();
    }
}
class Donkey extends Animal{
    Donkey(String petName){
        super(petName);
    }
    @Override
    public void move() {
        System.out.println("kicks and walks");
    }
}