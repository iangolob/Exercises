#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define BROJ_PONAVLJANJA 40

int main(void) {
   srand((unsigned int)time(NULL));

   int i = BROJ_PONAVLJANJA;
   char novi;
   int pozicija;

   FILE *slova = fopen("slova.bin", "rb");

   while (i > 0) {
      i--;
      pozicija = rand() % ('z' - 'a' + 1 + 'Z' - 'A' + 1 + '9' - '0' + 1);
      fseek(slova, (long)pozicija, SEEK_SET);
      fread(&novi, sizeof(char), 1, slova);
      printf("%c", novi);
      if (novi == 'X') {
         i = 0;
      }
   }
   fclose(slova);
   return 0;
}