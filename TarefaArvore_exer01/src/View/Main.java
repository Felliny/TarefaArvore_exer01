package View;

import Controller.Arvore01;

public class Main {
    public static void main(String[] args) {
        Arvore01 p= new Arvore01();
        int[] vetor= {33, 15, 41, 38, 47, 34, 49, 43};

        p.geraArvore(vetor);
    }
}
