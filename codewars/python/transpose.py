def transpose(matrix):
    out = []
    for _ in range(len(matrix[0])):
        out.append([None] * len(matrix))
    print(out)
    for row_i, row in enumerate(matrix):
        for data_i, data in enumerate(row):
            out[data_i][row_i] = data
    return out


print(transpose([[1, 2, 3]]))
