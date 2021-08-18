package maua;

public class SList {
    private Integer conteudo;
    private SList proximo;

    SList(Integer conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }
    private void addLast(Integer key){
        this.proximo = new SList(key);
    }
}
