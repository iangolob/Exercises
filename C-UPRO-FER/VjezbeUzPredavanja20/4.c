#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_NIZ 60

void izbaciNR(char *p) {
   while (*p != '\0') {
      if (*p == '\n') {
         *p = '\0';
      }
      p++;
   }
   return;
}

void genText(char *pc, char *pnovi, int duljina) {
   static int duljina_c;
   static _Bool inicijalizirano = 0;
   if (!inicijalizirano) {
      srand((unsigned int)time(NULL));

      duljina_c = 0;
      while (*(pc + duljina_c) != '\0') {
         duljina_c++;
      }
      inicijalizirano = 1;
   }

   for (int i = 0; i < duljina; i++) {
      *(pnovi + i) = *(pc + rand() % duljina_c);
   }
   *(pnovi + duljina) = '\0';
   return;
}

int main(void) {
   char c[MAX_NIZ + 1];
   printf("Upisite niz > ");
   fgets(c, MAX_NIZ + 1, stdin);
   printf("Upisite duljinu generiranog niza > ");
   int n;
   scanf("%d", &n);

   izbaciNR(c);

   char novi_niz[n + 1];

   genText(&c[0], &novi_niz[0], n);
   printf("a%s\n", novi_niz);
   genText(&c[0], &novi_niz[0], n);
   printf("a%s\n", novi_niz);
   genText(&c[0], &novi_niz[0], n);
   printf("a%s\n", novi_niz);

   return 0;
}