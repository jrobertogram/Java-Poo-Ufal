package question2;
public class Rectangle {
    private double width;
    private double height;

    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double area(){
        return this.getWidth() * this.getHeight();
    }
    public double perimeter(){
        return (this.getWidth() * 2) + (this.getHeight() * 2);
    }
    public double diagonal(){
        return Math.sqrt(this.getWidth() * this.getWidth()) + (this.getHeight()* this.getHeight());
    }
}