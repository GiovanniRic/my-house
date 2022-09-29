package com.nyhouse.service

interface LoanService {

      fun calculateInstallmentMonthly(amount: Double, tax: Double, years: Int) : Float;

}


