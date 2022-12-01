def accum(s):
    return "-".join(
        [char.upper() + char.lower() * idx for idx, char in enumerate(s)]
    )  # noqa: E501
