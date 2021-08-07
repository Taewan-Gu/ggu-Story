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
        <FlanetDescription />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import LogoIcons from "@/components/projects/LogoIcons.vue"
import FlanetDescription from "@/components/projects/FlanetDescription.vue"

export default {
  name:"Flanet",
  data () {
    return {
      selectedLogos: {
        flanet: true,
      }
    }
  },
  components: {
    LogoIcons,
    FlanetDescription,
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