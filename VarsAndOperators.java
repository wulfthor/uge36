class VarsAndOperators {
  public static void main(String[] args) {
    /*
     * FORMÅL:
     * Arbejde med udskrive variabler og aritmetik
     * (2.4 og 2.5)
     * Opgave 4) og 5) er et par "undringsopgaver" som
     * man kan give sig i kast med hvis man er færdig.
     *
     * OPGAVE:
     * 1)
     * Tildel flg variabler passende typer:
     * kundeNavn = "Kurt Verner"
     * kiloVægt = 75
     * meterHoejde = 1.75
     * gramVægt = <udregnes vha kiloVægt>
     *
     * Udskriv flg. linje:
     * Kære Kurt Verner. Din vægt i kg 75.0 svarer til 75000.0 gram. 
     *
     * 2)
     * Udregn BMI
     * Google formlen for BMI og udskriv flg. linje;
     * Kære Kurt Verner. Din BMI er 24.489795918367346
     *
     * 3)
     * Overvej hvordan du kan få printet følgende istedet (og kun vha kapitel 2)
     * Kære Kurt Verner. Din BMI er 24.489796
     *
     * 4)
     * Put flg. ind i main-metoden.Kompilér og kør programmet.
     *
     * char mystiskeA = '9';
     * char mystiskeB = '8';
     * System.out.println(mystiskeA + mystiskeB);
     * System.out.println(mystiskeA + kundeNavn + mystiskeB);
     *
     * 5)
     * Put nu flg. ind i main-metoden, kompilér og kør programmet.
     *
     * int mystiskeA = 9;
     * int mystiskeB = 8;
     * System.out.println(mystiskeA + mystiskeB);
     * System.out.println(mystiskeA + kundeNavn + mystiskeB);
     * 
     */
    //TODO:System.out.println("");

    String kundeNavn = "Kurt Verner";
    double kiloVaegt = 75.0;
    double meterHoej = 1.75;
    double gramVaegt = kiloVaegt * 1000;

    //Løsning
    double BMI = kiloVaegt/(meterHoej * meterHoej);

    System.out.println("Kære " + kundeNavn + ". Din vægt i kilo: " + kiloVaegt + " svarer til " + gramVaegt + " gram.");
    System.out.println("Kære " + kundeNavn + ". Din BMI er " + BMI + ".");
    float fkiloVaegt = 75.0f;
    float fmeterHoej = 1.75f;
    float fBMI = fkiloVaegt/(fmeterHoej * fmeterHoej);
    System.out.println("Kære " + kundeNavn + ". Din BMI er " + fBMI + ".");

    // Det er en tricky opgave som kun kan forklares hvis man inddrager
    // unicode decimal-værdier for 9 og 8. Men pointen er at vise at selv 
    // meget simple kombinationer af variabeltyper og operatorer kan vise
    // sig at give mystiske resultater.
    // Så man skal ikke gøre meget andet end køre koden og undre sig. 
    // Unicode kommer senere.
    //
    //int mystiskeA = 9;
    //int mystiskeB = 8;
    char mystiskeA = '9';
    char mystiskeB = '8';
    System.out.println(mystiskeA + mystiskeB + ": resultatet af " + mystiskeA + " + " + mystiskeB);
    System.out.println(mystiskeA + " plus " + mystiskeB + " = " +  mystiskeA + mystiskeB);
  }
}
