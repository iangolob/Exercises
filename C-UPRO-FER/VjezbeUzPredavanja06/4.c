#include <stdio.h>

int main(void) {
   int br = 1;
   for (int a = 1; a <= 100; a++) {
      for (int b = 1; b <= 100; b++) {
         for (int c = 1; c <= 100; c++) {
            if (a * a + b * b == c * c) {
               printf("%d. trojka: %d^2 + %d^2 = %d^2\n", br, a, b, c);
               br++;
            }
         }
      }
   }
   return 0;
}