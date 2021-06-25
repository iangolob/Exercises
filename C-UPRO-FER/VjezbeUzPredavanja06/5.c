#include <stdio.h>

int main(void) {

   int br = 0, test = 2, prime = 1;

   while (br < 25) {
      for (int i = 2; i < test; i++) {
         if (test % i == 0) {
            prime = 0;
         }
      }
      if (prime == 1) {
         printf("%d\n", test);
         br++;
      }
      prime = 1;
      test++;
   }
   return 0;
}