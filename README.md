# Lab3 - Object Oriented Programming

* <h2>RPGCharacter.java</h2>

  * <h3>Instance Variables</h3>
  
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

  * <h3>Instance Methods</h3>
  
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
      
      
      
<br>

* <h2>Sword.java</h2>

  * <h3>Instance Variables</h3>
  
    * `private String type` - ชนิดของ Sword
    * `private int level` - ระดับของ Sword
    * `private int baseDamage` - Damage เริ่มต้นที่ยังไม่ได้คํานวณจาก variable อื่นเลย
  * <h3>Instance Methods</h3>
  
    * `public String getType()` - getter เพื่อ return type ของ Sword
    * `public int getLevel()`- getter เพื่อ return level ของ Sword
    * `public int getDamage()` - getter เพื่อ return damage ของ Sword
      
<br>

* <h2>Shield.java</h2>

  * <h3>Instance Variables</h3>
  
    * `private String type` - ชนิดของ Shield
    * `private int level` - ระดับของ Shield
    * `private int baseDefense` - Damage เริ่มต้นที่ยังไม่ได้คํานวณจาก variable อื่นเลย
  * <h3>Instance Methods</h3>
  
    * `public String getType()` - getter เพื่อ return type ของ Sword
    * `public int getLevel()` - getter เพื่อ return level ของ Sword
    * `public int getDefense()` - getter เพื่อ return damage ของ Sword
     
 
