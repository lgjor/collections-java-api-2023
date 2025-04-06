package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributos
    private List<Integer> numeros;

    //Construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }


    public List<Integer> getNumeros() {
        return this.numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    //Métodos

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : this.numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = this.numeros.get(0);
        for (int numero : this.numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }   

    public int encontrarMenorNumero() {
        int menorNumero = this.numeros.get(0);
        for (int numero : this.numeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(this.numeros);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        System.out.println("Números adicionados: " + somaNumeros.getNumeros());
        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }   
}
