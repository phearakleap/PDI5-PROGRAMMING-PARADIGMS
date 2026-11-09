public class exercise6 {
    
    static class Rectangle{
        
        private double width, height;

        Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }


        public double rectPerimeter(){
            return (2*width) + (2*height);
        }

        public double rectArea(){
            return width * height;
        }

    }

    static class Circle{

        private double radius;

        Circle(double radius){
            this.radius = radius;
        }

        public double circPerimeter(){
            return 2 * Math.PI * radius;
        }

        public double circArea(){
            return Math.PI * radius;
        }

    }

    public static void main(String[] args){
        Rectangle rect = new Rectangle(30, 16);
        Circle circ = new Circle(4.7);

        System.out.println("Rectangle Perimeter and Area: ");
        System.out.printf("\tPerimeter: %.3f m\n", rect.rectPerimeter());
        System.out.printf("\tArea: %.3f m^2\n", rect.rectArea());

        System.out.println("\nCircle Perimeter and Area: ");
        System.out.printf("\tPerimeter: %.3f m\n", circ.circPerimeter());
        System.out.printf("\tArea: %.3f m^2\n", circ.circArea());

    }
}
