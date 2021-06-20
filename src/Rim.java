public class Rim extends Start1{

     static String[] arab= arab55();
     public static String [] arab55(){
      String list[] = new String[100];
         for (int i=0;i<100;i++){
             list[i]=String.valueOf(i);
         }
        return list;
     }
    public static String [] rim = {"","I","II","III","IV","V","VI","VII","VIII","IX","X",
            "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
            "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
            "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
            "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
            "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
            "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
            "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
            "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
            "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};

    public static String izArab (String ope) {
        //пооучить надо индекс в rime
        int i=0;
        while(true){
            if(ope.equals(arab[i])){
                break;
            }
            i++;
        }
        ope=rim[i];
        return ope;
    }
//ниже проверяется, есть ли в ОПЕР1 и ОПЕР2 символы РИМСКИЕ
    public static boolean proverkaARim(String ope) {

        int yy = 0;
        while (true){
            for (int hh = 1; hh < rim.length; hh++) {
                if (ope.equals(rim[hh])) {
                    yy = 100;break;
                }
            }
            break;
    }
        if (yy > 0) {
            return false;
        } else {
            return true;
        }
    }
    public static String izRim (String ope) {
        //пооучить надо индекс в rime
        int i=0;
        while(true){
            if(ope.equals(rim[i])){
                break;
            }
            i++;
        }
        ope=arab[i];
        return ope;
    }
    }










