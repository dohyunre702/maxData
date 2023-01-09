###
Java로 대용량 데이터 분석하기 프로젝트 복습

### 개요
- 목표: MDIS에서 받은 데이터로 2021년도 인구이동 분석하기
- point :파일 입출력 원리, 예외처리, 데이터 파싱에 컬렉션 프레임워크 사용
- 블로그 글 (개념 학습 및 정리)
  - 파일 입출력 - 클래스 간 상속관계, 원리
  - 예외처리 - checked vs unchecked exception

### 기능 구현
1. 파일 불러와서 가공하기
   - 데이터 1줄씩 읽기
   - 필요한 데이터 원하는 형태로 파싱해 List 객체로 저장하기
   - 새 파일 생성하기
   - 파싱한 데이터 새 파일에 입력하기