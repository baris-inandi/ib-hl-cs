def disemvowel(string_):
    return "".join(
        [c for c in string_ if c.lower() not in ["a", "e", "i", "o", "u"]]
    )  # noqa: E501


print(disemvowel("This website is for losers LOL!"))
