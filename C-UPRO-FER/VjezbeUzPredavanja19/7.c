#include "fibonacci.h"
#include <stdio.h>
int main(void) {

   int n;
   printf("Upisite broj Fibonaccijevih brojeva > ");
   scanf("%d", &n);

   resetFibonacci();
   for (int i = 0; i < n; i++) {
      printf("%d\n", getNextFibonacci());
   }
   return 0;
}