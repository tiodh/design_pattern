package menu;

public abstract class AbstractDish {
    protected String name;
    protected int price;

    public AbstractDish(String _name, int _price){
        this.name   = _name;
        this.price  = _price;
    }

    public abstract void getDescription();

    public abstract void setOrder();
}
