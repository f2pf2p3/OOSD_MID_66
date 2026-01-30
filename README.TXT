ตอนที่ 1 (6 คะแนน)

1. สร้างคลาส Country ที่ประกอบด้วยฟิลด์ต่อไปนี้: (2 คะแนน)
 code, name, gdp (ทุกฟิลด์เป็น private)
 และ:
 1.1 เขียน constructor ที่เหมาะสม
 1.2 Override เมธอด toString() ให้ส่งค่ากลับเป็นข้อมูลตามที่ปรากฏในผลลัพธ์ (ดูตัวอย่างผลลัพธ์)

2. สร้างคลาส DB ที่ประกอบด้วยฟิลด์และเมธอดต่อไปนี้(2 คะแนน)
 -storage เป็น ArrayList<Country>
 +add(Country) // รับพารามิเตอร์เป็นวัตถุชนิด Country และนำไปเพิ่มใน storage
 +print(n) // แสดงรายการวัตถุที่จัดเก็บไว้ใน storage ตามจำนวนที่ระบุในพารามิเตอร์ n
 +print() // แสดงรายการวัตถุทั้งหมดที่จัดเก็บไว้ใน storage

3. เขียนคลาส Demo1 และทำการทดลองในฟังก์ชัน test() ดังนี้(2 คะแนน)
 3.1 สร้างวัตถุชนิด Country จำนวน 5 ตัว โดยใส่ข้อมูลดังนี้:
001, Thailand, 3
002, Philippines, 6.2
003, Cambodia, 6.8
004, Bangladesh, 7.4
005, Greece, 2.2
 3.2 สร้างวัตถุชนิด DB ชื่อ db และนำวัตถุในข้อ 3.1 ไปจัดเก็บผ่านทางเมธอด add()
 3.3 แสดงข้อมูลที่จัดเก็บทั้งหมดผ่านทางเมธอด print() ของวัตถุ db
 3.4 แสดงข้อมูลที่จัดเก็บจำนวน 2 รายการ ผ่านทางเมธอด print(n) ของวัตถุ db
ตัวอย่างผลลัพธ์:
รหัส: 001, ประเทศ: Thailand, GDP: 3.0
รหัส: 002, ประเทศ: Philippines, GDP: 6.2
รหัส: 003, ประเทศ: Cambodia, GDP: 6.8
รหัส: 004, ประเทศ: Bangladesh, GDP: 7.4
รหัส: 005, ประเทศ: Greece, GDP: 2.2
-----
รหัส: 001, ประเทศ: Thailand, GDP: 3.0
รหัส: 002, ประเทศ: Philippines, GDP: 6.2

------------------------------------------------------------------------------------------------------------
ตอนที่ 2 (13 คะแนน)

1. สร้างคลาส DevelopingCountry โดยสืบทอดคุณสมบัติมาจากคลาส Country และเพิ่มฟิลด์กับเมธอดต่อไปนี้:
 (2 คะแนน)
 ฟิลด์: pollution, corruption
 เมธอด: factoryBase(n) ที่นำ 50% ของค่าพารามิเตอร์ n ไปใส่ให้กับฟิลด์ pollution และที่นำ 50% ของ
 ค่าพารามิเตอร์ ไปใส่ให้กับฟิลด์ gdp
 importTechnology (n) ที่นำ 10% ของค่าพารามิเตอร์ n ไปเพิ่มค่าให้กับฟิลด์ gdp
 governmentProjects(n) ที่นำ 15% ของค่าพารามิเตอร์ n ไปเพิ่มค่าให้กับฟิลด์ corruption
 override เมธอด toString() ให้เพิ่มการแสดงค่าของฟิลด์ pollution และ corruption
 เขียน constructor ที่เหมาะสม

2. สร้างคลาส DevelopedCountry โดยสืบทอดคุณสมบัติมาจากคลาส Country และเพิ่มฟิลด์กับเมธอดต่อไปนี้:
 (2 คะแนน)
 ฟิลด์: innovation, happynessScore
 เมธอด: education(n) ที่นำ 10% ของค่าพารามิเตอร์ n ไปเพิ่มค่าให้กับฟิลด์ innovation
 publicServices (n) ที่นำ 25% ของค่าพารามิเตอร์ n ไปเพิ่มค่าให้กับฟิลด์ happynessScore และ
รหัส: 001, ประเทศ: Thailand, GDP: 3.0
รหัส: 002, ประเทศ: Philippines, GDP: 6.2
รหัส: 003, ประเทศ: Cambodia, GDP: 6.8
รหัส: 004, ประเทศ: Bangladesh, GDP: 7.4
รหัส: 005, ประเทศ: Greece, GDP: 2.2
-----
รหัส: 001, ประเทศ: Thailand, GDP: 3.0
รหัส: 002, ประเทศ: Philippines, GDP: 6.2
 นำค่า 10% ของค่าพารามิเตอร์ n ไปลดค่าของฟิลด์ gdp
 exportTechnology(n) ที่นำ 10% ของค่าพารามิเตอร์ n ไปเพิ่มค่าให้กับฟิลด์ gdp
 override เมธอด toString() ให้เพิ่มการแสดงค่าของฟิลด์ innovation และ happynessScore
 เขียน constructor ที่เหมาะสม

3. แก้ไขคลาส DB โดยเพิ่มเมธอด: (2 คะแนน)
topPollution() ที่ส่งค่ากลับเป็นชื่อประเทศ ที่มีค่า pollution มากที่สุด
topCorruption() ที่ส่งค่ากลับเป็นชื่อประเทศที่มีค่า corruption มากที่สุด
topInnovation() ที่ส่งค่ากลับเป็นชื่อประเทศที่มีค่า innovation มากที่สุด
topHappyness() ที่ส่งค่ากลับเป็นชื่อประเทศที่มีค่า happynessScore มากที่สุด

4. เขียนคลาส Demo2 และทำการทดลองในฟังก์ชัน test() ดังนี้: (7 คะแนน)
 4.1 สร้างวัตถุชนิด DevelopingCountry จำนวน 3 ตัว โดยใส่ข้อมูลและใช้งานเมธอดดังนี้:
“001”, “Thailand”, 3, 6, 9
“002”, “Philippines”, 6.2, 5, 8
“003”, “Cambodia”, 6.8, 8, 8
 A.factoryBase(5); A.importTechnology(6); A.governmentProjects(8);
 B.factoryBase(4); B.importTechnology(5); B.governmentProjects(5);
 C.factoryBase(4); C.importTechnology(3); C.governmentProjects(4);
 4.2 สร้างวัตถุชนิด DevelopedCountry จำนวน 3 ตัว โดยใส่ข้อมูลและใช้งานเมธอดดังนี้:
“008”, “Korea”, 2.2, 5, 4
“009”, “USA”, 2.1, 10, 5
“010”, “UK”, 1.4, 6, 7
 D.education(8); D.publicServices(7); D.exportTechnology(6);
 E.education(6); E.publicServices(6); E.exportTechnology(10);
 F.education(7); F.publicServices(8); F.exportTechnology(5);
 4.3 สร้างวัตถุชนิด DB ชื่อ db และนำวัตถุในข้อ 4.1, 4.2 ไปจัดเก็บ
 4.4 แสดงข้อมูลที่จัดเก็บทั้งหมดผ่านทางเมธอด print() ของวัตถุ db
 4.5 แสดงชื่อประเทศที่มีค่า pollution มากที่สุดออกทางจอภาพ
 4.6 แสดงชื่อประเทศที่มีค่า innovation มากที่สุดออกทางจอภาพ
 4.7 แสดงชื่อประเทศที่มีค่า happynessScore มากที่สุดออกทางจอภาพ

ตัวอย่างผลลัพธ์:
รหัส:001, ประเทศ:Thailand, GDP:6.1, pollution:8.5, corruption:10.2
รหัส:002, ประเทศ:Philippines, GDP:8.7, pollution:7.0, corruption:8.75
รหัส:003, ประเทศ:Cambodia, GDP:9.100000000000001, pollution:10.0, corruption:8.6
รหัส:008, ประเทศ:Korea, GDP:2.1, innovation:5.8, happyness:5.75
รหัส:009, ประเทศ:USA, GDP:2.5, innovation:10.6, happyness:6.5
รหัส:010, ประเทศ:UK, GDP:1.0999999999999999, innovation:6.7, happyness:9.0
-----
Top pollution country: Cambodia
Top innovation country: USA
Top happyness country: UK

------------------------------------------------------------------------------------------------------------
ตอนที่ 3 (6 คะแนน)

1. สร้างอินเตอร์เฟสชื่อ Corruptible ที่ประกอบด้วยเมธอดต่อไปนี้(1 คะแนน)
 Abstract เมธอด: secretBudget(n)

2. สร้างคลาส CorruptedCountry โดยสืบทอดคุณสมบัติมาจากคลาส DevelopingCountry และอินเตอร์เฟส
Corruptible จากนั้นทำการ override เมธอด secretBudget(n) โดยให้นำ 70% ของค่าพารามิเตอร์ n ไปเพิ่ม
ให้กับค่าของฟิลด์ corruption (1 คะแนน)

3. เขียนคลาส Demo3 และทำการทดลองในฟังก์ชัน test() ดังนี้(4 คะแนน)
 3.1 สร้างวัตถุชนิด CorruptedCountry จำนวน 3 ตัว โดยใส่ข้อมูลและเรียกใช้เมธอดดังนี้:
“001”, “Thailand”, 3, 6, 9
“002”, “Philippines”, 6.2, 5, 8
“003”, “Cambodia”, 6.8, 8, 8
X.secretBudget(8);
Y.secretBudget(9);
Z.secretBudget(10);
 3.2 สร้างวัตถุชนิด DB ชื่อ db และนำวัตถุในข้อ 3.1 ไปจัดเก็บ
 3.3 แสดงข้อมูลที่จัดเก็บทั้งหมดผ่านทางเมธอด print() ของวัตถุ db
 3.4 แสดงชื่อประเทศที่มีค่า corruption มากที่สุดออกทางจอภาพ

ตัวอย่างผลลัพธ์:
รหัส:001, ประเทศ:Thailand, GDP:3.0, pollution:6.0, corruption:14.6
รหัส:002, ประเทศ:Philippines, GDP:6.2, pollution:5.0, corruption:14.3
รหัส:003, ประเทศ:Cambodia, GDP:6.8, pollution:8.0, corruption:15.0
-----
Top corruption country: Cambodia
------------------------------------------------------------------------------------------------------------
