public class hotelCust
{
 private String name;
 private String ic;
 private String phoneNo;
 private String hotelType;
 private String day;
 private char pack;
 private double price;
 
  public hotelCust (String name, String ic, String phoneNo, String hotelType, String day, char pack, double price)
 {
 
  this.name = name;
  this.ic = ic;
  this.phoneNo = phoneNo;
  this.hotelType = hotelType;
  this.day = day;
  this.pack = pack;
  this.price = price;
  
 }
 
 public void setName(String name) {this.name = name;}
 public void setIc(String ic) {this.ic = ic;}
 public void setPhoneNo(String phoneNo) {this.phoneNo = phoneNo;}
 public void setHotelType(String hotelType) {this.hotelType = hotelType;}
 public void setDay(String day) {this.day = day;}
 public void setPack(char pack) {this.pack = pack;}
 public void setPrice(double price) {this.price = price;}
 
 public String getName() {return name;}
 public String getIc() {return ic;}
 public String getPhoneNo() {return phoneNo;}
 public String getHotelType() {return hotelType;}
 public String getDay() {return day;}
 public char getPack() {return pack;}
 public double getPrice() {return price;}
 
 public double calcDisc()
 {
  double disc;
  
  if (day == "friday" && pack == 'A')
  {
   if (hotelType == "Vip")
      disc = 0.9;
   else
      disc = 0.94;
  }
  else if (day == "friday" && pack == 'B')
  {
   if (hotelType == "Vip")
      disc = 0.9;
   else
      disc = 0.94;
  }
  else
  {
   disc = 0.97;
  }
  
  return disc;
 }
}
   
 