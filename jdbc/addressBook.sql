DROP TABLE Addresses;

CREATE TABLE Addresses
(
	AddressID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
	FirstName VARCHAR (15) NOT NULL,
	LastName VARCHAR (30) NOT NULL,
	Email VARCHAR (30) NOT NULL,
	PhoneNumber VARCHAR (15) NOT NULL
);

INSERT INTO Addresses (FirstName,LastName,Email,PhoneNumber)
	VALUES 
		('Mike','Green','demo1@deitel.com','555-5555'),
		('Mary','Brown','demo2@deitel.com','555-1234'),
		('John','Red','demo3@deitel.com','555-1234'),
		('Jason','Silver','demo4@deitel.com','555-1234'),
		('Matt','Black','demo5@deitel.com','555-1234'),
		('Damien','Dark','demo6@deitel.com','555-1234'),
		('Oscar','Pink','demo7deitel.com','555-1234'),
		('Lesther','Money','demo8@deitel.com','555-1234'),
		('Francis','Diamond','demo9@deitel.com','555-1234'),
		('Bacon','Wood','demo10@deitel.com','555-1234');