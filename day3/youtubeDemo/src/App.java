
// SOLID
// KATMANLI MIMARILER
// REFERENCE TYPES

// Bir sınıf yalnızca bir sınıfı extend edebilir
// Bir sınıf birden fazla interface i implement edebilir

// (abstracts) DRY : D'ont R'epeat Y'ourself
// abstract class lar ortak operasyonları tutar:
// tamamlanmamış operasyonların başında da abstract yazar ve içi boş bırakılır;
// tamamlanmış olanların içi doldurulur.

// abstract class lar ve interface ler new()lenemez

    public class App {
        public static void main(String[] args) throws Exception {
            
            // instance oluşturma
                                                                // polimorfizm
            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
            customerManager.GiveCredit();

            // instance oluşturma
            Company company = new Company();
            company.setCompanyName("XYZ Company");
            company.setTaxNumber("10000");
            company.setCity("Ankara");
            company.setId(1);

            // instance oluşturma
            Person person = new Person();
            person.setFirstName("Berfin");
            person.setLastName("Açıkgöz");
            person.setNationalIdentity("12312312312");
            person.setCity("İzmir");
            person.setId(2);

                      
        }
    }


    interface ICreditManager{
        void Calculate();
        void Save();
    }

    abstract class BaseCreditManager implements ICreditManager {

        public abstract void Calculate(); //tamamlanmamış(her yerde o yere özel)
        public void Save(){
            System.out.println("kaydedildi : base"); //tamamlanmış(her yerde aynı)
        }

    }

    class TeacherCreditManager implements ICreditManager{
        @Override
        public void Calculate() {
            System.out.println("öğretmen kredisi hesaplandı");
            
        }

        @Override
        public void Save() {
            System.out.println("öğretmen kredisi kaydedildi");
            
        }

    }

    class MilitaryCreditManager implements ICreditManager{

        @Override
        public void Calculate() {
            System.out.println("asker kredisi hesaplandı");
            
        }

        @Override
        public void Save() {
            System.out.println("asker kredisi kaydedildi");
            
        }

    }

    class Customer {
        private int Id ;
        private String city;

        public int getId() {
            return Id;
        }
        public void setId(int id) {
            Id = id;
        }

        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        
    }

    class Company extends Customer{

        private String TaxNumber;
        private String CompanyName;

        public String getTaxNumber() {
            return TaxNumber;
        }

        public void setTaxNumber(String taxNumber) {
            TaxNumber = taxNumber;
        }

        public String getCompanyName() {
            return CompanyName;
        }

        public void setCompanyName(String companyName) {
            CompanyName = companyName;
        }

        
    }

    class Person extends Customer{
        private String NationalIdentity ;
        private String FirstName ;
        private String LastName ;

        public String getNationalIdentity() {
            return NationalIdentity;
        }

        public void setNationalIdentity(String nationalIdentity) {
            NationalIdentity = nationalIdentity;
        }

        public String getFirstName() {
            return FirstName;
        }
        public void setFirstName(String firstName) {
            FirstName = firstName;
        }
        public String getLastName() {
            return LastName;
        }
        public void setLastName(String lastName) {
            LastName = lastName;
        }
        
    }

    class CustomerManager{

        private Customer _customer;
        private ICreditManager _creditManager;
        

        public CustomerManager(Customer _customer, ICreditManager _creditManager) {
            this._customer = _customer;
            this._creditManager = _creditManager;
        }

        public void Save(){
            System.out.println("müşteri kaydedildi: "+_customer.getId());
        }

        public void Delete(){
            System.out.println("müşteri silindi: "+_customer.getId());
        }

        public void GiveCredit(){
            _creditManager.Calculate();
            _creditManager.Save();
            System.out.println("Kredi verildi: "+_creditManager);
        }

    }


