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
  }
}
</script>

<style scoped>

</style>