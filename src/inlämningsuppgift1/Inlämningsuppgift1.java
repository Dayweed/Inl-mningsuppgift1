package inlämningsuppgift1; 

import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.*;

public class Inlämningsuppgift1 {
    public static void main(String[] args) {
        Inlämningsuppgift1 a = new Inlämningsuppgift1();			//Vi bryter ut oss ur den statiska metoden main.
    }
	public Inlämningsuppgift1(){
		String input = "";											//Variabel för användarinput.
		String listToString = "";									//Variabel för Lista med inlagda djur.
		int index = -1;												//Variabel för index i djurlistan. -1 som startvärde ifall djuret ej skulle finnas.
		IFood sixten = new Dog("Sixten", 5000.0);					//Skapande av djur objekt.
		IFood dogge = new Dog("Dogge", 10000.0);
		IFood ove = new Cat("Ove", 3000.0);
		IFood venus = new Cat("Venus", 5000.0);
		IFood hypno = new Snake("Hypno", 1000);
		
		List<IFood> animals = new ArrayList<>();					//Lista där alla djur läggs in.
		animals.add(sixten);
		animals.add(dogge);
		animals.add(ove);
		animals.add(venus);
		animals.add(hypno);
		
		for(IFood a : animals){									//Får alla djurnamn i listan som text.
			listToString += "- " + a.getName() + "\n";
		}
		while(true){																						//Loop så länge som användaren vill använda programmet.
			try{
				input = showInputDialog("Write the name of an animal to get daily food amount.");			//Input från användaren.
				for(int i = 0; i < animals.size(); i++){													//Hittar index i listan över det djur som sökes.
					if(input.equalsIgnoreCase(animals.get(i).getName()))
						index = i;																			//Lagrar index i variabel index.
				}
				if(index == -1)																				//Om index är -1(det vi initierade den med från början) så få upp felmeddelande.
					showMessageDialog(null, "There's no animal with that name.\nOr you can try again and check your spelling.\n"
							+ "The following animals are registered at HealthyPets:\n" + listToString);
				else{
					double food;										//Variabel för mängden mat som ska ges.
					showMessageDialog(null, animals.get(index).getName() + " should have " + animals.get(index).calculateFood() + "g " + animals.get(index).getFoodType() + ".");
					index = -1;
				}
			}
			catch(NullPointerException e){
				System.exit(0);
			}
		}
	}
}