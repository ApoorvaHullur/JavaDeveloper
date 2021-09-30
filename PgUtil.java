class PgUtil{

public static void main(String a[]){

PgDTO dto=new PgDTO();
dto.setPgName("Kushi");
dto.setWardenName("Suma");
dto.setFees(6500);
dto.setLocation("GayathriNagar");


System.out.println(dto.getPgName()+""+dto.getWardenName()+""+dto.getFees()+""+dto.getLocation());
}
}