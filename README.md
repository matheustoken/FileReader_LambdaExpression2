# Sales Data Analysis Program

## Description
This program reads a `.csv` file containing sales data records and instantiates a list of **Sale** objects in memory. The program will then calculate the total sales for each seller and display the results.

### Requirements:
- **Types**: Do not use primitive types like `int` or `double` for attributes and methods. Use **wrapper types** like `Integer` and `Double` for the fields, as shown in the project.

- **CSV File**: Download the sales data CSV file from the following link:  
  [Sales Data CSV](https://gist.github.com/acenelio/e4e169691ee5aef2c56c87bc22a54379)

- **Exception Handling**: If an error occurs while reading the file, it should be handled, and an appropriate error message should be displayed.

### Steps:
1. **Reading the CSV**: Parse the `.csv` file and load the sales data into a list of `Sale` objects. Each sale record should contain relevant information, such as price, seller name, and date.

2. **Sale Class**:
   - **Attributes**:
     - **Price**: The price of the sale (use `Double`).
     - **Seller**: The name of the seller (use `String`).
     - **Date**: The date of the sale (use `String` or `LocalDate`).

   - **Methods**:
     - `toString()`: Override the `toString` method to display sale details.
     - `getSeller()`: Retrieve the seller's name.
     - `getPrice()`: Retrieve the sale price.

3. **Analysis**:
   - **Total Sales per Seller**: Calculate the total sales amount for each seller and display the results. The order in which sellers are displayed doesn't matter
   
4. **Collections**:
   - Use a **Set** or **Map** to collect unique seller names efficiently, as these data structures do not allow duplicates.
   - Use **Stream** and **Lambda expressions** to calculate the total sales per seller from the list.

### Example Output:

![image](https://github.com/user-attachments/assets/62ea9321-f31e-4896-b1d9-8961bfa1f771)

### Class Structure:
- **Sale Class**: This class should represent a sale with the following attributes and methods:
  - **Attributes**: `price`, `seller`, `date`.
  - **Methods**: `toString()`, `getSeller()`, `getPrice()`.

- **Main Program**: The main class should handle reading the CSV file, creating the list of `Sale` objects, and calculating the total sales for each seller using Stream and Lambda expressions.

### Technologies Used:
- Java (or another suitable programming language)
- Stream API
- Lambda Expressions
- Exception Handling
- Set / Map Collections

## Actor:
Matheus Accorsi
