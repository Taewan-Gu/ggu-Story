<template>
  <div>
    <img
      :src="require('@/assets/img/projects/agaeinmain.png')"
      class="mainimg"
      alt="main"
    />
    <h1 class="projectTitle">
      Agaein <span class="projectSummary">(위치, 특징기반 실종동물 찾기)</span>
    </h1>
    <br />
    <h1>프로젝트 개요</h1>
    <div class="projectContent">
      <p>
        개발중인 주소:
        <a href="https://www.agaein.com">https://www.agaein.com</a>
      </p>
      <p>
        이제 가족이 된 반려동물을 잃어버렸거나 반대로 주인을 찾아 주고 싶은
        사람들을 위한 사이트입니다.
      </p>
      <p>
        GraphQL과 Express.js, PostgreSQL의 JSON 쿼리를 배우며 진행하고 있습니다.
      </p>
    </div>
    <br />
    <br />
    <br />
    <br />
    <br />
    <h1 class="developing">
      <v-icon color="#888888" size="36px" class="icon">
        mdi-hammer-wrench
      </v-icon>
      개발 진행 중
      <v-icon color="#888888" size="36px" class="icon">
        mdi-hammer-wrench
      </v-icon>
    </h1>
    <br />
    <br />
    <br />
    <br />
    <br />
    <h1>프로젝트 정보</h1>
    <div class="projectContent">
      <p>
        자세한 프로젝트 설명 및 깃 주소:
        <a href="https://github.com/sundayTen/agaein"
          >https://github.com/sundayTen/agaein</a
        >
      </p>
      <p>
        노션 주소:
        <a
          href="https://hjinn.notion.site/hjinn/PROJECT-WORKSPACE-b6cf4492c2b9443aba7a572999411097"
          >https://hjinn.notion.site/hjinn/PROJECT-WORKSPACE-b6cf4492c2b9443aba7a572999411097</a
        >
      </p>
      <p>아직 제작 중이라 미흡합니다.</p>
      <p>OKKY에서 시작된 사이드 프로젝트</p>
      <p>
        총 5명 중 디자이너 1명, 프론트엔드 2명, 풀스택 1명, 백엔드 1명 (백엔드,
        인프라 담당)
      </p>
      <p>2021.08 ~ 진행 중</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "AgaeinDescription",
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

.developing {
  text-align: center;
}
</style>
