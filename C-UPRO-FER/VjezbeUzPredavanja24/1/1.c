#include <stdio.h>

int main(void) {
   float prosjek = 0;
   int brojStudenata = 0;

   FILE *f = fopen("bodovi.txt", "r");

   struct student_s {
      char jmbag[10 + 1];
      char ime[20 + 1];
      char prezime[20 + 1];
      float bodovi;
   } student;

   while (fscanf(f, "%*s %*s %*s %f", &student.bodovi) == 1) {
      brojStudenata++;
      prosjek += student.bodovi;
   }

   prosjek = prosjek / brojStudenata;

   fseek(f, 0, SEEK_SET);

   while (fscanf(f, "%s %s %s %f", &student.jmbag, &student.ime,
                 &student.prezime, &student.bodovi) == 4) {
      if (student.bodovi > prosjek) {
         printf("%s %s %s %.1f\n", student.jmbag, student.ime, student.prezime,
                student.bodovi);
      }
   }

   fclose(f);

   return 0;
}