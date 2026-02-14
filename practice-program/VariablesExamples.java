class VariableExamples {   // class keyword with class name

    int id = 10;                 // Instance variable
    String name = "Jay";         // Instance variable
    int rollNo;                  // Instance variable

    static int age = 20;         // Static variable

    void display() {             // Method
        String status = "Active";   // Local variable

        // Printing instance and local variables
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Status: " + status);
    }

    public static void main(String args[]) {   // Main method

        VariableExamples var = new VariableExamples(); // Object creation

        var.rollNo = 20;     // Accessing instance variable using object
        var.display();       // Calling non-static method

        // Accessing static variable
        System.out.println("Age: " + age);
    }
}
