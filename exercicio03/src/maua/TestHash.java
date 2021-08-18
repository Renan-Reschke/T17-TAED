package maua;

public class TestHash {

    public static void main(String[] args) {
        Integer[] tabChaves = new Integer[]{23, 45, 77, 11, 33, 49, 10, 4, 89, 14};
        Integer[] tabhash = new Integer[10];

        Integer hashCode = null, chave, novaHash = null;
        for (int i=0; i<tabChaves.length; i++ ) {
            chave = tabChaves[i];
            hashCode = hash(chave);
            System.out.println("\nChave = " + chave +
                    " mapeada para hascode = " + hashCode);
            if (tabhash[hashCode] == null )
                tabhash[hashCode] = tabChaves[i];
            else {
                novaHash = rehashing(tabhash, hashCode);
                if(novaHash != null) {
                    tabhash[novaHash] = tabChaves[i];
                    System.out.println("** Colisao no slot da Tabela Hash ** ");
                    System.out.println("Chave " + tabChaves[i] +
                            " armazenada no indice " + novaHash + " ao inves de " + hashCode+"\n");
                }
                else
                    System.out.println("Nao foi encontrado espaço para armazenar a chave "+ tabChaves[i]+"\n");
            }
        }
    }

    public static Integer hash(Integer key) {
        return (key % 10);
    }

    public static Integer rehashing(Integer[] tabhash, Integer indice) {
        for (Integer i = indice + 1 ; i < tabhash.length ; i ++) {
            if (tabhash[i] == null )
                return i;
        }
        for (Integer i = 0 ; i < indice ; i++ ) {
            if (tabhash[i] == null )
                return i;
        }
        return null;
    }
}
