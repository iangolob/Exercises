#include <stdio.h>
#define MAX_NIZ 20

void izbaciNR(char *p) {
   int poz = 0;
   while (*(p + poz) != '\0') {
      poz++;
   }
   if (*(p + poz - 1) == '\n') {
      *(p + poz - 1) = '\0';
   }
   return;
}

void stvoriObrnutiNiz(char *p1, char *p2) {
   int duljina = 0;
   while (*(p1 + duljina) != '\0') {
      duljina++;
   }
   for (int i = duljina - 1; i >= 0; i--) {
      *(p2 + duljina - i - 1) = *(p1 + i);
   }
   *(p2 + duljina) = '\0';
   return;
}

int main(void) {
   char niz1[MAX_NIZ + 1], niz2[MAX_NIZ + 1];

   printf("Upisite niz > ");
   fgets(niz1, MAX_NIZ, stdin);

   izbaciNR(niz1);

   stvoriObrnutiNiz(niz1, niz2);

   printf("Originalni: %s\nObrnuti   : %s", niz1, niz2);

   return 0;
}