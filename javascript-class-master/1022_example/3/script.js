//변수 a에 값 1을 저장한다.
a = 1;

// 증가연산자(++)가 변수 a의 앞에 작성되어 있으므로
// 변수 a값에 1을 더한 값을 변수 x에 저장한다.
// x >> 2, a >> 2
x = ++a;

//변수 x의 값을 HTML 문서에 출력한다.
window.document.write(x+" ");// <<< 가 = 2

// 증가연산자(++) 변수 a의 뒤에 작성되어 있으므로,
// 변수 x에 변수 a의 값을 저장하고, 변수 a의 값을 1 더한다.
// x >> 2, a >> 3
x = a++;

//변수 x의 값을 HTML 문서에 출력한다.
window.document.write(x+" ");// <<< 나 = 2

//변수 a의 값을 HTML 문서에 출력한다.
window.document.write(a+" ");// <<< 다 = 3


