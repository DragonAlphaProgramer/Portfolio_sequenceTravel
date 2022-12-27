/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sequence;

import javax.swing.ImageIcon;

/**
 *
 * @author PatrykK
 */
class Karta {

    ImageIcon symbol;
    Specjalne specjal;
    Kolor kolor;
    Nominal nominal;

    enum Specjalne {
        Brak, Dzikun, rozbojnik
    }

    enum Kolor {
        Kier, Karo, Trefl, Pik
    }

    enum Nominal {
        Dwojka, Trojka, Czworka, Piatka, Szostka, Siodemka, Osemka, Dziewiatka,
        Dziesiatka, Walet, Dama, Krol, As
    }
    int[] kordy = new int[2];

    Karta(int pozycjaX, int pozycjaY, int nominałwe, int kolorwe, int specjalwe, ImageIcon imageIcon) {
        kordy[0] = pozycjaY;
        kordy[1] = pozycjaX;
        switch (nominałwe) {
            case 1:
                this.nominal = Nominal.As;
                break;
            case 2:
                this.nominal = Nominal.Dwojka;
                break;
            case 3:
                this.nominal = Nominal.Trojka;
                break;
            case 4:
                this.nominal = Nominal.Czworka;
                break;
            case 5:
                this.nominal = Nominal.Piatka;
                break;
            case 6:
                this.nominal = Nominal.Szostka;
                break;
            case 7:
                this.nominal = Nominal.Siodemka;
                break;
            case 8:
                this.nominal = Nominal.Osemka;
                break;
            case 9:
                this.nominal = Nominal.Dziewiatka;
                break;
            case 10:
                this.nominal = Nominal.Dziesiatka;
                break;
            case 11:
                this.nominal = Nominal.Walet;
                break;
            case 12:
                this.nominal = Nominal.Dama;
                break;
            case 13:
                this.nominal = Nominal.Krol;
                break;
        }
        switch (kolorwe) {
            case 1:
                this.kolor = Kolor.Kier;
                break;
            case 2:
                this.kolor = Kolor.Karo;
                break;
            case 3:
                this.kolor = Kolor.Trefl;
                break;
            case 4:
                this.kolor = Kolor.Pik;
                break;
        }
        switch (specjalwe) {
            case 0:
                this.specjal = Specjalne.Brak;
                break;
            case 1:
                this.specjal = Specjalne.Dzikun;
                break;
            case 2:
                this.specjal = Specjalne.rozbojnik;
                break;
        }
        symbol = imageIcon;
    }

    public ImageIcon getSymbol() {
        return symbol;
    }

    public Specjalne getSpecjal() {
        return specjal;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public Nominal getNominal() {
        return nominal;
    }

    public int[] getKordy() {
        return kordy;
    }

    @Override
    public String toString() {
        System.out.print("karta:");
        String wynikN = "", wynikK = "", wynikS = "";
        switch (this.nominal) {
            case As:
                wynikN = "As";
                break;
            case Dwojka:
                wynikN = "2";
                break;
            case Trojka:
                wynikN = "3";
                break;
            case Czworka:
                wynikN = "4";
                break;
            case Piatka:
                wynikN = "5";
                break;
            case Szostka:
                wynikN = "6";
                break;
            case Siodemka:
                wynikN = "7";
                break;
            case Osemka:
                wynikN = "8";
                break;
            case Dziewiatka:
                wynikN = "9";
                break;
            case Dziesiatka:
                wynikN = "10";
                break;
            case Walet:
                wynikN = "Walet";
                break;
            case Dama:
                wynikN = "Dama";
                break;
            case Krol:
                wynikN = "Król";
                break;
        }
        switch (kolor) {
            case Karo:
                wynikK = " Karo";
                break;
            case Kier:
                wynikK = " Kier";
                break;
            case Pik:
                wynikK = " Pik";
                break;
            case Trefl:
                wynikK = " Trefl";
                break;
        }
        switch (specjal) {
            case Brak:
                wynikS = " Zwykla";
                break;
            case Dzikun:
                wynikS = " Dziki";
                break;
            case rozbojnik:
                wynikS = " Rozbojnik";
                break;
        }
        return (wynikN + wynikK + wynikS);
    }
}
