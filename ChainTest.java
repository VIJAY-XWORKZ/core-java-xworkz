class ChainTest{

public static void main(String[]args){

Chain chain1 = new Chain ();
chain1.name="neck chain";
chain1.material="gold";
chain1.weigth="20gm";
chain1.serialNo=4534;
chain1.price="120000Rs";

System.out.println("the name is  "+chain1.name);
System.out.println("the chain material is  "+chain1.material);
System.out.println("the weigth is  "+chain1.weigth);
System.out.println("the serial no is "+chain1.serialNo);
System.out.println("the price is  "+chain1.price);

chain1.provideGoodLook();


Chain chain2 = new Chain ();
chain2.name="neck chain";
chain2.material="silver";
chain2.weigth="25gm";
chain2.serialNo=6734;
chain2.price="1500Rs";

System.out.println("the name is  "+chain2.name);
System.out.println("the chain material is  "+chain2.material);
System.out.println("the weigth is  "+chain2.weigth);
System.out.println("the serial no is "+chain2.serialNo);
System.out.println("the price is  "+chain2.price);

chain2.provideGoodLook();

}



}