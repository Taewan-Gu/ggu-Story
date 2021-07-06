<template>
  <div class="planSpecificMenu">
    <div
      v-for="(item, idx) in specificMenuList"
      :key="idx"
      class="menuItem"
    >
      {{item}}
    </div>
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

.menuItem {
  margin-top:20px;
  margin-bottom:20px;
  padding-top:20px;
  padding-bottom:20px;
  cursor: pointer;
  font-weight: 650;
}

.menuItem:hover {
  transform: scale(1.1);
  transition: 0.3s;
}

</style>