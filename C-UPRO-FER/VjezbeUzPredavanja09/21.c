#include <stdio.h>

int main(void) {
   unsigned long long n;
   printf("Upisite prirodni broj u granicama [1, 4250000000] > ");
   scanf("%llu", &n);
   printf("%llu * %llu = %llu", n, n, n * n);
   return 0;
}