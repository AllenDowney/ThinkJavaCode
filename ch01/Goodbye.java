/**
 * Example program that demonstrates print vs println.
 */
public class Goodbye {
    //Instance variables
 private String name, status;
    //Static class-wide counter variable.
    private static int id = 0;
    
    public Goodbye(String n, String s){
       this.name = n;
       this.status = s;
       id += 1;
    }
    /**
    * Setter and Getter methods for Encapsulation
    */
    public void setName(String name){
     this.name = name;   }
  public String getName(){
       return this.name;}
    public void setStatus(String status){
        this.status = status;}
    public String getStatus(){
        return this.status;}
    //Handler method for output
    public void getGoodbyeInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Current Status: "+getStatus());
        System.out.println("ID: "+this.id);



     
}
    /**
     * Prints a greeting.
     */
    public static void main(String[] args) {
        System.out.print("Goodbye, ");  // note the space
        System.out.println("cruel world");
        System.out.println("I'm being no longer with you");
//Instantiate  a new object  of class Goodbye

    Goodbye obj1 = new Goodbye("HP-LAT-1946IPV0", "Running");
        obj1.getGoodbyeInfo();
    }

}
