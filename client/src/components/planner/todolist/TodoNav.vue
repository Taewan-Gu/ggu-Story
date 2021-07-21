<template>
  <div class="todoNav">
    <div class="backButton" @click="onClickBackButton">
      <i class="far fa-arrow-alt-circle-left backIcon"></i>
    </div>
    <div class="planTtile">
      {{todo}}
    </div>
  </div>
</template>

<script>
export default {
  name: "TodoNav",
  data () {
    return {
      todo: "TODO를 추가하세요!",
    }
  },
  created () {
    if (this.$store.state.todo[0]) {
      this.todo = this.$store.state.todo[0].plan.title
    }
  },
  methods: {
    onClickBackButton () {
      this.$router.go(-1)
    }
  }
}
</script>

<style scoped>
.todoNav {
  display: flex;
  align-items: center;
}

.backButton {
  margin: 50px;
  cursor: pointer;
}

.backButton:hover {
  color: #FF96AD;
  transition: 0.3s;
}

.backIcon {
  font-size: 50px;
}

.planTtile {
  margin-left: 50px;
  font-size: 32px;
  font-weight: 550;
  padding-bottom: 2px;
}
</style>