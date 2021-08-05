<template>
  <v-container>
    <v-row>
      <v-col
        cols="12"
        xl="8"
        offset-xl="2"
      >
        <ProjectCard
          v-for="(thumbnail, idx) in thumbnails"
          :key=idx
          :thumbnail=thumbnail
          :title="titles[idx]"
          :summary="summaries[idx]"
          :numberOfTeam="numberOfTeamArray[idx]"
          :role="roles[idx]"
          :period="periods[idx]"
        />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import ProjectCard from "@/components/projects/ProjectCard.vue";

export default {
  name: "Projects",
  data () {
    return {
      thumbnails: ["coderunthumbnail.png", "flanetthumbnail.png", "nuvothumbnail.png", "kgbrosthumbnail.png"],
      titles: ["CODE:RUN", "FLANET", "NUVO", "KGBros"],
      summaries: ["스터디 동영상 공유 플랫폼", "시계열 데이터를 활용한 AI/ML 블록코딩 서비스", "VR 여행 사진 전시 플랫폼", "영화 추천 사이트"],
      numberOfTeamArray: [5, 5, 4, 2],
      roles: ["백엔드, 인프라", "백엔드, 인프라", "프론트엔드", "백엔드, 프론트엔드"],
      periods: ["2021.04 ~ 2021.05(6주)", "2021.02 ~ 2021.04(7주)", "2021.01 ~ 2021.02(7주)", "2020.12(2주)"],
    }
  },
  components: {
    ProjectCard,
  },
}
</script>

<style scoped>
  .thumnail {
    width: 50%;
  }
</style>