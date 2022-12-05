package myhouse.loan.service


import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class LoanHouseServiceTest {

    lateinit var service: LoanService;

    @BeforeEach
    fun setUp() {
        service = LoanHouseService()
    }


    @Test
    fun when_calculate_total_interest() {

        val result = service.calculateTotalInterests(100000.toDouble(), 1.50, 20)
        assertEquals(15812.0F, result)

    }


    @Test
    fun when_calculate_installment_monthly() {

        val result = service.calculateInstallmentMonthly(100000.toDouble(), 1.50, 20)
        assertEquals(482.55F, result)

    }


}