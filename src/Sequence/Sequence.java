package Sequence;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author PatrykK
 */
public class Sequence extends javax.swing.JFrame {

    boolean kres=true;
    int akcja = 0;
    ArrayList<Karta> talia = new ArrayList<>();
    int[][] tablica = new int[6][8];
    int biezacy_gracz = 0;
    int reka, wygrana, druzyny;
    ArrayList<Gracz> gracze = new ArrayList<>();

    /**
     * Creates new form Sequence
     */
    public Sequence() {
        initComponents();
        Reka1.setEnabled(false);
        Reka2.setEnabled(false);
        Reka3.setEnabled(false);
        Reka4.setEnabled(false);
        Reka5.setEnabled(false);
        Reka6.setEnabled(false);
        Reka7.setEnabled(false);
        DwojkaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2P.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        TrojkaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3P.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        CzworkaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4P.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        PiatkaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5P.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        SzostkaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6P.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        SiodemkaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7P.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        OsemkaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8P.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DziewiatkaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9P.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DziesiatkaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TP.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DamaPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QP.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        KrolPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KP.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        AsPik.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AP.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DwojkaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2K.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        TrojkaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3K.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        CzworkaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4K.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        PiatkaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5K.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        SzostkaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6K.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        SiodemkaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7K.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        OsemkaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8K.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DziewiatkaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9K.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DziesiatkaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TK.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DamaKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QK.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        KrolKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KK.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        AsKier.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AK.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DwojkaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2C.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        TrojkaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3C.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        CzworkaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4C.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        PiatkaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5C.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        SzostkaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6C.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        SiodemkaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7C.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        OsemkaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8C.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DziewiatkaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9C.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DziesiatkaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TC.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DamaKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QC.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        KrolKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KC.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        AsKaro.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AC.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DwojkaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2T.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        TrojkaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3T.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        CzworkaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4T.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        PiatkaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5T.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        SzostkaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6T.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        SiodemkaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7T.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        OsemkaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8T.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DziewiatkaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9T.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DziesiatkaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TT.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        DamaTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QT.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        KrolTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KT.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        AsTrefl.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AT.png")).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH))));
        inicjuj_talie();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Start = new javax.swing.JButton();
        DwojkaPik = new javax.swing.JButton();
        TrojkaPik = new javax.swing.JButton();
        CzworkaPik = new javax.swing.JButton();
        PiatkaPik = new javax.swing.JButton();
        SzostkaPik = new javax.swing.JButton();
        SiodemkaPik = new javax.swing.JButton();
        OsemkaPik = new javax.swing.JButton();
        DziewiatkaPik = new javax.swing.JButton();
        AsKaro = new javax.swing.JButton();
        AsTrefl = new javax.swing.JButton();
        KrolTrefl = new javax.swing.JButton();
        DamaTrefl = new javax.swing.JButton();
        DziesiatkaTrefl = new javax.swing.JButton();
        DziewiatkaTrefl = new javax.swing.JButton();
        OsemkaTrefl = new javax.swing.JButton();
        DziesiatkaPik = new javax.swing.JButton();
        KrolKaro = new javax.swing.JButton();
        DziesiatkaKier = new javax.swing.JButton();
        DziewiatkaKier = new javax.swing.JButton();
        OsemkaKier = new javax.swing.JButton();
        SiodemkaKier = new javax.swing.JButton();
        SzostkaKier = new javax.swing.JButton();
        SiodemkaTrefl = new javax.swing.JButton();
        DamaPik = new javax.swing.JButton();
        DamaKaro = new javax.swing.JButton();
        DamaKier = new javax.swing.JButton();
        DwojkaKier = new javax.swing.JButton();
        TrojkaKier = new javax.swing.JButton();
        CzworkaKier = new javax.swing.JButton();
        PiatkaKier = new javax.swing.JButton();
        SzostkaTrefl = new javax.swing.JButton();
        KrolPik = new javax.swing.JButton();
        DziesiatkaKaro = new javax.swing.JButton();
        KrolKier = new javax.swing.JButton();
        AsKier = new javax.swing.JButton();
        DwojkaTrefl = new javax.swing.JButton();
        TrojkaTrefl = new javax.swing.JButton();
        CzworkaTrefl = new javax.swing.JButton();
        PiatkaTrefl = new javax.swing.JButton();
        AsPik = new javax.swing.JButton();
        DziewiatkaKaro = new javax.swing.JButton();
        OsemkaKaro = new javax.swing.JButton();
        SiodemkaKaro = new javax.swing.JButton();
        SzostkaKaro = new javax.swing.JButton();
        PiatkaKaro = new javax.swing.JButton();
        CzworkaKaro = new javax.swing.JButton();
        TrojkaKaro = new javax.swing.JButton();
        DwojkaKaro = new javax.swing.JButton();
        Reka1 = new javax.swing.JButton();
        Reka2 = new javax.swing.JButton();
        Reka3 = new javax.swing.JButton();
        Reka4 = new javax.swing.JButton();
        Reka5 = new javax.swing.JButton();
        Reka6 = new javax.swing.JButton();
        Reka7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Start.setText("Zacznij grę");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        DwojkaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        DwojkaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        DwojkaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        DwojkaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DwojkaPikActionPerformed(evt);
            }
        });

        TrojkaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        TrojkaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        TrojkaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        TrojkaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrojkaPikActionPerformed(evt);
            }
        });

        CzworkaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        CzworkaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        CzworkaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        CzworkaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CzworkaPikActionPerformed(evt);
            }
        });

        PiatkaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        PiatkaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        PiatkaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        PiatkaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiatkaPikActionPerformed(evt);
            }
        });

        SzostkaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        SzostkaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        SzostkaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        SzostkaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzostkaPikActionPerformed(evt);
            }
        });

        SiodemkaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        SiodemkaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        SiodemkaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        SiodemkaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiodemkaPikActionPerformed(evt);
            }
        });

        OsemkaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        OsemkaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        OsemkaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        OsemkaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OsemkaPikActionPerformed(evt);
            }
        });

        DziewiatkaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        DziewiatkaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        DziewiatkaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        DziewiatkaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DziewiatkaPikActionPerformed(evt);
            }
        });

        AsKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        AsKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        AsKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        AsKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsKaroActionPerformed(evt);
            }
        });

        AsTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        AsTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        AsTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        AsTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsTreflActionPerformed(evt);
            }
        });

        KrolTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        KrolTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        KrolTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        KrolTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrolTreflActionPerformed(evt);
            }
        });

        DamaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        DamaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        DamaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        DamaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DamaTreflActionPerformed(evt);
            }
        });

        DziesiatkaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        DziesiatkaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        DziesiatkaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        DziesiatkaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DziesiatkaTreflActionPerformed(evt);
            }
        });

        DziewiatkaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        DziewiatkaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        DziewiatkaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        DziewiatkaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DziewiatkaTreflActionPerformed(evt);
            }
        });

        OsemkaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        OsemkaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        OsemkaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        OsemkaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OsemkaTreflActionPerformed(evt);
            }
        });

        DziesiatkaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        DziesiatkaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        DziesiatkaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        DziesiatkaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DziesiatkaPikActionPerformed(evt);
            }
        });

        KrolKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        KrolKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        KrolKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        KrolKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrolKaroActionPerformed(evt);
            }
        });

        DziesiatkaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        DziesiatkaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        DziesiatkaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        DziesiatkaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DziesiatkaKierActionPerformed(evt);
            }
        });

        DziewiatkaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        DziewiatkaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        DziewiatkaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        DziewiatkaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DziewiatkaKierActionPerformed(evt);
            }
        });

        OsemkaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        OsemkaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        OsemkaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        OsemkaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OsemkaKierActionPerformed(evt);
            }
        });

        SiodemkaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        SiodemkaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        SiodemkaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        SiodemkaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiodemkaKierActionPerformed(evt);
            }
        });

        SzostkaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        SzostkaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        SzostkaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        SzostkaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzostkaKierActionPerformed(evt);
            }
        });

        SiodemkaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        SiodemkaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        SiodemkaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        SiodemkaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiodemkaTreflActionPerformed(evt);
            }
        });

        DamaPik.setMaximumSize(new java.awt.Dimension(90, 65));
        DamaPik.setMinimumSize(new java.awt.Dimension(90, 65));
        DamaPik.setPreferredSize(new java.awt.Dimension(90, 65));
        DamaPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DamaPikActionPerformed(evt);
            }
        });

        DamaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        DamaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        DamaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        DamaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DamaKaroActionPerformed(evt);
            }
        });

        DamaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        DamaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        DamaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        DamaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DamaKierActionPerformed(evt);
            }
        });

        DwojkaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        DwojkaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        DwojkaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        DwojkaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DwojkaKierActionPerformed(evt);
            }
        });

        TrojkaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        TrojkaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        TrojkaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        TrojkaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrojkaKierActionPerformed(evt);
            }
        });

        CzworkaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        CzworkaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        CzworkaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        CzworkaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CzworkaKierActionPerformed(evt);
            }
        });

        PiatkaKier.setMaximumSize(new java.awt.Dimension(90, 65));
        PiatkaKier.setMinimumSize(new java.awt.Dimension(90, 65));
        PiatkaKier.setPreferredSize(new java.awt.Dimension(90, 65));
        PiatkaKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiatkaKierActionPerformed(evt);
            }
        });

        SzostkaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        SzostkaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        SzostkaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        SzostkaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzostkaTreflActionPerformed(evt);
            }
        });

        KrolPik.setMaximumSize(new java.awt.Dimension(90, 65));
        KrolPik.setMinimumSize(new java.awt.Dimension(90, 65));
        KrolPik.setPreferredSize(new java.awt.Dimension(90, 65));
        KrolPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrolPikActionPerformed(evt);
            }
        });

        DziesiatkaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        DziesiatkaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        DziesiatkaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        DziesiatkaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DziesiatkaKaroActionPerformed(evt);
            }
        });

        KrolKier.setMaximumSize(new java.awt.Dimension(90, 65));
        KrolKier.setMinimumSize(new java.awt.Dimension(90, 65));
        KrolKier.setPreferredSize(new java.awt.Dimension(90, 65));
        KrolKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrolKierActionPerformed(evt);
            }
        });

        AsKier.setMaximumSize(new java.awt.Dimension(90, 65));
        AsKier.setMinimumSize(new java.awt.Dimension(90, 65));
        AsKier.setPreferredSize(new java.awt.Dimension(90, 65));
        AsKier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsKierActionPerformed(evt);
            }
        });

        DwojkaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        DwojkaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        DwojkaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        DwojkaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DwojkaTreflActionPerformed(evt);
            }
        });

        TrojkaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        TrojkaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        TrojkaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        TrojkaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrojkaTreflActionPerformed(evt);
            }
        });

        CzworkaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        CzworkaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        CzworkaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        CzworkaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CzworkaTreflActionPerformed(evt);
            }
        });

        PiatkaTrefl.setMaximumSize(new java.awt.Dimension(90, 65));
        PiatkaTrefl.setMinimumSize(new java.awt.Dimension(90, 65));
        PiatkaTrefl.setPreferredSize(new java.awt.Dimension(90, 65));
        PiatkaTrefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiatkaTreflActionPerformed(evt);
            }
        });

        AsPik.setMaximumSize(new java.awt.Dimension(90, 65));
        AsPik.setMinimumSize(new java.awt.Dimension(90, 65));
        AsPik.setPreferredSize(new java.awt.Dimension(90, 65));
        AsPik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsPikActionPerformed(evt);
            }
        });

        DziewiatkaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        DziewiatkaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        DziewiatkaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        DziewiatkaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DziewiatkaKaroActionPerformed(evt);
            }
        });

        OsemkaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        OsemkaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        OsemkaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        OsemkaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OsemkaKaroActionPerformed(evt);
            }
        });

        SiodemkaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        SiodemkaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        SiodemkaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        SiodemkaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiodemkaKaroActionPerformed(evt);
            }
        });

        SzostkaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        SzostkaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        SzostkaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        SzostkaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzostkaKaroActionPerformed(evt);
            }
        });

        PiatkaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        PiatkaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        PiatkaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        PiatkaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiatkaKaroActionPerformed(evt);
            }
        });

        CzworkaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        CzworkaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        CzworkaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        CzworkaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CzworkaKaroActionPerformed(evt);
            }
        });

        TrojkaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        TrojkaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        TrojkaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        TrojkaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrojkaKaroActionPerformed(evt);
            }
        });

        DwojkaKaro.setMaximumSize(new java.awt.Dimension(90, 65));
        DwojkaKaro.setMinimumSize(new java.awt.Dimension(90, 65));
        DwojkaKaro.setPreferredSize(new java.awt.Dimension(90, 65));
        DwojkaKaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DwojkaKaroActionPerformed(evt);
            }
        });

        Reka1.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka1.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka1.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka1ActionPerformed(evt);
            }
        });

        Reka2.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka2.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka2.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka2ActionPerformed(evt);
            }
        });

        Reka3.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka3.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka3.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka3ActionPerformed(evt);
            }
        });

        Reka4.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka4.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka4.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka4ActionPerformed(evt);
            }
        });

        Reka5.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka5.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka5.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka5ActionPerformed(evt);
            }
        });

        Reka6.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka6.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka6.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka6ActionPerformed(evt);
            }
        });

        Reka7.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka7.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka7.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DwojkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TrojkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CzworkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PiatkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SzostkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SiodemkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OsemkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DziewiatkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AsKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AsTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KrolTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DamaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DziesiatkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DziewiatkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OsemkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DziesiatkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(DziewiatkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(OsemkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SiodemkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SzostkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PiatkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CzworkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TrojkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DwojkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(DziesiatkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KrolKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AsKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DwojkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TrojkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CzworkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PiatkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AsPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DamaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DamaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DwojkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TrojkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CzworkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PiatkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SzostkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KrolPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(KrolKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DziesiatkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DziewiatkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OsemkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SiodemkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SzostkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SiodemkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DamaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Reka2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reka1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Start)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Reka3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Reka4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Reka5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Reka6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Reka7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TrojkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DwojkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CzworkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PiatkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SiodemkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SzostkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OsemkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DziewiatkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AsTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AsKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KrolTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DamaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DziewiatkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DziesiatkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OsemkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DziesiatkaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DziesiatkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KrolKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DziewiatkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OsemkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SzostkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SiodemkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SiodemkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DamaPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DamaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DamaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DwojkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TrojkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PiatkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CzworkaKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SzostkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KrolPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KrolKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DziesiatkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AsKier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DwojkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CzworkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TrojkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PiatkaTrefl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AsPik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OsemkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DziewiatkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SiodemkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SzostkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CzworkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PiatkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TrojkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DwojkaKaro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reka4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Reka1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reka2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reka3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reka6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reka5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Reka7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        gracze.removeAll(gracze);
        kres=false;
        inicjuj_talie();
        int indeks = 1;
        Collections.shuffle(talia);
        Collections.shuffle(talia);
        Collections.shuffle(talia);

        for (Karta k : talia) {
            System.out.println(k.toString() + " " + indeks);
            indeks++;
        }
        System.out.println("");
        Object[] opcje = {"2 graczy", "3 graczy", "2 drużyny po 2", "3 drużyny po 2"};
        int opcja = JOptionPane.showOptionDialog(rootPane, "Ilu ma byc graczy", "Nowa gra",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcje, null);
        int druzyna = 0;
        biezacy_gracz=0;
        int gracz = 0;
        switch (opcja) {
            case 0:
                druzyny = 2;
                gracz = 1;
                reka = 7;
                wygrana = 2;
                break;
            case 1:
                druzyny = 3;
                gracz = 1;
                reka = 6;
                wygrana = 1;
                break;
            case 2:
                druzyny = 2;
                gracz = 2;
                wygrana = 2;
                reka = 6;
                break;
            case 3:
                druzyny = 3;
                gracz = 2;
                wygrana = 1;
                reka = 5;
                break;
            default:
                druzyny = 2;
                gracz = 1;
                wygrana = 2;
                reka = 7;
                break;
        }
        for (int i = 0; i < gracz; i++) {
            for (int j = 0; j < druzyny; j++) {
                Color temp = null;
                if (i == 0) {
                    do {
                        temp = JColorChooser.showDialog(rootPane, "Wybierz kolor drużyny", Color.WHITE);
                    } while (temp == null);
                } else {
                    temp = this.gracze.get(gracz == 2 ? this.gracze.size() - 2 : this.gracze.size() - 3).getKolor();
                }
                this.gracze.add(new Gracz(temp, i + 1, j + 1));
            }
        }
        for (int i = 0; i < reka; i++) {
            for (Gracz g : gracze) {
                g.doloz(talia.get(talia.size() - 1));
                talia.remove(talia.size() - 1);
            }
        }
        Reka1.setEnabled(true);
        Reka2.setEnabled(true);
        Reka3.setEnabled(true);
        Reka4.setEnabled(true);
        Reka5.setEnabled(true);
        Reka6.setEnabled(true);
        Reka7.setEnabled(true);
        pokaz_karty(biezacy_gracz);
        for(int i =0;i<6;i++){
              for(int j =0;j<8;j++){
            tablica[i][j]=0;
        }
        }
        styl();
    }//GEN-LAST:event_StartActionPerformed

    private void Reka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka2ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(1), 1);
        }
    }//GEN-LAST:event_Reka2ActionPerformed

    private void Reka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka1ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(0), 0);
        }
    }//GEN-LAST:event_Reka1ActionPerformed

    private void Reka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka3ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(2), 2);
        }
    }//GEN-LAST:event_Reka3ActionPerformed

    private void Reka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka4ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(3), 3);
        }
    }//GEN-LAST:event_Reka4ActionPerformed

    private void Reka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka6ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(5), 5);
        }
    }//GEN-LAST:event_Reka6ActionPerformed

    private void Reka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka5ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(4), 4);
        }
    }//GEN-LAST:event_Reka5ActionPerformed

    private void Reka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka7ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(6), 6);
        }
    }//GEN-LAST:event_Reka7ActionPerformed

    private void DziewiatkaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DziewiatkaKaroActionPerformed
        wykonaj_akcje(5, 0);
    }//GEN-LAST:event_DziewiatkaKaroActionPerformed

    private void OsemkaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OsemkaKaroActionPerformed
        wykonaj_akcje(5, 1);
    }//GEN-LAST:event_OsemkaKaroActionPerformed

    private void SiodemkaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiodemkaKaroActionPerformed
        wykonaj_akcje(5, 2);
    }//GEN-LAST:event_SiodemkaKaroActionPerformed

    private void SzostkaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzostkaKaroActionPerformed
        wykonaj_akcje(5, 3);
    }//GEN-LAST:event_SzostkaKaroActionPerformed

    private void PiatkaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiatkaKaroActionPerformed
        wykonaj_akcje(5, 4);
    }//GEN-LAST:event_PiatkaKaroActionPerformed

    private void CzworkaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CzworkaKaroActionPerformed
        wykonaj_akcje(5, 5);
    }//GEN-LAST:event_CzworkaKaroActionPerformed

    private void TrojkaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrojkaKaroActionPerformed
        wykonaj_akcje(5, 6);
    }//GEN-LAST:event_TrojkaKaroActionPerformed

    private void DwojkaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DwojkaKaroActionPerformed
        wykonaj_akcje(5, 7);
    }//GEN-LAST:event_DwojkaKaroActionPerformed

    private void AsPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsPikActionPerformed
        wykonaj_akcje(4, 7);
    }//GEN-LAST:event_AsPikActionPerformed

    private void PiatkaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiatkaTreflActionPerformed
        wykonaj_akcje(4, 6);
    }//GEN-LAST:event_PiatkaTreflActionPerformed

    private void CzworkaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CzworkaTreflActionPerformed
        wykonaj_akcje(4, 5);
    }//GEN-LAST:event_CzworkaTreflActionPerformed

    private void TrojkaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrojkaTreflActionPerformed
        wykonaj_akcje(4, 4);
    }//GEN-LAST:event_TrojkaTreflActionPerformed

    private void DwojkaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DwojkaTreflActionPerformed
        wykonaj_akcje(4, 3);
    }//GEN-LAST:event_DwojkaTreflActionPerformed

    private void AsKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsKierActionPerformed
        wykonaj_akcje(4, 2);
    }//GEN-LAST:event_AsKierActionPerformed

    private void KrolKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrolKierActionPerformed
        wykonaj_akcje(4, 1);
    }//GEN-LAST:event_KrolKierActionPerformed

    private void DziesiatkaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DziesiatkaKaroActionPerformed
        wykonaj_akcje(4, 0);
    }//GEN-LAST:event_DziesiatkaKaroActionPerformed

    private void DamaKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamaKaroActionPerformed
        wykonaj_akcje(3, 0);
    }//GEN-LAST:event_DamaKaroActionPerformed

    private void DamaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamaKierActionPerformed
        wykonaj_akcje(3, 1);
    }//GEN-LAST:event_DamaKierActionPerformed

    private void DwojkaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DwojkaKierActionPerformed
        wykonaj_akcje(3, 2);
    }//GEN-LAST:event_DwojkaKierActionPerformed

    private void TrojkaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrojkaKierActionPerformed
        wykonaj_akcje(3, 3);
    }//GEN-LAST:event_TrojkaKierActionPerformed

    private void CzworkaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CzworkaKierActionPerformed
        wykonaj_akcje(3, 4);
    }//GEN-LAST:event_CzworkaKierActionPerformed

    private void PiatkaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiatkaKierActionPerformed
        wykonaj_akcje(3, 5);
    }//GEN-LAST:event_PiatkaKierActionPerformed

    private void SzostkaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzostkaTreflActionPerformed
        wykonaj_akcje(3, 6);
    }//GEN-LAST:event_SzostkaTreflActionPerformed

    private void KrolPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrolPikActionPerformed
        wykonaj_akcje(3, 7);
    }//GEN-LAST:event_KrolPikActionPerformed

    private void DamaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamaPikActionPerformed
        wykonaj_akcje(3, 7);
    }//GEN-LAST:event_DamaPikActionPerformed

    private void SiodemkaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiodemkaTreflActionPerformed
        wykonaj_akcje(2, 6);
    }//GEN-LAST:event_SiodemkaTreflActionPerformed

    private void SzostkaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzostkaKierActionPerformed
        wykonaj_akcje(2, 5);
    }//GEN-LAST:event_SzostkaKierActionPerformed

    private void SiodemkaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiodemkaKierActionPerformed
        wykonaj_akcje(2, 4);
    }//GEN-LAST:event_SiodemkaKierActionPerformed

    private void OsemkaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OsemkaKierActionPerformed
        wykonaj_akcje(2, 3);
    }//GEN-LAST:event_OsemkaKierActionPerformed

    private void DziewiatkaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DziewiatkaKierActionPerformed
        wykonaj_akcje(2, 2);
    }//GEN-LAST:event_DziewiatkaKierActionPerformed

    private void DziesiatkaKierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DziesiatkaKierActionPerformed
        wykonaj_akcje(2, 1);
    }//GEN-LAST:event_DziesiatkaKierActionPerformed

    private void KrolKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrolKaroActionPerformed
        wykonaj_akcje(2, 0);
    }//GEN-LAST:event_KrolKaroActionPerformed

    private void DziesiatkaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DziesiatkaPikActionPerformed
        wykonaj_akcje(1, 7);
    }//GEN-LAST:event_DziesiatkaPikActionPerformed

    private void OsemkaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OsemkaTreflActionPerformed
        wykonaj_akcje(1, 6);
    }//GEN-LAST:event_OsemkaTreflActionPerformed

    private void DziewiatkaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DziewiatkaTreflActionPerformed
        wykonaj_akcje(1, 5);
    }//GEN-LAST:event_DziewiatkaTreflActionPerformed

    private void DziesiatkaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DziesiatkaTreflActionPerformed
        wykonaj_akcje(1, 4);
    }//GEN-LAST:event_DziesiatkaTreflActionPerformed

    private void DamaTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamaTreflActionPerformed
        wykonaj_akcje(1, 3);
    }//GEN-LAST:event_DamaTreflActionPerformed

    private void KrolTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrolTreflActionPerformed
        wykonaj_akcje(1, 2);
    }//GEN-LAST:event_KrolTreflActionPerformed

    private void AsTreflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsTreflActionPerformed
        wykonaj_akcje(1, 1);
    }//GEN-LAST:event_AsTreflActionPerformed

    private void AsKaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsKaroActionPerformed
        wykonaj_akcje(1, 0);
    }//GEN-LAST:event_AsKaroActionPerformed

    private void DziewiatkaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DziewiatkaPikActionPerformed
        wykonaj_akcje(0, 7);
    }//GEN-LAST:event_DziewiatkaPikActionPerformed

    private void OsemkaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OsemkaPikActionPerformed
        wykonaj_akcje(0, 6);
    }//GEN-LAST:event_OsemkaPikActionPerformed

    private void SiodemkaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiodemkaPikActionPerformed
        wykonaj_akcje(0, 5);
    }//GEN-LAST:event_SiodemkaPikActionPerformed

    private void SzostkaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzostkaPikActionPerformed
        wykonaj_akcje(0, 4);
    }//GEN-LAST:event_SzostkaPikActionPerformed

    private void PiatkaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiatkaPikActionPerformed
        wykonaj_akcje(0, 3);
    }//GEN-LAST:event_PiatkaPikActionPerformed

    private void CzworkaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CzworkaPikActionPerformed
        wykonaj_akcje(0, 2);
    }//GEN-LAST:event_CzworkaPikActionPerformed

    private void TrojkaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrojkaPikActionPerformed
        wykonaj_akcje(0, 1);
    }//GEN-LAST:event_TrojkaPikActionPerformed

    private void DwojkaPikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DwojkaPikActionPerformed
        wykonaj_akcje(0, 0);
    }//GEN-LAST:event_DwojkaPikActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sequence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Sequence().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsKaro;
    private javax.swing.JButton AsKier;
    private javax.swing.JButton AsPik;
    private javax.swing.JButton AsTrefl;
    private javax.swing.JButton CzworkaKaro;
    private javax.swing.JButton CzworkaKier;
    private javax.swing.JButton CzworkaPik;
    private javax.swing.JButton CzworkaTrefl;
    private javax.swing.JButton DamaKaro;
    private javax.swing.JButton DamaKier;
    private javax.swing.JButton DamaPik;
    private javax.swing.JButton DamaTrefl;
    private javax.swing.JButton DwojkaKaro;
    private javax.swing.JButton DwojkaKier;
    private javax.swing.JButton DwojkaPik;
    private javax.swing.JButton DwojkaTrefl;
    private javax.swing.JButton DziesiatkaKaro;
    private javax.swing.JButton DziesiatkaKier;
    private javax.swing.JButton DziesiatkaPik;
    private javax.swing.JButton DziesiatkaTrefl;
    private javax.swing.JButton DziewiatkaKaro;
    private javax.swing.JButton DziewiatkaKier;
    private javax.swing.JButton DziewiatkaPik;
    private javax.swing.JButton DziewiatkaTrefl;
    private javax.swing.JButton KrolKaro;
    private javax.swing.JButton KrolKier;
    private javax.swing.JButton KrolPik;
    private javax.swing.JButton KrolTrefl;
    private javax.swing.JButton OsemkaKaro;
    private javax.swing.JButton OsemkaKier;
    private javax.swing.JButton OsemkaPik;
    private javax.swing.JButton OsemkaTrefl;
    private javax.swing.JButton PiatkaKaro;
    private javax.swing.JButton PiatkaKier;
    private javax.swing.JButton PiatkaPik;
    private javax.swing.JButton PiatkaTrefl;
    private javax.swing.JButton Reka1;
    private javax.swing.JButton Reka2;
    private javax.swing.JButton Reka3;
    private javax.swing.JButton Reka4;
    private javax.swing.JButton Reka5;
    private javax.swing.JButton Reka6;
    private javax.swing.JButton Reka7;
    private javax.swing.JButton SiodemkaKaro;
    private javax.swing.JButton SiodemkaKier;
    private javax.swing.JButton SiodemkaPik;
    private javax.swing.JButton SiodemkaTrefl;
    private javax.swing.JButton Start;
    private javax.swing.JButton SzostkaKaro;
    private javax.swing.JButton SzostkaKier;
    private javax.swing.JButton SzostkaPik;
    private javax.swing.JButton SzostkaTrefl;
    private javax.swing.JButton TrojkaKaro;
    private javax.swing.JButton TrojkaKier;
    private javax.swing.JButton TrojkaPik;
    private javax.swing.JButton TrojkaTrefl;
    // End of variables declaration//GEN-END:variables

    private void pokaz_karty(int biezacy_gracz) {
        for (Karta k : gracze.get(biezacy_gracz).getReka()) {
            System.out.println(k);
        }
        Reka6.setVisible(reka > 5);
        Reka7.setVisible(reka > 5 && reka == 7);
        Reka1.setIcon((gracze.get(biezacy_gracz).getReka().size()>=1)?(new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(0).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))):null);
        Reka2.setIcon((gracze.get(biezacy_gracz).getReka().size()>=2)?(new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(1).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))):null);
        Reka3.setIcon((gracze.get(biezacy_gracz).getReka().size()>=3)?(new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(2).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))):null);
        Reka4.setIcon((gracze.get(biezacy_gracz).getReka().size()>=4)?(new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(3).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))):null);
        Reka5.setIcon((gracze.get(biezacy_gracz).getReka().size()>=5)?(new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(4).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))):null);
        Reka6.setIcon((reka > 5&&gracze.get(biezacy_gracz).getReka().size()>=6) ? (new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(5).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))) : null);
        Reka7.setIcon((reka > 5 && reka == 7&&gracze.get(biezacy_gracz).getReka().size()==7) ? (new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(6).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))) : null);
    }

    private void inicjuj_talie() {
        talia.removeAll(talia);
        talia.add(new Karta(1, 1, 2, 4, 0, new ImageIcon(this.getClass().getResource("2P.png"))));
        talia.add(new Karta(1, 2, 3, 4, 0, new ImageIcon(this.getClass().getResource("3P.png"))));
        talia.add(new Karta(1, 3, 4, 4, 0, new ImageIcon(this.getClass().getResource("4P.png"))));
        talia.add(new Karta(1, 4, 5, 4, 0, new ImageIcon(this.getClass().getResource("5P.png"))));
        talia.add(new Karta(1, 5, 6, 4, 0, new ImageIcon(this.getClass().getResource("6P.png"))));
        talia.add(new Karta(1, 6, 7, 4, 0, new ImageIcon(this.getClass().getResource("7P.png"))));
        talia.add(new Karta(1, 7, 8, 4, 0, new ImageIcon(this.getClass().getResource("8P.png"))));
        talia.add(new Karta(1, 8, 9, 4, 0, new ImageIcon(this.getClass().getResource("9P.png"))));
        talia.add(new Karta(2, 1, 1, 2, 0, new ImageIcon(this.getClass().getResource("AC.png"))));
        talia.add(new Karta(2, 2, 1, 3, 0, new ImageIcon(this.getClass().getResource("AT.png"))));
        talia.add(new Karta(2, 3, 13, 3, 0, new ImageIcon(this.getClass().getResource("KT.png"))));
        talia.add(new Karta(2, 4, 12, 3, 0, new ImageIcon(this.getClass().getResource("QT.png"))));
        talia.add(new Karta(2, 5, 10, 3, 0, new ImageIcon(this.getClass().getResource("TT.png"))));
        talia.add(new Karta(2, 6, 9, 3, 0, new ImageIcon(this.getClass().getResource("9T.png"))));
        talia.add(new Karta(2, 7, 8, 3, 0, new ImageIcon(this.getClass().getResource("8T.png"))));
        talia.add(new Karta(2, 8, 10, 4, 0, new ImageIcon(this.getClass().getResource("TP.png"))));
        talia.add(new Karta(3, 1, 13, 2, 0, new ImageIcon(this.getClass().getResource("KC.png"))));
        talia.add(new Karta(3, 2, 10, 1, 0, new ImageIcon(this.getClass().getResource("TK.png"))));
        talia.add(new Karta(3, 3, 9, 1, 0, new ImageIcon(this.getClass().getResource("9K.png"))));
        talia.add(new Karta(3, 4, 8, 1, 0, new ImageIcon(this.getClass().getResource("8K.png"))));
        talia.add(new Karta(3, 5, 7, 1, 0, new ImageIcon(this.getClass().getResource("7K.png"))));
        talia.add(new Karta(3, 6, 6, 1, 0, new ImageIcon(this.getClass().getResource("6K.png"))));
        talia.add(new Karta(3, 7, 7, 3, 0, new ImageIcon(this.getClass().getResource("7T.png"))));
        talia.add(new Karta(3, 8, 12, 4, 0, new ImageIcon(this.getClass().getResource("QP.png"))));
        talia.add(new Karta(4, 1, 12, 2, 0, new ImageIcon(this.getClass().getResource("QC.png"))));
        talia.add(new Karta(4, 2, 12, 1, 0, new ImageIcon(this.getClass().getResource("QK.png"))));
        talia.add(new Karta(4, 3, 2, 1, 0, new ImageIcon(this.getClass().getResource("2K.png"))));
        talia.add(new Karta(4, 4, 3, 1, 0, new ImageIcon(this.getClass().getResource("3K.png"))));
        talia.add(new Karta(4, 5, 4, 1, 0, new ImageIcon(this.getClass().getResource("4K.png"))));
        talia.add(new Karta(4, 6, 5, 1, 0, new ImageIcon(this.getClass().getResource("5K.png"))));
        talia.add(new Karta(4, 7, 6, 3, 0, new ImageIcon(this.getClass().getResource("6T.png"))));
        talia.add(new Karta(4, 8, 13, 4, 0, new ImageIcon(this.getClass().getResource("KP.png"))));
        talia.add(new Karta(5, 1, 10, 2, 0, new ImageIcon(this.getClass().getResource("TC.png"))));
        talia.add(new Karta(5, 2, 13, 1, 0, new ImageIcon(this.getClass().getResource("KK.png"))));
        talia.add(new Karta(5, 3, 1, 1, 0, new ImageIcon(this.getClass().getResource("AK.png"))));
        talia.add(new Karta(5, 4, 2, 3, 0, new ImageIcon(this.getClass().getResource("2T.png"))));
        talia.add(new Karta(5, 5, 3, 3, 0, new ImageIcon(this.getClass().getResource("3T.png"))));
        talia.add(new Karta(5, 6, 4, 3, 0, new ImageIcon(this.getClass().getResource("4T.png"))));
        talia.add(new Karta(5, 7, 5, 3, 0, new ImageIcon(this.getClass().getResource("5T.png"))));
        talia.add(new Karta(5, 8, 1, 4, 0, new ImageIcon(this.getClass().getResource("AP.png"))));
        talia.add(new Karta(6, 1, 9, 2, 0, new ImageIcon(this.getClass().getResource("9C.png"))));
        talia.add(new Karta(6, 2, 8, 2, 0, new ImageIcon(this.getClass().getResource("8C.png"))));
        talia.add(new Karta(6, 3, 7, 2, 0, new ImageIcon(this.getClass().getResource("7C.png"))));
        talia.add(new Karta(6, 4, 6, 2, 0, new ImageIcon(this.getClass().getResource("6C.png"))));
        talia.add(new Karta(6, 5, 5, 2, 0, new ImageIcon(this.getClass().getResource("5C.png"))));
        talia.add(new Karta(6, 6, 4, 2, 0, new ImageIcon(this.getClass().getResource("4C.png"))));
        talia.add(new Karta(6, 7, 3, 2, 0, new ImageIcon(this.getClass().getResource("3C.png"))));
        talia.add(new Karta(6, 8, 2, 2, 0, new ImageIcon(this.getClass().getResource("2C.png"))));
        talia.add(new Karta(0, 0, 11, 2, 1, new ImageIcon(this.getClass().getResource("JC.png"))));
        talia.add(new Karta(0, 0, 11, 1, 2, new ImageIcon(this.getClass().getResource("JK.png"))));
        talia.add(new Karta(0, 0, 11, 4, 2, new ImageIcon(this.getClass().getResource("JP.png"))));
        talia.add(new Karta(0, 0, 11, 3, 1, new ImageIcon(this.getClass().getResource("JT.png"))));
    }

    private void zagraj(Karta karta, int zagrane) {
        if(kres==false){
        gracze.get(biezacy_gracz).getReka().remove(zagrane);
        if (talia.size() > 0) {
            gracze.get(biezacy_gracz).getReka().add(talia.get(talia.size() - 1));
            talia.remove(talia.size() - 1);
        }
        switch (karta.specjal) {
            case Brak:
                if (tablica[karta.kordy[1] - 1][karta.kordy[0] - 1] == 0) {
                    gracze.get(biezacy_gracz).zajmij_pole(karta.kordy[0] - 1, karta.kordy[1] - 1, tablica);
                    tablica[karta.kordy[1] - 1][karta.kordy[0] - 1] = gracze.get(biezacy_gracz).getDruzyna();
                    styl();
                    int sekewncje = 0;
                    sekewncje = gracze.get(biezacy_gracz).sekwencja(tablica);
                    
                    if (sekewncje == wygrana) {
                        JOptionPane.showMessageDialog(rootPane, "Koniec gry\n"
                                + "wygrała rużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        kres=true;
                    } else {
                        biezacy_gracz = biezacy_gracz + 1;
                        if (biezacy_gracz == gracze.size()) {
                            biezacy_gracz = 0;
                        }

                        Reka1.setIcon(null);
                        Reka2.setIcon(null);
                        Reka3.setIcon(null);
                        Reka4.setIcon(null);
                        Reka5.setIcon(null);
                        Reka6.setIcon(null);
                        Reka7.setIcon(null);
                        JOptionPane.showMessageDialog(rootPane, "Kolej gracza " + gracze.get(biezacy_gracz).getIndeks() + "\n"
                                + "Drużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        pokaz_karty(biezacy_gracz);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "To pole jest już zagrane. Zagraj inną kartę");
                }
                break;
            case Dzikun:
                akcja = 2;
                JOptionPane.showMessageDialog(rootPane, "Ten walet ma zabójczy wzrok i może zająć dowolne wolne miejsce\n"
                        + "Kilknij na tablicy kartę, gdzie chcesz dołożyc żeton");
                break;
            case rozbojnik:
                akcja = 1;
                JOptionPane.showMessageDialog(rootPane, "Walety z jednym okiem mogą skasować dowolny niewchodzący w sekwencje żeton\n"
                        + "Kilknij na tablicy kartę, gdzie chcesz usunąć żeton rywala");
                break;
        }
        }
    }

    private void wykonaj_akcje(int poziom, int pion) {
        switch (akcja) {
            case 0:
                break;
            case 2:
                if (tablica[poziom][pion] == 0) {
                    akcja = 0;
                    gracze.get(biezacy_gracz).zajmij_pole(pion, poziom, tablica);
                    tablica[poziom][pion] = gracze.get(biezacy_gracz).getDruzyna();
                    styl();
                    int sekewncje = 0;
                    sekewncje = gracze.get(biezacy_gracz).sekwencja(tablica);
                    if (sekewncje == wygrana) {
                        JOptionPane.showMessageDialog(rootPane, "Koniec gry\n"
                                + "wygrała rużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        kres=true;
                    } else {
                        biezacy_gracz++;
                        if (biezacy_gracz == gracze.size()) {
                            biezacy_gracz = 0;
                        }
                        Reka1.setIcon(null);
                        Reka2.setIcon(null);
                        Reka3.setIcon(null);
                        Reka4.setIcon(null);
                        Reka5.setIcon(null);
                        Reka6.setIcon(null);
                        Reka7.setIcon(null);
                        JOptionPane.showMessageDialog(rootPane, "Kolej gracza " + gracze.get(biezacy_gracz).getIndeks() + "\n"
                                + "Drużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        pokaz_karty(biezacy_gracz);
                    }

                }
                break;
            case 1:
                if (tablica[poziom][pion] != gracze.get(biezacy_gracz).getDruzyna() && tablica[poziom][pion] != 0) {
                    boolean element = false;
                    for (Gracz g : gracze) {
                        if (g.element_sekwencji(poziom, pion)==true) {
                            element = true;
                            break;
                        }
                    }
                    if (element == false) {
                        akcja = 0;

                        for (Gracz g : gracze) {
                            if (g.getDruzyna() == tablica[poziom][pion]) {
                                g.ofiara_rozbojnika(poziom, pion);
                            }
                        }
                        tablica[poziom][pion] = 0;
                        biezacy_gracz++;
                        if (biezacy_gracz == gracze.size()) {
                            biezacy_gracz = 0;
                        }
                        Reka1.setIcon(null);
                        Reka2.setIcon(null);
                        Reka3.setIcon(null);
                        Reka4.setIcon(null);
                        Reka5.setIcon(null);
                        Reka6.setIcon(null);
                        Reka7.setIcon(null);
                        styl();

                        JOptionPane.showMessageDialog(rootPane, "Kolej gracza " + gracze.get(biezacy_gracz).getIndeks() + "\n"
                                + "Drużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        pokaz_karty(biezacy_gracz);

                    }else{
                         JOptionPane.showMessageDialog(rootPane, "Nie można rozbijać gotowej sekwencji. Skasuj coś innego");
                    }
                }
                break;
        }
    }

    private void styl() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                switch (tablica[i][j]) {
                    case 0:
                        dopasuj_przycisk(i, j).setBorder(null);
                        break;
                    case 1:
                        dopasuj_przycisk(i, j).setBorder(new LineBorder(gracze.get(0).getKolor(), 4));
                        break;
                    case 2:
                        dopasuj_przycisk(i, j).setBorder(new LineBorder(gracze.get(1).getKolor(), 4));
                        break;
                    case 3:
                        dopasuj_przycisk(i, j).setBorder(new LineBorder(gracze.get(2).getKolor(), 4));
                        break;
                }
            }
        }
    }

    private JButton dopasuj_przycisk(int i, int j) {
        switch (i) {
            case 0:
                switch (j) {
                    case 0:
                        return DwojkaPik;
                    case 1:
                        return TrojkaPik;
                    case 2:
                        return CzworkaPik;
                    case 3:
                        return PiatkaPik;
                    case 4:
                        return SzostkaPik;
                    case 5:
                        return SiodemkaPik;
                    case 6:
                        return OsemkaPik;
                    case 7:
                        return DziewiatkaPik;
                }
                break;
            case 1:
                switch (j) {
                    case 0:
                        return AsKaro;
                    case 1:
                        return AsTrefl;
                    case 2:
                        return KrolTrefl;
                    case 3:
                        return DamaTrefl;
                    case 4:
                        return DziesiatkaTrefl;
                    case 5:
                        return DziewiatkaTrefl;
                    case 6:
                        return OsemkaTrefl;
                    case 7:
                        return DziesiatkaPik;
                }
                break;
            case 2:
                switch (j) {
                    case 0:
                        return KrolKaro;
                    case 1:
                        return DziesiatkaKier;
                    case 2:
                        return DziewiatkaKier;
                    case 3:
                        return OsemkaKier;
                    case 4:
                        return SiodemkaKier;
                    case 5:
                        return SzostkaKier;
                    case 6:
                        return SiodemkaTrefl;
                    case 7:
                        return DamaPik;
                }
                break;
            case 3:
                switch (j) {
                    case 0:
                        return DamaKaro;
                    case 1:
                        return DamaKier;
                    case 2:
                        return DwojkaKier;
                    case 3:
                        return TrojkaKier;
                    case 4:
                        return CzworkaKier;
                    case 5:
                        return PiatkaKier;
                    case 6:
                        return SzostkaTrefl;
                    case 7:
                        return KrolPik;
                }
                break;
            case 4:
                switch (j) {
                    case 0:
                        return DziesiatkaKaro;
                    case 1:
                        return KrolKier;
                    case 2:
                        return AsKier;
                    case 3:
                        return DwojkaTrefl;
                    case 4:
                        return TrojkaTrefl;
                    case 5:
                        return CzworkaTrefl;
                    case 6:
                        return PiatkaTrefl;
                    case 7:
                        return AsPik;
                }
                break;
            case 5:
                switch (j) {
                    case 0:
                        return DziewiatkaKaro;
                    case 1:
                        return OsemkaKaro;
                    case 2:
                        return SiodemkaKaro;
                    case 3:
                        return SzostkaKaro;
                    case 4:
                        return PiatkaKaro;
                    case 5:
                        return CzworkaKaro;
                    case 6:
                        return TrojkaKaro;
                    case 7:
                        return DwojkaKaro;
                }
                break;
        }
        return null;
    }
}
