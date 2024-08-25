public class Square implements Shape{
    @Override
    public void draw() {
        int width=8;

        for(int i=1;i<=width;i++){
            for(int j=width;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
