package maua;

public class SList {

    private static class No{
        Integer conteudo;
        No proximo;

        public No(Integer conteudo){
            this.conteudo = conteudo;
            this.proximo = null;
        }

        public No getProximo(){
            return this.proximo;
        }

        public Integer getConteudo(){
            return this.conteudo;
        }
    }

    private Integer tamanho = 0;
    private No head = null;

    SList(){
    }

    public int tamanho(){
        return this.tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void InsereInicio(Integer key){
        if(this.tamanho == 0){
            No novoNo = new No(key);
            this.tamanho++;
            this.head = novoNo;
        } else{
            No novoNo = new No(key);
            novoNo.proximo = this.head;
            this.head = novoNo;
            this.tamanho++;
        }


    }

    public No getHead(){
        return this.head;
    }

    public String printLista(){
        String texto = "";
        if(!this.isEmpty()){
            No atual = this.head;
            texto += atual.getConteudo().toString();
            while(atual.proximo != null){
                atual = atual.proximo;
                texto += ", " + atual.getConteudo().toString();
            }
        }
        return texto;
    }
}
