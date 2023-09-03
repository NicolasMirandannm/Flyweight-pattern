import Flyweight.Jframe.EditorDeTextoJframe;
import Flyweight.cliente.ClienteEditorDeTextoFlyweight;
import Flyweight.fabrica.CharFabrica;

import java.awt.*;
import java.util.Random;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        var fontes = Stream.of(Font.MONOSPACED, Font.SANS_SERIF).toList();
        var estilos = Stream.of(Font.BOLD, Font.ITALIC).toList();
        var tamanhos = Stream.of(10,20).toList();

        var random = new Random();

        var fabricaDeCaracteres = new CharFabrica();
        var editorTextoJframe = new EditorDeTextoJframe();
        var consumidorEditorTexto = new ClienteEditorDeTextoFlyweight(fabricaDeCaracteres, editorTextoJframe);

        var textoTeste = "Flyweight é um design pattern do tipo estrutural que " +
                "visa uma manipulação de dados na memória mais eficiente quando " +
                "se trata de vários objetos que possuem informações repetidas.";

        for (char caractere : textoTeste.toCharArray()) {
            consumidorEditorTexto.escrever(
                    fontes.get(random.nextInt(fontes.size())),
                    tamanhos.get(random.nextInt(tamanhos.size())),
                    estilos.get(random.nextInt(estilos.size())),
                    caractere);
        }

        for (var intrinseco : consumidorEditorTexto.fabrica.getCaracteres()) {
            System.out.println(intrinseco.getParteIntrinseca().toString());
        }

    }
}
