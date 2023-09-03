package Flyweight.cliente;

import Flyweight.Jframe.EditorDeTextoJframe;
import Flyweight.fabrica.ICharFabrica;
import Flyweight.tipos.CharExtrinseco;

public interface IClienteEditorDeTextoFlyweight {
    public void escrever(String fonte, Integer tamanho, Integer estilo, char caractere);
}
