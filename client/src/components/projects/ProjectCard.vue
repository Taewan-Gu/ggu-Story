<template>
  <v-container>
    <v-row>
      <v-col
        offset-lg="2"
        lg="8"
        cols="12"
        class="projectCard"
        @click="showProjectDescription"
      >
        <img :src="require(`@/assets/img/projects/${thumbnail}`)" class="thumbnail" alt="projectthumnail">
        <div>
          <span class="projectTitle"> {{title}} </span> <br>
          <span class="projectSummary"> {{summary}} </span> <br>
          <span class="projectNumberOfTeam"> {{numberOfTeam}}명 중 </span><span class="projectRole"> {{role}} 담당 </span> <br>
          <span class="projectPeriod"> {{period}} </span>
        </div>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: "ProjectCard",
  props: {
    thumbnail: [String, Object],
    title: [String, Object],
    summary: [String, Object],
    numberOfTeam: [Number, Object],
    role: [String, Object],
    period: [String, Object],
    descriptionUrl: [String, Object],
  },
  methods: {
    showProjectDescription () {
      console.log(this.decriptionUrl);
      this.$router.history.push(this.descriptionUrl);
    }
  }
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

.thumbnail {
  margin: 10px 50px 10px 20px;
  width: 150px;
  border-radius: 5px;
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
  margin-left: 8px;
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