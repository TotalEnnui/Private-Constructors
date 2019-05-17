public class SingleTonClass {
	// Static Class Reference

	private static int objCount = 0;
	private static SingleTonClass obj = null;

	private SingleTonClass() {
		/*
		 * Private Constructor will prevent the instantiation of this class directly
		 */
	}

	public static SingleTonClass objectCreationMethod() {

		if (objCount < 3) {
			obj = new SingleTonClass();
			objCount++;
			System.out.println(objCount);
		}
		return obj;
	}

	public void display() {
		System.out.println("Singleton class Example " + objCount);
	}

	public static void main(String args[]) {
		// Object cannot be created directly due to private constructor
		// This way it is forced to create object via our method where
		// we have logic for only one object creation
		SingleTonClass myobject = SingleTonClass.objectCreationMethod();
		myobject.display();
		SingleTonClass myobject2 = SingleTonClass.objectCreationMethod();
		myobject2.display();
		SingleTonClass myobject3 = SingleTonClass.objectCreationMethod();
		myobject3.display();
		SingleTonClass myobject4 = SingleTonClass.objectCreationMethod();
		myobject4.display();
		
	}
}
