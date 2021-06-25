#include <stdio.h>

int main(void) {
   int br = 0;
   int n = 1;

   while (br < 50) {
      if (n % 3 == 0 || n % 7 == 0) {
         printf("%d", n);
         br++;
         if (br % 10 == 0) {
            if (br != 50)
               printf("\n");
         } else {
            printf(", ");
         }
      }
      n++;
   }

   return 0;
}