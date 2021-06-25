#include <stdio.h>

int main(void) {
   float zbr = 0.f;
   for (float i = 1; i <= 1000; i = i + 2) {
      zbr = zbr + 1.f / i - 1.f / (i + 1.f);
      printf("%f\n", zbr);
   }
   printf("%f\n", zbr);
   zbr = 0;
   float j = 1;
   while (j <= 1000) {
      zbr = zbr + 1.f / j - 1.f / (j + 1.f);
      j = j + 2;
   }
   printf("%f\n", zbr);
   zbr = 0;
   j = 1;
   do {
      zbr = zbr + 1.f / j - 1.f / (j + 1.f);
      j = j + 2;
   } while (j <= 1000);
   printf("%f\n", zbr);

   return 0;
}