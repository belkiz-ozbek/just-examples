#include<stdio.h>

struct ogrenci{
	char isim[15];
	char soyisim[15];
	int numara;
	int yas;
};


int main(){
	
struct ogrenci bilgi = {"ahmet", "bilici", 125, 23};

printf("%s %s %d %d", bilgi.isim, bilgi.soyisim, bilgi.numara, bilgi.yas);
	
	return 0;
}
