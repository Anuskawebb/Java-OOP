class pen{

    string color;
    string size;

    public void write(){

        system.out.println("writing");
    }
}


public class Demo{

    public static void main(String[] args){
        pen p = new pen();
        p.color = "red";
        p.size = "medium";
        p.write();
    

}