package lab4;

public class Tshirt extends Clothes implements WomenClothing, MenClothing{
    @Override
    public void dressWoman() {

    }
    @Override
    public void dressMan() {

    }
    @Override
    public void setName(){
        this.name = "Футболка";
    }
}