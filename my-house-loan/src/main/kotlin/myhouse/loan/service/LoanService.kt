package myhouse.loan.service

interface LoanService {

      fun calculateInstallmentMonthly(amount: Double, tax: Double, years: Int) : Float;

}


