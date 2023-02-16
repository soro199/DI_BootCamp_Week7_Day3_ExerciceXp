package exercice1;

public class PrintArray {
	
	// définition de la méthode printArray
	public static void printArray(Object[] array) {
	    // boucle pour parcourir tous les éléments du tableau
	    for (Object element : array) {
	        // imprime chaque élément sur une nouvelle ligne
	        System.out.println(element);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// définition d'un tableau d'entiers
	    Integer[] intArray = {1, 2, 3, 4, 5};
	    // définition d'un tableau de chaînes de caractères
	    String[] stringArray = {"Hello", "World", "!"};

	    // affichage d'un message pour indiquer le début du tableau d'entiers
	    System.out.println("Integer Array:");
	    // appel de la méthode printArray pour imprimer le tableau d'entiers
	    printArray(intArray);

	    // affichage d'un message pour indiquer le début du tableau de chaînes de caractères
	    System.out.println("\nString Array:");
	    // appel de la méthode printArray pour imprimer le tableau de chaînes de caractères
	    printArray(stringArray);

	}

}
