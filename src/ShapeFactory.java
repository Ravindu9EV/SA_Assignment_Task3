public class ShapeFactory {
    private Shape shapetype;
    public Shape getShape(String shapeType){

        switch (shapeType) {
            case "CIRCLE":
                this.shapetype = new Circle();
                break;
            case "SQUARE":
                this.shapetype = new Square();
                break;
            case "RECTANGLE":
                this.shapetype = new Rectangle();
                break;
            case "TRIANGLE":
                this.shapetype=new Triangle();
                break;
            default:
                this.shapetype=null;
                System.out.println("Invalid Shape Type Provided");
                break;

        }
        return shapetype;
    }
}
