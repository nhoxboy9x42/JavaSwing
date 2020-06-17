/**
 *@author by Roller
 *
 */
package JavaSwing;

class Student {
    private String ID;
    private String Name;
    private String Phone;
    private String Email;
    private String DateOfBirth;
    private Float GPA;
    private String Gender;

    Student(){
        this.ID = null;
        this.Name = null;
        this.Phone = null;
        this.Email = null;
        this.DateOfBirth = null;
        this.GPA = 0f;
        this.Gender = null;
    }
    Student(String ID, String Name, String Phone, String Email, String DateOfBirth, Float GPA, String Gender){
        this.ID = ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.DateOfBirth = DateOfBirth;
        this.GPA = GPA;
        this.Gender = Gender;
    }
    Student(Student s){
        this.ID = s.ID;
        this.Name = s.Name;
        this.Phone = s.Phone;
        this.Email = s.Email;
        this.DateOfBirth = s.DateOfBirth;
        this.GPA = s.GPA;
        this.Gender = s.Gender;
    }
    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public Float getGPA() {
        return this.GPA;
    }

    public void setGPA(Float GPA) {
        this.GPA = GPA;
    }
    
    public String getGender() {
        return this.Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

}

