package example

import org.junit.Assert.assertEquals
import org.junit.Test

class BankAccountShould {

    @Test
    fun `have balance of zero when created`() {

        val bankAccount = BankAccount()

        assertEquals(0, bankAccount.balance)

    }

    @Test
    fun `have the balance increased after a deposit`() {

        // given
        val bankAccount = BankAccount()

        // when
        bankAccount.deposit(10)

        // then
        assertEquals(10, bankAccount.balance)

    }

}