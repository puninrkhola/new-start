public class helloworld{
    public static void main(String[] args) {
        // Integer variable to store age
        int age = 25;

        // Double variable to store a product price
        double price = 19.99;

        // Character variable to store a grade
        char grade = 'A';

        // Boolean variable to check if the user is a student
        boolean isStudent = true;

        // String variable to store a name
        String name = "John Doe";

        // Performing some arithmetic operations
        double discountedPrice = price * 0.9; // 10% discount
        int nextYearAge = age + 1; // Age next year

        // Printing values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
        System.out.println("Age Next Year: " + nextYearAge);
    }
}
