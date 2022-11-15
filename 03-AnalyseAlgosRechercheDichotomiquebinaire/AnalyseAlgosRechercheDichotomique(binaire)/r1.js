let tab = [6, 33, 1, 17, 12, 8, 40, 50, 3, 2, 9, 65, 99, 7];
tab.sort((a, b) => a-b);
let tourBoucle=0;
let inf = 0, sup = tab.length-1, pivot;
let check = false;
let rechercheDichotomique = (tabC, elem) => {

    // tourBoucle++;
    pivot = Math.floor((inf+sup)/2);
    if (elem === tabC[pivot]) { check = true; } 
    else if (elem > tabC[pivot]){ inf = pivot + 1; } 
    else { sup = pivot - 1; }

    if (inf <= sup || check == false) { rechercheDichotomique(tab, elem); }
    if (check == true) return pivot;
    else { return -1; }
}










let elem = 98;
console.log(`=========================================================================================`);
console.log(`Voici le tableau : ${tab}`);
let pos = rechercheDichotomique(tab, elem);

if(pos != -1){
    console.log(`Élément ${elem} trouvé à la position ${pos} avec ${tourBoucle} comparisons`);
}else {
    console.log(`Élément ${elem} est introuvable avec ${tourBoucle} comparisons`);
}
console.log(`==================================================================`);
// .....................
inf = 0, sup = tab.length-1, pivot, tourBoucle=0;
elem = 40;
console.log(`=========================================================================================`);
console.log(`Voici le tableau : ${tab}`);
pos = rechercheDichotomique(tab, elem);

if(pos != -1){
    console.log(`Élément ${elem} trouvé à la position ${pos} avec ${tourBoucle} comparisons`);
}else {
    console.log(`Élément ${elem} est introuvable avec ${tourBoucle} comparisons`);
}
console.log(`==================================================================`);
// .....................
inf = 0, sup = tab.length-1, pivot, tourBoucle=0;
elem = 1;
console.log(`=========================================================================================`);
console.log(`Voici le tableau : ${tab}`);
pos = rechercheDichotomique(tab, elem);

if(pos != -1){
    console.log(`Élément ${elem} trouvé à la position ${pos} avec ${tourBoucle} comparisons`);
}else {
    console.log(`Élément ${elem} est introuvable avec ${tourBoucle} comparisons`);
}
console.log(`==================================================================`);
// .....................
inf = 0, sup = tab.length-1, pivot, tourBoucle=0;
elem = 99;
console.log(`=========================================================================================`);
console.log(`Voici le tableau : ${tab}`);
pos = rechercheDichotomique(tab, elem);

if(pos != -1){
    console.log(`Élément ${elem} trouvé à la position ${pos} avec ${tourBoucle} comparisons`);
}else {
    console.log(`Élément ${elem} est introuvable avec ${tourBoucle} comparisons`);
}
console.log(`==================================================================`);



