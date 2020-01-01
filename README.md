# Day 5 Challenge
In this 5th Challenge of mine 
I try to connect XAMPP SQL and PHP server in my java GUI
with the combination of ArrayList as a part of principle in Data Structure and Algorithms 

# JDBC API DOCS

The Java Database Connectivity (JDBC) API provides universal data access from the Java programming language. Using the JDBC API, you can access virtually any data source, from relational databases to spreadsheets and flat files. JDBC technology also provides a common base on which tools and alternate interfaces can be built.

The JDBC API is comprised of two packages:

-   [`java.sql`](https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html)
-   [`javax.sql`](https://docs.oracle.com/javase/8/docs/api/javax/sql/package-summary.html)

You automatically get both packages when you download the Java Platform Standard Edition (Java SE) 8.

To use the JDBC API with a particular database management system, you need a JDBC technology-based driver to mediate between JDBC technology and the database. Depending on various factors, a driver might be written purely in the Java programming language or in a mixture of the Java programming language and Java Native Interface (JNI) native methods. To obtain a JDBC driver for a particular database management system, see  [JDBC Data Access API](http://www.oracle.com/technetwork/java/javase/tech/index-jsp-136101.html).

## Enhancements in Java SE 8

**Component**: core-libs  
**Sub-Component**: java.sql:bridge  
**Synopsis**: The JDBC-ODBC Bridge has been removed.  
**RFE**:  [7176225](http://bugs.java.com/bugdatabase/view_bug.do?bug_id=7176225)

**Component**: core-libs  
**Sub-Component**: java.sql  
**Synopsis**:  [JDBC 4.2](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/jdbc_42.html)  introduces the following features:

-   Addition of REF_CURSOR support.
-   Addition of  `java.sql.DriverAction`  Interface
-   >Addition of security check on deregisterDriver Method in DriverManager Class
-   Addition of the  `java.sql.SQLType`  Interface
-   Addition of the  `java.sql.JDBCType`  Enum
-   Add Support for large update counts
-   Changes to the existing interfaces
-   Rowset 1.2: Lists the enhancements for JDBC RowSet.
