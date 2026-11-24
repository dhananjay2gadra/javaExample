class chardemo
{
public static void main(String args[])
{
char ch='A';

int vch=(int)ch;//65

vch=vch+3;



System.out.println("Value of ch:"+ch);

ch=(char)vch;

System.out.println("Value of ch:"+ch);

System.out.println("Value of vch:"+vch);
}
}