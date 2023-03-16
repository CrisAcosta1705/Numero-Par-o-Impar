package Par_o_Impar;
import java.util.Scanner;
public class Par_o_Impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecla = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese un numero al azar");
		numero = tecla.nextInt();
		
		if (numero%2==0) {
		System.out.println("Par");
		
		} else if (numero%1==0) {
		System.out.println("Impar");
	
				}
		}

}
