package Flyweight.fabrica;

import Flyweight.CharFlyweight;
import Flyweight.ICharFlyweight;
import Flyweight.tipos.CharIntrinseco;

import java.util.HashMap;
import java.util.List;

public class CharFabrica implements ICharFabrica{
    private final HashMap<String, CharFlyweight> caracteres = new HashMap<>();

    @Override
    public ICharFlyweight fabricar(CharIntrinseco intrinseco) {
        var chave = intrinseco.gerarChave();

        if (!this.caracteres.containsKey(chave))
            this.caracteres.put(chave, new CharFlyweight(intrinseco));

        return this.caracteres.get(chave);
    }

    @Override
    public List<CharFlyweight> getCaracteres() {
        return this.caracteres.values().stream().toList();
    }
}
