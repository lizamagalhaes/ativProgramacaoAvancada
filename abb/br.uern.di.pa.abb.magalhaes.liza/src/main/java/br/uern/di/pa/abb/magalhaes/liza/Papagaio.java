package br.uern.di.pa.abb.magalhaes.liza;

import br.uern.di.pa.abb.magalhaes.liza.Passaro;

public class Papagaio extends Passaro{
    private int distancia_maxima = 0;
    
    public Papagaio(int valor){
        this.distancia_maxima = valor;
    }
    
    @Override
    public void cantar(){
        System.out.println("Papagaio legal");
    }
    
    @Override
    public int voar(int valor){
        int distancia = 0;
        if (valor > this.distancia_maxima){
            distancia = this.distancia_maxima;
        }
        else{
            distancia = valor;
        }
        return distancia;
        }
    }