public class Triangle implements Shape{
    @Override
    public void draw() {
        int base=15;

        for(int i=1;i<base;i++){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
