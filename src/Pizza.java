import java.sql.SQLOutput;

public class Pizza {
    //=======Attributes / Fields======//
    private int price;// متغير بيخزن السعر النهائي اللي هيتدفع
    private boolean veg;// متغير بيعرفنا البيتزا نباتية (true) ولا لحمة (false)
    private int extraCheesePrice =100;// قيمة ثابتة لسعر Cheese الإضافية
    private int extraToppingPrice =150;// قيمة ثابتة لسعر Topping الإضافي
    private int backPackPrice =20;// قيمة ثابتة لسعر TakeAway

    private int basePizzaPrice;// متغير عشان نحفظ فيه سعر البيتزا "السادة" قبل أي إضافات

    //==========================================================//
    // متغيرات (Boolean) عشان نعرف إيه اللي اتضاف فعلاً ونطبعه في الفاتورة


    private boolean isExtraCheeseAdded = false;// هل الزبون طلب Cheese؟
    private boolean isExtraToppingPrice = false;// هل الزبون طلب Topping؟
    private  boolean isOptedForTakeAway = false;// هل الزبون طلب TakeAway؟
    //=======Constructor=======//
    //   بيشتغل أول ما بنعمل "new Pizza"
    public Pizza(boolean veg) {
        this.veg = veg;// بنحدد النوع بناءً على اللي باعتينه في الـ Main
        if(this.veg){
            this.price=300;// لو نباتية سعرها يبدأ من 300
        }else{
            this.price=400;// لو مش نباتية سعرها يبدأ من 400
        }
        basePizzaPrice =this.price;// بنخزن السعر الأساسي هنا عشان لا يضيع بعد الإضافات
    }
    // Method for adding cheese

   public void addExtraCheese(){
        isExtraCheeseAdded = true;// بنعلم إن الجبنة اتضافت
       this.price+=extraCheesePrice;// بنزود سعر الجبنة على الإجمالي

   }
   // Method for adding topping

   public void addExtraTopping(){
        isExtraToppingPrice = true;// بنعلم إن التوبينج اتضاف
        this.price+=extraToppingPrice;// بنزود سعر التوبينج على الإجمالي

   }
    // Method of ordering takeaway

   public void takeAway(){
        isOptedForTakeAway = true;// بنعلم إن الزبون هياخد الشنطة
        this.price+=backPackPrice;// بنزود سعر الشنطة على الإجمالي

   }
    // Invoice collection and printing method
   public void getBill(){
        String bill ="";// بنعمل نص فاضي نجمع فيه الكلام
        System.out.println("Pizza : "+basePizzaPrice);// بنطبع أول سطر (السعر الأساسي)
        if(isExtraCheeseAdded){
            bill +="Extra Cheese Added : "+extraCheesePrice+"\n";// لو ضاف Cheese بنزود سطر للفاتورة
        }
       if(isExtraToppingPrice){
           bill +="Extra Topping Added : "+extraToppingPrice+"\n";// لو ضاف Topping بنزود سطر
       }
       if(isOptedForTakeAway){
           bill +="Take Away: "+backPackPrice+"\n";// لو طلب TakeAway بنزود سطر
       }
       bill +="Bill :"+this.price+"\n";// بنضيف السعر النهائي المجموع
       System.out.println(bill);// بنطبع كل اللي جمعناه في الـ bill مرة واحدة

   }
}
