#include <stdio.h>

int main(void) {
   int n;
   printf("Upisite broj oglasa > ");
   scanf("%d", &n);

   struct {
      int sifra;
      int cijena;
      int povrsina;
   } a[n], pomocni;

   for (int i = 0; i < n; i++) {
      printf("%3d. oglas > ", i + 1);
      scanf("%d %d %d", &a[i].sifra, &a[i].cijena, &a[i].povrsina);
   }

   for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
         if (a[i].cijena < a[j].cijena) {
            pomocni = a[i];
            a[i] = a[j];
            a[j] = pomocni;
         }
      }
   }

   for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
         if (a[i].cijena == a[j].cijena && a[i].povrsina < a[j].povrsina) {
            pomocni = a[i];
            a[i] = a[j];
            a[j] = pomocni;
         }
      }
   }
   for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
         if (a[i].cijena == a[j].cijena && a[i].povrsina == a[j].povrsina &&
             a[i].sifra > a[j].sifra) {
            pomocni = a[i];
            a[i] = a[j];
            a[j] = pomocni;
         }
      }
   }

   printf("\n");
   for (int i = 0; i < n; i++) {
      printf("%7d EUR%9d m2%9d\n", a[i].cijena, a[i].povrsina, a[i].sifra);
   }
   return 0;
}