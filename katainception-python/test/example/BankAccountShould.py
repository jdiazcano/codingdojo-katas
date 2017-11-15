import unittest
import example


class BankAccountShould(unittest.TestCase):
    def have_balance_of_zero_when_created(self):
        bankAccount = example.BankAccount()

        self.assertEqual(bankAccount.accountValue, 0)

    def have_the_balance_increased_after_a_deposit(self):
        bankAccount = example.BankAccount()

        bankAccount.deposit(self, 10)

        self.assertEqual(bankAccount.accountValue, 10)
