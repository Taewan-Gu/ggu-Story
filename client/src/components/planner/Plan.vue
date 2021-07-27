<template>
  <div class="plan">
    <div class="addPlan">
      <input type="text" class="planInput" v-model="planInput">
      <div class="addPlanButton" @click="add_plan">
        계획 추가
      </div>
    </div>
    <div class="planDisplay">
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
      plans: [],
      planInput: "",
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
          console.error(err)
        });
  },
  methods: {
    add_plan () {
      if (this.planInput == "") {
        alert("계획의 타이틀을 입력하세요.")
        return;
      }
      const formData = {
        "period_id": 1,
        "title": this.planInput,
      }
      axios
        .post(`${SERVER.URL.planner.plan_post}`, formData)
        .then(() => {
          this.plans.push([formData.period_id, formData.title])
        })
        .catch(err => {
          console.error(err)
        });
      this.planInput = ""
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

.planDisplay {
  position: absolute;
  display: flex;
  flex-flow: row wrap;
}

.addPlan {
  position: fixed;
  display: flex;
  right: 70px;
  height: 100px;
  align-items: center;
  top: 0px;
}

.addPlanButton {
  color: #eeeeee;
  background-color: #393e46;
  font-size: 20px;
  font-weight: 550;
  padding: 10px;
  border-radius: 5px;
  cursor: pointer;
  margin-left: 25px;
}

.addPlanButton:hover {
  background-color: black;
  transition: 0.5s;
}

.planInput {
  line-height: 30px;
  font-size: 20px;
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