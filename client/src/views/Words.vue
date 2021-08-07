<template>
  <v-container>
    <v-row>
      <v-col
        cols="10"
        xl="6"
        offset-xl="2"
      >
        <DisplayPannel />
      </v-col>
      <v-col
        cols="2"
      >
        <Tags />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import DisplayPannel from "@/components/words/DisplayPannel.vue"
import Tags from "@/components/words/Tags.vue"

export default {
  name: "Words",
  components: {
    DisplayPannel,
    Tags,
  }
}
</script>

<style scoped>

</style>