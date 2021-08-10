package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
interface EmpLastName extends JpaRepository<Employee, String>{
    List<Employee> findAllByLastNameOrderByFirstNameAsc(String lastName);
    Employee findByLastName(String lastName);
}