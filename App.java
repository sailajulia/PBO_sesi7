public class App {
    public static void main(String[] args) {
        Mahasiswa<Integer> mhs1 = new Mahasiswa<Integer>("Budi", 12345);
        Mahasiswa<String> mhs2 = new Mahasiswa<String>("Budi", "12345");
        Mahasiswa<Double> mhs3 = new Mahasiswa<Double>("Budi", 12345.0);

        mhs1.info();
        mhs2.info();
        mhs3.info();

        Concatenation x = new Concatenation();
        x.add(1, "Budi");
        x.add(1, "Budi", "12345" );
        
    }
}