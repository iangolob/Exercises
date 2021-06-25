#include <math.h>
#include <stdio.h>

void korijeni(int n, float *k2p, float *k3p, float *k5p) {
   *k2p = pow(n, 1.f / 2);
   *k3p = pow(n, 1.f / 3);
   *k5p = pow(n, 1.f / 5);
   return;
}

int main(void) {
   float k2, k3, k5;
   int n;

   printf("Upisite nenegativni cijeli broj > ");
   scanf("%d", &n);

   korijeni(n, &k2, &k3, &k5);

   printf("Rezultati su:\n%f\n%f\n%f", k2, k3, k5);

   return 0;
}