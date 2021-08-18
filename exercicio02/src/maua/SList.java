package maua;

public class SList {
    private Integer conteudo;
    private SList proximo;

    SList(Integer conteudo){
        this.conteudo = conteudo;
        this.proximo = null;
    }
    public void InsereInicio(Integer key){
        this.proximo = new SList(this.conteudo);
        this.conteudo = key;
    }

    public Integer getConteudo(){
        return this.conteudo;
    }

    public SList getProximo(){
        return this.proximo;
    }

    static public String printLista(SList lista){
        String texto = "";
        SList atual = lista;
        texto += atual.getConteudo().toString();
        while(atual.proximo != null){
            atual = atual.proximo;
            texto += ", " + atual.getConteudo().toString();
        }
        return texto;
    }
}
