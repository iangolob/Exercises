#include <stdio.h>

int main(void) {

   FILE *predmeti1 = fopen("predmeti1.bin", "rb");

   struct predmet_s {
      int sifra;
      char naziv[40 + 1];
      int broj_polozenih;
   } predmet;

   while (fread(&predmet, sizeof(predmet), 1, predmeti1) == 1) {
      printf("%d, %s, polozilo %d\n", predmet.sifra, predmet.naziv,
             predmet.broj_polozenih);
   }
   return 0;
}