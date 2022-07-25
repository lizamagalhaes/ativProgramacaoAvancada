package br.uern.di.pa.abb.magalhaes.liza;

import br.uern.di.pa.abb.magalhaes.liza.Ave;

public abstract class Passaro implements Ave{
    @Override
    public abstract void cantar();
    @Override
    public abstract int voar(int valor);
    }
