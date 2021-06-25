#include <math.h>
#include <stdio.h>

int main(void) {
   int n;
   scanf("%d", &n);
   if (n % 2 == 0) {
      printf("Nije");
   } else {
      int prime = 1;
      for (int i = 3; i <= sqrt(n); i = i + 2) {
         if (n % i == 0) {
            prime = 0;
         }
      }
      if (prime) {
         printf("Je");
      } else {
         printf("Nije");
      }
   }
   return 0;
}