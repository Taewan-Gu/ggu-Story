<template>
  <v-container>
    <v-row>
      <v-col
        cols="12"
        xl="8"
        offset-xl="2"
      >
        <LogoIcons
          :selectedLogos="selectedLogos"
        />
      </v-col>
      <v-col
        cols="12"
        xl="8"
        offset-xl="2"
      >
        <hr class="divideLine" />
      </v-col>
      <v-col
        cols="12"
        xl="8"
        offset-xl="2"
      >
        <AgaeinDescription />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import LogoIcons from "@/components/projects/LogoIcons.vue"
import AgaeinDescription from "@/components/projects/AgaeinDescription.vue"

export default {
  name:"Agaein",
  data () {
    return {
      selectedLogos: {
        agaein: true,
      }
    }
  },
  components: {
    LogoIcons,
    AgaeinDescription,
  }
}
</script>

<style scoped>
.divideLine {
  height: 5px;
  background-color: #FA8072;
  opacity: 0.2;
}
</style>