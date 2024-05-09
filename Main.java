import java.util.Scanner;

class Main{
   public static void main(String[] args) {
      Scanner op = new Scanner(System.in);

      Perro perro = new Perro();

      System.out.print("Deme el nombre del Perro: ");
      String name1 = op.nextLine();
      System.out.print("Deme el tipo de alimento: ");
      String alimento1 = op.nextLine();
      System.out.print("Deme su edad del Perro: ");
      int age1 = op.nextInt();
      System.out.print("Deme la raza: ");
      op.nextLine();
      String race1 = op.nextLine();

      perro.setNombre(name1);
      perro.setTipo_alimentacion(alimento1);
      perro.setEdad(age1);
      perro.setRaza(race1);

      Gato gato = new Gato();

      System.out.println("Deme el nombre del Gato: ");
      String name2 = op.nextLine();
      System.out.println("Deme el tipo de alimento: ");
      String alimento2 = op.nextLine();
      System.out.println("Deme su edad del gato: ");
      int age2 = op.nextInt();
      System.out.println("Deme la raza: ");
      String race2 = op.nextLine();

      gato.setNombre(name2);
      gato.setTipo_alimentacion(alimento2);
      gato.setEdad(age2);
      gato.setRaza(race2);

      perro.mostrar();
      System.out.println();
      gato.mostrar();
   }
}