<template>
  <v-container>
    <v-row>
      <v-col
        cols="12"
        xl="8"
        offset-xl="2"
      >
        <Label :title="pageTitle"/>
        <AboutMe />
        <Stack />
        <Experience />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import Label from "@/components/common/Label.vue";
import AboutMe from "@/components/home/AboutMe.vue";
import Stack from "@/components/home/Stack.vue";
import Experience from "@/components/home/Experience.vue";

export default {
  name: "Home",
  data () {
    return {
      pageTitle: "HOME",
    }
  },
  components: {
    AboutMe,
    Label,
    Stack,
    Experience,
  }
}
</script>

<style scoped>

</style>