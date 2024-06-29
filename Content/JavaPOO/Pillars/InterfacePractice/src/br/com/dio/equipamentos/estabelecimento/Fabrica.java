package br.com.dio.equipamentos.estabelecimento;

import br.com.dio.equipamentos.copiadora.Copiadora;
import br.com.dio.equipamentos.copiadora.Xerox;
import br.com.dio.equipamentos.digitalizadora.Digitalizadora;
import br.com.dio.equipamentos.digitalizadora.Scanner;
import br.com.dio.equipamentos.impressora.Deskjet;
import br.com.dio.equipamentos.impressora.Impressora;
import br.com.dio.equipamentos.impressora.Laserjet;
import br.com.dio.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

    public static void main(String[] args) {

        System.out.println("\n-------------IMPRESSORAS-------------");
        Impressora impressoraDeskjet = new Deskjet();
        impressoraDeskjet.imprimir();
        Impressora impressoraLaserjet = new Laserjet();
        impressoraLaserjet.imprimir();
        // Impressora impressoraMultifuncional = new EquipamentoMultifuncional();
        // impressoraMultifuncional.imprimir();

        System.out.println("\n-------------DIGITALIZADORAS-------------");
        Digitalizadora digitalizadoraScanner = new Scanner();
        digitalizadoraScanner.digitalizar();

        System.out.println("\n-------------COPIADORAS-------------");
        Copiadora copiadoraXerox = new Xerox();
        copiadoraXerox.copiar();

        System.out.println("\n-------------Equipamento Multifuncional-------------");
        EquipamentoMultifuncional multi = new EquipamentoMultifuncional();
        Impressora impressoraMulti = multi;
        Digitalizadora digitalizadoraMulti = multi;
        Copiadora copiadoraMulti = multi;
        impressoraMulti.imprimir();
        digitalizadoraMulti.digitalizar();;
        copiadoraMulti.copiar();;
    }
}
