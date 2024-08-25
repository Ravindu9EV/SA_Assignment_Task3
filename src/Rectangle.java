public class Rectangle implements Shape{
    @Override
    public void draw() {
        int width=9;
        int height=4;
        for(int i=0;i<height;i++){
            for(int j=width;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
