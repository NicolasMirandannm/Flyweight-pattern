package Flyweight.tipos;

public record CharIntrinseco(String fonte, Integer tamanho, Integer estilo) {
    public String gerarChave() {
        return fonte.toLowerCase().replace("\\s", "_")
                +"_"
                +tamanho.toString().toLowerCase()
                +"_"+estilo.toString().toLowerCase();
    }
}

