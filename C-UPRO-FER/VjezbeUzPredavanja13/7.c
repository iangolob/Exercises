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
   scanf("%d", &n);
   for (int i = 0; i < n; i++) {
      printf("%d, ", fib(i + 1));
   }
   return 0;
}