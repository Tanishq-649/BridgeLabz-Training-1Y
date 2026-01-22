class VariableExamples{ //class keyword with class example
		int id = 10;   //-------Instance Variable
		String name = "Tanishq"; //-------Instance Variable
		static int age = 19; // static variable
		
		void display(){ // Method
			String status = "Active"; // local variable
		System.out.println("Status: "+status); //printing statement
		}
		
		
		public static void main(String args[]){ // Main method
		
		VariableExamples var = new VariableExamples();
		var.display();
	}
}