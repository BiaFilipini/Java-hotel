package Hotel1;

import java.util.Scanner;

public class Gerencia {
    public static void main(String[] args) {
        HotelGeral hotel = new HotelGeral();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarQuarto(hotel, scanner);
                    break;
                case 2:
                    cadastrarReserva(hotel, scanner);
                    break;
                case 3:
                    realizarCheckOut(hotel, scanner);
                    break;
                case 4:
                    hotel.listarQuartos();
                    break;
                case 5:
                    hotel.listarReservas();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== Bem-vindo ao Hotel Coffee ===");
        System.out.println("=== O que deseja fazer: ===");
        System.out.println("1: Cadastrar Quarto");
        System.out.println("2: Cadastrar Reserva");
        System.out.println("3: Realizar Check-out");
        System.out.println("4: Listar Quartos");
        System.out.println("5: Listar Reservas");
        System.out.println("0: Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarQuarto(HotelGeral hotel, Scanner scanner) {
        System.out.print("Número do quarto: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Tipo do quarto: ");
        String tipo = scanner.nextLine();
        System.out.print("Preço diário: ");
        double preco = scanner.nextDouble();
        hotel.cadastrarQuarto(numero, tipo, preco);
    }

    private static void cadastrarReserva(HotelGeral hotel, Scanner scanner) {
        System.out.print("Nome do hóspede: ");
        String nome = scanner.nextLine();
        System.out.print("Número do quarto: ");
        int numQuarto = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Data de check-in (dd/mm/aaaa): ");
        String checkin = scanner.nextLine();
        System.out.print("Data de check-out (dd/mm/aaaa): ");
        String checkout = scanner.nextLine();
        hotel.cadastrarReserva(nome, numQuarto, checkin, checkout);
    }

    private static void realizarCheckOut(HotelGeral hotel, Scanner scanner) {
        System.out.print("Número do quarto para check-out: ");
        int quartoCheckout = scanner.nextInt();
        hotel.realizarCheckOut(quartoCheckout);
    }
}
