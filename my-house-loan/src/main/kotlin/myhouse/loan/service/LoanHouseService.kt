package myhouse.loan.service

import java.text.DecimalFormat
import kotlin.math.pow

class LoanHouseService : LoanService {

    override fun calculateInstallmentMonthly(amount: Double, tax: Double, years: Int): Float {

        val numInstallmentYear = 12
        val numInstallmentTotal = numInstallmentYear * years
        val taxOnNumInstallmentYear = (tax/100) / numInstallmentYear
        val pow = (1 + taxOnNumInstallmentYear).pow((numInstallmentTotal.toDouble()))

        val installment = (amount * pow) * ((taxOnNumInstallmentYear) / (pow - 1))
        return formatInstallment(installment)


    }

    override fun calculateTotalInterests(amount: Double, tax: Double, years: Int): Float {

        val installment = calculateInstallmentMonthly(amount, tax, years)
        val totalLoan = installment * (years * 12)
        val totalInterests = totalLoan - amount;

        return formatInstallment(totalInterests)
    }

    private fun formatInstallment(installment: Double) : Float {

        val df = DecimalFormat("#.##")
       return (df.format(installment).replace(",", ".")).toFloat()

    }


}