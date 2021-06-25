#include <stdio.h>

int brojiSamoglasnike(char path[40]) {
   int rez = 0;
   char c;
   FILE *dat = fopen(path, "r");
   if (dat == NULL) {
      rez = -1;
   } else {
      while ((c = getc(dat)) != EOF) {
         switch (c) {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
         case 'A':
         case 'E':
         case 'I':
         case 'O':
         case 'U':
            rez++;
            break;
         }
      }
   }
   fclose(dat);
   return rez;
}

int main(void) {

   char path[40];
   printf("Upisite kompletan put do datoteke > ");
   scanf("%s", path);

   int broj = brojiSamoglasnike(path);
   if (broj == -1) {
      printf("Nije uspjelo otvaranje datoteke %s", path);
   } else {
      printf("Broj samoglasnika u datoteci %s je %d", path, broj);
   }
   return 0;
}