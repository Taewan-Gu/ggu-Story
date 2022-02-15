<template>
  <div>
    <img
      :src="require('@/assets/img/projects/ggustorymain.png')"
      class="mainimg"
      alt="main"
    />
    <h1 class="projectTitle">
      ggu Story <span class="projectSummary">(개인 포트폴리오 사이트)</span>
    </h1>
    <br />
    <h1>프로젝트 개요</h1>
    <div class="projectContent">
      <p>
        제 자신을 표현할 개인 포트폴리오 사이트입니다.
      </p>
      <p>
        Vue.js를 통해 만들었고, 꾸준히 업데이트 예정입니다.
      </p>
    </div>
    <br />
    <h1>아키텍처 및 기술스택</h1>
    <v-container>
      <v-row>
        <v-col cols="6">
          <img
            :src="require('@/assets/img/projects/ggustoryarchitecture.png')"
            class="architectureImg"
            alt="architecture"
          />
        </v-col>
        <v-col cols="6">
          <img
            :src="require('@/assets/img/projects/ggustorystack.png')"
            class="stackImg"
            alt="stack"
          />
        </v-col>
      </v-row>
    </v-container>

    <br />
    <h1>프로젝트 정보</h1>
    <div class="projectContent">
      <p>
        자세한 프로젝트 설명 및 깃 주소:
        <a href="https://github.com/Taewan-Gu/ggu-story"
          >https://github.com/Taewan-Gu/ggu-story</a
        >
      </p>
      <p>개인 포트폴리오 프로젝트</p>
      <p>2021.07 ~ 2021.08(운영 중)</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "GgustoryDescription",
};
</script>

<style scoped>
.mainimg {
  width: 80%;
  margin-left: 10%;
}

.projectTitle {
  font-size: 54px;
}

.projectSummary {
  font-size: 14px;
}

.projectContent {
  margin: 10px;
  font-size: 16px;
  font-weight: 400;
}

.architectureImg {
  width: 100%;
}

.stackImg {
  margin-left: 10%;
  width: 80%;
  height: auto;
}

.projectVideo {
  margin-left: 10%;
}
</style>
