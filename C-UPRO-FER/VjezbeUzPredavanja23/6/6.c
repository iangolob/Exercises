#include <stdio.h>
#include <string.h>
int main(void) {
   FILE *du = fopen("osobe.txt", "r");
   struct osoba_s {
      int mat;
      char ime[20 + 1];
      char prezime[20 + 1];
      char datum[15 + 1];
   } osoba;

   while (fscanf(du, "%d %s %s %s", &osoba.mat, osoba.ime, osoba.prezime,
                 osoba.datum) == 4) {
      if (strstr(osoba.ime, "na") != NULL ||
          strstr(osoba.datum, "1987") != NULL) {
         printf("%d %s %s\n", osoba.mat, osoba.ime, osoba.prezime);
      }
   }

   fclose(du);
   return 0;
}