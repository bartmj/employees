package employees

interface EmployeeManager {
    fun add(employee: Employee) {}
    fun logInfo(employee: Employee) {}
    fun payrollSum() {}
}


//* Następnie dodaj interfejs EmployeeManager z metodami:
//* - do dodawania pracownika
//* - taką która wypisuje wszystkie informacje (id, address, salary, position) wszystkich aktualnie dodanych pracowników
//* - taką, która zwraca sumę wynagrodzeń wszystkich pracowników