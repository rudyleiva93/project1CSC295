/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCheckoutSimulator;

/**
 *
 * @author rleiva
 */
public class CustomerInfo {
    
    private String title;
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postcode;
    private String visa;
    
    public CustomerInfo()
    {
        title = "";
        firstName = "";
        lastName = "";
        address1 = "";
        address2 = "";
        city = "";
        state = "";
        postcode = "";
        visa = "";
    }
    
    public CustomerInfo(String title, String firstName, String lastName, String address1, String address2, String city, String state, String postcode, String visa)
    {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.visa = visa;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getVisa() {
        return visa;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }
    
    
}
