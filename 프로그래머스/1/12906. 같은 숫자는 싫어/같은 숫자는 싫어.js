function solution(arr)
{
    let stack = [];
    for(let i of arr){
        if(stack[stack.length-1] != i)
            stack.push(i)
    }
    return stack;
}