# 테이블이 있다는 가정하에 SQL만 작성, 풀이후 (테스트)실행 불가능
/* 
[문제1]: employees 테이블에 새로운 직원을 추가하세요. 직원의 정보는 다음과 같습니다:
employee_id: 101
first_name: 'John'
last_name: 'Doe'
email: 'johndoe@example.com'
hire_date: '2024-06-24'
job_id: 'IT_PROG'

[문제2]: products 테이블에 새로운 제품을 추가하세요. 제품의 정보는 다음과 같습니다:
product_id: 201
product_name: 'Wireless Mouse'
category: 'Electronics'
price: 29.99
stock_quantity: 150

[문제3]: employees 테이블에서 모든 직원의 first_name과 email을 조회하세요.

[문제4]: products 테이블에서 price가 1000 인 제품의 product_name과 price를 조회하세요.

[문제5]: employees 테이블에서 employee_id가 101인 직원의 email을 'john.doe@company.com'으로 업데이트하세요.

[문제6]: products 테이블에서 product_id가 201인 제품의 price를 24.99로 업데이트하세요.

[문제7]: employees 테이블에서 employee_id가 101인 직원을 삭제하세요.

[문제8]: products 테이블에서 product_id가 201인 제품을 삭제하세요.

*/
 

# [문제1]: employees 테이블에 새로운 직원을 추가하세요. 직원의 정보는 다음과 같습니다
insert into employees values(102, 'jeon', 'hodol', 'ithodol@naver.com', '07-12-25', 'ithodol');

# [문제2]: products 테이블에 새로운 제품을 추가하세요. 제품의 정보는 다음과 같습니다
insert into products values(202, 'cocaine', 'drug', 100, 1);

# [문제3]: employees 테이블에서 모든 직원의 first_name과 email을 조회하세요.
select first_name, email from employees;

# [문제4]: products 테이블에서 price가 1000 인 제품의 product_name과 price를 조회하세요.
select product_name, price from products where price = 1000;

# [문제5]: employees 테이블에서 employee_id가 101인 직원의 email을 'john.doe@company.com'으로 업데이트하세요.
update employees set email = 'john.doe@company.com' where employee_id = 101;

# [문제6]: products 테이블에서 product_id가 201인 제품의 price를 24.99로 업데이트하세요.
update products set price = 24.99 where product_id = 201;

# [문제7]: employees 테이블에서 employee_id가 101인 직원을 삭제하세요.
delete from employees where employee_id = 101;

# [문제8]: products 테이블에서 product_id가 201인 제품을 삭제하세요.
delete from products where product_id = 201;

