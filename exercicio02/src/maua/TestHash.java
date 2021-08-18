package maua;

public class TestHash {
    public static void main(String[] args) {

        Integer[] tabKeys = new Integer[100];
        for(int i=1; i<tabKeys.length; i++){
            tabKeys[i] = i;
        }

        Integer hashCode, chave;
        SList[] tabHash = new SList[10];

        for(int i=1; i<tabKeys.length; i++){
            chave = tabKeys[i];
            hashCode = hash(chave);
            System.out.println("Chave = " + chave +
                    " mapeada para hascode = " + hashCode);
            if (tabHash[hashCode] == null ) {
                tabHash[hashCode] = new SList();
                tabHash[hashCode].InsereInicio(tabKeys[i]);
            }
            else {
                tabHash[hashCode].InsereInicio(tabKeys[i]);
                System.out.println("** Colisao no slot da Tabela Hash ** ");
                System.out.println("Chave " + tabKeys[i] +
                        " adicionada na lista ligada ...\n ");
            }
        }

        System.out.println("\nTabela HASH:");
        System.out.println("--------------------------");
        for(int i=0; i<tabHash.length; i++){
            if (tabHash[i] == null)
                System.out.println("Slot " + i + " ---> Valor nulo");
            else
                System.out.println("Slot" + i + " ---> " + tabHash[i].printLista());
        }
    }

    public static Integer hash(Integer key) {
        return (key % 10);
    }


}
