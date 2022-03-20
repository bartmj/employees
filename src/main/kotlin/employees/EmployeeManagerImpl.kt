package employees

class EmployeeManagerImpl : EmployeeManager {

    private val employees = mutableListOf<Employee>()

    override fun add(employee: Employee) {
        employees.add(employee)
    }

    override fun logInfo() {
        for (e in employees) {
            print("${e.id} ${e.address} ${e.salary} ${e.position}")
        }
    }

    override fun payrollSum(): Int {
        var sum : Int = 0
        for(e in employees) {
            sum += e.salary
        }
        return sum
    }
}