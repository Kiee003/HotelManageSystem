class hotelCust: 
    #CONSTRUCTOR 
    def __init__(self,name,ic,phoneNo,hotelType,day,pack,price):
        self.name = name
        self.ic = ic
        self.phoneNo = phoneNo
        self.hotelType = hotelType
        self.day = day
        self.pack = pack
        self.price = price

    def calcDisc(self):
        disc=0.0
        if self.day == "friday" and self.pack == 'A':
           if self.hotelType == "Vip":
              disc = 0.9
           else:
              disc = 0.94
        elif self.day == "friday" and self.pack == 'B':
           if self.hotelType == "Vip":
              disc = 0.9
           else:
              disc = 0.94
        else:
          disc = 0.97
        return disc;

print("\n\t\t**********************************************")
print("\n\t\t            WELCOME TO OUR HOTEL            ")
print("\n\t\t**********************************************")
print("\n\n\t\t       This is the package for our hotel    ")
print("\n\t\t                Hotel Package               ")
print("\t\t________________________________________________")
print("\t\t|     Package A      |       Package B         |")
print("\t\t|____________________|_________________________|")
print("\t\t|    (3D 2N)         |       (5D 4N)           |")
print("\t\t|___________________ |_________________________|")
print("\t\t|    Free Spa        |    Free Spa & Gym       |")
print("\t\t|____________________|_________________________|")
print("\t\t|   Free Breakfast   | Free Breakfast & Dinner |")
print("\t\t|____________________|_________________________|")
print("\t\t|   Unlimited Wifi   |   Unlimited Wifi        |")
print("\t\t|____________________|_________________________|")
print("\t\t|   Price RM 500     |     Price RM 700        |")
print("\t\t|____________________|_________________________|")
print("\n\t\t\t          Hotel Type                    ")
print("\t\t________________________________________________")
print("\t\t|         VIP        |        BASIC            |")
print("\t\t|____________________|_________________________|")
print("\t\t|       RM 100       |        RM 50            |")
print("\t\t|____________________|_________________________|")
print("\t\t\t    *******THANK YOU********             ")

allCust=[]
temp0 = hotelCust("Anita Sofea", "020405100322", "0112345788", "Vip", "friday", "A", 600)
allCust.append(temp0)
temp1 = hotelCust("Syafiq Aqil", "970806013455", "0111356890", "Vip", "friday", "B", 800)
allCust.append(temp1)
temp2 = hotelCust("Marina Putri", "990704054432", "0187654332", "Basic", "friday", "A", 550)
allCust.append(temp2)
temp3 = hotelCust("Susan Wong", "001005068444", "0134567281", "Basic", "friday", "B", 750)
allCust.append(temp3)
temp4 = hotelCust("Michael Kim", "761208010311", "0115467990", "Vip", "monday", "A", 600)
allCust.append(temp4)
temp5 = hotelCust("Ahmad Amin", "960503105037", "0178654329", "Basic", "thursday", "B", 550)
allCust.append(temp5)

for i in range(len(allCust)):
    dis = allCust[i].calcDisc()
    totalDisc = dis * allCust[i].price
    print("\nName of the Customer: " +allCust[i].name)
    print("IC: " +allCust[i].ic)
    print("Phone Number: " +allCust[i].phoneNo)
    print("Hotel Type: " +allCust[i].hotelType)
    print("Day of the Customer Booking: " +allCust[i].day)
    print("Package Customer Booking: " +allCust[i].pack)
    print("Price before Discount: RM" +str(allCust[i].price))
    print("Discount of the Customer: " +str(dis))
    print("Price After Discount: RM" +str(totalDisc))
    
