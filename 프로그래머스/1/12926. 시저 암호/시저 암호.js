function solution(s, n) {
    let arr = s.split('');
    for (let i = 0; i < arr.length; i++) {
        let alpha = arr[i];
        arr[i] = alpha === ' ' ? alpha : shift(alpha.charCodeAt(), n);
    }
    return arr.join('');
}

function shift(alpha, num) {
    let isSmall = alpha > 90;
    alpha += num;
    if ((isSmall && alpha > 122) || (!isSmall && alpha > 90)){
        alpha -= 26;
    }
    return String.fromCharCode(alpha);
}