import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Willian Kelvin
 */
public class Data extends JFrame {
    JLabel lnim,lnama,lmk1,lmk2,lnilai1,lnilai2;
    JTextField nim,nama,mk1,mk2,nilai1,nilai2;
    JButton convert;
  
    Convert_Rerata nilai = new Convert_Rerata(); //menginisialisasi objek dari kelas lain
    NilaiHuruf nilaii = new NilaiHuruf(); //menginisialisasi objek dari kelas lain
    
    public void DataNilai(){
        lnim = new JLabel("NIM");
        lnama = new JLabel("Nama");
        lmk1 = new JLabel("Mata Kuliah 1");
        lnilai1 = new JLabel("Nilai 1");
        lmk2 = new JLabel("Mata Kuliah 2");
        lnilai2 = new JLabel("Nilai 2");
        convert = new JButton("Convert");
        
        nim = new JTextField();
        nama = new JTextField();
        mk1 = new JTextField();
        mk2 = new JTextField();
        nilai1 = new JTextField();
        nilai2 = new JTextField();

        setLayout(null); // Membuat Layout GUI kosong
        setTitle("Hitung Nilai");
        add(lnim);
        add(lnama);
        add(lmk1);
        add(lnilai1);
        add(lmk2);
        add(lnilai2);
        add(nim);
        add(nama);
        add(mk1);
        add(nilai1);
        add(mk2);
        add(nilai2);
        add(convert);
        
        //mengatur tata letak form
        lnim.setBounds(100, 70, 130, 30);
        lnama.setBounds(100, 110, 130, 30);
        lmk1.setBounds(100, 150, 130, 30);
        lnilai1.setBounds(100, 190, 130, 30);
        lmk2.setBounds(100, 230, 130, 30);
        lnilai2.setBounds(100, 270, 130, 30);
        
        nim.setBounds(250, 80, 150, 20);
        nama.setBounds(250, 120, 150, 20);
        mk1.setBounds(250, 160, 150, 20);
        nilai1.setBounds(250, 200, 150, 20);
        mk2.setBounds(250, 240, 150, 20);
        nilai2.setBounds(250, 280, 150, 20);
        convert.setBounds(200, 310, 150, 20);

        setSize(600, 450); // ukuran GUI
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       convert.addActionListener(new java.awt.event.ActionListener() { //addActionListener berfungsi untuk reaksi setelah button tersebut di klik

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int a1 = Integer.parseInt(nim.getText()); 
                    String a2 = nama.getText();
                    String a3 = mk1.getText();
                    float a4 = Float.parseFloat(nilai1.getText());
                    String a5 = mk2.getText();
                    float a6 = Float.parseFloat(nilai2.getText());
                          
                    float ratarata = nilai.rerata(a4,a6); //melempar nilai parameter ke kelas Convert_rerata
                    String nilaihuruf = nilaii.Huruf(ratarata); //melempar nilai parameter ke kelas NilaiHuruf
                            
                    System.out.println("NIM             : "+a1);
                    System.out.println("Nama            : "+a2);
                    System.out.println("Mata Kuliah 1   : "+a3);
                    System.out.println("Mata Kuliah 2   : "+a5);
                    System.out.println("Rata - rata     : "+ratarata);
                    System.out.println("Nilai Huruf     : "+nilaihuruf);
                } catch (NumberFormatException ex) { //berfungsi untuk menangani ketika error input
                    JOptionPane.showMessageDialog(rootPane, "TIPE DATA SALAH"); // menampilkan pesan jika input yang dimasukkan tidak sesuai
                } catch (Error ext){
                    JOptionPane.showMessageDialog(rootPane, "SALAH");
                }
                
            }
        });
    }

}
