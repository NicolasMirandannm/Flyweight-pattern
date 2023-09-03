package Flyweight.fabrica;

import Flyweight.CharFlyweight;
import Flyweight.ICharFlyweight;
import Flyweight.tipos.CharIntrinseco;

import java.util.List;

public interface ICharFabrica {
    public ICharFlyweight fabricar(CharIntrinseco intrinseco);
    public List<CharFlyweight> getCaracteres();
}
