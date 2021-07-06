<template>
  <div class="period">
      박스로 감싼 [{{selected_period}}]
      & 변경 버튼 & 추가 버튼
  </div>
</template>

<script>
import SERVER from "@/api/UrlMapper.js"
import axios from "axios"

export default {
  name: "Period",
  data () {
    return {
      periods: [],
      selected_period: "하루",
    }
  },
  created () {
    axios
        .get(`${SERVER.URL.planner.period_all}`)
        .then(res => {
          res.data.forEach(e => {
            this.periods.push(e.period_data)
          });
        })
        .catch(err => {
          console.error(err);
        });
  },
  methods: {
    select_period (idx) {
      this.selected_period = this.periods[idx];
    }
  },
}
</script>

<style scoped>
.period {
  position: fixed;
  left: 400px;
  width: 400px;
  height: 100px;
  top: 0px;
  background-color: #333333;
  color: #eeeeee;
}
</style>