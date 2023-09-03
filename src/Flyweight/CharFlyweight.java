package Flyweight;

import Flyweight.Jframe.EditorDeTextoJframe;
import Flyweight.tipos.CharExtrinseco;
import Flyweight.tipos.CharIntrinseco;

public class CharFlyweight implements ICharFlyweight {
    private final CharIntrinseco parteIntrinseca;
    public CharFlyweight(CharIntrinseco parteIntrinseca) {
        this.parteIntrinseca = parteIntrinseca;
    }

    @Override
    public void escrever(CharExtrinseco parteExtrinseca, EditorDeTextoJframe jframe) {
        jframe.write(parteIntrinseca.fonte(), parteIntrinseca.tamanho(), parteIntrinseca.estilo(), parteExtrinseca.caractere());
    }

    public CharIntrinseco getParteIntrinseca() {
        return this.parteIntrinseca;
    }

}
