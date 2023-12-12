import re

def to_words(n):
   match1 = re.fullmatch("\d*\.?\d*",str(n))
   if match1 is None:
      print("Not a Valid Number")
      return
   my_dict = {'1': 'one', '2': 'two', '3': 'three', '4': 'four', '5': 'five', '6': 'six', '7': 'seven', '8': 'eight', '9': 'nine', '0': 'zero', '.': 'point'}
   for i in n:
      print(my_dict[i], end=" ")
   print()


a = "1234.8182"
print(a)
to_words(a) 