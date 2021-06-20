public class Result2 extends Start1{
    public static void resultOut (){

//ниже идет поиск знака + или минус или...
        for(int i = 0; i<dl; i++){
            if(mass2[i]=='+'){
                int eee=Integer.parseInt(oper1)+Integer.parseInt(oper2);//5
                String ggg=String.valueOf(eee);
                System.out.print(Rim.izArab(ggg));
                break;
            }}
        for(int i=0;i<dl;i++){
            if(mass2[i]=='-'){
                int eee=Integer.parseInt(oper1)-Integer.parseInt(oper2);//5
                String ggg=String.valueOf(eee);
                System.out.print(Rim.izArab(ggg));
                break;
            }}
        for(int i=0;i<dl;i++){
            if(mass2[i]=='/') {
                int eee=Integer.parseInt(oper1)/Integer.parseInt(oper2);//5
                String ggg=String.valueOf(eee);
                System.out.print(Rim.izArab(ggg));
                break;
            }}
        for(int i=0;i<dl;i++){
            if(mass2[i]=='*'){
                int eee=Integer.parseInt(oper1)*Integer.parseInt(oper2);//5
                String ggg=String.valueOf(eee);
                System.out.print(Rim.izArab(ggg));
                break;
            }//if
        }//for
    }
}
