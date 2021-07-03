# Travel-Management-System


* Travel Management System designed using java swing, awt &amp; mysql.

---

### This is just an overview of management in the travel & tourism company. It manages and maintains the records of customers, hotels, packages of the travel company. The project is aimed to maintain the day-to-day state of holidays/vacation of customers, List of hotels, package details etc. Main objective of this project is to provide solution for travel company to manage most there work using computerized process. This software application will help admin to handle customer information, hotels allocation details, custmer details etc.


### Database


```

show datbase;

CREATE SCHEMA tms;

use tms;

--Create table account

create table account(username varchar(30), name varchar(30), password varchar(30), securityQsn varchar(30), answer varchar(30), primary key (username));


-- Create table customer

create table customer(username varchar(30), id_type varchar(20), number varchar(20), name varchar(30), gender varchar(15), country varchar(20), address varchar(50), phone bigint, email varchar(40));


--Create table hotels

create table hotels(name varchar(30), cost_per_day int(20), food_charges int(20), ac_charges int(20)); 


--Create book hotel

create table bookHotel(username varchar(30), name varchar(30), persons varchar(20), days varchar(20), ac varchar(10), food varchar(10), id varchar(30), number varchar(20), phone varchar(20), cost int(20));


--Create book package

create table bookPackage(username varchar(30), package varchar(40), persons varchar(20), id varchar(30), number varchar(20), phone varchar(20), price int(20));






```
#### Main Dashboard
![Screenshot (40)](https://user-images.githubusercontent.com/82214263/124360823-7ba3fc80-dc49-11eb-8431-ca00e0f76162.png)


#### Login
![Login](https://user-images.githubusercontent.com/82214263/124362202-2cfa6080-dc51-11eb-8408-a351af7a9549.PNG)


#### Signup
![Signup](https://user-images.githubusercontent.com/82214263/124362208-397eb900-dc51-11eb-9b4d-2c1205b047d3.PNG)

#### Forgot Password
![ForgotPassword](https://user-images.githubusercontent.com/82214263/124362373-07ba2200-dc52-11eb-9e02-9226ec6a4dfd.PNG)


#### Add Customer
![AddCustomer](https://user-images.githubusercontent.com/82214263/124362228-53200080-dc51-11eb-9396-94feae7c807f.PNG)


#### View Customer Details
![ViewCustomerDetails](https://user-images.githubusercontent.com/82214263/124362238-64690d00-dc51-11eb-90e6-eeefdbb6864a.PNG)


#### Delete Customer Details
![DeleteCutomer](https://user-images.githubusercontent.com/82214263/124362247-734fbf80-dc51-11eb-8a3d-a00189d032f5.PNG)


#### Explore Available Package
![checkpackage](https://user-images.githubusercontent.com/82214263/124362274-8f536100-dc51-11eb-84fb-47ea3d3ba583.PNG)




#### Book Package
![bookpackage](https://user-images.githubusercontent.com/82214263/124362263-82367200-dc51-11eb-8291-a82ed6ce617f.PNG)


#### Check Booked Hotels
![ViewBookedHotels](https://user-images.githubusercontent.com/82214263/124362285-a1350400-dc51-11eb-9379-ff92b63c6682.PNG)




#### Don't forget to use mysql-connector jar file in your libraries. The link is given below.

[mysql-connector-java-5.1.49](https://github.com/iamkishan067/Travel-Management-System/tree/main/dist/lib)


