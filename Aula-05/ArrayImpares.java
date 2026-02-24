public class ArrayImpares {

    void main(){

        int[] vetorImpares = new int[100];

        int numero = 3; 

        for(int i=0; i<100; i++) {
            vetorImpares[i] = numero;
            numero+=2;
            IO.println(vetorImpares[i]);
        }
    }
}