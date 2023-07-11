public class Rectangle {

    private int length;
    private int width;
    public int testVar = 10;

    public Rectangle(int length, int width){
        this.length = length;
        this.width  = width;

    }


    public int calculateArea(){
        return this.length * this.width;
    }

    public boolean checkIfSquare(){
        if (this.length == this.width){
            return true;
        }
        return false;
    }
}
