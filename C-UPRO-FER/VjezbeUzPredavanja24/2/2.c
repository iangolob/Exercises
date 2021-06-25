#include <stdio.h>

int main(void) {

   FILE *slova = fopen("slova.bin", "wb");

   for (char i = 'A'; i <= 'Z'; i++) {
      fwrite(&i, sizeof(char), 1, slova);
   }

   for (char i = 'a'; i <= 'z'; i++) {
      fwrite(&i, sizeof(char), 1, slova);
   }

   for (char i = '0'; i <= '9'; i++) {
      fwrite(&i, sizeof(char), 1, slova);
   }

   fclose(slova);
   return 0;
}