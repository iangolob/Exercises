#include <stdio.h>

int main(void) {
   int s = 0;
   int i = 11;
   int br = 0;
   while (br < 1000) {
      if (i % 7 == 0 || i / 10 % 10 + i % 10 == 5) {
         s = s + i;
         br++;
      }
      i++;
   }

   printf("%d", s);
}