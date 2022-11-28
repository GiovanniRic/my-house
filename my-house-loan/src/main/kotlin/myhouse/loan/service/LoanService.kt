package myhouse.loan.service

interface LoanService {

      fun calculateInstallmentMonthly(amount: Double, tax: Double, years: Int) : Float

      fun calculateTotalInterests(amount: Double, tax: Double, i: Int): Float

}


