import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AnalizaTurbinyGazowej extends JFrame  implements ActionListener {

    JLabel lT1, lP1, lFi, lNw, lP2, lP4, lT3, lWd, lNms, lNmt, lNit, lNis, lDaneWejsciowe, lDaneWyjsciowe, lN, lM, lV, lP, lNe, lT2, lT4, lQd;
    JTextField tT1, tP1, tFi, tNw, tP2, tP4, tT3, tWd, tNms, tNmt, tNit, tNis, tN, tM, tV, tP, tNe, tT2, tT4, tQd;
    JLabel kT1, kP1, kNw, kP2, kP4, kT3, kWd, kN, kM, kV, kP, kT2, kT4, kQd;
    JLabel nT1, nP1, nFi, nNw, nP2, nP4, nT3, nWd, nNms, nNmt, nNit, nNis, nN, nM, nV, nP, nNe, nT2, nT4, nQd;
    JButton bOblicz, bWyczysc, bprzykladowe;
    double p1, p2, p3, t1, t3, fi, nms, nmt, nit, nis, nw, t2, t4, mp, mg, x, xz, z, mieszanina, p4, t2s, t4s, mcpz, n, m, qd, vn, p, wd, ne, mcv;
    double norm = 22.42; //objętniość mola gazu doskonałego w warunkach normalnych ( T=273,15K, p=101325 Pa)
    double ps = 0.00316712; //ciśnienie nasycenia [Pa]
    double mcp2 = 29.1; // Właćciwa molowa pojemność cieplna dla gazów 2-atomowych
    double mcp3 = 33.3; // właściwa molowa pojemnośc ciepla dla gazów 3-atomowych
    double mi = 28.5478;
    double mr = 8.3147;



    public AnalizaTurbinyGazowej() {

        setSize(1000, 650);
        setTitle("Analiza turbiny gazowej");
        setLayout(null);

        lDaneWejsciowe = new JLabel("Dane wejściowe: ");
        lDaneWejsciowe.setBounds(10, 10, 150, 20);
        add(lDaneWejsciowe);

        lT1 = new JLabel("Temperatura: ");
        lT1.setBounds(20, 40, 150, 20);
        add(lT1);

        tT1 = new JTextField("");
        tT1.setBounds(50, 60, 80, 20);
        add(tT1);

        kT1 = new JLabel("K");
        kT1.setBounds(140, 60, 80, 20);
        add(kT1);

        nT1 = new JLabel("t1 ");
        nT1.setBounds(30, 60, 20, 20);
        add(nT1);


        lP1 = new JLabel("Ciśnienie: ");
        lP1.setBounds(20, 90, 150, 20);
        add(lP1);

        tP1 = new JTextField("");
        tP1.setBounds(50, 110, 80, 20);
        add(tP1);

        kP1 = new JLabel("MPa");
        kP1.setBounds(140, 110, 80, 20);
        add(kP1);

        nP1 = new JLabel("p1 ");
        nP1.setBounds(30, 110, 20, 20);
        add(nP1);

        lFi = new JLabel("Wilgotność powietrza: ");
        lFi.setBounds(20, 140, 150, 20);
        add(lFi);

        tFi = new JTextField("");
        tFi.setBounds(50, 160, 80, 20);
        add(tFi);

        nFi = new JLabel("φ ");
        nFi.setBounds(30, 160, 20, 20);
        add(nFi);

        lNw = new JLabel("Moc wentylatora: ");
        lNw.setBounds(20, 190, 150, 20);
        add(lNw);

        tNw = new JTextField("");
        tNw.setBounds(50, 210, 80, 20);
        add(tNw);

        kNw = new JLabel("kW");
        kNw.setBounds(140, 210, 80, 20);
        add(kNw);

        nNw = new JLabel("Nw ");
        nNw.setBounds(25, 210, 30, 20);
        add(nNw);

        lP2 = new JLabel("Ciśnienie: ");
        lP2.setBounds(230, 40, 150, 20);
        add(lP2);

        tP2 = new JTextField("");
        tP2.setBounds(260, 60, 80, 20);
        add(tP2);

        kP2 = new JLabel("MPa");
        kP2.setBounds(350, 60, 80, 20);
        add(kP2);

        nP2 = new JLabel("p2=p3 ");
        nP2.setBounds(220, 60, 50, 20);
        add(nP2);

        lP4 = new JLabel("Ciśnienie: ");
        lP4.setBounds(230, 90, 150, 20);
        add(lP4);

        tP4 = new JTextField("");
        tP4.setBounds(260, 110, 80, 20);
        add(tP4);

        kP4 = new JLabel("MPa");
        kP4.setBounds(350, 110, 80, 20);
        add(kP4);

        nP4 = new JLabel("p4 ");
        nP4.setBounds(240, 110, 20, 20);
        add(nP4);

        lT3 = new JLabel("Temperatura: ");
        lT3.setBounds(230, 140, 150, 20);
        add(lT3);

        tT3 = new JTextField("");
        tT3.setBounds(260, 160, 80, 20);
        add(tT3);

        kT3 = new JLabel("K");
        kT3.setBounds(350, 160, 80, 20);
        add(kT3);

        nT3 = new JLabel("T3 ");
        nT3.setBounds(240, 160, 20, 20);
        add(nT3);

        lWd = new JLabel("Wartość opałowa: ");
        lWd.setBounds(230, 190, 150, 20);
        add(lWd);

        tWd = new JTextField("");
        tWd.setBounds(260, 210, 80, 20);
        add(tWd);

        kWd = new JLabel("MJ/m3");
        kWd.setBounds(350, 210, 80, 20);
        add(kWd);

        nWd = new JLabel("Wd ");
        nWd.setBounds(235, 210, 30, 20);
        add(nWd);

        lNms = new JLabel("Sprawność mechaniczna sprężarki: ");
        lNms.setBounds(440, 40, 220, 20);
        add(lNms);

        tNms = new JTextField("");
        tNms.setBounds(470, 60, 80, 20);
        add(tNms);

        nNms = new JLabel("nms ");
        nNms.setBounds(440, 60, 50, 20);
        add(nNms);

        lNmt = new JLabel("Sprawność mechaniczna turbiny: ");
        lNmt.setBounds(440, 90, 210, 20);
        add(lNmt);

        tNmt = new JTextField("");
        tNmt.setBounds(470, 110, 80, 20);
        add(tNmt);

        nNmt = new JLabel("nmt ");
        nNmt.setBounds(440, 110, 30, 20);
        add(nNmt);

        lNit = new JLabel("Sprawnośc wewnętrzna turbiny: ");
        lNit.setBounds(440, 140, 210, 20);
        add(lNit);

        tNit = new JTextField("");
        tNit.setBounds(470, 160, 80, 20);
        add(tNit);

        nNit = new JLabel("nit ");
        nNit.setBounds(440, 160, 30, 20);
        add(nNit);

        lNis = new JLabel("Sprawność wewnętrzna sprężarki: ");
        lNis.setBounds(440, 190, 210, 20);
        add(lNis);

        tNis = new JTextField("");
        tNis.setBounds(470, 210, 80, 20);
        add(tNis);

        nNis = new JLabel("nis ");
        nNis.setBounds(440, 210, 30, 20);
        add(nNis);


        lDaneWyjsciowe = new JLabel("Dane wyjściowe: ");
        lDaneWyjsciowe.setBounds(730, 10, 150, 20);
        add(lDaneWyjsciowe);

        lN = new JLabel("Strumień molowy powietrza: ");
        lN.setBounds(740, 40, 200, 20);
        add(lN);

        tN = new JTextField("");
        tN.setBounds(770, 60, 80, 20);
        add(tN);

        kN = new JLabel("kmol/s");
        kN.setBounds(860, 60, 80, 20);
        add(kN);

        nN = new JLabel("n ");
        nN.setBounds(750, 60, 20, 20);
        add(nN);


        lM = new JLabel("Strumień masowy powietrza: ");
        lM.setBounds(740, 90, 200, 20);
        add(lM);

        tM = new JTextField("");
        tM.setBounds(770, 110, 80, 20);
        add(tM);

        kM = new JLabel("kg/s");
        kM.setBounds(860, 110, 80, 20);
        add(kM);

        nM = new JLabel("m ");
        nM.setBounds(750, 110, 20, 20);
        add(nM);

        lV = new JLabel("Strumień objętościowy powietrza: ");
        lV.setBounds(740, 140, 220, 20);
        add(lV);

        tV = new JTextField("");
        tV.setBounds(770, 160, 80, 20);
        add(tV);

        kV = new JLabel("m3");
        kV.setBounds(860, 160, 80, 20);
        add(kV);

        nV = new JLabel("V ");
        nV.setBounds(750, 160, 20, 20);
        add(nV);

        lP = new JLabel("Strumień paliwa: ");
        lP.setBounds(740, 190, 150, 20);
        add(lP);

        tP = new JTextField("");
        tP.setBounds(770, 210, 80, 20);
        add(tP);

        kP = new JLabel("m3/s");
        kP.setBounds(860, 210, 80, 20);
        add(kP);

        nP = new JLabel("p ");
        nP.setBounds(750, 210, 30, 20);
        add(nP);

        lNe = new JLabel("Sprawność układu: ");
        lNe.setBounds(740, 240, 150, 20);
        add(lNe);

        tNe = new JTextField("");
        tNe.setBounds(770, 260, 80, 20);
        add(tNe);

        nNe = new JLabel("ne ");
        nNe.setBounds(750, 260, 30, 20);
        add(nNe);

        lT2 = new JLabel("Temperatura: ");
        lT2.setBounds(740, 290, 150, 20);
        add(lT2);

        tT2 = new JTextField("");
        tT2.setBounds(770, 310, 80, 20);
        add(tT2);

        kT2 = new JLabel("K");
        kT2.setBounds(860, 310, 80, 20);
        add(kT2);

        nT2 = new JLabel("T2 ");
        nT2.setBounds(750, 310, 30, 20);
        add(nT2);

        lT4 = new JLabel("Temperatura: ");
        lT4.setBounds(740, 340, 150, 20);
        add(lT4);

        tT4 = new JTextField("");
        tT4.setBounds(770, 360, 80, 20);
        add(tT4);

        kT4 = new JLabel("K");
        kT4.setBounds(860, 360, 80, 20);
        add(kT4);

        nT4 = new JLabel("T4 ");
        nT4.setBounds(750, 360, 30, 20);
        add(nT4);

        lQd = new JLabel("Ciepło dostarczone: ");
        lQd.setBounds(740, 390, 150, 20);
        add(lQd);

        tQd = new JTextField("");
        tQd.setBounds(770, 410, 80, 20);
        add(tQd);

        kQd = new JLabel("MW");
        kQd.setBounds(860, 410, 80, 20);
        add(kQd);

        nQd = new JLabel("Qd ");
        nQd.setBounds(750, 410, 30, 20);
        add(nQd);

        bOblicz = new JButton("Oblicz");
        bOblicz.setBounds(770, 450, 80, 50);
        add(bOblicz);
        bOblicz.addActionListener(this);

        bWyczysc = new JButton("Wyczyść");
        bWyczysc.setBounds(700, 510, 100, 50);
        add(bWyczysc);
        bWyczysc.addActionListener(this);

        bprzykladowe = new JButton("Przykładowe");
        bprzykladowe.setBounds(820, 510, 110, 50);
        add(bprzykladowe);
        bprzykladowe.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo==bOblicz) {

            t1 = Double.parseDouble(tT1.getText());
            p1 = Double.parseDouble(tP1.getText());
            fi = Double.parseDouble(tFi.getText());
            nw = Double.parseDouble(tNw.getText());
            p2 = Double.parseDouble(tP2.getText());
            p3 = Double.parseDouble(tP2.getText());
            p4 = Double.parseDouble(tP4.getText());
            t3 = Double.parseDouble(tT3.getText());
            wd = Double.parseDouble(tWd.getText());
            nms = Double.parseDouble(tNms.getText());
            nmt = Double.parseDouble(tNmt.getText());
            nit = Double.parseDouble(tNit.getText());
            nis = Double.parseDouble(tNis.getText());


            //funkcja liczaca stopien zwilzenia
            mp = 18;
            mg = 28.84;
            x = (mp / mg) * ((fi * ps) / (p1 - (fi * ps)));
            xz = x * (1 / (mp / mg));
            mieszanina = 1 - z;

            //funkcja obliczajaca udzialy molowe pierwiastkow
            mcpz = (z * mcp3) + (mieszanina * mcp2);

            //kappa
            mcv = mcpz - mr;
            double kappa = mcpz / mcv;

            //funkcja licząca t2s
            double potega = Math.pow((p2 / p1), ((kappa - 1) / kappa));
            t2s = potega * t1;

            //funkcja liczaca t2
            t2 = t1 + ((t2s - t1) / nis);
            tT2.setText(String.format("%.2f", t2));

            //funkcja licząca t4s
            double potega2 = Math.pow((p4 / p3), ((kappa - 1) / kappa));
            t4s = potega2 * t3;

            //funkcja licząca t4
            t4 = -(nit * (t3 - t4s) - t3);
            tT4.setText(String.format("%.2f", t4));

            //strumień molowy
            n = nw / (nmt * mcpz * (t3 - t4 - t2 + t1));
            tN.setText(String.format("%.4f", n));

            //strumień masowy
            m = n * mi;
            tM.setText(String.format("%.3f", m));

            //strumień objętościowy
            vn = n * norm;
            tV.setText(String.format("%.3f", vn));

            //funkcja na ciepło
            qd = (n * mcpz * (t3 - t2)) / 0.9;
            tQd.setText(String.format("%.3f", qd));

            //strumień paliwa
            p = qd / wd;
            tP.setText(String.format("%.3f", p));

            //sprawność układu
            ne = nw / qd;
            tNe.setText(String.format("%.3f", ne));

        } else if (zrodlo==bWyczysc) {
            tT1.setText("");
            tFi.setText("");
            tP1.setText("");
            tNw.setText("");
            tP2.setText("");
            tP4.setText("");
            tT3.setText("");
            tWd.setText("");
            tNms.setText("");
            tNmt.setText("");
            tNit.setText("");
            tNis.setText("");
            tN.setText("");
            tM.setText("");
            tV.setText("");
            tP.setText("");
            tNe.setText("");
            tT2.setText("");
            tT4.setText("");
            tQd.setText("");
        } else if (zrodlo==bprzykladowe) {
            tT1.setText("298");
            tP1.setText("0.1");
            tFi.setText("0.7");
            tNw.setText("40");
            tP2.setText("1");
            tP4.setText("0.2");
            tT3.setText("1300");
            tWd.setText("40");
            tNms.setText("0.99");
            tNmt.setText("0.98");
            tNit.setText("0.95");
            tNis.setText("0.8");
        }
        

    }

    public static void main(String[] args) {

        AnalizaTurbinyGazowej aplication = new AnalizaTurbinyGazowej();
        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplication.setVisible(true);
    }
}

