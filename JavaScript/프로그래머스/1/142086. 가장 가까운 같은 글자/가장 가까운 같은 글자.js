function solution(s) {
    let arr = [];
    let stack = [];
    let index = 0;
    for(let i of s){            // stack[b,a,n,a] na
        if(!stack.includes(i)){
            stack.push(i);
            arr.push(-1);
        } else{
            let lastIndex = stack.lastIndexOf(i)
            stack.push(i);
            arr.push(index - lastIndex);
        }
        index++;
    }
    return arr;
}
