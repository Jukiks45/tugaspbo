public class Beruang {
    
    public String nama;
    public int umur;
    public String spesies;
    public int berat; // Dalam kilogram
    public String habitat;

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Spesies: " + spesies);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Habitat: " + habitat);
    }
}
