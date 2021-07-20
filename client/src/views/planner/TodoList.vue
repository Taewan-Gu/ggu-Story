<template>
  <div class="todoList">
    <Nav
      class="todoNav"
    />
    <Section
      class="todoSection"
    />
  </div>
</template>

<script>
import Nav from "@/components/planner/todolist/TodoNav.vue";
import Section from "@/components/planner/todolist/TodoSection.vue";

export default {
  name: "TodoList",
  components: {
    Nav,
    Section
  }

}
</script>

<style scoped>
.todoNav {
  position: fixed;
  left: 200px;
  right: 0px;
  top: 0px;
  height: 100px;
}

.todoSection {
  position: absolute;
  left: 200px;
  right: 0px;
  top: 100px;
}
</style>