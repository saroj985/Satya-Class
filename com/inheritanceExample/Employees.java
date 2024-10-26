package com.inheritanceExample;
class Employees {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employees(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void bonus() {
    	double bonusAmount = salary * 0.10;
    	System.out.println("Bonus: " + bonusAmount);
    }

    public void performanceReport() {
        System.out.println("Performance Report for: " + name);
    }

    public void managingProject() {
        System.out.println("Managing Project " + name);
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Manager m = new Manager("Saroj", "123 Street", 5000);
        Developer d = new Developer("Manoj", "321 Street", 9000);
        Programmer p = new Programmer("Ram", "123 New Street", 15000);

        m.bonus();
        m.performanceReport();
        m.managingProject();

        d.bonus();
        d.performanceReport();
        d.managingProject();

        p.bonus();
        p.performanceReport();
        p.managingProject();
    }
    
}

class Manager extends Employees {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
}

class Developer extends Employees {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }
}

class Programmer extends Employees {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }
}


