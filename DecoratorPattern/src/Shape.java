public interface Shape {
    void draw();
    
    public class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Shape: Rectangle");
        }
    }
    
    public class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Shape: Circle");
        }
    }
//    Create abstract decorator class implementing the Shape interface.
    public abstract class ShapeDecorator implements Shape{
        protected Shape decoratedShape;
        
        public ShapeDecorator(Shape decoratedShape){
            this.decoratedShape = decoratedShape;
        }
        public void draw(){
            decoratedShape.draw();
        }
    }
//    Create concrete decorator class extending the ShapeDecorator class.
    public class RedshapeDecorator extends ShapeDecorator{
        public RedshapeDecorator(Shape decoratedShape) {
            super(decoratedShape);
        }

        @Override
        public void draw() {
            decoratedShape.draw();
            setRedBorder(decoratedShape);
        }

        private void setRedBorder(Shape decoratedShape){
                System.out.println("Border Color: Red");
        }
}
}
