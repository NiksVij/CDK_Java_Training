abstract class Animal{
    int i,j;
    String petName="";
    private Animal(){
        System.out.println("Animal() Constructor");
    }
    Animal(String petName){
        this();
        this.petName = petName;

    }
    public abstract void move();

    public void takeRest()
    {
        System.out.println("Sleeping.....");
    }
}