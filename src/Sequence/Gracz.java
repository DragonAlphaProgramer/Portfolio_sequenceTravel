package Sequence;

import java.awt.Color;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PatrykK
 */
class Gracz {

    private Color kolor;

    public Color getKolor() {
        return kolor;
    }

    public ArrayList<Karta> getReka() {
        return reka;
    }

    public void setReka(ArrayList<Karta> reka) {
        this.reka = reka;
    }
    public int sekwencje = 0;

    public int getIndeks() {
        return indeks;
    }

    public int getDruzyna() {
        return druzyna;
    }

    public int getSekwencje() {
        return sekwencje;
    }
    private final int indeks;
    private final int druzyna;
    private ArrayList<int[]> pola_sekwencji = new ArrayList<>();
    private ArrayList<int[]> pola_osadzone = new ArrayList<>();
    private ArrayList<Karta> reka = new ArrayList<>();

    Gracz(Color kolor, int indeks, int druzyna) {
        this.kolor = kolor;
        this.indeks = indeks;
        this.druzyna = druzyna;
    }

    void doloz(Karta k) {
        reka.add(k);
    }

    void zajmij_pole(int poziom, int pion, int[][] tablica) {
        int[] temp = new int[2];
        temp[1] = poziom;
        temp[0] = pion;
        pola_osadzone.add(temp);
        sekwencje = sekwencja(tablica);
        System.out.println(sekwencje);
    }

    void ofiara_rozbojnika(int poziom, int pion) {
        int i = 0;
        for (int[] pole : pola_osadzone) {
            if (pole[0] == poziom && pole[1] == pion) {
                if (element_sekwencji(poziom, pion) == false) {
                    pola_osadzone.remove(i);
                }
                break;
            }
            i++;
        }
    }

    public boolean element_sekwencji(int poziom, int pion) {
        for (int[] pole : pola_sekwencji) {
            if (pole[1] == poziom && pole[0] == pion) {
                return true;
            }
        }
        return false;
    }

    public int sekwencja(int[][] tablica) {
        boolean[][] tabela = new boolean[8][10];
        int ilosc_sekwencji = 0;
        pola_sekwencji.removeAll(pola_sekwencji);
        for (int[] pole : pola_osadzone) {
            tabela[pole[0] + 1][pole[1] + 1] = true;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablica[i][j] == this.getDruzyna()) {
                    tabela[i + 1][j + 1] = true;
                }
            }
        }

        int[] temp = new int[2];
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 9; j++) {

                if (i + 3 < 7) {
                    if ((tabela[i - 1][j] == false && tabela[i][j] == true && tabela[i + 1][j] == true && tabela[i + 2][j] == true && tabela[i + 3][j] == true && tabela[i + 4][j] == false)) {
                        ilosc_sekwencji = ilosc_sekwencji + 1;
                        System.out.print("++");
                        for (int x = 0; x < 4; x++) {
                            temp[1] = i + x - 1;
                            temp[0] = j - 1;
                            pola_sekwencji.add(temp);
                        }

                    }
                }
                if (j + 3 < 9) {
                    if (tabela[i][j] == true && tabela[i][j + 1] == true && tabela[i][j + 2] == true && tabela[i][j + 3] == true && tabela[i][j + 4] == false && tabela[i][j - 1] == false) {
                        ilosc_sekwencji = ilosc_sekwencji + 1;
                        for (int x = 0; x < 4; x++) {
                            temp[1] = i - 1;
                            temp[0] = j + x - 1;
                            pola_sekwencji.add(temp);
                        }
                        System.out.print("+-");
                    }
                }
                if (j + 3 < 9 && i + 3 < 7) {
                    if (tabela[i - 1][j - 1] == false && tabela[i][j] == true && tabela[i + 1][j + 1] == true && tabela[i + 2][j + 2] == true && tabela[i + 3][j + 3] == true && tabela[i + 4][j + 4] == false) {
                        ilosc_sekwencji = ilosc_sekwencji + 1;
                        for (int x = 0; x < 4; x++) {
                            temp[1] = i + x - 1;
                            temp[0] = j + x - 1;
                            pola_sekwencji.add(temp);
                        }
                        System.out.print("+>");
                    }
                }
                if (j + 3 < 9 && i + 3 < 7) {
                    if (tabela[i - 1][j + 4] == false && tabela[i][j + 3] == true && tabela[i + 1][j + 2] == true && tabela[i + 2][j + 1] == true && tabela[i + 3][j] == true && tabela[i + 4][j - 1] == false) {
                        ilosc_sekwencji = ilosc_sekwencji + 1;
                        for (int x = 0; x < 4; x++) {
                            temp[1] = i + x - 1;
                            temp[0] = j + (3 - x) - 1;
                            pola_sekwencji.add(temp);
                        }
                        System.out.print("+<");
                    }
                }
            }
        }
        System.out.println(ilosc_sekwencji);
        return ilosc_sekwencji;
    }
}
