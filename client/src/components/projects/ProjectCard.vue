<template>
  <v-container>
    <v-row>
      <v-col
        offset-lg="2"
        lg="8"
        cols="12"
        class="projectCard"
      >
        <img src="@/assets/img/projects/nuvothumnail.png" class="thumnail" alt="">
        <div>
          <span class="projectTitle"> NUVO </span> <br>
          <span class="projectSummary"> VR 여행 사진 전시 플랫폼 </span> <br>
          <span class="projectNumberOfTeam"> 4명 중 </span><span class="projectRole"> 프론트엔드 담당 </span> <br>
          <span class="projectPeriod"> 2021.01 ~ 2021.02(7주) </span>
        </div>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: "ProjectCard",
}
</script>

<style scoped>
@keyframes infiniteGradient {
  from {
    background-color: #f9f9f9;
  }
  to {
    background-color: #eeeeee;
  }
}

.projectCard {
  margin-top: 30px;
  border: 1px solid;
  border-color: #eeeeee;
  border-radius: 10px;
  display: flex;
  background-color: #f9f9f9;
  cursor: pointer;
}

.projectCard:hover {
  animation-duration: 1s;
  animation-name: infiniteGradient;
  animation-iteration-count: infinite;
  animation-direction: alternate;
}

.thumnail {
  margin: 10px 50px 10px 20px;
  width: 150px;
}

.projectTitle {
  font-size: 28px;
  font-weight: 550;
  color: #444444;
  line-height: 62px;
}

.projectSummary {
  font-size: 20px;
  font-weight: 550;
}

.projectRole {
  font-size: 20px;
  font-weight: 550;
  color: #DF711B;
}

.projectNumberOfTeam {
  font-size: 16px;
  font-weight: 500;
}

.projectPeriod {
  font-size: 14px;
  font-weight: 400;
}
</style>