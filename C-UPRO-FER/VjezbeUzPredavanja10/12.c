#include <stdio.h>

int main(void) {
   int br['z' - 'a' + 1] = {0};
   char c[81];

   printf("Upisite niz > ");
   fgets(c, 80, stdin);

   int i = 0;
   while (c[i] != '\0') {
      if (c[i] >= 'a' && c[i] <= 'z') {
         br[c[i] - 'a']++;
      }
      i++;
   }
   for (i = 0; i <= 'z' - 'a'; i++) {
      if (br[i] != 0) {
         printf("slovo '%c' pojavilo se %d puta\n", i + 'a', br[i]);
      }
   }
   return 0;
}