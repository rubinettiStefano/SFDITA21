void main() {

    int a = 10;//numero intero
    double b = 10.5;//numero con virgola
    char c = 'z';//singola lettera
    boolean t = true;//boolean = vero o falso
    boolean f = false;

    String s = "ciao mi chiamo Stefano";//TESTO


    //REGOLE PER LE ESPRESSIONI MATEMATICHE
    //numero intero +-/* numero intero -> int
    int div = 10/4;//questo fa 2, NON 2.5
    //int +-/* double -> double
    double div2 = 10/4.0;//double 2.5
    //i char sono strani, per ora non facciamo espressioni
    //i booleani hanno una loro algebra che affronteremo, non interagiscono tramite +-/*
    String testo1 = "ciao "+7;//espressione dove abbiamo + e prima/dopo una String
    //prende il nome di CONCATENAZIONE e da sempre una String come risulto
    //"ciao 7"
    String testo2 = "ciao "+7.2;//"ciao 7.2";
    String testo3 = "ciao "+false;//"ciao false"
    String testo4 = 7+" ciao";//"7 ciao"

    //le espressioni matematiche seguono ordine standard
    // da sinistra verso destra
    // prima moltiplicazioni/divisioni poi somme/sottrazioni

    double esp1 = 2.5+10/4;//4.5
    String esp2 = 2+3+" ciao";//"5 ciao"
    String esp3 = "ciao "+2+3;//"ciao 23"
    String esp4 = "ciao "+(2+3);//"ciao 5"

}