public class array3{
    public static int[] rimuoviDuplicati(int[] array) {
        int lunghezzaArrayOriginale = array.length;

        if (lunghezzaArrayOriginale <= 1) {
            return array;
        }

        int contatoreUnici = 1;
        for (int i = 1; i < lunghezzaArrayOriginale; i++) {
            boolean duplicato = false;
            for (int j = 0; j < contatoreUnici; j++) {
                if (array[i] == array[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                array[contatoreUnici++] = array[i];
            }
        }

        int[] arraySenzaDuplicati = new int[contatoreUnici];
        System.arraycopy(array, 0, arraySenzaDuplicati, 0, contatoreUnici);

        return arraySenzaDuplicati;
    }

    public static void stampaArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arrayConDuplicati = {1, 2, 3, 2, 4, 5, 6, 1, 7, 2, 9, 4};

        int[] arraySenzaDuplicati = rimuoviDuplicati(arrayConDuplicati);

        System.out.print("Array originale: ");
        stampaArray(arrayConDuplicati);
        System.out.print("Array senza duplicati: ");
        stampaArray(arraySenzaDuplicati);
    }
}
