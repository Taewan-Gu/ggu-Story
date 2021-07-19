<template>
  <div class="planner">
    <SpecificMenu :specificMenuList="specificMenuList" />
    <Period />
    <Plan />
  </div>
</template>

<script>
import SpecificMenu from "@/components/nav/SpecificMenu.vue"
import Period from "@/components/planner/Period.vue"
import Plan from "@/components/planner/Plan.vue"
import SERVER from "@/api/UrlMapper.js"
import axios from "axios"

export default {
  name:"Planner",
  data() {
    return {
      specificMenuList:["Date Filter", "Achivements"]
    }
  },
  components: {
    SpecificMenu,
    Period,
    Plan,
  },
  created () {
    axios
        .get(`${SERVER.URL.planner.period_all}`)
        .then(res => {
          this.$store.dispatch("storePeriods", res.data)
        })
        .catch(err => {
          console.error(err);
        });
  }
}
</script>

<style scoped>

</style>