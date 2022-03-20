package employees

class EmployeeManagerImpl : EmployeeManager {

    private var totalSum: Int = 0

    private val employees = mutableListOf<Employee>()

    override fun add(employee: Employee) {
        employees.add(employee)
    }

    override fun logInfo(employee: Employee) {
        for (e in employees) {
            print(" " + employee.id + " " + employee.address + " " + employee.salary + " " + employee.position)
        }
    }

    override fun payrollSum() {
        var sum : Int = 0
        for(e in employees) {
            sum += e.salary
        }
        totalSum = sum
    }
}