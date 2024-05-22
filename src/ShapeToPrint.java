public class ShapeToPrint implements Printable{



    @Override
    public void print (Shape shape){
        System.out.println("Figure name is "+ shape.getName());
    }


}
