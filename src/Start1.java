import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

public class Start1<mass2> {
    public static int dl=0;
    public static char[] mass2 =null;
    public static String oper1="";
    public static String oper2="";
    protected static String s="";

    public static void main (String [] args)throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String [] mass =
                    s.split("\\+|\\*|\\/|\\-");//два операнда
            String oper01 = mass[0];
            String oper02 = mass[1];
             oper1= oper01.replaceAll(" ", "");
             oper2=oper02.replaceAll(" ", "");

             //проверка на арабские и римские числа
            if(!Rim.proverkaARim(oper1) && !Rim.proverkaARim(oper2)){
                oper1=Rim.izRim(oper1);
                oper2=Rim.izRim(oper2);

                if (parseInt(oper1)>10||parseInt(oper1)<1|| parseInt(oper2)>10||parseInt(oper1)<1){
                    System.out.print("Введите целое число от 1 до 10, после перезапуска программы!");}
                else{
                    dl = s.length();//длинна строки
                    mass2 = s.toCharArray();//теперь массив преобразуем в тип char, для поиска символа - оператора
                    Result2.resultOut();
                }
            }else if(Rim.proverkaARim(oper1) && Rim.proverkaARim(oper2)){
//ниже идет проверка на диапозон чисел от 1 до 10
if (parseInt(oper1)>10||parseInt(oper1)<1|| parseInt(oper2)>10||parseInt(oper1)<1){
    System.out.print("Введите целое число от 1 до 10, после перезапуска программы!");}
    else{
        dl = s.length();//длинна строки
        mass2 = s.toCharArray();//теперь массив преобразуем в тип char, для поиска символа - оператора
        Result.resultOut();
    }}
            else if(!Rim.proverkaARim(oper1) && Rim.proverkaARim(oper2)) {
                System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно!");
                throw new NumberFormatException();
            }
            else if(Rim.proverkaARim(oper1) && !Rim.proverkaARim(oper2)) {
                System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно!");
                throw new NumberFormatException();
            }
            reader.close();
        }
    }
