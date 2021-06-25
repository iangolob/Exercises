#include <stdio.h>

int main(void) {

   int prime = 1;

   for (int test = 1000; test <= 10000; test++) {
      for (int i = 2; i < test; i++) {
         if (test % i == 0) {
            prime = 0;
         }
      }
      if (prime == 1) {
         printf("%d\n", test);
      }
      prime = 1;
   }
   return 0;
}