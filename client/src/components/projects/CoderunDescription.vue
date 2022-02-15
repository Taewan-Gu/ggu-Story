<template>
  <div>
    <img :src="require('@/assets/img/projects/coderunmain.png')" class="mainimg" alt="main">
    <h1 class="projectTitle">CODE:RUN <span class="projectSummary">(스터디 동영상 공유 플랫폼)</span></h1>
    <br>
    <h1>프로젝트 개요</h1>
    <div class="projectContent">
      <p>
        알고리즘 문제나 CS 지식을 동영상으로 공유하기 위해 만든 사이트입니다.
      </p>
      <p>
        동영상 스트리밍의 여러 방식과 인코딩, 데이터 저장, 커스텀 JWT, 쿠버네티스 스케일링 등을 경험할 수 있었던 프로젝트입니다.
      </p>
    </div>
    <br>
    <h1>아키텍처</h1>
    <img :src="require('@/assets/img/projects/coderunarchitecture.png')" class="architectureImg" alt="architecture">
    <br>
    <h1>기술스택</h1>
    <img :src="require('@/assets/img/projects/coderunstack.png')" class="stackImg" alt="stack">
    <br>
    <h1>프로젝트 영상</h1>
    <br>
    <div class="projectVideo">
      <iframe width="90%" height="500px" src="https://www.youtube.com/embed/L3Ybs6dHkFg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
      <p>영상 링크: <a href="https://www.youtube.com/watch?v=L3Ybs6dHkFg">https://www.youtube.com/watch?v=L3Ybs6dHkFg</a></p>
    </div>
    <br>
    <h1>프로젝트 정보</h1>
    <div class="projectContent">
      <p>자세한 프로젝트 설명 및 깃 주소: <a href="https://github.com/Taewan-Gu/CODE-RUN">https://github.com/Taewan-Gu/CODE-RUN</a></p>
      <p>삼성 청년 SW 아카데미 자율프로젝트</p>
      <p>총 5명 중 프론트엔드 3명, 백엔드 2명 (백엔드, 인프라 담당)</p>
      <p>2021.04 ~ 2021.05(6주)</p>
    </div>
  </div>
</template>

<script>
export default {
  name:"CoderunDescription",
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