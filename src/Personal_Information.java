public class Personal_Information {
    
        String name;
        int age;
        String address;
        String phomeNumber;
    
        public Personal_Information(String name, int age, String address, String phomeNumber) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.phomeNumber = phomeNumber;
        }
    
        public String getName() {
            return name;
        }
        public int getAge(){
            return age;
    
        }
        public String getAddress(){
            return address;
        }
        public String getPhoneNumber(){
            return phomeNumber;
        }
    
    
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setAddress(String address){
            this.address = address;
        }
        public void setPhoneNumber(String phomeNumber){
            this.phomeNumber = phomeNumber;
        }
        
         void DisplayInfo(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phomeNumber);
         }
        public static void main(String[] args) {
            Personal_Information info1 = new Personal_Information("Muneeb", 30, "123 Main St", "0325-1533234");
            Personal_Information info2 = new Personal_Information("Muneeb",30,"123 Main", "033355-1234");
            Personal_Information info3 = new Personal_Information("Family",30,"123 Main", "0312-1214232");
            System.out.println("--------------");
            info1.DisplayInfo();
            System.out.println("--------------");
            info2.DisplayInfo();
            System.out.println("--------------");
            info3.DisplayInfo();
            
     
            
        }
    }
    
