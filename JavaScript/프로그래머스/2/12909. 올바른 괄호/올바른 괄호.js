function solution(s){ 
    let stack = [];
    
    if(s[0] == ')') return false;
    for(let i of s){
        if(i == '('){  // 요소가 '(' 일 때만 스택에 요소를 집어넣고
            stack.push(i);
        }else stack.pop(); // ')'가 오면 pop으로 스택에 요소 하나를 뺀다.
    }
    if(stack.pop()){ // 스택이 비어있다면 pop을 했을때 아무값도 없음
        return false;
    } else return true;
}