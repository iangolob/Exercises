#include <stdio.h>

int main(void) {
   unsigned int n = 0;
   int poz, b;
   while (scanf("%d %d", &b, &poz),
          (b == 0 || b == 1) && (poz >= 0 && poz < 32)) {
      if (b == 0) {
         n = n & ~(0x1 << poz);
      } else {
         n = n | (0x1 << poz);
      }
      for (int i = 31; i >= 0; i--) {
         printf("%0X", (n >> i) & 0x1);
      }
      printf(" = %u\n", n);
   }

   printf("End");
   return 0;
}