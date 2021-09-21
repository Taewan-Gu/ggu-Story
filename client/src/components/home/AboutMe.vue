<template>
  <div class="aboutMe">
    <div class="intro">
      안녕하세요. Backend 개발자 구태완입니다.
    </div>
    <h1>추구하는 방향</h1>
    <v-container class="direction">
      <v-row>
        <v-col lg="4">
          <v-icon color="#FFB740" class="bulbIcon">
            mdi-lightbulb-on
          </v-icon>
          <h3>New Trend</h3>
          <p class="content">
            지난 20년 사이, 많은 언어가 생겨나고 개발 트렌드가 변화하였습니다.
            현재도 변화하고 있는 개발에 적응하기 위해 새로운 기술에 관심을
            가지고 꾸준히 습득하고 있습니다.
          </p>
        </v-col>
        <v-col lg="4">
          <v-icon color="#FFB740" class="optmzIcon">
            mdi-head-cog
          </v-icon>
          <h3>Optimization</h3>
          <p class="content">
            알고리즘을 좋아하다 보니 깊게 생각하고 최적의 방안을 찾아내는 것을
            좋아합니다. 프로그래밍과 개발 환경에 대해서도 많은 생각을 거치고
            최선의 방향을 찾아내려 노력하고 있습니다.
          </p>
        </v-col>
        <v-col lg="4">
          <v-icon color="#FFB740" class="teamIcon">
            mdi-account-group
          </v-icon>
          <h3>Team</h3>
          <p class="content">
            팀이 한 프로젝트를 위해 만들어졌다면, 팀원은 해당 프로젝트를
            지지하는 나무라고 생각합니다. 서로의 소통이 부재하고 어긋난다면
            프로젝트를 지지할 수 없다고 생각하며, 개발 내외로 모든 팀원을
            존중하고 소통하려 노력하고 있습니다.
          </p>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  name: "AboutMe",
};
</script>

<style scoped>
.aboutMe {
  margin-bottom: 40px;
}

.intro {
  font-size: 18px;
  font-weight: 500;
  margin-bottom: 25px;
}

.direction {
  margin-top: 10px;
  text-align: center;
}

.content {
  margin-top: 10px;
  font-size: 14px;
}

.optmzIcon {
  font-size: 250px;
  margin-bottom: 20px;
}

.bulbIcon {
  font-size: 230px;
  margin-bottom: 40px;
}

.teamIcon {
  font-size: 260px;
  margin-bottom: 10px;
}
</style>
