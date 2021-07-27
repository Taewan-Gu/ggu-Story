<template>
  <div class="planCard" @click="gotoPlanPage">
    <!-- @TODO 제목 카드 밖으로 나갈 수 있음 -->
    <h2> {{cardTtile}} </h2>
  </div>
</template>

<script>
import axios from 'axios'
import SERVER from "@/api/UrlMapper.js"

export default {
  name: "PlanCard",
  data () {

  },
  props: {
    cardTtile: [String, Object],
    cardId: [Number, Object]
  },
  methods: {
    gotoPlanPage () {
      axios
          .get(SERVER.URL.planner.todo_get + "?plan_id=" + this.cardId)
          .then(res => {
            this.$store.dispatch("storeTodo", res.data)
            this.$store.dispatch("storePlanId", this.cardId)
            this.$router.push({name: "TodoList"})
          })
          .catch(err => {
            console.log(err)
          })
    }
  }
}
</script>

<style scoped>
.planCard {
  display: flex;
  justify-content: center;
  align-items: center;
  padding-bottom: 10px;
  border: 5px solid;
  border-radius: 20px;
  border-color: #35495e;
  width: 300px;
  height: 150px;
}
</style>