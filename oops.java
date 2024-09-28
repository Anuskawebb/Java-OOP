class pen{          //creating class to declare the variables amd properties which are going to be used

    String color;
    String type;

    public void write(){    //creating a method inside the class (fuctions inside the class are called methods)

        System.out.println("writting something");
    }

    // public void printcolor(){
    //     System.out.println(this.color);
    }

    class student{      //class name like above
        
        String name;    //properties
        int age;

        public void printname(){  //methods
            System.out.println(this.name);
        }
        public void printage(){   //methods
            System.out.println(this.age);
        }

        student(){

            System.out.println("Constructor is called");  //this is a non paramitarized constructor which has no return type (constructors are created with the same name of the class name) and constructors can be called under the class like i did here
        }
        student(String name,int age){ //this is a paramitarized constructor 
           this.name = name;   //here this.name is the name of the property that i ahve4 defined int the class section and the last name is the parameters i have passed 
            this.age = age;
            }
    }
    
    public class oops{ //this is a public class under this i can create my main method under the main method i will create my objcets and call my methods
        public static void main(String[] args){ //main method

            // pen pen1=new pen();     //here  the type will be the same name as the class name and then the bject name then again the type or the class name followed by the new keyword
            // pen1.color="blue";   //calling the properties using the object which i have i just created to assign the value
            // pen1.type="gell";

            // // pen1.write();

            // pen pen2=new pen();
            // pen2.color="red";
            // pen2.type="ballpoint";

            // pen1.printcolor(); //calling the method using the object and . operator
            // pen2.printcolor();

            student student1=new student("aman",24);   //in case of paramitarized constructor we have to assign the value within the time of object creation.

            // student1.name="Anuska";
            // student1.age=21;

            student1.printage(); //then we can call the call constructors using methods
            student1.printname();


        }

}