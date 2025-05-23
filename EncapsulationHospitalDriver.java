import java.util.ArrayList;
import java.util.Scanner;

class Hospital {
    private String name;
    private String type;
    private String address;
    private long contact;
    private String email;
    private ArrayList<Doctor> doctorList = new ArrayList<>();
    private ArrayList<Patient> patientList = new ArrayList<>();

    public Hospital(String name, String type, String address, long contact, String email) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void addPatient(Patient newPatient) {
        patientList.add(newPatient);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public Long getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }
}

class Doctor {
    private String doctorID;
    private String doctorName;
    private String specialization;
    private double experience;
    private static int id = 1234;

    {
        this.doctorID = "SASOON" + id++;
    }

    public Doctor(String doctorName, String specialization, double experience) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getExperience() {
        return experience;
    }
}

class Patient {
    private String patientId;
    private String patientName;
    private String gender;
    private int age;
    private String[] illeness;
    private String bloodGroup;
    private String address;
    private long contact;
    private String relativeName;
    private static int id = 3333;

    {
        this.patientId = "SASOON" + id++;
    }

    public Patient(String patientName, String gender, int age, String[] illeness, String bloodGroup, String address, Long contact, String relativeName) {
        this.patientName = patientName;
        this.gender = gender;
        this.age = age;
        this.illeness = illeness;
        this.bloodGroup = bloodGroup;
        this.address = address;
        this.contact = contact;
        this.relativeName = relativeName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getIlleness() {
        return illeness;
    }

    public void setIlleness(String[] illeness) {
        this.illeness = illeness;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getRelativeName() {
        return relativeName;
    }

    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getAddress() {
        return address;
    }
}

public class EncapsulationHospitalDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital("SASOON HOSPITAL", "MutliSpec", "PUNE-MH", 9876543120L, "sasoon@gmail.com");

        for (;;) {
            System.out.println("1. Display Hospital Details");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Patient");
            System.out.println("4. View Patient");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter an option: ");

            int option = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (option) {
                case 1: {
                    displayHospital(hospital);
                    break;
                }
                case 2: {
                    addDoctor(hospital, sc);
                    break;
                }
                case 3: {
                    addPatient(hospital);
                    break;
                }
                case 4: {
                    viewPatient(hospital);
                    break;
                }
                case 5: {
                    System.out.println("Thank you for using the application");
                    System.exit(0);
                }
                default: {
                    System.out.println("INVALID INPUT");
                }
            }
            System.out.println();
        }
    }

    public static void displayHospital(Hospital hospital) {
        System.out.println("Hospital Details");
        System.out.println("Name: " + hospital.getName());
        System.out.println("Type: " + hospital.getType());
        System.out.println("Contact: " + hospital.getContact());
        System.out.println("Address: " + hospital.getAddress());
        System.out.println("Email: " + hospital.getEmail());

        ArrayList<Doctor> dupList = hospital.getDoctorList();
        if (dupList.size() == 0) {
            System.out.println("\nNo doctor data available\n");
            return;
        }
        for (Doctor doctor : dupList) {
            System.out.println(doctor.getDoctorID() + ": " + doctor.getDoctorName()
                    + ", Specialization: " + doctor.getSpecialization() + ", Exp: "
                    + doctor.getExperience());
            System.out.println();
        }
    }

    public static void addDoctor(Hospital hospital, Scanner sc) {
        System.out.print("Enter doctor name: ");
        String docName = sc.nextLine();
        Doctor doctor = new Doctor(docName, "NEURO", 20);
        hospital.setDoctor(doctor);
        System.out.println("Doctor Added");
    }

    public static void addPatient(Hospital hospital) {
        String[] illeness1 = {"Fever", "Sugar", "BP"};
        Patient patient1 = new Patient("Mahesh", "Male", 75, illeness1, "B+", "Pune", 775591965L, "Ganesh");
        hospital.addPatient(patient1);

        String[] illeness2 = {"Fever", "Sugar", "BP"};
        Patient patient2 = new Patient("Suresh", "Male", 65, illeness2, "A+", "Mumbai", 775591965L, "Ramesh");
        hospital.addPatient(patient2);

        String[] illeness3 = {"Cold", "Cough"};
        Patient patient3 = new Patient("Rajesh", "Male", 55, illeness3, "O+", "Nagpur", 775591965L, "Naresh");
        hospital.addPatient(patient3);
    }

    public static void viewPatient(Hospital hospital) {
        if (hospital.getPatientList().size() == 0) {
            System.out.println("\nNO PATIENT DATA FOUND");
            return;
        }
        System.out.println("PATIENT Details");
        for (Patient obj : hospital.getPatientList()) {
            System.out.println();
            System.out.println("Patient id: " + obj.getPatientId());
            System.out.println("Patient Name: " + obj.getPatientName());
            System.out.println("Address: " + obj.getAddress());
            System.out.print("Illness: ");
            for (String illness : obj.getIlleness()) {
                System.out.print(illness + " ");
            }
            System.out.println();
            System.out.println("Contact: " + obj.getContact());
            System.out.println("Age: " + obj.getAge());
            System.out.println("Gender: " + obj.getGender());
            System.out.println("Relative Name: " + obj.getRelativeName());
        }
    }
}

       
        