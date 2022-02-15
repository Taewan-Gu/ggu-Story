<template>
  <div>
    <img :src="require('@/assets/img/projects/kgbrosmain.png')" class="mainimg" alt="main">
    <h1 class="projectTitle">KGBros <span class="projectSummary">(영화 추천 사이트)</span></h1>
    <br>
    <h1>프로젝트 개요</h1>
    <div class="projectContent">
      <p>
        삼성 청년 SW 아카데미 1학기 마지막 프로젝트로 영화추천 사이트를 만들게 되었습니다.
      </p>
      <p>
        Django와 Vuejs를 통한 FrontEnd, BackEnd 연결 및 Firebase RDB, 리액트네이티브를 경험할 수 있었던 프로젝트입니다.
      </p>
    </div>
    <br>
    <h1>아키텍처</h1>
    <img :src="require('@/assets/img/projects/kgbrosarchitecture.png')" class="architectureImg" alt="architecture">
    <br>
    <h1>기술스택</h1>
    <img :src="require('@/assets/img/projects/kgbrosstack.png')" class="stackImg" alt="stack">
    <br> <br>
    <h1>프로젝트 영상</h1>
    <br>
    <div class="projectVideo">
      <iframe width="90%" height="500" src="https://www.youtube.com/embed/oRlv1NJeDSE" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
      <p>영상 링크: <a href="https://www.youtube.com/watch?v=oRlv1NJeDSE">https://www.youtube.com/watch?v=oRlv1NJeDSE</a></p>
    </div>
    <br>
    <h1>프로젝트 정보</h1>
    <div class="projectContent">
      <p>자세한 프로젝트 설명 및 깃 주소</p>
      <p><a href="https://github.com/Taewan-Gu/KGBros-vuejs-server">https://github.com/Taewan-Gu/KGBros-vuejs-server</a></p>
      <p><a href="https://github.com/Taewan-Gu/KGBros-django-server">https://github.com/Taewan-Gu/KGBros-django-server</a></p>
      <p><a href="https://github.com/Taewan-Gu/KGBros-ReactNative">https://github.com/Taewan-Gu/KGBros-ReactNative</a></p>
      <p>삼성 청년 SW 아카데미 1학기 최종프로젝트</p>
      <p>총 2명 중 프론트엔드 1명, 풀스택 1명 (풀스택 담당)</p>
      <p>2020.12(2주)</p>
    </div>
  </div>
</template>

<script>
export default {
  name:"KgbrosDescription",
}
</script>

<style scoped>
.mainimg {
  width: 80%;
  margin-left:10%;
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