class Main {
    public static void main(String[] args) {


        RPGCharacter Naruto = new RPGCharacter("Naruto", 1);
        RPGCharacter Sasuke = new RPGCharacter("Sasuke", 2);
        RPGCharacter Sakura = new RPGCharacter("Sakura", 3);


        Naruto.ShowStatus();
        Sasuke.ShowStatus();


        Naruto.equipSword();
        Naruto.ShowStatus();

        Naruto.Attack(Sasuke);

        Sasuke.equipShield();
        Sasuke.ShowStatus();
        Naruto.Attack(Sasuke);

        Sasuke.Attack(Naruto);


        Sakura.ShowStatus();
        Sakura.levelup();
        Sakura.levelup();
        Sakura.showSpeed();

        Sakura.equipSword();
        Sakura.showSpeed();

        Sakura.equipShield();
        Sakura.showSpeed();

        Sakura.ShowStatus();
        Sakura.SwordLevelUp();
        Sakura.showSpeed();
        Sakura.ShieldLevelUp();
        Sakura.showSpeed();

        Sakura.ShowStatus();


    }
}