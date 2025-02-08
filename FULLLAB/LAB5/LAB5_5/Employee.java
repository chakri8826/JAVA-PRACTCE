class Employee{
        private String code,name,address;
        private int phno;
        private double salary=0,da=0.1,hra=0.2,amount=0;
        Employee(String code,String name,String address,int phno,double salary,double da,double hra){
                this.code=code;
                this.name=name;
                this.address=address;
                this.phno=phno;
                this.salary=salary;
                this.da=da;
                this.hra=hra;
               }
        public void computeSalary(){
              amount=(salary*da)+(salary*hra)+salary;
             }
        public String toString(){
                return "Name: "+name+"\nemp_Code: "+code+"\nAddress: "+address+"\nphno: "+phno+"\nSalary: "+amount;
               }
      }
