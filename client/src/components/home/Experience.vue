<template>
  <div class="experience">
    <h1>경험</h1>
    <br />
    <v-container class="innerContainer">
      <v-row>
        <v-col cols="6" md="4" lg="3" class="contentTitle">
          <h2>삼성 청년 SW 아카데미</h2>
          <p class="period">2020.07 ~ 2021.05</p>
        </v-col>
        <v-col cols="6" md="8" lg="9">
          <div class="contentDetail">
            NUVO 프로젝트 지역 3등 <br />
            삼성전자 네트워크사업부 프로젝트 3등 <br />
            아카데미 레이싱 알고리즘 경진대회 전체 3등 <br />
          </div>
        </v-col>
      </v-row>
      <br>
      <hr>
      <br>
      <v-row>
        <v-col cols="6" md="4" lg="3" class="contentTitle">
          <h2>넥슨 코리아</h2>
          <p class="period">2021.05 ~ 2021.06</p>
        </v-col>
        <v-col cols="6" md="4" lg="3" class="contentTitle">
          <h2>엔테크서비스</h2>
          <p class="period">2021.07 ~ 2021.09</p>
        </v-col>
        <v-col cols="6" md="4" lg="3" class="contentTitle">
          <h2>뉴빌리티</h2>
          <p class="period">2021.10 ~ 2021.10</p>
        </v-col>
        <v-col cols="6" md="4" lg="3" class="contentTitle">
          <h2>현대카드</h2>
          <p class="period">2021.12 ~ 재직 중</p>
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
