package com.example.STUDENTFORM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity
@Table (name = "certificate")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull(message = "Form number cannot be fill")
    @Min(value = 1,message = "Form number must be atleast 1 ")
    @Max(value = 100,message = "Form number cannot be exceed  100 ")
    private String FormNo;

    @DateTimeFormat(fallbackPatterns = "yyyy-mm-dd")
    @NotNull(message = "Date cannot be fill")
    private Date Date;


    @NotNull(message = "Full name cannot be fill")
    @Size(min = 3,max = 50,message = "Full name must be between 3 and 50 characters")
    private String FullName;

    @NotNull(message = "Reg.No cannot be null")
    @Min(value = 1,message = "Reg number must be atleast 1 ")
    @Max(value = 100,message = "Reg number cannot be exceed  100 ")
    private String RegNo;


    @Pattern(regexp = "^\\d{10}$",message = "whatsapp number must be 10 digits")
    private String WhatsappNo;


    @Email(message = "Email should be valid")
    @NotBlank(message = "email is required")
    private String EmailId;


    @NotBlank(message = "coursecode cannot be blank")
    @Size(min = 3,max = 20,message = "coursecode must be between 3 and 20 characters")
    private String CourseCode;


    @NotNull(message = "Triner name cannot be null")
    @Size(min = 3,max = 50,message = "Triner name must be between 3 and 50 characers")
    private String TrinerName;


    @AssertTrue(message = "you must agree to the terms and conditions")
    private boolean agreeToTerms;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormNo() {
        return FormNo;
    }

    public void setFormNo(String formNo) {
        FormNo = formNo;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String regNo) {
        RegNo = regNo;
    }

    public String getWhatsappNo() {
        return WhatsappNo;
    }

    public void setWhatsappNo(String whatsappNo) {
        WhatsappNo = whatsappNo;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public String getTrinerName() {
        return TrinerName;
    }

    public void setTrinerName(String trinerName) {
        TrinerName = trinerName;
    }

    public boolean isAgreeToTerms() {
        return agreeToTerms;
    }

    public void setAgreeToTerms(boolean agreeToTerms) {
        this.agreeToTerms = agreeToTerms;
    }
}


