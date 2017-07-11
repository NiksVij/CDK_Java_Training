public class EnumDemoCons {

    public enum Furniture {
        SOFA(7), CHAIR(2), DININGTABLE(3), TABLE(4);

        Furniture(int price) {
            this.price = price;
            System.out.println("Cons "+this + " " + price);
        }

        private final int price;

        //can have our own methods
        public int getPrice() {
            return price;
        }

        public boolean isTable() {
            if(this.name().contains("TABLE"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        //Furniture of = new Furniture(10); //cannot instantiate Furniture, since its enum

        Furniture of; //right way to do it
        of = Furniture.CHAIR;

        //Furniture.values() returns an array of Furniture i..e Furniture[] which has all constants
        for (/*Furniture f : Furniture.values()*/int i = 0 ;i<Furniture.values().length;i++) {
            Furniture f = Furniture.values()[i];
            System.out.print("Furniture: " + f + ", ");

            if (f.getPrice() >= 4) {
                System.out.print("Expensive, ");
            } else {
                System.out.print("Affordable, ");
            }

            switch (f) {
                case SOFA:
                    System.out.println("Relax on Sofa");
                    continue;
                case CHAIR:
                    System.out.println("Sit on chair");
                    continue;
                default:
                    System.out.println("OK");
            }
        }

    }

}