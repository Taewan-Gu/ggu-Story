@@@@ 로고 @@@@

#### 프로젝트 URL: www.ggustory.site

※ ec2 freetier가 자꾸 터진다.. 메모리 1G와 CPU 1G 1개 로는 불가능한 프로젝트인가 보다... ㅠ

- 해결방안을 찾아야 할 듯하다.



# 프로젝트: 나를 표현하자!

@@@@ 목차 @@@@



## 기획

 'FIVE'라는 책이 있다. 5년이내 5가지 큰 목표를 이루기 위해 계속해서 정진하는 것이다. 그 목표는 세부적으로 세워야하고 그 목표를 위해 차근차근 기간별 계획을 세워 이뤄보려 한다. 아직 5가지를 모두 정하지는 못 했지만, 차근차근 생각하며 계획을 세울 예정이다.

 처음엔 문서로 정리했다. 하지만 너무 비효율적이었고, 예전 처음 웹을 배울 때 했던 TodoList가 생각났다. 처음 배웠던 때를 생각하며 새롭게 내 자신의 실력을 다듬을 시간이 되었으면 좋겠다. 다만, 기본적인 TodoList를 하면 내 실력은 더 늘지 않을테니, 새로운 백엔드 프레임워크를 써볼예정이다.



## 기술 스택

* 프론트엔드: Vuejs
* 백엔드: Spring Boot
* 인프라: AWS EC2, Nginx, Docker, Jenkins

* 일정관리: Trello
* 형상관리: github
* 목업: PhotoShop



## 목업

* 처음 대충 그려보기

  ![나의 계획 사이트](README.assets/%EB%82%98%EC%9D%98%20%EA%B3%84%ED%9A%8D%20%EC%82%AC%EC%9D%B4%ED%8A%B8.png)





## 요구사항정리

* 태완's 계획
  * 기간설정
    * 각 기간을 볼 수 있도록 필터링 기능
  * 성취
    * 성취한 목록을 보여줄 수 있는 화면
  * 단위계획추가
    * 각 단위 계획을 사용자 설정으로 만들어주기
  * 날짜, 기간별 계획 페이지
    * 날짜, 기간, 분기 등으로 단위계획마다의 계획으로 들어갈 수 있는 페이지(게시판형식, 누르면 이동)
  * 계획 CRUD
    * 위의 날짜, 기간별 계획페이지에서 각 날짜나 기간을 클릭하면 해당 페이지로 이동하여 계획 등록 및 삭제, 보여주기 등을 할 수 있다.
  * 체크리스트
    * 각 계획에 체크리스트를 만들어준다.
* 태완's 포폴
  * 각 프로젝트를 보여줄 예정
    * 이미 만들어져 있는 포트폴리오를 쓸 예정
  * 스택
    * 새롭게 나의 스택을 표현
  * 정보
    * 나의 정보를 표현
* 기타
  * 관리자 로그인
    * 관리자가 아닐 경우, 등록, 수정, 삭제는 불가.
    * 보기는 가능!
* 요구사항 추가 예정
  * 춤 동영상
  * 내 사명집 추가
  * 명작 영화들 추가



## 배포

CPU 1G 1개, RAM 1G....

각 이미지로 빌드하려면 올려진 다른 컨테이너들을 stop하고 빌드해야 서버가 안 터진다;;

그래서 Jenkins 사용도 못 하고 도커에 컨테이너 3개 올려서 사용 중 - 이게 최대치인듯

나중에 나의 사이드 프로젝트가 커지게 된다면,

MSA 방식으로 바꾸기 위해서는 새로운 서버를 늘려야 될 것 같다.



배포하면서 느낀점: EC2 프리티어는 정말 컨테이너 올리기 힘들구나.



## SECRET 요소 수정 중

아직 DB에 아무것도 없기 때문에^^ - SECRET 요소들 나중에 지울 예정