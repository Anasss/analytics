# Country Analytics :chart_with_upwards_trend:
[![Build Status](https://travis-ci.com/Anasss/analytics.svg?branch=main)](https://travis-ci.com/Anasss/analytics)

Demo for Country data analytics

A SpringBoot webApp managing countries data.

## How to build and run from sources?

* Clone the repository:

```
git clone https://github.com/Anasss/analytics.git 

```

* Install dependencies:

```
cd analytics
mvn install

```

* Running the app:

```
mvn spring-boot:run

```

## Functional description
* Create a server that returns an html page with an empty table, having 3 colmns (see table below)
  ![excel-table](https://github.com/Anasss/analytics/blob/main/screenshots/excel-screenshot.png)
* Add a form (or anything else) that alows the user to add an entry into the table
* Save the entries on the server in a database (SQL, mysql, postgress, csv, Excel, txt, xml…)
    * Optional: create one or two charts to visualise the entered data

## Class Diagram
![analytics class diagram](https://github.com/Anasss/analytics/blob/main/screenshots/class-diagram.png)


## Tech stack
* Java 8
* SpringBoot
* Lombock
* Maven
* ThymeLeaf
* Bootstrap
* H2 DB

## Demo
![ui screenshot](https://github.com/Anasss/analytics/blob/main/screenshots/ui-screenshot.png)
