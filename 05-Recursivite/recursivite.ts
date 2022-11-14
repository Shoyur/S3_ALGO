// Exponentielle : 2^4 = 2x2x2x2

// Cas 1 façon itérative

let expIter = (base:number, exposant:number) => {
    let reponse = 1;
    for(;exposant >= 1;--exposant) {
        reponse*=base;
    }
    return reponse;
}

// Cas 2 façon récursive
let expRecursif = (base: number, exposant: number):number => {
    // Conditions arrêt
    if(exposant == 0){
        return 1;
  }else {
    return base*expRecursif(base,exposant-1);
  }
  
};

let base=2;
let exposant = -4;
let rep:string;
let resultat = expRecursif(base, Math.abs(exposant));
if (exposant < 0){
    rep = (1 / resultat).toFixed(2);
}else {
    rep = resultat.toFixed(0);
}
console.log(`Le résultat de ${base} puissance ${exposant} = ${rep}`);
