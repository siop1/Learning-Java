// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public void rectArea(float l,float b){
        System.out.println("Area of rectangle is "+l*b);
    }
    public void rectSquare(float l){
        System.out.println("Area of square is "+l*l);
    }
    public void rectCircle(float r){
        System.out.println("Area of circle is "+3.14*r*r);
    }
    public static void main(String[] args) {
        Main obj=new Main();
        obj.rectArea(10,20);
        obj.rectSquare(10);
        obj.rectCircle(10);
        
        
    }
}