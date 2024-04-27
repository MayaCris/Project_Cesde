EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 10


def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """
    total_bake_time_remaining = EXPECTED_BAKE_TIME - elapsed_bake_time
    return total_bake_time_remaining


# You might also consider using 'PREPARATION_TIME' here, if you have it defined.
def preparation_time_in_minutes(number_of_layers):
    """ Calculate the preparation time.
    :param number_of_layers: int - the number of layers in the lasagna.
    :return: int - total preparation time (in minutes) for the lasagna.
    
    This function takes an integer representing the number of lasagna layers and calculates
    the total preparation time in minutes for the lasagna.
    
    """
    total_preparation_time_in_minutes = 2 * number_of_layers
    return total_preparation_time_in_minutes


# Remember to add a docstring (you can copy and then alter the one from bake_time_remaining.)
def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.

    This function takes two integers representing the number of lasagna layers and the
    time already spent baking and calculates the total elapsed minutes spent cooking the
    lasagna.
    """
    
    total_elapsed_time_in_minutes = preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
    return total_elapsed_time_in_minutes