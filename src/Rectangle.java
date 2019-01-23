
public class Rectangle {
    
    private int width = 25;
    private int heigth = 10;
    
    public Rectangle(int w, int h){
        
        if(w > 0 && w < 30 && h > 0 && h < 30){
            width = w;
            heigth = h;
            System.out.println("Rectangle created: width-" + width + "and heigth = " + heigth);
        }else{
            System.out.println("Invalid width and/or heigth. " + "Each must be positive and less than 30. ");
        }
    }
    public int getArea(){
        return width * heigth;
    }
    public void draw() {
        for(int rowCounter = 0; rowCounter < heigth; rowCounter++){
            for(int colCounter = 0; colCounter < width; colCounter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
