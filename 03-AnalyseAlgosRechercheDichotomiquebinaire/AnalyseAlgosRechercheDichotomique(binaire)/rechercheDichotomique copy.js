
let tab = [6, 33, 1, 17, 12, 8, 40, 50, 3, 2, 9, 65, 99, 7];

// Inline compare function
tab.sort((a, b) => a-b);

let tourBoucle=0;
let inf = 0, sup = tab.length-1, pivot;
let rechercheDichotomique = (tabC, elem) => {
        ++tourBoucle;
        pivot = Math.floor((inf+sup)/2);
        if (elem === tabC[pivot]) { return pivot; } 
        else if (elem > tabC[pivot]){ inf = pivot + 1; } 
        else { sup = pivot - 1; }
        if (inf <= sup) { rechercheDichotomique(tab, elem); }
        return pivot;
}
let elem = 98;
let pos = rechercheDichotomique(tab, elem);

if(pos != -1){ console.log(`Élément ${elem} trouvé à la position ${pos} avec ${tourBoucle} comparisons`); }
else { console.log(`Élément ${elem} est introuvable avec ${tourBoucle} comparisons`); }




