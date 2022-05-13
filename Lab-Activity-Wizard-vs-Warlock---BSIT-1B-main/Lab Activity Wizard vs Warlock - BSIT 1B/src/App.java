public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Wizards and Warlocks");
        System.out.println("Both Fighter Have 200 HP and 200 Mana");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Porsha = new Wizard("Porsha");
        Warlock Yonah = new Warlock("Yonah");
        Porsha.MaleficGranade(Yonah);
        Porsha.VoidCatalyst(Yonah);
        Yonah.NilheimMist(Porsha);
        Porsha.BlazingHope(Yonah);
        Yonah.Ferocity(Porsha);
        Yonah.DragonicFlame(Yonah);
        Porsha.Vanguard(Porsha);
        Porsha.AdrenalineRush(Yonah);
        Yonah.TartarusChains(Porsha);
        Porsha.ProximaMidnight(Yonah);

    }
}

