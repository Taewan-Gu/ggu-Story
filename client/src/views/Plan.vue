<template>
  <div class="plan">
    <SpecificMenu :specificMenuList="specificMenuList" />
  </div>
</template>

<script>
import SpecificMenu from "@/components/nav/SpecificMenu.vue"

export default {
  name:"Plan",
  data() {
    return {
      specificMenuList:["Date Filter", "Achivements"]
    }
  },
  components: {
    SpecificMenu,
  }
}
</script>

<style scoped>

</style>