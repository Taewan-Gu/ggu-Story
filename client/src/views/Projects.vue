<template>
  <v-container>
    <v-row>
      <v-col
        cols="12"
        xl="8"
        offset-xl="2"
      >
        <ProjectCard />
        <ProjectCard />
        <ProjectCard />
        <ProjectCard />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import ProjectCard from "@/components/projects/ProjectCard.vue";

export default {
  name: "Projects",
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