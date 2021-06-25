#include <stdio.h>

int fib(int raz) {
   if (raz > 2) {
      return fib(raz - 1) + fib(raz - 2);
   } else {
      return 1;
   }
}

int main(void) {
   int n;
   printf("%d", fib(15));
}