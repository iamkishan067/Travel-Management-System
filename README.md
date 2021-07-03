# Travel-Management-System


## Travel Management System designed using java swing, awt &amp; mysql.

---

### This is just an overview of management in the travel & tourism company. It manages and maintains the records of customers, hotels, packages of the travel company. The project is aimed to maintain the day-to-day state of holidays/vacation of customers, List of hotels, package details etc. Main objective of this project is to provide solution for travel company to manage most there work using computerized process. This software application will help admin to handle customer information, hotels allocation details, custmer details etc.


~~The world is flat.~~


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

![Screenshot (40)](https://user-images.githubusercontent.com/82214263/124360823-7ba3fc80-dc49-11eb-8431-ca00e0f76162.png)


![Splash](https://user-images.githubusercontent.com/82214263/124360898-e81efb80-dc49-11eb-87ea-c15e0a122309.PNG)

![Screenshot (38)](https://user-images.githubusercontent.com/82214263/124360933-14d31300-dc4a-11eb-8a30-260705062a35.png)


![Screenshot (36)](https://user-images.githubusercontent.com/82214263/124360951-1e5c7b00-dc4a-11eb-9137-9c58f4264561.png)

![Screenshot (41)](https://user-images.githubusercontent.com/82214263/124360827-852d6480-dc49-11eb-8375-c2005ae6fce4.png)


![Screenshot (37)](https://user-images.githubusercontent.com/82214263/124360954-23212f00-dc4a-11eb-861a-90884f9237cb.png)


![Screenshot (43)](https://user-images.githubusercontent.com/82214263/124360966-3502d200-dc4a-11eb-8843-a4bef4ffbf09.png)


![Screenshot (51)](https://user-images.githubusercontent.com/82214263/124360973-3df3a380-dc4a-11eb-98d1-92a942aff688.png)







	Don't forget to use mysql-connertor jar file in your libraries. [^1]
	[title](https://www.example.com)
