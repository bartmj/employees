package employees

interface EmployeeManager {
    fun add(employee: Employee) {}
    fun logInfo() {}
    fun payrollSum(): Int
}