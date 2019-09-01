class Escape {
  public static void main(String[] args) {
    /*
     * FORMÅL:
     * At øve sig i at escape karakterer (kap 1.7)
     *
     * OPGAVE:
     * Brug println og escape karakteren for at printe flg:
     * 1)
     * "Mange gange skal man ta' sig "sammen""
     * "for at kunne skrive backslash \"
     *
     * 2)
     * "Skriver du \"\" får du en tom besked"
     *
     * 3)
     * "public class Hello {
     * "        public static main(String[] args)
     * "        {
     * "          System.out.println("Hej Verden");
     * "        }
     * "}
     *
     */

    //Løsning
    //
    //1)
    System.out.println("Mange gange skal man ta' sig \"sammen\"");
    System.out.println("for at kunne skrive backslash \\");
    //2)
    System.out.println("Skriver du \\\"\\\" får du en tom besked");
    //3)
    System.out.println("public class Hello {");
    System.out.println("\tpublic static void main(String[] args)");
    System.out.println("\t{");
    System.out.println("\t\tSystem.out.println(\"Hej Verden\");");
    System.out.println("\t}");
    System.out.println("}");

  }
}
