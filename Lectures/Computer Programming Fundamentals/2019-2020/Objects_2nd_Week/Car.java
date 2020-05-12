public class Car {
private String colour;
double price;
String brand;

public Car(String brand){
    this.brand = brand;
}

public void setColour(String c){
    colour = c;
}

// Method Overloading
public void setColour(String c, String d){
    colour = c + d;
}

public String getColour() {
    return colour;
}

public void setBrand(String b){
    brand = b;
}
public String getBrand() {
    return brand;
}

public void setPrice(double p){
    price = p;
}
public double getPrice() {
    return price;
}


}