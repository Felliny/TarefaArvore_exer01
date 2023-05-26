package Controller;

import model.Arvore;

public class Arvore01 {

    public Arvore01() {
        super();
    }

    public void geraArvore(int[] vetor){
        Arvore arvore= new Arvore();

        int tamanho= vetor.length;

        for (int i = 0; i < tamanho; i++) {
            arvore.insert(vetor[i]);
        }

        try {
            System.out.println("Prefix: ");
            arvore.prefixSearch();
            System.out.println("\n");
            System.out.println("Infix: ");
            arvore.infixSearch();
            System.out.println("\n");
            System.out.println("Posfix: ");
            arvore.postfixSearch();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
