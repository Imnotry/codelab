import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Tabung tabung = new Tabung(" tabung");
        Kubus kubus = new Kubus(" kubus");
        var balok = new Balok(" balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}




