#include <stdio.h>

int main(void) {
   int n;

   printf("Upisite broj pretinaca > ");
   scanf("%d", &n);
   struct {
      int sifra;
      float visina, sirina, dubina;
      float volumen;
   } pretinac[n], pomocni;

   printf("Upisite podatke za pretince (%d)\n", n);
   for (int i = 0; i < n; i++) {
      printf("%d. pretinac > ", i);
      scanf("%d %f %f %f", &pretinac[i].sifra, &pretinac[i].visina,
            &pretinac[i].sirina, &pretinac[i].dubina);
      pretinac[i].volumen =
          pretinac[i].dubina * pretinac[i].sirina * pretinac[i].visina * 0.001;
   }
   for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
         if (pretinac[i].volumen < pretinac[j].volumen) {
            pomocni = pretinac[i];
            pretinac[i] = pretinac[j];
            pretinac[j] = pomocni;
         }
      }
   }
   printf("Sortirani pretinci:\n");
   for (int i = 0; i < n; i++) {
      printf("%d = %7.2f litara\n", pretinac[i].sifra, pretinac[i].volumen);
   }
   return 0;
}