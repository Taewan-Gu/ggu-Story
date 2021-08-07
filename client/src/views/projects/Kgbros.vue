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
        <KgbrosDescription />
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import LogoIcons from "@/components/projects/LogoIcons.vue"
import KgbrosDescription from "@/components/projects/KgbrosDescription.vue"

export default {
  name:"Kgbros",
  data () {
    return {
      selectedLogos: {
        kgbros: true,
      }
    }
  },
  components: {
    LogoIcons,
    KgbrosDescription,
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