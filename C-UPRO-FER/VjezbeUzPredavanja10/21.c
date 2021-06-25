#include <stdio.h>

int main(void) {
   struct {
      char ime[30];
      char prezime[30];
   } ljudi[10];
   int j;
   for (int i = 0; i < 10; i++) {
      printf("%2d. Ime      > ", i + 1);
      scanf("%s", &ljudi[i].ime);

      j = 0;
      while (ljudi[i].ime[j] != '\0') {
         if (ljudi[i].ime[j] == '\n') {
            ljudi[i].ime[j] = '\0';
         }
         j++;
      }

      printf("%2d. Prezime  > ", i + 1);
      scanf("%s", &ljudi[i].prezime);

      j = 0;
      while (ljudi[i].prezime[j] != '\0') {
         if (ljudi[i].prezime[j] == '\n') {
            ljudi[i].prezime[j] = '\0';
         }
         j++;
      }
   }

   printf("\n");
   for (int i = 9; i >= 0; i--) {
      printf("%s, %s\n", ljudi[i].prezime, ljudi[i].ime);
   }
   return 0;
}