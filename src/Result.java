public class Result extends Start1{
    public static void resultOut (){

//ниже идет поиск знака + или минус или...
        for(int i = 0; i<dl; i++){
            if(mass2[i]=='+'){
                System.out.print
                        (Integer.parseInt(oper1)+
                                Integer.parseInt(oper2));
                break;
            }}
        for(int i=0;i<dl;i++){
            if(mass2[i]=='-'){
                System.out.print
                        (Integer.parseInt(oper1)-
                                Integer.parseInt(oper2));
                break;
            }}
        for(int i=0;i<dl;i++){
            if(mass2[i]=='/') {
System.out.print
                (Integer.parseInt(oper1) /
                        Integer.parseInt(oper2));

                break;
            }}
        for(int i=0;i<dl;i++){
            if(mass2[i]=='*'){
                System.out.print
                        (Integer.parseInt(oper1)*
                                Integer.parseInt(oper2));
                break;
            }//if
        }//for
    }
}
