#include "fibonacci.h"

static int fib1, fib0;

void resetFibonacci(void) {
   fib1 = 0;
   fib0 = 0;
};
int getNextFibonacci(void) {
   int temp = fib0;
   fib0 = fib1;
   fib1 = fib1 + temp;
   if (fib1 == 0 && fib0 == 0) {
      fib1 = 1;
   }
   return fib1;
};