package payroll;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
    EmployeeNotFoundException(String lastName){
        super("Could not find any employees by this last name: " + lastName);
    }
}