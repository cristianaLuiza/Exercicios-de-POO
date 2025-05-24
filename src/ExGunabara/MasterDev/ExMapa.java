package ExGunabara.MasterDev;

import java.util.HashMap;
import java.util.Map;

public class ExMapa {
    public static void main(String[] args) {
        Map<Long, Pessoa> mapa = new HashMap<>();
        Pessoa joao =  new Pessoa(10,"joao");

        mapa.put(10L,joao);

      //  ExGunabara.Pessoa joao = mapa.get(10L);
    }
}
