import java.util.Scanner; // Import the Scanner class

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, NIM, ps;

        System.out.println("==============Input=============");
        System.out.print("Isi nama: ");
        nama = in.nextLine();
        System.out.print("Isi NIM: ");
        NIM = in.nextLine();
        System.out.print("Isi Program Studi: ");
        ps = in.nextLine();

        System.out.println();
        System.out.println("===========Output===============");
        System.out.println("Hi " +nama+ ", Anda terdaftar dengan NIM: " +NIM+ "nim di Program Studi " +ps+ ".");
    }
}