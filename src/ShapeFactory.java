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
            default:
                this.shapetype=null;
                break;

        }
        return shapetype;
    }
}
