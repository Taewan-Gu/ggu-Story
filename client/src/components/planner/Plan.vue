<template>
  <div class="plan">
      여기는 플랜 자리 <br>
      Todo랑 swap으로 만들 예정 <br>
      데이터는 생성될 때 부모에서 받아와서 내려주기. <br>
      {{plans}}
  </div>
</template>

<script>
import SERVER from "@/api/UrlMapper.js"
import axios from "axios"

export default {
  name: "Plan",
  data () {
    return {
      plans: []
    }
  },
  created () {
    axios
        .get(`${SERVER.URL.planner.plan_all}`)
        .then(res => {
          console.log(res);
          res.data.forEach(e => {
            this.plans.push([e.id, e.title])
          });
        })
        .catch(err => {
          console.error(err);
        });
  },
  methods: {
    select_plan (idx) {
      console.log(this.plans[idx])
    }
  },
}
</script>

<style scoped>
.plan {
  position: fixed;
  left: 400px;
  right: 0px;
  bottom: 0px;
  top: 100px;
  background-color: #222222;
  color: #eeeeee;
}
</style>