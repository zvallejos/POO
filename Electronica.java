public class Main {
    public static void main(String[] args) {

        Celular celular = new Celular("Samsung", "Galaxy S10", 8);
        Televisor televisor = new Televisor("TLC", "NoSeDeTeles10", 48);

        celular.mostrarInfo();
        System.out.println();
        televisor.mostrarInfo();
    }
}