int eggAmount;
int eggMin = 4;
int milkAmount;
int milkMin = 200; //mm
int flourAmount;
int flourMin = 100; //gram

System.out.println("hello user")
System.out.println("panmaker is starting")
System.out.println("How many eggs do you have")

Scanner userInput;
userInput = new Scanner(System.in);
eggsAmount = userInput.nextIn();
System.out.println("you have" + eggAmount + "eggs");
//ini buat kalibrasi telor

System.out.println("how many (mm) milk you have?");
userInput = new Scanner(System.in);
milkAmount = userInput.nextIn();
System.out.println("you have" + milkAmount + "mm");
//ini buat kalibrasi susu

System.out.println("how much (gram) flour you have?");
userInput = new Scanner(System.in);
milkAmount = userInput.nextIn();
System.out.println("you have" + flourAmount + "gram");
//ini buat kalibrasi tepung

//kode pengeluaran dibawah
    if (eggAmount < eggMin < || milkAmount < milkMin || flourAmount < flourMin) {
        System.out.println("sorry no pan for today")
} else {
    //perhitungan buat porsi
    eggAmount = eggAmount / eggMin;
    System.out.println("you have" + "portion of egg");

    flourAmount = flourAmount / flourMin;
    System.out.println("you have" + "portion of flour");
    
    milkAmount = milkAmount / milkMin;
    System.out.println("you have" + "portion of milk");

//untuk menentukan yg terkecil dari ke 3 nya
int smallest;
if (eggAmount <= milkAmount && milkAmount <= eggAmount) {
    smallest = eggAmount
} else if (milkAmount <= flourAmount && flourAmount <= eggAmount) {
    smallest = milkAmount;
} else {
    smallest = flourAmount;
}
system.out.println("");
system.out.println("you can make" + smallest*4 +"of pan");
System.out.Println("");
System.out.Println("you will need " + smallest*eggsMin + " eggs");
System.out.Println("you will need " + smallest*eggsMin + "g flour");
System.out.Println("you will need " + smallest*eggsMin + "ml milk");
System.out.Println("");    
System.out.Println("panmaker shutting down...");
//app selesai