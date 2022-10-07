package Innernested;

public class Parcel {
    public String recipient;
    private int mass;

    class Destination{
        public String street;
        private int homeNumber;
        private int roomNumber;

        public void doSomething(){
            System.out.println(mass);
        }
    }
}
