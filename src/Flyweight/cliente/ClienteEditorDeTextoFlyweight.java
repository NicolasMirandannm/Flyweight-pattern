package Flyweight.cliente;

import Flyweight.Jframe.EditorDeTextoJframe;
import Flyweight.fabrica.ICharFabrica;
import Flyweight.tipos.CharExtrinseco;
import Flyweight.tipos.CharIntrinseco;

public class ClienteEditorDeTextoFlyweight implements IClienteEditorDeTextoFlyweight {
    private Integer tamanhoDoTexto = 0;
    public final ICharFabrica fabrica;
    private final EditorDeTextoJframe jframe;
    public ClienteEditorDeTextoFlyweight(ICharFabrica fabrica, EditorDeTextoJframe jframe) {
        this.jframe = jframe;
        this.fabrica = fabrica;
    }

    @Override
    public void escrever(String fonte, Integer tamanho, Integer estilo, char caractere) {

        var caractereFlyweight = fabrica.fabricar(new CharIntrinseco(fonte, tamanho, estilo));
        caractereFlyweight.escrever(new CharExtrinseco(tamanhoDoTexto++, caractere), jframe);

    }

}
