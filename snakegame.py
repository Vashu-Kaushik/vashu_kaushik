def add_matrices(matrix1, matrix2):
    # Check if the matrices have the same dimensions
    if len(matrix1) != len(matrix2) or len(matrix1[0]) != len(matrix2[0]):
        raise ValueError("Matrices must have the same dimensions for addition.")

    # Initialize a result matrix with the same dimensions
    result = [[0 for _ in range(len(matrix1[0]))] for _ in range(len(matrix1))]

    # Add the corresponding elements of the matrices
    for i in range(len(matrix1)):
        for j in range(len(matrix1[0])):
            result[i][j] = matrix1[i][j] + matrix2[i][j]

    return result

# Example matrices
matrix1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

matrix2 = [
    [9, 8, 7],
    [6, 5, 4],
    [3, 2, 1]
]

# Adding the matrices
sum_matrix = add_matrices(matrix1, matrix2)

# Displaying the result
print("Sum of the matrices:")
for row in sum_matrix:
    print(row)
