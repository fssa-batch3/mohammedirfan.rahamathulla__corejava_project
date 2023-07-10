package Day01.Practice;

public class Cat {
    // Attributes
    private boolean hasDots;
    private String color;
    // Getters and setters
    public boolean hasDots() {
        return hasDots;
    }
    public void setHasDots(boolean hasDots) {
        this.hasDots = hasDots;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // Main method to create Cat objects
    public static void main(String[] args) {
        // Create two Cat objects
        Cat Cat1 = new Cat();
        Cat1.setColor("purple");
        Cat1.setHasDots(false);
        Cat Cat2 = new Cat();
        Cat2.setColor("blue");
        Cat2.setHasDots(true);
        // Print the attributes of each Cat
        System.out.println("Cat 1:");
        System.out.println("Has Dots: " + Cat1.hasDots());
        System.out.println("Color: " + Cat1.getColor());
        System.out.println("Cat 2:");
        System.out.println("Has Dots: " + Cat2.hasDots());
        System.out.println("Color: " + Cat2.getColor());
    }
}














