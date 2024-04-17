import java.util.HashSet;
import java.util.Scanner;

public class HackErrank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("dati numarul de elemente ");
		int Lenght = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("nume: ");
		HashSet <String> hSet = new HashSet <String>();
		
		for(int i = 0; i < Lenght; i++) {
			String pair = scanner.nextLine();
			hSet.add(pair);
			System.out.println("S-au gasit " + hSet.size() + " perechi");
			
		}
		scanner.close();
		} 

	}

