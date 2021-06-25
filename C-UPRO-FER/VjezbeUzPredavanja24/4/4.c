#include <stdio.h>
#include <stdlib.h>

int main(void) {

   FILE *predmeti = fopen("predmeti.txt", "r");
   FILE *predmeti1 = fopen("predmeti1.bin", "wb");
   FILE *predmeti2 = fopen("predmeti2.bin", "wb");

   struct predmet_s {
      int sifra;
      char naziv[40 + 1];
      int broj_polozenih;
   } predmet;
   predmet.broj_polozenih = 0;

   while (fscanf(predmeti, "%d %[^\n]", &predmet.sifra, &predmet.naziv[0]) ==
          2) {
      fwrite(&predmet, sizeof(predmet), 1, predmeti1);
      fseek(predmeti2, (long)(predmet.sifra - 1001) * sizeof(predmet),
            SEEK_SET);
      fwrite(&predmet, sizeof(predmet), 1, predmeti2);
   }
   return 0;
}