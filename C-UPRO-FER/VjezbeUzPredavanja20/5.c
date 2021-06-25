#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
   srand((unsigned int)time(NULL));
   int broj_redaka = rand() % 6 + 5;
   int broj_stupaca = rand() % 11 + 10;
   int a[broj_redaka][broj_stupaca];

   for (int i = 0; i < broj_redaka; i++) {
      for (int j = 0; j < broj_stupaca; j++) {
         a[i][j] = 0;
      }
   }

   int broj_hitaca;
   printf("Upisite broj hitaca > ");
   scanf("%d", &broj_hitaca);

   for (int i = 0; i < broj_hitaca; i++) {
      a[rand() % broj_redaka][rand() % broj_stupaca]++;
   }

   for (int i = 0; i < broj_redaka; i++) {
      for (int j = 0; j < broj_stupaca; j++) {
         printf("%4d", a[i][j]);
      }
      printf("\n");
   }
   return 0;
}