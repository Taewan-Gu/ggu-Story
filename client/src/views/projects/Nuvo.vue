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
        <NuvoDescription />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import LogoIcons from "@/components/projects/LogoIcons.vue"
import NuvoDescription from "@/components/projects/NuvoDescription.vue"

export default {
  name:"Nuvo",
  data () {
    return {
      selectedLogos: {
        nuvo: true,
      }
    }
  },
  components: {
    LogoIcons,
    NuvoDescription,
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