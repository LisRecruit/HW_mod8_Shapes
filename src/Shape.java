public class Shape implements Printable{
    protected String name;

    public String getName() {
        return name;
    }
    @Override
    public void print(){
        System.out.println("Figure name is "+ getClass().getName());
    }

}
