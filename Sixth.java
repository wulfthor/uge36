class Sixth {
  public static void main(String[] args) {
    /*
     * OPGAVE:
     * Et primtal er et positivt heltal større end 1, 
     * der ikke er deleligt med andre hele positive tal end 1 
     * og tallet selv,
     *
     * Brug modulo-operatoren, variablen startTal og System.out.println 
     * til at lave en test med et heltal mellem 2 og 20
     *
     * F.eks for tallet 5 skal programmet vise 
        Hvis mere end to af nedenstående udsagn er sande så er 5 ikke et primtal
        0=0
        1=0
        2=0
        1=0
        0=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
        5=0
     *
     */


    int startTal = 5;
    System.out.println("Hvis mere end to af nedenstående udsagn er sande så er " + startTal + " ikke et primtal");
    
    //TODO: 
    //System.out.println(0=0);

    //Løsning
    System.out.println(startTal%1+ "=0");
    System.out.println(startTal%2+ "=0");
    System.out.println(startTal%3+ "=0");
    System.out.println(startTal%4+ "=0");
    System.out.println(startTal%5+ "=0");
    System.out.println(startTal%6+ "=0");
    System.out.println(startTal%7+ "=0");
    System.out.println(startTal%8+ "=0");
    System.out.println(startTal%9+ "=0");
    System.out.println(startTal%10+ "=0");
    System.out.println(startTal%11+ "=0");
    System.out.println(startTal%12+ "=0");
    System.out.println(startTal%13+ "=0");
    System.out.println(startTal%14+ "=0");
    System.out.println(startTal%15+ "=0");
    System.out.println(startTal%16+ "=0");
    System.out.println(startTal%17+ "=0");
    System.out.println(startTal%18+ "=0");
    System.out.println(startTal%19+ "=0");
    System.out.println(startTal%20+ "=0");
  }
}
