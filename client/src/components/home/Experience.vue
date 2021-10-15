<template>
  <div class="experience">
    <h1>경험</h1>
    <br />
    <v-container class="innerContainer">
      <v-row>
        <v-col cols="6" md="4" lg="3" class="contentTitle">
          <h2>삼성 청년 SW 아카데미</h2>
          <p class="period">2020.07 ~ 2021.06 (1년)</p>
        </v-col>
        <v-col cols="6" md="8" lg="9">
          <h3>1 학기</h3>
          <div class="contentDetail">
            기초 웹 및 알고리즘, Vuejs, Django 등 학습 <br />
            아카데미 프로그래밍 경진대회 전체 3등 <br />
          </div>
          <h3>2 학기</h3>
          <div class="contentDetail">
            Docker 및 FastAPI, k8s, Jenkins 등 학습 <br />
            삼성전자 네트워크사업부 연계 프로젝트 3등 <br />
            NUVO 프로젝트 지역 3등
          </div>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="6" md="4" lg="3" class="contentTitle">
          <h2>엔테크서비스</h2>
          <p class="period">2021.07 ~ 2021.09</p>
        </v-col>
        <v-col cols="6" md="8" lg="9">
          <h3>인프라 시스템 개발</h3>
          <div class="contentDetail">
            JSP/Servlet부터 Spring MVC까지 자바 웹 기본기 학습 <br />
            변수 작명부터 Exception 처리, 동시성 문제 등 코드리뷰 진행 <br />
            사내 DB 권한 시스템 유지보수
          </div>
        </v-col>
      </v-row>
      <v-row>
        <v-col cols="6" md="4" lg="3" class="contentTitle">
          <h2>뉴빌리티</h2>
          <p class="period">2021.10 ~ </p>
        </v-col>
        <v-col cols="6" md="8" lg="9">
          <h3>현재</h3>
          <div class="contentDetail">
            자율주행 음식 배달로봇 주문 서비스 백엔드 개발
          </div>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  name: "Experience",
};
</script>

<style scoped>
.experience {
  margin-bottom: 40px;
}

.period {
  font-size: 16px;
  font-weight: 550;
  margin-top: 10px;
  margin-left: 2px;
}

.contentTitle {
  text-align: start;
}

.contentDetail {
  margin-top: 10px;
  margin-bottom: 10px;
}

.innerContainer {
  margin: 0px;
}
</style>
