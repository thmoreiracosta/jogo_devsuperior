import java.util.Scanner;
public class Program {
	

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Champion c1 = new Champion();
		Champion c2 = new Champion();
		
		
		System.out.printf("Digite os dados do primeiro(a) lutador: \n");
		
		System.out.printf("Nome: ");
		c1.name = ler.next();
		System.out.printf("Vida inicial: ");
		c1.life = ler.nextInt();
		System.out.printf("Ataque: ");
		c1.attack = ler.nextInt();
		System.out.printf("Armadura: ");		
		c1.armor = ler.nextInt();
		
		System.out.printf("Digite os dados do segundo(a) lutador: \n");
		
		System.out.println("Nome: ");
		c2.name = ler.next();
		System.out.println("Vida inicial: ");
		c2.life = ler.nextInt();
		System.out.println("Ataque: ");
		c2.attack = ler.nextInt();
		System.out.println("Armadura: ");
		c2.armor = ler.nextInt();
		
		System.out.printf("Quantos round's você deseja executar? \n");
		int round = ler.nextInt();
		
		for(int i = 1; i<=round; ++i) {
			c1.takeDamage(c2);
			c2.takeDamage(c1);
			System.out.println("\nResultado do turno " + i + "\n");
			System.out.println(c1.name + " " + c1.life);
			System.out.println(c2.name + " " + c2.life + "\n");
		}
		
				
		System.out.println();		
		
		System.out.println("FIM DO COMBATE! \n");
		
		
		
		
	}

}
