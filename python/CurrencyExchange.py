"""Functions for calculating steps in exchaning currency.

Python numbers documentation: https://docs.python.org/3/library/stdtypes.html#numeric-types-int-float-complex

Overview of exchanging currency when travelling: https://www.compareremit.com/money-transfer-tips/guide-to-exchanging-currency-for-overseas-travel/
"""



def exchange_money(budget, exchange_rate):
    """

    :param budget: float - amount of money you are planning to exchange.
    :param exchange_rate: float - unit value of the foreign currency.
    :return: float - exchanged value of the foreign currency you can receive.
    """

    value_exchange_money = budget / exchange_rate
    return value_exchange_money


def get_change(budget, exchanging_value):
    """

    :param budget: float - amount of money you own.
    :param exchanging_value: float - amount of your money you want to exchange now.
    :return: float - amount left of your starting currency after exchanging.
    """

    new_budget = budget - exchanging_value
    return new_budget


def get_value_of_bills(denomination, number_of_bills):
    """

    :param denomination: int - the value of a bill.
    :param number_of_bills: int - total number of bills.
    :return: int - calculated value of the bills.
    """
    value_of_bills = (int) (denomination * number_of_bills)
    return value_of_bills
    


def get_number_of_bills(amount, denomination):
    """

    :param amount: float - the total starting value.
    :param denomination: int - the value of a single bill.
    :return: int - number of bills that can be obtained from the amount.
    """

    number_of_bills = (int) (amount / denomination)
    return number_of_bills


def get_leftover_of_bills(amount, denomination):
    """

    :param amount: float - the total starting value.
    :param denomination: int - the value of a single bill.
    :return: float - the amount that is "leftover", given the current denomination.
    """

    leftover_of_bills = amount % denomination
    return leftover_of_bills

def exchangeable_value(budget, exchange_rate, spread, denomination):
    """

    :param budget: float - the amount of your money you are planning to exchange.
    :param exchange_rate: float - the unit value of the foreign currency.
    :param spread: int - percentage that is taken as an exchange fee.
    :param denomination: int - the value of a single bill.
    :return: int - maximum value you can get.
    """
    
    total_exchange_fee = exchange_rate + ((spread / 100) * exchange_rate)
    exchanged_value = exchange_money(budget,total_exchange_fee)
    total_bills = get_number_of_bills(exchanged_value, denomination)
    exchangeabled_value = get_value_of_bills(total_bills, denomination)
    return exchangeabled_value
    
    
print(exchangeable_value(100000, 10.61, 10, 1))
print(exchangeable_value(1500, 0.84, 25, 40))
print(exchangeable_value(470000, 1050, 30, 10000000000))
print(exchangeable_value(470000, 0.00000009, 30, 700))
print(exchangeable_value(425.33, 0.0009, 30, 700))





