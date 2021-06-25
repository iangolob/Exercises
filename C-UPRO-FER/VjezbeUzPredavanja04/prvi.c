#include <stdio.h>

int main(void) {
   float x, y;
   int n;

   printf("Upisite dva realna broja > ");
   scanf("%f %f", &x, &y);
   printf("Upisite vrstu operacije (1-zbrajanje, 2-mnozenje) > ");
   scanf("%d", &n);

   if (n == 1) {
      printf("Zbroj je %f", x + y);
   } else if (n == 2) {
      printf("Umnozak je %f", x * y);
   } else {
      printf("Neispravan odabir operacije");
   }
   return 0;
}