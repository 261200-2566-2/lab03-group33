/*
# Lab3 - Object Oriented Programming

* RPGCharacter.java

  * Instance Variables

    * `private String name` - เก็บชื่อของ Character นั้นๆ
    * `private int maxHP` - Health Power สูงสุดที่สามารถเป็นไปได้
    * `private int maxMana` - Mana สูงสุดที่สามารถเป็นไปได้
    * `private int currentHP` - Health Power ณ ขณะเวลาหนึ่ง
    * `private int currentMana` - Mana ณ ขณะเวลาหนึ่ง
    * `private int level` - ระดับของ Character, สามารถนําค่านั้ไปคํานวณค่าอย่างอื่นได้เช่น Speed
    * `Sword mySword` - ไว้เก็บ Sword ของ RPGCharacter นั้นๆ
    * `Shield myShield` - ไว้เก็บ Shield ของ RPGCharacter นั้นๆ
    * `private double baseRunSpeed` - Speed เริ่มต้นที่ยังไม่ได้คํานวณจากตัวแปลอื่นเลย
    * `private boolean isEquipSword` - ไว้เก็บค่า boolean ว่ามี Sword ไหม
    * `private boolean isEquipShield` - ไว้เก็บค่า boolean ว่ามี Shield ไหม
    * `private double cachedRunSpeed` - ไว้เก็บค่า Speed ที่คํานวณมาเรียบร้อยแล้วจากการ modify ค่าต่างๆ ของ Character นั้น โดยถ้า levelUp(),unequipSword(),equipSword(),equipShield(),unequipShield() จะทําการ set ค่า cachedRunSpeed เป็น 0 เพื่อคํานวณ speed ใหม่

  * Instance Methods

    * `public String getName()` - เป็น getter เพื่อ return name
    * `public int getCurrentHP()` - เป็น getter เพื่อ return currentHP
    * `public int getCurrentMana()` - เป็น getter เพื่อ return currentMana
    * `public void ShowStatus()` - print สถานะของ RPGCharacter ได้แก่ค่า level,currentHP,currentMana,runspeed ส่วนถ้า RPGCharacter นั้นมีดาบหรือโล่ก็จะแสดง type,level,damage ของดาบ
    * `public void levelup()` - ใช้ method นี้เพื่อ levelup ได้ โดยจะเพิ่ม level ขึ้น 1 ระดับ และจะแสดงสถานะต่างๆ ของ RPGCharacter เมื่อ level up
    * `public void Attack(RPGCharacter Target)` - ใช้โจมตีคู่ต่อสู้โดยมี input เป็น RPGCharacter แล้วจะไปทําการลด HP ของคู่ต่อสู่
    * `public void equipSword(String type, int level)` - เป็น method ที่จะสร้าง Sword ให้ใหม่หากยังไม่มี Sword เลย และ haveSword จะเป็น true และ print ว่า equip แล้ว แต่ถ้า มี Sword แล้ว จะ print ว่ามี Sword แล้ว
    * `public void unequipSword()` - เป็น method ที่จะ set haveShield เป็น false หากมี Sword และถ้ายังไม่มีก็จะ print ว่าไม่สามารถ unequip ได้
    * `public void equipShield(String type, int level)` - เป็น method ที่จะสร้าง Shield ให้ใหม่หากยังไม่มี Shield เลย และ haveShield จะเป็น true และ print ว่า equip แล้ว แต่ถ้า มี Shield แล้ว จะ print ว่ามี Shield แล้ว
    * `public void unequipShield()` - เป็น method ที่จะ set haveShield เป็น false หากมี Shield และถ้ายังไม่มีก็จะ print ว่าไม่สามารถ unequip ได้
    * `public void SwordLevelUp()` - หากตัวละครสวมใส่ดาบ ก็จะทำการเพิ่มเวลของดาบที่ตัวละครสวมใส่อยู่ขึ้น 1 และทำการ คำนวณ speed ของตัวละครใหม่
    * `public void ShieldLevelUp()` - หากตัวละครสวมใส่โล่ ก็จะทำการเพิ่มเวลของดาบที่ตัวละครสวมใส่อยู่ขึ้น 1
และทำการ คำนวณ speed ของตัวละครใหม่
    * `public double getRunSpeed()` - คํานวณค่าความเร็วที่คํานวณทุกอย่างหมดแล้ว
    * `private void calculateAndCacheRunSpeed()` - คํานวณค่าความเร็วโดยจะลบความเร็วถ้ามีดาบหรือโล่แค่ครั้งแรกของก็เรียกใช้เพื่อไม่ให้มันลบทุกครั้งตอนเรียก โดยมี cachedRunSpeed มาควบคุม
    * `private double calculateShieldSpeedDecrease()` - คํานวณค่าความเร็วที่จะต้องลบออกจากความเร็วจากการใช้ Shield
    * `private double calculateSwordSpeedDecrease()` - คํานวณค่าความเร็วที่จะต้องลบออกจากความเร็วจากการใช้ Sword



* Sword.java

  * Instance Variables

    * `private String type` - ชนิดของ Sword
    * `private int level` - ระดับของ Sword
    * `private int baseDamage` - Damage เริ่มต้นที่ยังไม่ได้คํานวณจาก variable อื่นเลย
  * Instance Methods

    * `public String getType()` - getter เพื่อ return type ของ Sword
    * `public int getLevel()`- getter เพื่อ return level ของ Sword
    * `public int getDamage()` - getter เพื่อ return damage ของ Sword

* Shield.java

  * Instance Variables

    * `private String type` - ชนิดของ Shield
    * `private int level` - ระดับของ Shield
    * `private int baseDefense` - Damage เริ่มต้นที่ยังไม่ได้คํานวณจาก variable อื่นเลย
  * Instance Methods

    * `public String getType()` - getter เพื่อ return type ของ Sword
    * `public int getLevel()` - getter เพื่อ return level ของ Sword
    * `public int getDefense()` - getter เพื่อ return damage ของ Sword
*/
public class RPGCharacter {

    private String name;
    private int maxHP;
    private int maxMana;
    private int currentHP;
    private int currentMana;
    private int level;
    Sword mySword;
    Shield myShield;
    private static double baseRunSpeed = 5;
    private boolean isEquipSword;
    private boolean isEquipShield;
    private double cachedRunSpeed;

    public RPGCharacter(String name, int level) {

        this.name = name;
        this.level = level;
        this.maxHP = 100 + 10 * level;
        this.currentHP = maxHP;
        this.maxMana = 50 + 2 * level;
        this.currentMana = maxMana;
        this.isEquipSword = false;
        this.isEquipShield = false;
        mySword = new Sword("Wooden", 1);
        myShield = new Shield("Wooden", 1);
        System.out.println("The character " + name + " level " + level + " has been created");
    }

    public String getName() {
        return name;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void ShowStatus() {

        System.out.println();
        System.out.println("----------" + name + "----------");
        System.out.println("     Level: " + level);
        System.out.println("        HP: " + currentHP);
        System.out.println("      Mana: " + currentMana);
        System.out.println(" Run Speed: " + getRunSpeed());

        if (isEquipSword) {
            System.out
                    .println(
                            " [Level " + mySword.getLevel() + "] " + mySword.getType() + " Sword Damage: " + mySword.getDamage());
        } else {
            System.out.println(" " + name + " doesn't have Sword");
        }

        if (isEquipShield) {
            System.out.println(
                    " [Level " + myShield.getLevel() + "] " + myShield.getType() + " Shield Defense :" + myShield.getDefense());
        } else {
            System.out.println(" " + name + " doesn't have Shield");
        }

        System.out.println("--------------------------");

    }

    public void levelup() {

        System.out.println();
        System.out.println("-----" + name + " leveled up-----");
        int levelTemp = level;
        double oldRunSpeed = getRunSpeed();
        level++;
        int hpTemp = currentHP;
        cachedRunSpeed = 0;
        int manaTemp = currentMana;
        currentHP = currentHP + 10;
        currentMana = currentMana + 2;

        System.out.println("   Level: " + levelTemp + " --> " + level);
        System.out.println("      HP: " + hpTemp + " --> " + currentHP);
        System.out.println("    Mana: " + manaTemp + " --> " + currentMana);
        System.out.println("    Speed: " + oldRunSpeed + " --> " + getRunSpeed());
        System.out.println("----------------------------");
        System.out.println();
    }

    public void Attack(RPGCharacter Target) {
        System.out.println();
        System.out.println("--------------------------");

        if (isEquipSword) {
            if (Target.isEquipShield) {
                if (Target.myShield.getDefense() <= mySword.getDamage()) {
                    int hptemp = Target.currentHP;
                    Target.currentHP -= mySword.getDamage();
                    Target.currentHP += Target.myShield.getDefense();
                    System.out.println(" " + name + " dealt " + mySword.getDamage() + " damage to "
                            + Target.getName());
                    System.out.println(" " + Target.getName() + " blocked " + Target.myShield.getDefense() + " damage");
                    System.out.println(" " + Target.getName() + "'s HP = " + hptemp + "-->" + Target.getCurrentHP());
                } else {
                    System.out.println(Target.getName() + " blocked all damage");
                    System.out.println(" " + name + " dealt " + mySword.getDamage() + " damage to " + Target.getName());
                    System.out.println(" " + Target.getName() + "'s HP = " + Target.getCurrentHP());
                }
            } else {
                int hptemp = Target.currentHP;
                Target.currentHP -= mySword.getDamage();
                System.out.println(" " + name + " dealt " + mySword.getDamage() + " damage to " + Target.getName());
                System.out.println(" " + Target.getName() + "'s HP = " + hptemp + "-->" + Target.getCurrentHP());
            }
        } else {

            System.out.println("Cannot attack," + name + " doesn't have sword");
        }

        System.out.println("--------------------------");

    }

    public void equipSword() {
        if (isEquipSword) {
            System.out.println("->" + name + " already equip Sword");
        } else {
            cachedRunSpeed = 0;
            isEquipSword = true;
            System.out.println("->" + name + " equips a [level " + mySword.getLevel() + "] " + mySword.getType() + " Sword");
        }
    }

    public void unequipSword() {
        if (isEquipSword) {
            cachedRunSpeed = 0;
            isEquipSword = false;
            System.out.println("unequipped Sword");

        } else {
            System.out.println("already unequipped, no need to do it again");
        }
    }

    public void equipShield() {
        if (isEquipShield) {
            System.out.println("->" + name + " already equipped Shield");
        } else {
            cachedRunSpeed = 0;
            isEquipShield = true;
            System.out
                    .println("->" + name + " equips a [level " + myShield.getLevel() + "] " + myShield.getType() + " Shield");
        }
    }

    public void unequipShield() {
        if (isEquipShield) {
            cachedRunSpeed = 0;
            isEquipShield = false;
            System.out.println("->" + name + "unequipped Shield");
        } else {
            System.out.println("already unequipped, no need to do it again");
        }
    }

    public void SwordLevelUp(){
        if(isEquipSword){

            int lvltemp = mySword.level;
            mySword.level++;
            System.out.println(mySword.getType() + "sword Level"+lvltemp+"->"+mySword.level);
            mySword.baseDamage += mySword.level;
            cachedRunSpeed = 0;

        }
        else System.out.println(getName() + " have no sword, cannot level up");
    }

    public void ShieldLevelUp(){
        if(isEquipShield){
            int lvltemp = myShield.level;
            myShield.level++;
            System.out.println(myShield.getType() + "shield Level"+lvltemp+"->"+myShield.level);
            myShield.baseDefense += myShield.level;
            cachedRunSpeed = 0;
        }else System.out.println(getName() + " have no shield, cannot level up");

    }

    public double getRunSpeed() {
        if (cachedRunSpeed == 0) {
            calculateAndCacheRunSpeed();
        }
        return Math.round(cachedRunSpeed * 10) / 10.0;


    }

    private void calculateAndCacheRunSpeed() {
        if (cachedRunSpeed == 0) {
            cachedRunSpeed = baseRunSpeed * (1 + 0.3 * level);

            if (isEquipSword) {
                cachedRunSpeed -= calculateSwordRunSpeedDecrease();
            }

            if (isEquipShield) {
                cachedRunSpeed -= calculateShieldRunSpeedDecrease();
            }
        }
    }

    private double calculateSwordRunSpeedDecrease() {
        return baseRunSpeed * (0.1 + 0.04 * mySword.getLevel());
    }

    private double calculateShieldRunSpeedDecrease() {
        return baseRunSpeed * (0.1 + 0.08 * myShield.getLevel());

    }

    public void showSpeed() {
        System.out.println("->" + name + " Current Run Speed: " + getRunSpeed());
    }

}
