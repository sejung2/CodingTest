function solution(name, yearning, photo) {
    let obj = {};
    let arr = [];
    
    name.forEach((v,i)=>{
        obj[v] = yearning[i];;
    });
    
    for (let i of photo) {
        let cnt = 0;
        for (let j of i) {
            if (obj[j])
                cnt += obj[j];
        }
        arr.push(cnt);
    }
    return arr;
}