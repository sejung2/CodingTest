function solution(numbers) {
    let answer = [];

    numbers.forEach((v, i) => {
        numbers.forEach((v1, i1) => {
            if (i !== i1) {
                answer.push(v + v1);
            }
        });
    });

    answer = answer.filter((v, i) => answer.indexOf(v) === i);
    answer.sort((a, b) => a - b);

    return answer;
}
