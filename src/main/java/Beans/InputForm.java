package Beans;

import Annotation.CSVAnnotation;
import Annotation.CSVProviderAnnotation;
import Annotation.JsonAnnotation;
import Annotation.JsonProviderAnnotation;
import Utilities.CSVUtility;
import Utilities.JsonUtility;

import java.util.List;

@JsonAnnotation
@CSVAnnotation
public class InputForm {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String websiteOrDomainName;
    private String hostingYes;
    private String projectDescription;
    private String uniqueValue;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getWebsiteOrDomainName() {
        return websiteOrDomainName;
    }

    public void setWebsiteOrDomainName(String websiteOrDomainName) {
        this.websiteOrDomainName = websiteOrDomainName;
    }

    public String getHostingYes() {
        return hostingYes;
    }

    public void setHostingYes(String hostingYes) {
        this.hostingYes = hostingYes;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getUniqueValue() {
        return uniqueValue;
    }

    public void setUniqueValue(String uniqueValue) {
        this.uniqueValue = uniqueValue;
    }

    @CSVProviderAnnotation(value="simpleReadWithOneRowinCSV")
    public static InputForm getCSVDataSimple(){
        CSVUtility csvUtility=new CSVUtility();
        InputForm inputForm= (InputForm) csvUtility.csvRead(InputForm.class);
        return inputForm;
    }

    @CSVProviderAnnotation(value="readCSVWithUniqueIdentfierFromFeatureFile")
    public static InputForm getCSVData(String value){
        CSVUtility csvUtility=new CSVUtility();
        List<InputForm>inputFormList=csvUtility.csvReadAll(InputForm.class);
        InputForm inputForm=new InputForm();
        for(InputForm form:inputFormList){
            if(form.getUniqueValue().equalsIgnoreCase(value)){
                inputForm.setFirstName(form.getFirstName());
                inputForm.setLastName(form.getLastName());
                inputForm.setAddress(form.getAddress());
                inputForm.setEmail(form.getEmail());
                inputForm.setCity(form.getCity());
                inputForm.setPhone(form.getPhone());
                inputForm.setHostingYes(form.getHostingYes());
                inputForm.setProjectDescription(form.getProjectDescription());
                inputForm.setState(form.getState());
                inputForm.setWebsiteOrDomainName(form.getWebsiteOrDomainName());
                inputForm.setZipCode(form.getZipCode());
            }
        }
        return inputForm;
    }

    @JsonProviderAnnotation(value="readJsonWithUniqueIdentfierFromFeatureFile")
    public static InputForm getJsonData(String value){
        JsonUtility jsonUtility=new JsonUtility();
        List<InputForm>inputFormList=jsonUtility.jsonReadAll(InputForm.class);
        InputForm inputForm=new InputForm();
        for(InputForm form:inputFormList){
            if(form.getUniqueValue().equalsIgnoreCase(value)){
                inputForm.setFirstName(form.getFirstName());
                inputForm.setLastName(form.getLastName());
                inputForm.setAddress(form.getAddress());
                inputForm.setEmail(form.getEmail());
                inputForm.setCity(form.getCity());
                inputForm.setPhone(form.getPhone());
                inputForm.setHostingYes(form.getHostingYes());
                inputForm.setProjectDescription(form.getProjectDescription());
                inputForm.setState(form.getState());
                inputForm.setWebsiteOrDomainName(form.getWebsiteOrDomainName());
                inputForm.setZipCode(form.getZipCode());
            }
        }
        return inputForm;
    }

    @Override
    public String toString() {
        return "InputForm{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", websiteOrDomainName='" + websiteOrDomainName + '\'' +
                ", hostingYes='" + hostingYes + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", uniqueValue='" + uniqueValue + '\'' +
                '}';
    }
}
