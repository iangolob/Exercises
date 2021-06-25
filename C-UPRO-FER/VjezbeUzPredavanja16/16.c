#include <stdio.h>
#define MAX_LEN 20

void brojVelikaMala(char *p, int *v, int *m) {
   int poz = 0;
   while (*(p + poz) != '\0') {
      if (*(p + poz) >= 'A' && *(p + poz) <= 'Z') {
         (*v)++;
      }
      if (*(p + poz) >= 'a' && *(p + poz) <= 'z') {
         (*m)++;
      }
      poz++;
   }
   return;
}

int main(void) {
   char a[MAX_LEN + 1];
   printf("Upisite niz > ");
   fgets(a, MAX_LEN + 1, stdin);

   int velika = 0, mala = 0;
   brojVelikaMala(&a[0], &velika, &mala);
   printf("Velikih: %d\nMalih: %d", velika, mala);

   return 0;
}