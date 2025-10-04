def cursorbuzz(n, max_n): 
    if n > max_n:
        print(f"Error: el valor de n ({n}) excede el máximo permitido ({max_n}).")
        return
    for i in range(1, n+1):
        if i % 3 == 0 and i % 5 == 0:
            print("Cursorbuzz")
        elif i % 3 == 0:
            print("Fizz")
        elif i % 5 == 0:
            print("Buzz")
        else:
            print(i)

# Ejemplo de uso
cursorbuzz(100, 150)