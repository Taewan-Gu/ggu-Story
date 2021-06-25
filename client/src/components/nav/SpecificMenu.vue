<template>
  <div class="planSpecificMenu">
      {{specificMenuList}}
  </div>
</template>

<script>
export default {
  name: "SpecificMenu",
  props: {
    specificMenuList: [Array],
  }
}
</script>

<style scoped>
.planSpecificMenu {
  position: fixed;
  left: 200px;
  width: 200px;
  height: 100%;
  top: 0px;
  background-color: #393e46;
  color: #eeeeee;
}
</style>