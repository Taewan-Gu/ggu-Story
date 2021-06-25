<template>
  <div class="portpolio">
    <SpecificMenu :specificMenuList="specificMenuList" />
  </div>
</template>

<script>
import SpecificMenu from "@/components/nav/SpecificMenu.vue"

export default {
  name:"Portpolio",
  data() {
    return {
      specificMenuList:["Project 1", "Project 2", "Project 3", "Project 4", "Project 5"]
    }
  },
  components: {
    SpecificMenu,
  }
}
</script>

<style>

</style>