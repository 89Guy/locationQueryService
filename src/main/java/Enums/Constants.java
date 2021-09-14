package Enums;

public enum Constants {

    TEST_RAIL_URL(""),
    TEST_RAIL_PROJECT_NAME("Automation"),
    TEST_RAIL_SUITE_NAME(""),
    CSVJSONURL("https://www.seleniumeasy.com/test/input-form-demo.html");

    public String value;

    Constants(String value){
        this.value=value;
    }
}
