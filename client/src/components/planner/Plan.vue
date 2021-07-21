<template>
  <div class="plan">
    <div
      class="row"
      v-for="(plan, idx) in plans"
      :key="idx"
    >
      <Card
        class="card"
        :cardTtile = "plan[1]"
        :cardId = "plan[0]"
      />
    </div>
  </div>
</template>

<script>
import Card from "@/components/planner/PlanCard.vue"
import SERVER from "@/api/UrlMapper.js"
import axios from "axios"

export default {
  name: "Plan",
  data () {
    return {
      plans: []
    }
  },
  components: {
    Card,
  },
  created () {
    axios
        .get(`${SERVER.URL.planner.plan_all}`)
        .then(res => {
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
  position: absolute;
  display: flex;
  left: 400px;
  right: 0px;
  bottom: 0px;
  top: 100px;
  padding-left: 20px;
  color: black;
  flex-flow: row wrap;
}

.card {
  margin: 20px;
  cursor: pointer;
}

@keyframes lightCard {
  from {
    background-color: #eeeeee;
  }

  to {
    background-color: #FF96AD;
  }
}

.card:hover {
  animation-duration: 1s;
  animation-name: lightCard;
  animation-iteration-count: infinite;
  animation-direction: alternate;
}
.card:hover {
  transform: inherit scale(1.05);
  
}

.row {
  display: contents;
}

.row:nth-child(4n)::after {
  content: '';
  width: 100%;
}
</style>