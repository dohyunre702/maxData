## Java로 대용량 데이터 분석하기 프로젝트 복습
***
### 1. 개요
<b><u>"2021년 서울에서 가장 많은 인구가 이사를 간 지역은 어디인가?"</b></u>
- GOAL | MDIS에서 받은 데이터로 2021년도 인구이동 분석하기
- POINT | 파일 입출력 원리와 예외처리, 데이터 파싱에 컬렉션 프레임워크 사용

### 2. 데이터
- MDIS 홈페이지 "국내인구이동통계(2021)" 활용
- 자료 형태: CSV

  ![2021stat.csv](https://user-images.githubusercontent.com/61702307/211232602-efa14025-964d-4f7d-b3a4-eb492b72277b.png)
- 메타데이터

  ![2021인구이동설계서](https://user-images.githubusercontent.com/61702307/211232668-99c7c38a-7b59-4562-8659-e4c5895f1979.PNG)
- (참고) 행정구역 코드

  ![2021.6 SGIS 행정구역 코드](https://user-images.githubusercontent.com/61702307/211232869-f96e605f-0c62-44b1-8699-16cc6339406a.png)


### 3. 클래스 설계
1. `PopulationStatistics` 
   - main 메소드를 실행하는 클래스
2. `PopulationMove`
    - 전입-전출 행정구역 시도코드 처리 클래스 : 생성자 사용
3. `FileManager`
   - 파일을 읽고, 추출하고, 새 파일을 생성하는 클래스
4. `Count` 
   - 시도별 이동횟수를 세는 클래스

### 4. 기능 구현
1. 파일 불러와서 가공하기
   - 데이터 1줄씩 읽기
   - 필요한 데이터 원하는 형태로 파싱해 List 객체로 저장하기
   - 새 파일 생성하기
   - 파싱한 데이터 새 파일에 입력하기
   - `from_to_txt` 출력 결과
   
   ![image](https://user-images.githubusercontent.com/61702307/211234637-ca72c1e1-ec9a-4734-841d-c86c88de98ea.png)
   
2. 데이터 카운트하기
   - 시도별 이동횟수 Map으로 반환하기
   - `key`: "전입코드, 전출코드" (문자열), `value`: 횟수 (1)
   - `each_sido_cnt.txt` 출력결과
   
   ![image](https://user-images.githubusercontent.com/61702307/211234476-f77c4224-2654-4bbe-b92a-404b4bc736ee.png)

### 5. 연관 개념 정리
- [파일 입출력 - 클래스 간 상속관계와 주요 메소드](https://historical-doll-a1d.notion.site/8ac0fad16bf24258bdc51d2b07b45875)
- 파일 입출력과 예외처리 - checked vs unchecked exception
