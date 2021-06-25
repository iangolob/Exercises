#include <stdio.h>

int main(void) {
   char ulazniNiz[21], mSlova[21], vSlova[21];
   printf("Upisati niz > ");
   fgets(ulazniNiz, 20, stdin);
   int i = 0, mLen = 0, vLen = 0;
   while (ulazniNiz[i] != '\0') {
      if (ulazniNiz[i] >= 'a' && ulazniNiz[i] <= 'z') {
         mSlova[mLen] = ulazniNiz[i];
         mLen++;
      }
      if (ulazniNiz[i] >= 'A' && ulazniNiz[i] <= 'Z') {
         vSlova[vLen] = ulazniNiz[i];
         vLen++;
      }
      i++;
   }
   mSlova[mLen] = '\0';
   vSlova[vLen] = '\0';
   printf("%d: %s\n", mLen, mSlova);
   printf("%d; %s\n", vLen, vSlova);
   return 0;
}