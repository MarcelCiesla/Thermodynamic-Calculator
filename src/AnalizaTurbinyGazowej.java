import javax.swing.*;

public class AnalizaTurbinyGazowej extends JFrame {

    public AnalizaTurbinyGazowej() {

        JLabel lT1, lP1, lFi, lNw, lP2, lP4, lT3, lWd, lNms, lNmt, lNit, lNis, lNk, lDaneWejsciowe;
        JTextField tT1, tP1, tFi, tNw, tP2, tP4, tT3, tWd, tNms, tNmt, tNit, tNis, tNk;
        JLabel kT1, kP1, kNw, kP2, kP4, kT3, kWd;
        JLabel nT1, nP1, nFi, nNw, nP2, nP4, nT3, nWd, nNms, nNmt, nNit, nNis, nNk;

        setSize(1000,500);
        setTitle("Analiza turbiny gazowej");
        setLayout(null);

        lDaneWejsciowe = new JLabel("Dane wejściowe: ");
        lDaneWejsciowe.setBounds(10,10,150,20);
        add(lDaneWejsciowe);

        lT1 = new JLabel("Temperatura: ");
        lT1.setBounds(20,40,150,20);
        add(lT1);

        tT1 = new JTextField("");
        tT1.setBounds(50,60,80,20);
        add(tT1);

        kT1 = new JLabel("K");
        kT1.setBounds(140,60,80,20);
        add(kT1);

        nT1 = new JLabel("t1 ");
        nT1.setBounds(30,60,20,20);
        add(nT1);


        lP1 = new JLabel("Ciśnienie: ");
        lP1.setBounds(20,90,150,20);
        add(lP1);

        tP1 = new JTextField("");
        tP1.setBounds(50,110,80,20);
        add(tP1);

        kP1 = new JLabel("MPa");
        kP1.setBounds(140,110,80,20);
        add(kP1);

        nP1 = new JLabel("p1 ");
        nP1.setBounds(30,110,20,20);
        add(nP1);

        lFi = new JLabel("Wilgotność powietrza: ");
        lFi.setBounds(20,140,150,20);
        add(lFi);

        tFi = new JTextField("");
        tFi.setBounds(50,160,80,20);
        add(tFi);

        nFi = new JLabel("φ ");
        nFi.setBounds(30,160,20,20);
        add(nFi);

        lNw = new JLabel("Moc wentylatora: ");
        lNw.setBounds(20,190,150,20);
        add(lNw);

        tNw = new JTextField("");
        tNw.setBounds(50,210,80,20);
        add(tNw);

        kNw = new JLabel("kW");
        kNw.setBounds(140,210,80,20);
        add(kNw);

        nNw = new JLabel("Nw ");
        nNw.setBounds(25,210,30,20);
        add(nNw);

        lP2 = new JLabel("Ciśnienie: ");
        lP2.setBounds(230,40,150,20);
        add(lP2);

        tP2 = new JTextField("");
        tP2.setBounds(260,60,80,20);
        add(tP2);

        kP2 = new JLabel("MPa");
        kP2.setBounds(350,60,80,20);
        add(kP2);

        nP2 = new JLabel("p2=p3 ");
        nP2.setBounds(220,60,50,20);
        add(nP2);

        lP4 = new JLabel("Ciśnienie: ");
        lP4.setBounds(230,90,150,20);
        add(lP4);

        tP4 = new JTextField("");
        tP4.setBounds(260,110,80,20);
        add(tP4);

        kP4 = new JLabel("MPa");
        kP4.setBounds(350,110,80,20);
        add(kP4);

        nP4 = new JLabel("p4 ");
        nP4.setBounds(240,110,20,20);
        add(nP4);

        lT3 = new JLabel("Temperatura: ");
        lT3.setBounds(230,140,150,20);
        add(lT3);

        tT3 = new JTextField("");
        tT3.setBounds(260,160,80,20);
        add(tT3);

        kT3 = new JLabel("K");
        kT3.setBounds(350,160,80,20);
        add(kT3);

        nT3 = new JLabel("T3 ");
        nT3.setBounds(240,160,20,20);
        add(nT3);

        lWd = new JLabel("Wartość opałowa: ");
        lWd.setBounds(230,190,150,20);
        add(lWd);

        tWd = new JTextField("");
        tWd.setBounds(260,210,80,20);
        add(tWd);

        kWd = new JLabel("MJ/m3");
        kWd.setBounds(350,210,80,20);
        add(kWd);

        nWd = new JLabel("Wd ");
        nWd.setBounds(235,210,30,20);
        add(nWd);

        lNms = new JLabel("Sprawność mechaniczna sprężarki: ");
        lNms.setBounds(440,40,220,20);
        add(lNms);

        tNms = new JTextField("");
        tNms.setBounds(470,60,80,20);
        add(tNms);

        nNms = new JLabel("nms ");
        nNms.setBounds(440,60,50,20);
        add(nNms);

        lNmt = new JLabel("Sprawność mechaniczna turbiny: ");
        lNmt.setBounds(440,90,210,20);
        add(lNmt);

        tNmt = new JTextField("");
        tNmt.setBounds(470,110,80,20);
        add(tNmt);

        nNmt = new JLabel("nmt ");
        nNmt.setBounds(440,110,30,20);
        add(nNmt);

        lNit = new JLabel("Sprawnośc wewnętrzna turbiny: ");
        lNit.setBounds(440,140,210,20);
        add(lNit);

        tNit = new JTextField("");
        tNit.setBounds(470,160,80,20);
        add(tNit);

        nNit = new JLabel("nit ");
        nNit.setBounds(440,160,30,20);
        add(nNit);

        lNis = new JLabel("Sprawność wewnętrzna sprężarki: ");
        lNis.setBounds(440,190,210,20);
        add(lNis);

        tNis = new JTextField("");
        tNis.setBounds(470,210,80,20);
        add(tNis);

        nNis = new JLabel("nis ");
        nNis.setBounds(440,210,30,20);
        add(nNis);

        lNk = new JLabel("Sprawność kotła: ");
        lNk.setBounds(230,240,150,20);
        add(lNk);

        tNk = new JTextField("");
        tNk.setBounds(260,260,80,20);
        add(tNk);

        nNk = new JLabel("nk ");
        nNk.setBounds(235,260,30,20);
        add(nNk);







    }

    public static void main(String[] args) {

        AnalizaTurbinyGazowej aplication = new AnalizaTurbinyGazowej();
        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplication.setVisible(true);
    }
}
