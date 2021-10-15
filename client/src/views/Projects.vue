<template>
  <v-container>
    <v-row>
      <v-col
        cols="12"
        xl="8"
        offset-xl="2"
      >
        <Label :title="pageTitle"/>
        <ProjectCard
          v-for="(thumbnail, idx) in thumbnails"
          :key=idx
          :thumbnail=thumbnail
          :title="titles[idx]"
          :summary="summaries[idx]"
          :numberOfTeam="numberOfTeamArray[idx]"
          :role="roles[idx]"
          :period="periods[idx]"
          :descriptionUrl="decriptionUrls[idx]"
        />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import ProjectCard from "@/components/projects/ProjectCard.vue";
import Label from "@/components/common/Label.vue";

export default {
  name: "Projects",
  data () {
    return {
      pageTitle: "PROJECTS",
      thumbnails: ["agaeinthumbnail.png", "ggustorythumbnail.png", "coderunthumbnail.png", "flanetthumbnail.png", "nuvothumbnail.png", "kgbrosthumbnail.png"],
      titles: ["Agaein", "ggu Story", "CODE:RUN", "FlaNET", "NUVO", "KGBros"],
      summaries: ["위치, 특징기반 실종동물 찾기", "개인 포트폴리오 사이트", "스터디 동영상 공유 플랫폼", "시계열 데이터를 활용한 AI/ML 블록코딩 서비스", "VR 여행 사진 전시 플랫폼", "영화 추천 사이트"],
      numberOfTeamArray: [5, 1, 5, 5, 4, 2],
      roles: ["백엔드, 인프라", "모든 개발", "백엔드, 인프라", "백엔드, 인프라", "프론트엔드", "백엔드, 프론트엔드"],
      periods: ["2021.08 ~ 진행 중", "2021.07 ~ 진행 중", "2021.04 ~ 2021.05(6주)", "2021.02 ~ 2021.04(7주)", "2021.01 ~ 2021.02(7주)", "2020.12(2주)"],
      decriptionUrls: ["/projects/agaein", "/projects/ggustory", "/projects/coderun", "/projects/flanet", "/projects/nuvo", "/projects/kgbros"],
    }
  },
  components: {
    ProjectCard,
    Label,
  },
}
</script>

<style scoped>
  .thumnail {
    width: 50%;
  }
</style>