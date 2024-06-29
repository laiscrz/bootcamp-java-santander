package br.com.dio.equipamentos.multifuncional;

import br.com.dio.equipamentos.copiadora.Copiadora;
import br.com.dio.equipamentos.digitalizadora.Digitalizadora;
import br.com.dio.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Equipamento multifuncional: Copiando documento...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Equipamento multifuncional: Digitalizando documento...");
    }

    @Override
    public void imprimir() {
        System.out.println("Equipamento multifuncional: Imprimindo documento...");
    }
}
