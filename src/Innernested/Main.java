package Innernested;

public class Main {
    public static void main(String[] args){
        Parcel parcel = new Parcel();
        Parcel.Destination destination = parcel.new Destination();
        destination.doSomething();
    }
}
