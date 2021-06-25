#include <stdbool.h>
#include <stdio.h>

int main(void) {
   char c[8 + 1];

   printf("Upisite niz > ");
   fgets(c, 8 + 1, stdin);

   printf("Niz: %s\n", c);

   unsigned long heks = 0;
   bool nije = false;
   int i = 0;
   while (c[i] != '\n' && c[i] != '\0' && !nije) {
      if ((c[i] <= 'F' && c[i] >= 'A') || (c[i] <= '9' && c[i] >= '0')) {
         if (c[i] <= 'F' && c[i] >= 'A') {
            heks = heks * 16 + c[i] - 'A' + 10;
         } else {
            heks = heks * 16 + c[i] - '0';
         }
      } else {
         nije = true;
         printf("Neispravan znak %c na poziciji %d", c[i], i + 1);
      }
      i++;
   }
   if (!nije) {
      printf("Dekadski: %lu", heks);
   }
   return 0;
}