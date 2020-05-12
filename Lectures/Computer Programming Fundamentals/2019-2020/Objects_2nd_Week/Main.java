public class Main {
    public static void main(String args[]){
        Car bmwCar = new Car("BMW");
        bmwCar.setColour("Green");
        bmwCar.setPrice(20000);
        System.out.println(bmwCar.getBrand()+"-"+bmwCar.getColour());

        Customer brad = new Customer();
        brad.setCar(bmwCar);

        bmwCar.setColour("Black", "/Yellow");

        Customer john = new Customer();
        john.setCar(bmwCar);

        System.out.println("Brad's Car-"+brad.car.getBrand()+"-"+brad.car.getColour());
        System.out.println("John's Car-"+john.getCar().getBrand()+"-"+john.getCar().getColour());


    }
}