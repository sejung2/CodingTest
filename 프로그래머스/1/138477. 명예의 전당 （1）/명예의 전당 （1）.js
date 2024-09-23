function solution(k, score) {
    let stack = [];
    let answer = [];
    for(let i of score){
        if(stack.length < k){
            stack.push(i);
            stack.sort((a,b) =>a-b);
        } else {
            if(stack[0] < i){
                stack[0] = i;
                stack.sort((a,b) =>a-b);
            }
        }
        answer.push(stack[0]);
    }
    return answer;
}