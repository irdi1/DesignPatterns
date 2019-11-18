public class Main {

    public static void main(String[] args){
//        Icecream icecream = new Icecream.honeyDecorator(new Icecream.NuttyDecorator(new Icecream.SimpleIcecream()));
//        System.out.println(icecream.makeIcecream());
        System.out.println("\n----------------------------");

        Shape circle = new Shape.Circle();
        Shape redCircle = new Shape.RedshapeDecorator(new Shape.Circle());
        Shape redRectangle = new Shape.RedshapeDecorator(new Shape.Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red borders");
        redRectangle.draw();


    }
}
