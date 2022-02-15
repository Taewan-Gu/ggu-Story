<template>
  <div>
    <img :src="require('@/assets/img/projects/nuvomain.png')" class="mainimg" alt="main">
    <h1 class="projectTitle"> NUVO <span class="projectSummary">(VR 여행 사진 전시 플랫폼)</span></h1>
    <br>
    <h1>프로젝트 개요</h1>
    <div class="projectContent">
      <p>
        코로나로 인해 여행을 못가는 현재, 여행을 대리만족 시켜줄 VR 여행 사진 전시 플랫폼입니다.
      </p>
      <p>
        Vuejs를 이용한 SFC, Vuex를 통한 상태관리, 인터랙티브 페이지를 위한 CSS 애니메이션, 리액트네이티브 연동을 통한 웹앱 등을 경험할 수 있었던 프로젝트입니다.
      </p>
    </div>
    <br>
    <h1>아키텍처</h1>
    <img :src="require('@/assets/img/projects/nuvoarchitecture2.png')" class="architectureImg" alt="architecture">
    <br><br>
    <img :src="require('@/assets/img/projects/nuvoarchitecture1.jpg')" class="architectureImg" alt="architecture">
    <br><br>
    <h1>기술스택</h1>
    <img :src="require('@/assets/img/projects/nuvostack.png')" class="stackImg" alt="stack">
    <br> <br>
    <h1>프로젝트 영상</h1>
    <br>
    <div class="projectVideo">
      <iframe width="90%" height="500" src="https://www.youtube.com/embed/8f37NpMiJFU" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
      <p>영상 링크: <a href="https://www.youtube.com/watch?v=8f37NpMiJFU">https://www.youtube.com/watch?v=8f37NpMiJFU</a></p>
    </div>
    <br>
    <h1>프로젝트 정보</h1>
    <div class="projectContent">
      <p>자세한 프로젝트 설명 및 깃 주소: <a href="https://github.com/Taewan-Gu/NUVO">https://github.com/Taewan-Gu/NUVO</a></p>
      <p>삼성 청년 SW 아카데미 공통프로젝트: 3등 수상</p>
      <p>총 4명 중 프론트엔드 1명, 풀스택 1명, 백엔드 1명, VR 렌더링 1명 (프론트엔드 담당)</p>
      <p>2021.01 ~ 2021.02(7주)</p>
    </div>
  </div>
</template>

<script>
export default {
  name:"NuvoDescription",
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