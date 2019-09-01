class Fractions {
  public static void main(String[] args) {
    /*
     * FORMÅL:
     * Arbejde med variabler og aritmetik
     * (2.4 og 2.5) og afrundingsproblemer
     *
     * OPGAVE:
     * 1)
     * Brøkregning
     * Nedenfor er der noget kode der giver flg output:
     * "Brøken 1/3 giver som decimaltal: 0.3333333333333333"
     * Ændre koden så der kommer flg output:
     * "Brøken 1/7 giver som decimaltal: 0.14285714285714285"
     * "Brøken 1/10 giver som decimaltal: 0.1"
     *
     * 2)
     * læg decimaltallet sammen 10 gange, gem det i en variabel og udskriv variablen:
     * System.out.println("...<din sum variabel>....")
     *
     * 3)
     * gang decimaltallet med 10, gem det i en variabel og udskriv variablen:
     * System.out.println("...<din product variabel>....")
     *
     */

     double tæller = 1.0;
     double nævner = 3.0;
     int iTæller = 1;
     int iNævner = 3;
     double sum;
     double brøk = tæller/nævner;
     System.out.println("Brøken " + iTæller + "/" + iNævner + " giver som decimaltal: " + brøk); 

     // TODO
     // 1) prøv med nævner 7 og 10
     // 2) sum
     // 3) produkt
     // Løsning
     sum = brøk + brøk + brøk + brøk + brøk + brøk + brøk + brøk + brøk + brøk;
     System.out.println("og " + iTæller + "/" + iNævner + " summet 10 gange: " + sum);
     double produkt = brøk * 10;
     System.out.println("og " + iTæller + "/" + iNævner + " ganget med 10: " + produkt);
  }
}
