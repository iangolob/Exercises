#include <stdio.h>

int main(void) {
   char c[20 + 1] = {0};
   int max = 0;
   printf("Upisite niz > ");
   fgets(c, 20 + 1, stdin);
   for (int i = 0; i < 21; i++) {
      if (c[i] == '\n') {
         c[i] = '\0';
      }
      if (c[i] > max) {
         max = c[i];
      }
   }
   printf("Niz: %s\nNajveca ASCII vrijednost: %d", c, max);
   return 0;
}