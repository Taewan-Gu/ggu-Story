<template>
  <div>
    <img :src="require('@/assets/img/projects/flanetmain.png')" class="mainimg" alt="main">
    <h1 class="projectTitle">FlaNET <span class="projectSummary">(시계열 데이터를 활용한 AI/ML 블록코딩 서비스)</span></h1>
    <br>
    <h1>프로젝트 개요</h1>
    <div class="projectContent">
      <p>
        삼성전자 네트워크사업부 연계 프로젝트의 일환으로 시계열 데이터를 활용한 AI/ML 블록코딩 서비스 프로젝트를 진행하게 되었습니다.
      </p>
      <p>
        CNN모델과 LSTM모델에 대한 학습과, FastAPI, 도커 볼륨, 텐서플로우 모델 학습 및 자동 크롤러 등을 경험할 수 있었던 프로젝트입니다.
      </p>
    </div>
    <br>
    <h1>아키텍처</h1>
    <img :src="require('@/assets/img/projects/flanetarchitecture.png')" class="architectureImg" alt="architecture">
    <br>
    <h1>기술스택</h1>
    <img :src="require('@/assets/img/projects/flanetstack.png')" class="stackImg" alt="stack">
    <br>
    <h1>프로젝트 영상</h1>
    <br>
    <div class="projectVideo">
      <iframe width="90%" height="500" src="https://www.youtube.com/embed/OJfp0IxcjhM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
      <p>영상 링크: <a href="https://www.youtube.com/watch?v=OJfp0IxcjhM">https://www.youtube.com/watch?v=OJfp0IxcjhM</a></p>
    </div>
    <br>
    <h1>프로젝트 정보</h1>
    <div class="projectContent">
      <p>자세한 프로젝트 설명 및 깃 주소: <a href="https://github.com/fksk94/FLANET">https://github.com/fksk94/FLANET</a></p>
      <p>삼성 청년 SW 아카데미 넷싸프로젝트: 아카데미 내 우수 20인 선정 및 3등 수상</p>
      <p>총 5명 중 프론트엔드 2명, 백엔드 3명 (백엔드, 인프라 담당)</p>
      <p>2021.02 ~ 2021.04(7주)</p>
    </div>
  </div>
</template>

<script>
export default {
  name:"FlanetDescription",
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
}

.projectVideo {
  margin-left: 10%;
}
</style>