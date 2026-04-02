//======Inheritance=======//
public class DeluxPizza extends Pizza {
    // Constructor Deluxe Pizza
    public DeluxPizza(Boolean veg){
        // super: keyword to call Parent Constructor
        super(veg);
        // Calling Parent methods inside Constructor
        super.addExtraCheese();// بيضيف Cheese فوراً وبشكل إجباري
        super.addExtraTopping();// بيضيف Topping فوراً وبشكل إجباري
    }
    // ======= Method Overriding ======= //
    @Override
    public void addExtraCheese() {
        // Empty body to prevent extra price
    }

    @Override
    public void addExtraTopping() {
        // Empty body (Overriding the original behavior)
    }
}
