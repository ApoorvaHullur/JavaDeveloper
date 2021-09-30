class PropertyUtil{

public static void main(String a[]){

PropertyDTO dto=new PropertyDTO();
dto.setPropertyType("Home");
dto.setCost(4000000);
dto.setLocation("Bilagi");
dto.setPropertyOwner("Ishwar Sulakhe");

System.out.println(dto.getPropertyType()+""+dto.getCost()+""+dto.getLocation()+""+dto.getPropertyOwner());
}
}
