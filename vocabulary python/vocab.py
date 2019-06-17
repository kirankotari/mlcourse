import json
from difflib import get_close_matches

data = json.load(open('dictionary.json'))

def retrieve_definition(word):
    word = word.lower()

    if word in data:
        return data[word]
    elif word.title() in data:
        return data[word.title()]
    elif word.upper() in data:
        return data[word.upper()]
    elif len(get_close_matches(word, data.keys())) > 0:
        return ("Did you mean %s instead?" % get_close_matches(word, data.keys())[0])

word_user = input('Enter a word: ')

print(retrieve_definition(word_user))