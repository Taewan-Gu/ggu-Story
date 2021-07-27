<template>
  <div class="todoSection">
    <div
      class="todo"
      v-for="(todo, idx) in todos"
      :key="idx"
    >
      <div class="todoTitle">
        {{todo.todo}}
      </div>
      <div class="todoContent">
        {{todo.todo_data}}
      </div>
      <div class="button doneButton">
        끝
      </div>
      <div class="button deleteButton">
        삭제
      </div>
    </div>
    <hr>
    <div class="todo">
      <input class="todoTitleInput" v-model="todo"/>
      <input class="todoContentInput" v-model="todo_data"/>
      <div class="button addButton" @click="addTodo">
        추가
      </div>
    </div>
  </div>
</template>

<script>
import SERVER from "@/api/UrlMapper.js"
import axios from "axios"


export default {
  name: "TodoSection",
  data () {
    return {
      todos: [],
      todo: "",
      todo_data: "",
      plan_id: null,
    }
  },
  created () {
    this.todos = this.$store.state.todo
    this.plan_id = this.$store.state.planId
  },
  methods: {
    addTodo() {
      console.log(this.plan_id)
      const formData = {
        "plan_id": this.plan_id,
        "todo": this.todo,
        "todo_data": this.todo_data
      }

      axios
          .post(SERVER.URL.planner.todo_post, formData)
          .then(() => {
            this.todos.push({
              "todo": this.todo,
              "todo_data": this.todo_data
            })
            this.todo = ""
            this.todo_data = ""
          })
          .catch(err => {
            console.log(err)
          })
    },
  }
}
</script>

<style scoped>
.todo {
  display: flex;
}

.todoTitle {
  border: 2px solid;
  border-radius: 10px;
  line-height: 80px;
  width: 30%;
  height: 80px;
  margin: 20px;
  font-size: 28px;
  font-weight: 550;
}

.todoContent {
  line-height: 80px;
  border: 2px solid;
  border-radius: 10px;
  width: 50%;
  height: 80px;
  margin: 20px;
  font-size: 24px;
  font-weight: 550;
}

.todoTitleInput {
  line-height: 80px;
  border: 2px solid;
  border-radius: 10px;
  width: 30%;
  height: 80px;
  margin: 20px;
  font-size: 28px;
  font-weight: 550;
}

.todoContentInput {
  line-height: 80px;
  border: 2px solid;
  border-radius: 10px;
  width: 50%;
  height: 80px;
  margin: 20px;
  font-size: 28px;
  font-weight: 550;
}

.button {
  cursor: pointer;
  line-height: 80px;
  border: 2px solid;
  border-radius: 10px;
  height: 80px;
  font-weight: 550;
  font-size: 20px;
}

.button:hover {
  background-color: #FF96AD;
  transition: 0.3s;
}

.addButton {
  width: 10%;
  margin: 20px;
}

.deleteButton {
  width: 5%;
  margin: 10px;
  margin-top:20px;
  margin-bottom:20px;
}

.doneButton {
  width: 5%;
  margin: 10px;
  margin-top:20px;
  margin-bottom:20px;
}
</style>