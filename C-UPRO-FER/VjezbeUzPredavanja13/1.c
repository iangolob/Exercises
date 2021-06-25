#include <stdio.h>

double kvadrat(float x) { return x * x; }

int main(void) {
   float n;
   scanf("%f", &n);
   printf("%lf", kvadrat(n));
   return 0;
}