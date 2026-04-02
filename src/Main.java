public class Main{
    public static void main (String[]args){
// هنا ننشئ بيتزا عادية (false يعني غير نباتية)
 /*    Pizza basePizza =new Pizza (false);
  بننادي Method إضافة الجبنة عشان تزود السعر 100//
        basePizza.addExtraCheese();
  بننادي Method إضافة التوبينج عشان تزود السعر 150//
        basePizza.addExtraTopping();
  بننادي ميثود التيك أواي عشان تزود 20 جنيه حق الشنطة//
        basePizza.takeAway();
  في الآخر بنطلب منه يطبع لنا الحساب الإجمالي//
        basePizza.getBill();*/


       // DeluxPizza dp= new DeluxPizza(true);
        DeluxPizza dp= new DeluxPizza(false);
       /* dp.addExtraCheese();
        dp.addExtraTopping();
        dp.takeAway();*/
        dp.getBill();
    }
}