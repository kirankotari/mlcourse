import json
import difflib
from difflib import get_close_matches

data = json.load(open('dictionary.json'))

output = get_close_matches('rain', ['help','mate','rainy'], n=1, cutoff = 0.75)

print(output)