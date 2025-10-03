#include <stdio.h>

int main() {
    int n, i;
    unsigned long long int f1 = 0, f2 = 1, siguiente;

    printf("Ingrese la cantidad de numeros Fibonacci a generar: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("Por favor ingrese un numero mayor a 0.\n");
        return 1;
    }

    printf("Serie de Fibonacci de %d numeros:\n", n);

    for (i = 1; i <= n; i++) {
        if (i == 1) {
            printf("%llu ", f1);
            continue;
        }
        if (i == 2) {
            printf("%llu ", f2);
            continue;
        }
        // Cálculo correcto de Fibonacci: suma de los dos números anteriores
        siguiente = f1 + f2;  
        printf("%llu ", siguiente);
        f1 = f2;
        f2 = siguiente;
    }

    printf("\n");
    return 0;
}
